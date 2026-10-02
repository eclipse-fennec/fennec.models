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

import org.eclipse.fennec.model.compliance.context.CategoryRef;
import org.eclipse.fennec.model.compliance.context.RequirementRef;

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
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getDetectedBy <em>Detected By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getSignalValues <em>Signal Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getDiagnosticId <em>Diagnostic Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.Finding#getCorrectionNote <em>Correction Note</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding()
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
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.ReportOrigin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who raised this finding. Distinguishes a finding a person added from the findings of the agent within the same revision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.ReportOrigin
	 * @see #setOrigin(ReportOrigin)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Origin()
	 * @model
	 * @generated
	 */
	ReportOrigin getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.ReportOrigin
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(ReportOrigin value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification, e.g. the data category of the GDPR context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getCategories();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.RequirementRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requirements the finding concerns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementRef> getRequirements();

	/**
	 * Returns the value of the '<em><b>Relevance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.RelevanceLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How serious the finding is if it holds. Independent of confidence: a finding can be severe but uncertain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.RelevanceLevel
	 * @see #setRelevanceLevel(RelevanceLevel)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_RelevanceLevel()
	 * @model
	 * @generated
	 */
	RelevanceLevel getRelevanceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getRelevanceLevel <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.RelevanceLevel
	 * @see #getRelevanceLevel()
	 * @generated
	 */
	void setRelevanceLevel(RelevanceLevel value);

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.Confidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How sure the assessment is. Independent of relevanceLevel. Use REQUIRES_PURPOSE_CONFIRMATION whenever the classification cannot be settled from the metamodel alone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.Confidence
	 * @see #setConfidence(Confidence)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Confidence()
	 * @model
	 * @generated
	 */
	Confidence getConfidence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.Confidence
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(Confidence value);

	/**
	 * Returns the value of the '<em><b>Detected By</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.report.DetectionSignal}.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.DetectionSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which signals led to this finding. Set every one that applies. A reviewer uses this to judge the finding without re-deriving it, so a name match and an enum-literal match must not look alike.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected By</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.report.DetectionSignal
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_DetectedBy()
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
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_SignalValues()
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
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getRationale <em>Rationale</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Recommendation()
	 * @model
	 * @generated
	 */
	String getRecommendation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getRecommendation <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation</em>' attribute.
	 * @see #getRecommendation()
	 * @generated
	 */
	void setRecommendation(String value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.report.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required, at least one. A finding without legal evidence is an opinion and must not be produced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Evidence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Diagnostic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the model.atlas Diagnostic this finding was raised as, so that a later review of the same artefact updates that diagnostic instead of raising a second one for the same problem. Diagnostic ids are deterministic - derived from the producer, the code and the target, the producer here being the GDPR review - so the same finding about the same element keeps its id across re-validations and this reference survives without a matching step. It holds the id alone: a diagnostic is addressed from outside by scope, registry, stage, objectId and id, and the first four are those of the object this report is about. Leave it unset on a finding that no diagnostic was raised for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Id</em>' attribute.
	 * @see #setDiagnosticId(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_DiagnosticId()
	 * @model
	 * @generated
	 */
	String getDiagnosticId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getDiagnosticId <em>Diagnostic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Id</em>' attribute.
	 * @see #getDiagnosticId()
	 * @generated
	 */
	void setDiagnosticId(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The decision a person took on this finding: resolved, knowingly accepted, or explicitly re-opened, together with its justification and who took it when. Unset means no decision has been taken yet, which reads the same as OPEN - so a report written before this feature existed stays valid. A review never sets it; only a person does.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(FindingResolution)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_Resolution()
	 * @model containment="true"
	 * @generated
	 */
	FindingResolution getResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(FindingResolution value);

	/**
	 * Returns the value of the '<em><b>Correction Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why a person changed the assessment itself - category, relevanceLevel or confidence - in the revision that carries this finding. Kept apart from resolution.justification because correcting the assessment and deciding what to do about it are separate acts: a person may correct a category and leave the finding open. Who made the correction and when is not repeated here; it is the generatedBy and generatedAt of the report revision, whose origin is HUMAN. Empty on a finding nobody corrected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correction Note</em>' attribute.
	 * @see #setCorrectionNote(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getFinding_CorrectionNote()
	 * @model
	 * @generated
	 */
	String getCorrectionNote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.Finding#getCorrectionNote <em>Correction Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction Note</em>' attribute.
	 * @see #getCorrectionNote()
	 * @generated
	 */
	void setCorrectionNote(String value);

} // Finding
