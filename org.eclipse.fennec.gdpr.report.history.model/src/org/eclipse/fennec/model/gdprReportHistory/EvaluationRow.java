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
package org.eclipse.fennec.model.gdprReportHistory;

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
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierId <em>Classifier Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierUriFragment <em>Classifier Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureUriFragment <em>Feature Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getChangeKind <em>Change Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow()
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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_RevisionNumber()
	 * @model required="true"
	 * @generated
	 */
	int getRevisionNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Classifier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClassifierEvaluation.id of the report, which is the classifier name and is documented there as stable across reruns. The key rows are matched on when diffing two revisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Id</em>' attribute.
	 * @see #setClassifierId(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_ClassifierId()
	 * @model required="true"
	 * @generated
	 */
	String getClassifierId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierId <em>Classifier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Id</em>' attribute.
	 * @see #getClassifierId()
	 * @generated
	 */
	void setClassifierId(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifier name as it appears in the reviewed model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_ClassifierName()
	 * @model
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment addressing the classifier, e.g. //Patient. The address into the model, and the fallback match key when an id is missing, because it is derived from the model rather than from an agent following an instruction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Uri Fragment</em>' attribute.
	 * @see #setClassifierUriFragment(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_ClassifierUriFragment()
	 * @model
	 * @generated
	 */
	String getClassifierUriFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierUriFragment <em>Classifier Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Uri Fragment</em>' attribute.
	 * @see #getClassifierUriFragment()
	 * @generated
	 */
	void setClassifierUriFragment(String value);

	/**
	 * Returns the value of the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FeatureEvaluation.id of the report, of the form classifier.feature. Empty on a row that states a classifier-level finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Id</em>' attribute.
	 * @see #setFeatureId(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_FeatureId()
	 * @model
	 * @generated
	 */
	String getFeatureId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureId <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Id</em>' attribute.
	 * @see #getFeatureId()
	 * @generated
	 */
	void setFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature name as it appears in the reviewed model. Empty on a classifier-level row.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Feature Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment addressing the feature, e.g. //Patient/street. Empty on a classifier-level row.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Uri Fragment</em>' attribute.
	 * @see #setFeatureUriFragment(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_FeatureUriFragment()
	 * @model
	 * @generated
	 */
	String getFeatureUriFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureUriFragment <em>Feature Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Uri Fragment</em>' attribute.
	 * @see #getFeatureUriFragment()
	 * @generated
	 */
	void setFeatureUriFragment(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declared type of the feature, copied from the report. Part of why a category was assigned, so it belongs next to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data category assigned, as the literal name of the report's DataCategory, e.g. SPECIAL_CATEGORY.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Relevance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relevance assigned, as the literal name of the report's RelevanceLevelType, e.g. HIGH.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance Level</em>' attribute.
	 * @see #setRelevanceLevel(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_RelevanceLevel()
	 * @model
	 * @generated
	 */
	String getRelevanceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRelevanceLevel <em>Relevance Level</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_Confidence()
	 * @model
	 * @generated
	 */
	String getConfidence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getConfidence <em>Confidence</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRationale <em>Rationale</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_Recommendation()
	 * @model
	 * @generated
	 */
	String getRecommendation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRecommendation <em>Recommendation</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_Citations()
	 * @model
	 * @generated
	 */
	String getCitations();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCitations <em>Citations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citations</em>' attribute.
	 * @see #getCitations()
	 * @generated
	 */
	void setCitations(String value);

	/**
	 * Returns the value of the '<em><b>Change Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReportHistory.ChangeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How this row differs from the same classifier or feature in the preceding revision. UNCHANGED on the first revision. Says that something changed; the change rows say what.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
	 * @see #setChangeKind(ChangeKind)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_ChangeKind()
	 * @model
	 * @generated
	 */
	ChangeKind getChangeKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getChangeKind <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getEvaluationRow_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // EvaluationRow
