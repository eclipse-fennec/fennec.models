# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Eclipse Fennec Models — the Fennec-own EMF models as OSGi bundles: `org.eclipse.fennec.model` (collection, PushStream and utility models) and the shared compliance models (`org.eclipse.fennec.compliance.*`, plus the deprecated `org.eclipse.fennec.gdpr.*`). Published to Maven Central under group ID `org.eclipse.fennec.models`.

### Relation to common.models

- These modules moved here from **eclipse-fennec/common.models** in 0.1.0 (history preserved). common.models keeps only the models of external standards; its library is now `fennecEMFCommonModels`.
- This repo's library `org.eclipse.fennec.models.library` provides **`fennecEMFModels`** — the name the common.models library had up to 0.0.1. A consumer must never combine the 0.0.1 common.models library with this one (both provide that name); switch the common.models library to 0.1.0/`fennecEMFCommonModels` in the same change.
- `org.eclipse.fennec.query.model` did not move; it lives in **eclipse-fennec/emf.persistence-jpa**.
- Model artifacts keep their coordinates (`org.eclipse.fennec.models:<bsn>:<Bundle-Version>`), so they must be published from exactly one repository — here.

## Build Commands

```bash
./gradlew clean build                                            # Build (regenerates the code)
./gradlew :org.eclipse.fennec.models.library:resolve.required   # Re-resolve the library's -runbundles
```

- Java 21 (bundles target Java 21; CI tests on Java 21 and 25), Gradle 9 (wrapper 9.8.2)
- Gradle with the **biz.aQute.bnd.workspace** plugin (Bnd 7.2.1)

## Build System

- Workspace configuration lives in `cnf/ext/fennec.bnd` (libraries, base version 0.1.0, Maven repos) and `cnf/ext/central.mvn`; `cnf/build.bnd` only holds `-fixupmessages`.
- Project coordinates (`github_org`, `github_repository`, `maven_group_id`) come from `gradle.properties`.
- Each module has a `bnd.bnd` with bundle metadata, dependencies and the `-generate` directive.

## Code Generation

- **The `-generate` block is enabled in every module** (unlike common.models, where it is commented out). Every build regenerates the Java code from `.genmodel`/`.ecore`.
- Generated code in `src/` and `src-gen*/` is committed — do not hand-edit it. After changing an `.ecore`/`.genmodel`, build and commit the regenerated code with it.
- GenModel settings that matter (e.g. `get`/`body` annotations) may be duplicated in `.genmodel` and `.ecore`; change both.

## Adding a Model

1. Create the module (`bnd.bnd`, `model/`), with `-generate` enabled and `Bundle-Version` set.
2. Add it to `-runrequires` in `org.eclipse.fennec.models.library/required.bndrun` and re-resolve (see above); the BOM includes the library's buildpath.

## Branching & CI

- `main` — release builds (GPG-signed, deployed to Maven Central)
- `snapshot` — snapshot builds (deployed to Sonatype snapshots)
- Feature branches — PR builds (build + test only)
- License: EPL-2.0, headers checked in CI via SkyWalking Eyes
