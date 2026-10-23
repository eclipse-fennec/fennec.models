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
package org.eclipse.fennec.model.compliance.report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * What a person decided about a finding: whether it was reviewed and how its risk is treated (ISO 27005 / ISO 31000). Whether the cause was removed is not decided here; the next review of the changed subject shows it by no longer raising the finding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getMeasureIds <em>Measure Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getTreatmentNote <em>Treatment Note</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDelegatedTo <em>Delegated To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDecidedAt <em>Decided At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution()
 * @model
 * @generated
 */
@ProviderType
public interface FindingResolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.ReviewStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether a person has classified the finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.ReviewStatus
	 * @see #setStatus(ReviewStatus)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_Status()
	 * @model required="true"
	 * @generated
	 */
	ReviewStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.ReviewStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ReviewStatus value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.RiskTreatment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the risk is treated. Required once REVIEWED.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.RiskTreatment
	 * @see #setTreatment(RiskTreatment)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_Treatment()
	 * @model
	 * @generated
	 */
	RiskTreatment getTreatment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getTreatment <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.RiskTreatment
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(RiskTreatment value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk assessment the treatment is based on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_RiskAssessment()
	 * @model containment="true"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

	/**
	 * Returns the value of the '<em><b>Measure Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ids of the inventory measures that treat the finding (MITIGATE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Ids</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_MeasureIds()
	 * @model
	 * @generated
	 */
	EList<String> getMeasureIds();

	/**
	 * Returns the value of the '<em><b>Treatment Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What is done when it is not a measure, e.g. for AVOID: the field is generalised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Note</em>' attribute.
	 * @see #setTreatmentNote(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_TreatmentNote()
	 * @model
	 * @generated
	 */
	String getTreatmentNote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getTreatmentNote <em>Treatment Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment Note</em>' attribute.
	 * @see #getTreatmentNote()
	 * @generated
	 */
	void setTreatmentNote(String value);

	/**
	 * Returns the value of the '<em><b>Delegated To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To whom the risk is transferred or delegated (TRANSFER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegated To</em>' attribute.
	 * @see #setDelegatedTo(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_DelegatedTo()
	 * @model
	 * @generated
	 */
	String getDelegatedTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDelegatedTo <em>Delegated To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegated To</em>' attribute.
	 * @see #getDelegatedTo()
	 * @generated
	 */
	void setDelegatedTo(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Until when the treatment is done, as ISO-8601 date (MITIGATE, TRANSFER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_DueDate()
	 * @model
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the person decided so.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_Justification()
	 * @model required="true"
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Decided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who decided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided By</em>' attribute.
	 * @see #setDecidedBy(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_DecidedBy()
	 * @model required="true"
	 * @generated
	 */
	String getDecidedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDecidedBy <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided By</em>' attribute.
	 * @see #getDecidedBy()
	 * @generated
	 */
	void setDecidedBy(String value);

	/**
	 * Returns the value of the '<em><b>Decided At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When, as ISO-8601 date-time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided At</em>' attribute.
	 * @see #setDecidedAt(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFindingResolution_DecidedAt()
	 * @model required="true"
	 * @generated
	 */
	String getDecidedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.FindingResolution#getDecidedAt <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided At</em>' attribute.
	 * @see #getDecidedAt()
	 * @generated
	 */
	void setDecidedAt(String value);

} // FindingResolution
