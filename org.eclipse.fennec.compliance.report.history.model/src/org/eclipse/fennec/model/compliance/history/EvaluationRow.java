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
package org.eclipse.fennec.model.compliance.history;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The assessment of one classifier or one feature as one revision recorded it, flattened into a single row.
 * 
 * Values copied from the report (category, relevance, confidence) are plain strings rather than the report's enumerations: this package stays self-contained, and the change rows have to hold values of differently typed fields as text anyway. Only vocabularies this model owns are enumerations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementPath <em>Element Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildId <em>Child Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildName <em>Child Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildPath <em>Child Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChangeKind <em>Change Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getReviewStatus <em>Review Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getResolutionJustification <em>Resolution Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedAt <em>Decided At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCorrectionNote <em>Correction Note</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getContextId <em>Context Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRequirementIds <em>Requirement Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getAssetId <em>Asset Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getFindingOrigin <em>Finding Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getMeasureIds <em>Measure Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatmentNote <em>Treatment Note</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDelegatedTo <em>Delegated To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getLawfulBases <em>Lawful Bases</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow()
 * @model
 * @generated
 */
@ProviderType
public interface EvaluationRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which revision this row states. Points at ReportRevision.revisionNumber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(int)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_RevisionNumber()
	 * @model required="true"
	 * @generated
	 */
	int getRevisionNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the evaluated element: the classifier of an EMF subject, the requirement of a control evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ElementId()
	 * @model required="true"
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifier name as it appears in the reviewed model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ElementName()
	 * @model
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Element Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment addressing the classifier, e.g. //Patient. The address into the model, and the fallback match key when an id is missing, because it is derived from the model rather than from an agent following an instruction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Path</em>' attribute.
	 * @see #setElementPath(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ElementPath()
	 * @model
	 * @generated
	 */
	String getElementPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementPath <em>Element Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Path</em>' attribute.
	 * @see #getElementPath()
	 * @generated
	 */
	void setElementPath(String value);

	/**
	 * Returns the value of the '<em><b>Child Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the child element, e.g. the feature of a classifier. Unset for a row about the element itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Id</em>' attribute.
	 * @see #setChildId(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ChildId()
	 * @model
	 * @generated
	 */
	String getChildId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildId <em>Child Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Id</em>' attribute.
	 * @see #getChildId()
	 * @generated
	 */
	void setChildId(String value);

	/**
	 * Returns the value of the '<em><b>Child Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature name as it appears in the reviewed model. Empty on a classifier-level row.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Name</em>' attribute.
	 * @see #setChildName(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ChildName()
	 * @model
	 * @generated
	 */
	String getChildName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildName <em>Child Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Name</em>' attribute.
	 * @see #getChildName()
	 * @generated
	 */
	void setChildName(String value);

	/**
	 * Returns the value of the '<em><b>Child Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment addressing the feature, e.g. //Patient/street. Empty on a classifier-level row.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Path</em>' attribute.
	 * @see #setChildPath(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ChildPath()
	 * @model
	 * @generated
	 */
	String getChildPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildPath <em>Child Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Path</em>' attribute.
	 * @see #getChildPath()
	 * @generated
	 */
	void setChildPath(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declared type of the feature, copied from the report. Part of why a category was assigned, so it belongs next to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data category assigned, as the literal name of the report's DataCategory, e.g. SPECIAL_CATEGORY.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' attribute.
	 * @see #setCategories(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Categories()
	 * @model
	 * @generated
	 */
	String getCategories();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCategories <em>Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' attribute.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(String value);

	/**
	 * Returns the value of the '<em><b>Relevance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relevance assigned, as the literal name of the report's RelevanceLevelType, e.g. HIGH.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance Level</em>' attribute.
	 * @see #setRelevanceLevel(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_RelevanceLevel()
	 * @model
	 * @generated
	 */
	String getRelevanceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRelevanceLevel <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance Level</em>' attribute.
	 * @see #getRelevanceLevel()
	 * @generated
	 */
	void setRelevanceLevel(String value);

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Confidence in the assessment, as the literal name of the report's ConfidenceType. REQUIRES_PURPOSE_CONFIRMATION is the value a human is expected to act on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Confidence()
	 * @model
	 * @generated
	 */
	String getConfidence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the category was assigned, copied verbatim from the finding. Carried in full rather than truncated: a lost justification is exactly what an auditor asks about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRationale <em>Rationale</em>}' attribute.
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
	 * What the review recommends doing about it, copied verbatim from the finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation</em>' attribute.
	 * @see #setRecommendation(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Recommendation()
	 * @model
	 * @generated
	 */
	String getRecommendation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRecommendation <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation</em>' attribute.
	 * @see #getRecommendation()
	 * @generated
	 */
	void setRecommendation(String value);

	/**
	 * Returns the value of the '<em><b>Citations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The citation identifiers backing the assessment, joined into one cell, e.g. 'Art.9(1), Rec.51'. A single string rather than a list so that the row stays one spreadsheet row; the individual citations are diffed separately and appear in the change rows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citations</em>' attribute.
	 * @see #setCitations(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Citations()
	 * @model
	 * @generated
	 */
	String getCitations();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCitations <em>Citations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citations</em>' attribute.
	 * @see #getCitations()
	 * @generated
	 */
	void setCitations(String value);

	/**
	 * Returns the value of the '<em><b>Change Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.history.ChangeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How this row differs from the same classifier or feature in the preceding revision. UNCHANGED on the first revision. Says that something changed; the change rows say what.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeKind
	 * @see #setChangeKind(ChangeKind)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ChangeKind()
	 * @model
	 * @generated
	 */
	ChangeKind getChangeKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChangeKind <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeKind
	 * @see #getChangeKind()
	 * @generated
	 */
	void setChangeKind(ChangeKind value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason a human gave for storing this feature, copied from FeatureEvaluation.purpose.
	 * Empty until someone states it. Diffed like any other cell, so the revision in which a person
	 * answered the agent's open question, and what they answered, appears in the change sheet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What a person decided about the finding, as the literal name of the report's ResolutionStatus, e.g. ACCEPTED. Empty when the finding carries no resolution, which means it is still open. Diffed, so the revision in which a decision was taken or withdrawn appears in the change sheet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Status</em>' attribute.
	 * @see #setReviewStatus(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ReviewStatus()
	 * @model
	 * @generated
	 */
	String getReviewStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getReviewStatus <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Status</em>' attribute.
	 * @see #getReviewStatus()
	 * @generated
	 */
	void setReviewStatus(String value);

	/**
	 * Returns the value of the '<em><b>Resolution Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why it was decided so, copied verbatim from FindingResolution.justification. Carried in full for the same reason as rationale. Diffed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Justification</em>' attribute.
	 * @see #setResolutionJustification(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ResolutionJustification()
	 * @model
	 * @generated
	 */
	String getResolutionJustification();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getResolutionJustification <em>Resolution Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Justification</em>' attribute.
	 * @see #getResolutionJustification()
	 * @generated
	 */
	void setResolutionJustification(String value);

	/**
	 * Returns the value of the '<em><b>Decided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who took the decision, copied from FindingResolution.decidedBy. Not diffed on its own: it changes only together with the status or the justification, and the change row already names the author in changedBy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided By</em>' attribute.
	 * @see #setDecidedBy(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_DecidedBy()
	 * @model
	 * @generated
	 */
	String getDecidedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedBy <em>Decided By</em>}' attribute.
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
	 * When the decision was taken, copied from FindingResolution.decidedAt as an ISO-8601 UTC instant. May be earlier than the revision's generatedAt when a decision was carried over unchanged. Not diffed, like decidedBy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided At</em>' attribute.
	 * @see #setDecidedAt(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_DecidedAt()
	 * @model
	 * @generated
	 */
	String getDecidedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedAt <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided At</em>' attribute.
	 * @see #getDecidedAt()
	 * @generated
	 */
	void setDecidedAt(String value);

	/**
	 * Returns the value of the '<em><b>Correction Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why a person corrected category, relevanceLevel or confidence, copied verbatim from Finding.correctionNote. Diffed, so it appears in the change sheet next to the corrected values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correction Note</em>' attribute.
	 * @see #setCorrectionNote(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_CorrectionNote()
	 * @model
	 * @generated
	 */
	String getCorrectionNote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCorrectionNote <em>Correction Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction Note</em>' attribute.
	 * @see #getCorrectionNote()
	 * @generated
	 */
	void setCorrectionNote(String value);

	/**
	 * Returns the value of the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context of the evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Id</em>' attribute.
	 * @see #setContextId(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_ContextId()
	 * @model
	 * @generated
	 */
	String getContextId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getContextId <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Id</em>' attribute.
	 * @see #getContextId()
	 * @generated
	 */
	void setContextId(String value);

	/**
	 * Returns the value of the '<em><b>Requirement Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements concerned, comma separated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement Ids</em>' attribute.
	 * @see #setRequirementIds(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_RequirementIds()
	 * @model
	 * @generated
	 */
	String getRequirementIds();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRequirementIds <em>Requirement Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Ids</em>' attribute.
	 * @see #getRequirementIds()
	 * @generated
	 */
	void setRequirementIds(String value);

	/**
	 * Returns the value of the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asset of a control evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Id</em>' attribute.
	 * @see #setAssetId(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_AssetId()
	 * @model
	 * @generated
	 */
	String getAssetId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getAssetId <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Id</em>' attribute.
	 * @see #getAssetId()
	 * @generated
	 */
	void setAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Finding Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who raised the finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finding Origin</em>' attribute.
	 * @see #setFindingOrigin(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_FindingOrigin()
	 * @model
	 * @generated
	 */
	String getFindingOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getFindingOrigin <em>Finding Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finding Origin</em>' attribute.
	 * @see #getFindingOrigin()
	 * @generated
	 */
	void setFindingOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment</em>' attribute.
	 * @see #setTreatment(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_Treatment()
	 * @model
	 * @generated
	 */
	String getTreatment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatment <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' attribute.
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(String value);

	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessed risk level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Level</em>' attribute.
	 * @see #setRiskLevel(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_RiskLevel()
	 * @model
	 * @generated
	 */
	String getRiskLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRiskLevel <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' attribute.
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(String value);

	/**
	 * Returns the value of the '<em><b>Measure Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measures treating the finding, comma separated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Ids</em>' attribute.
	 * @see #setMeasureIds(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_MeasureIds()
	 * @model
	 * @generated
	 */
	String getMeasureIds();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getMeasureIds <em>Measure Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Ids</em>' attribute.
	 * @see #getMeasureIds()
	 * @generated
	 */
	void setMeasureIds(String value);

	/**
	 * Returns the value of the '<em><b>Treatment Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Treatment note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment Note</em>' attribute.
	 * @see #setTreatmentNote(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_TreatmentNote()
	 * @model
	 * @generated
	 */
	String getTreatmentNote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatmentNote <em>Treatment Note</em>}' attribute.
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
	 * To whom the risk is transferred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegated To</em>' attribute.
	 * @see #setDelegatedTo(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_DelegatedTo()
	 * @model
	 * @generated
	 */
	String getDelegatedTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDelegatedTo <em>Delegated To</em>}' attribute.
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
	 * Due date of the treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_DueDate()
	 * @model
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Lawful Bases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawful bases of a classifier row, comma separated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lawful Bases</em>' attribute.
	 * @see #setLawfulBases(String)
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#getEvaluationRow_LawfulBases()
	 * @model
	 * @generated
	 */
	String getLawfulBases();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getLawfulBases <em>Lawful Bases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lawful Bases</em>' attribute.
	 * @see #getLawfulBases()
	 * @generated
	 */
	void setLawfulBases(String value);

} // EvaluationRow
