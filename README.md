[![Snapshot Build](https://github.com/eclipse-fennec/fennec.models/actions/workflows/snapshot.yml/badge.svg)](https://github.com/eclipse-fennec/fennec.models/actions/workflows/snapshot.yml)[![CI Build](https://github.com/eclipse-fennec/fennec.models/actions/workflows/build.yml/badge.svg)](https://github.com/eclipse-fennec/fennec.models/actions/workflows/build.yml)

# Eclipse Fennec Models

The Fennec-own EMF models: utility models and the shared compliance models. The
EMF models of external standards (OGC, W3C, OMG, HL7, XOeV, OSCAL, ...) live in
[eclipse-fennec/common.models](https://github.com/eclipse-fennec/common.models).

These modules moved here from common.models in `0.1.0`, with their history.
`org.eclipse.fennec.query.model` did not move: it lives on in
[eclipse-fennec/emf.persistence-jpa](https://github.com/eclipse-fennec/emf.persistence-jpa).

## Branches & releases

* `snapshot` is the active development branch. PRs land here first; every
  push publishes `-SNAPSHOT` artifacts to
  [Sonatype Central snapshots](https://central.sonatype.com/repository/maven-snapshots/org/eclipse/fennec/models/).
* `main` always holds the latest released version. Released artifacts are
  available on [Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/)
  under `org.eclipse.fennec.models:*`.

## Fennec EMF Models Bndtools Library

Add this dependency to your Maven index (e.g. `cnf/ext/central.mvn`):

`org.eclipse.fennec.models:org.eclipse.fennec.models.library:<version>`

Then enable the library:

`-library: fennecEMFModels`

> **Migrating from common.models 0.0.1.** Up to `0.0.1` the common.models library
> (`org.eclipse.fennec.models:org.eclipse.fennec.common.models.library`) was called
> `fennecEMFModels` and contained these models too. Since `0.1.0` it is called
> `fennecEMFCommonModels` and the name `fennecEMFModels` belongs to this library.
> Switch the common.models library to `0.1.0` and its name to `fennecEMFCommonModels` in
> the same change as adding this library — never combine the `0.0.1` common.models library
> with this one, both provide `fennecEMFModels`.

## Fennec EMF Models Maven BOM

```xml
<dependency>
	<groupId>org.eclipse.fennec.models</groupId>
	<artifactId>org.eclipse.fennec.models.bom</artifactId>
	<version>${fennec.models.version}</version>
	<type>pom</type>
	<scope>import</scope>
</dependency>
```

## Available Models

### Fennec Utilities

| Module | Description |
|---|---|
| `org.eclipse.fennec.model` | Fennec collection, PushStream and utility models |

### Compliance

Shared compliance models for GDPR, BSI IT-Grundschutz++, ISO/IEC 27001, CRA, EU AI Act, KRITIS and the BSI Technical Guidelines (see [common.models#55](https://github.com/eclipse-fennec/common.models/issues/55)).

| Module | Description |
|---|---|
| `org.eclipse.fennec.compliance.corpus.model` | Normative texts: legal acts (Formex), control catalogs (OSCAL), technical documents |
| `org.eclipse.fennec.compliance.context.model` | Compliance contexts: requirements, taxonomies, roles, crosswalks, by-id references |
| `org.eclipse.fennec.compliance.inventory.model` | Assets, protection needs, measures (TOMs), applicability, processing activities, risk methodology |
| `org.eclipse.fennec.compliance.report.model` | Findings, evidence and risk treatment of a review against compliance contexts |
| `org.eclipse.fennec.compliance.report.history.model` | Revisions of the reports of one subject as flat rows |
| `org.eclipse.fennec.gdpr.model` | **Deprecated**, replaced by `compliance.corpus.model` |
| `org.eclipse.fennec.gdpr.report.model` | **Deprecated**, replaced by `compliance.report.model` |
| `org.eclipse.fennec.gdpr.report.history.model` | **Deprecated**, replaced by `compliance.report.history.model` |

## Building

```bash
./gradlew clean build
```

Java 21 and Gradle 9 (wrapper). Unlike common.models, the `-generate` block is
**enabled** in every module here, so a build always regenerates the Java code from the
`.genmodel`/`.ecore` files.
