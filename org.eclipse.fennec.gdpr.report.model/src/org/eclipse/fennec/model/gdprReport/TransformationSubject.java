/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.gdprReport;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identity of a reviewed model transformation: which compiled unit was examined, and which revisions of which metamodels it was compiled against, split by whether the unit reads them or writes them. subjectFingerprint here is the m2x1 fingerprint of the compiled unit; it covers a compiled program rather than an EPackage, so it is never comparable with a package fingerprint. A transformation is reviewed for what it does to data that the metamodel reviews already classified, so the packages it names are not decoration - they are where the findings come from.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getSourceFingerprint <em>Source Fingerprint</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getSourcePackages <em>Source Packages</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getTargetPackages <em>Target Packages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getTransformationSubject()
 * @model
 * @generated
 */
@ProviderType
public interface TransformationSubject extends Subject {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required. The unit's qualified name as the transformation declares it, e.g. clinic2contacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getTransformationSubject_QualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transformation language the unit was compiled from, e.g. qvto. A later analyser for another language writes its own value here rather than a second subject type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getTransformationSubject_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Source Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fingerprint of the source text the unit was compiled from (m2x1 scheme), for tracing a report back to the file a developer edited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Fingerprint</em>' attribute.
	 * @see #setSourceFingerprint(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getTransformationSubject_SourceFingerprint()
	 * @model
	 * @generated
	 */
	String getSourceFingerprint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.TransformationSubject#getSourceFingerprint <em>Source Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Fingerprint</em>' attribute.
	 * @see #getSourceFingerprint()
	 * @generated
	 */
	void setSourceFingerprint(String value);

	/**
	 * Returns the value of the '<em><b>Source Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.PackageSubject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metamodels this unit reads, each pinned to the exact revision: an entry's subjectFingerprint is the key of the review whose findings this report carries over, and its reportId points at that review. Take these from the compiled unit's own manifest, never from the source text: the manifest records what the compiler actually resolved. A model the unit declares inout belongs here and in targetPackages both, as two entries with the same nsURI and fingerprint. List a package even when no review of it exists, and say so in a finding - an unreviewed source makes the analysis incomplete rather than clean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Packages</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getTransformationSubject_SourcePackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageSubject> getSourcePackages();

	/**
	 * Returns the value of the '<em><b>Target Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.PackageSubject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metamodels this unit writes, recorded exactly as sourcePackages is, and taken from the same manifest. A target model's own review, where there is one, may disagree with what the flows put into it - that disagreement is a finding, not an error. A model the unit declares inout belongs here and in sourcePackages both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Packages</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getTransformationSubject_TargetPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageSubject> getTargetPackages();

} // TransformationSubject
