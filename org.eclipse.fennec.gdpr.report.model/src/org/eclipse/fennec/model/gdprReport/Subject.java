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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identity of what was reviewed, precise enough to tell whether a later revision is still the same artefact. Subclassed per kind of artefact: PackageSubject for an Ecore metamodel, TransformationSubject for a compiled model transformation. A report has exactly one subject; everything else the review rests on is recorded inside that subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Subject#getSubjectFingerprint <em>Subject Fingerprint</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Subject#getReportId <em>Report Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubject()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Subject extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required. Fingerprint of the exact revision that was reviewed. It is the identity of the review: a review is of content, not of a location, so the same bytes reached by any route are the same subject. The scheme depends on what is under review - fp1 for an EPackage, m2x1 for a compiled transformation unit - so two fingerprints are only comparable between subjects of the same kind. Compute it; never invent or copy one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Fingerprint</em>' attribute.
	 * @see #setSubjectFingerprint(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubject_SubjectFingerprint()
	 * @model required="true"
	 * @generated
	 */
	String getSubjectFingerprint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Subject#getSubjectFingerprint <em>Subject Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Fingerprint</em>' attribute.
	 * @see #getSubjectFingerprint()
	 * @generated
	 */
	void setSubjectFingerprint(String value);

	/**
	 * Returns the value of the '<em><b>Report Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The report that reviewed this subject, as the object id that report is stored under. Set it on a subject that is named inside another report as something that review rests on: it is the provenance of every carried-over finding, and without it a reader cannot check a quote against the review that produced it. Leave it unset on a report's own subject - the owning report already identifies itself - and leave it unset when no review of this revision exists, saying so in a finding, because an unreviewed source makes the analysis incomplete rather than clean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Id</em>' attribute.
	 * @see #setReportId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubject_ReportId()
	 * @model
	 * @generated
	 */
	String getReportId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Subject#getReportId <em>Report Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Id</em>' attribute.
	 * @see #getReportId()
	 * @generated
	 */
	void setReportId(String value);

} // Subject
