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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One assessment about a classifier or feature, always supported by at least one piece of legal evidence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getDetectedBy <em>Detected By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getSignalValues <em>Signal Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Finding#getDiagnosticId <em>Diagnostic Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding()
 * @model
 * @generated
 */
@ProviderType
public interface Finding extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required and unique within the report, e.g. F-001. Used to refer to the finding from outside.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.DataCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What kind of data this is, in GDPR terms. Pick the most specific category that the evidence supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.DataCategory
	 * @see #setCategory(DataCategory)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_Category()
	 * @model
	 * @generated
	 */
	DataCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.DataCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(DataCategory value);

	/**
	 * Returns the value of the '<em><b>Relevance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.RelevanceLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How serious the finding is if it holds. Independent of confidence: a finding can be severe but uncertain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RelevanceLevelType
	 * @see #setRelevanceLevel(RelevanceLevelType)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_RelevanceLevel()
	 * @model
	 * @generated
	 */
	RelevanceLevelType getRelevanceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getRelevanceLevel <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RelevanceLevelType
	 * @see #getRelevanceLevel()
	 * @generated
	 */
	void setRelevanceLevel(RelevanceLevelType value);

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.ConfidenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How sure the assessment is. Independent of relevanceLevel. Use REQUIRES_PURPOSE_CONFIRMATION whenever the classification cannot be settled from the metamodel alone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.ConfidenceType
	 * @see #setConfidence(ConfidenceType)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_Confidence()
	 * @model
	 * @generated
	 */
	ConfidenceType getConfidence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.ConfidenceType
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(ConfidenceType value);

	/**
	 * Returns the value of the '<em><b>Detected By</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.DetectionSignal}.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.DetectionSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which signals led to this finding. Set every one that applies. A reviewer uses this to judge the finding without re-deriving it, so a name match and an enum-literal match must not look alike.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected By</em>' attribute list.
	 * @see org.eclipse.fennec.model.gdprReport.DetectionSignal
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_DetectedBy()
	 * @model
	 * @generated
	 */
	EList<DetectionSignal> getDetectedBy();

	/**
	 * Returns the value of the '<em><b>Signal Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concrete values behind the signal, quoted exactly, e.g. the EEnum literals observed or the documentation phrase that triggered the flag. This is what makes detectedBy checkable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Values</em>' attribute list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_SignalValues()
	 * @model
	 * @generated
	 */
	EList<String> getSignalValues();

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the cited law applies to this feature, in prose. This is your reasoning and is read as interpretation, not fact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What could be done about it, e.g. generalise the value, record a lawful basis, remove the attribute. Optional, and never phrased as a compliance verdict.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation</em>' attribute.
	 * @see #setRecommendation(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_Recommendation()
	 * @model
	 * @generated
	 */
	String getRecommendation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getRecommendation <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation</em>' attribute.
	 * @see #getRecommendation()
	 * @generated
	 */
	void setRecommendation(String value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required, at least one. A finding without legal evidence is an opinion and must not be produced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_Evidence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Diagnostic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the diagnostic this finding corresponds to, so that a later review of the same artefact updates the diagnostic already raised instead of raising a second one for the same problem. Leave it unset on a finding that no diagnostic was raised for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Id</em>' attribute.
	 * @see #setDiagnosticId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFinding_DiagnosticId()
	 * @model
	 * @generated
	 */
	String getDiagnosticId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Finding#getDiagnosticId <em>Diagnostic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Id</em>' attribute.
	 * @see #getDiagnosticId()
	 * @generated
	 */
	void setDiagnosticId(String value);

} // Finding
