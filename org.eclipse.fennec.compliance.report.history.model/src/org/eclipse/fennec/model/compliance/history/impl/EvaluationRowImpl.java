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
package org.eclipse.fennec.model.compliance.history.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.history.ChangeKind;
import org.eclipse.fennec.model.compliance.history.EvaluationRow;
import org.eclipse.fennec.model.compliance.history.HistoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getElementPath <em>Element Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getChildId <em>Child Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getChildName <em>Child Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getChildPath <em>Child Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getChangeKind <em>Change Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getReviewStatus <em>Review Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getResolutionJustification <em>Resolution Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getDecidedAt <em>Decided At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getCorrectionNote <em>Correction Note</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getContextId <em>Context Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getRequirementIds <em>Requirement Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getAssetId <em>Asset Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getFindingOrigin <em>Finding Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getMeasureIds <em>Measure Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getTreatmentNote <em>Treatment Note</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getDelegatedTo <em>Delegated To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl#getLawfulBases <em>Lawful Bases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationRowImpl extends MinimalEObjectImpl.Container implements EvaluationRow {
	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected String elementId = ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementPath() <em>Element Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementPath() <em>Element Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPath()
	 * @generated
	 * @ordered
	 */
	protected String elementPath = ELEMENT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildId() <em>Child Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildId() <em>Child Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildId()
	 * @generated
	 * @ordered
	 */
	protected String childId = CHILD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildName() <em>Child Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildName() <em>Child Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildName()
	 * @generated
	 * @ordered
	 */
	protected String childName = CHILD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildPath() <em>Child Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildPath() <em>Child Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildPath()
	 * @generated
	 * @ordered
	 */
	protected String childPath = CHILD_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategories() <em>Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected String categories = CATEGORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEVANCE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected String relevanceLevel = RELEVANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected String confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendation() <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendation() <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected String recommendation = RECOMMENDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCitations() <em>Citations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitations()
	 * @generated
	 * @ordered
	 */
	protected static final String CITATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitations() <em>Citations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitations()
	 * @generated
	 * @ordered
	 */
	protected String citations = CITATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeKind() <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeKind CHANGE_KIND_EDEFAULT = ChangeKind.UNCHANGED;

	/**
	 * The cached value of the '{@link #getChangeKind() <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeKind()
	 * @generated
	 * @ordered
	 */
	protected ChangeKind changeKind = CHANGE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewStatus() <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewStatus() <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewStatus()
	 * @generated
	 * @ordered
	 */
	protected String reviewStatus = REVIEW_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionJustification() <em>Resolution Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolutionJustification() <em>Resolution Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionJustification()
	 * @generated
	 * @ordered
	 */
	protected String resolutionJustification = RESOLUTION_JUSTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecidedBy() <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIDED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecidedBy() <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedBy()
	 * @generated
	 * @ordered
	 */
	protected String decidedBy = DECIDED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecidedAt() <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIDED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecidedAt() <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedAt()
	 * @generated
	 * @ordered
	 */
	protected String decidedAt = DECIDED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrectionNote() <em>Correction Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectionNote()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRECTION_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrectionNote() <em>Correction Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectionNote()
	 * @generated
	 * @ordered
	 */
	protected String correctionNote = CORRECTION_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected String contextId = CONTEXT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementIds() <em>Requirement Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementIds()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_IDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementIds() <em>Requirement Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementIds()
	 * @generated
	 * @ordered
	 */
	protected String requirementIds = REQUIREMENT_IDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected String assetId = ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFindingOrigin() <em>Finding Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String FINDING_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFindingOrigin() <em>Finding Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingOrigin()
	 * @generated
	 * @ordered
	 */
	protected String findingOrigin = FINDING_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreatment() <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected static final String TREATMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected String treatment = TREATMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String RISK_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected String riskLevel = RISK_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureIds() <em>Measure Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureIds()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_IDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureIds() <em>Measure Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureIds()
	 * @generated
	 * @ordered
	 */
	protected String measureIds = MEASURE_IDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreatmentNote() <em>Treatment Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentNote()
	 * @generated
	 * @ordered
	 */
	protected static final String TREATMENT_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreatmentNote() <em>Treatment Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentNote()
	 * @generated
	 * @ordered
	 */
	protected String treatmentNote = TREATMENT_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelegatedTo() <em>Delegated To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedTo()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegatedTo() <em>Delegated To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedTo()
	 * @generated
	 * @ordered
	 */
	protected String delegatedTo = DELEGATED_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLawfulBases() <em>Lawful Bases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLawfulBases()
	 * @generated
	 * @ordered
	 */
	protected static final String LAWFUL_BASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLawfulBases() <em>Lawful Bases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLawfulBases()
	 * @generated
	 * @ordered
	 */
	protected String lawfulBases = LAWFUL_BASES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.EVALUATION_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionNumber(int newRevisionNumber) {
		int oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementId() {
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementId(String newElementId) {
		String oldElementId = elementId;
		elementId = newElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementPath() {
		return elementPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementPath(String newElementPath) {
		String oldElementPath = elementPath;
		elementPath = newElementPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__ELEMENT_PATH, oldElementPath, elementPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildId() {
		return childId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildId(String newChildId) {
		String oldChildId = childId;
		childId = newChildId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CHILD_ID, oldChildId, childId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildName() {
		return childName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildName(String newChildName) {
		String oldChildName = childName;
		childName = newChildName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CHILD_NAME, oldChildName, childName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildPath() {
		return childPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildPath(String newChildPath) {
		String oldChildPath = childPath;
		childPath = newChildPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CHILD_PATH, oldChildPath, childPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategories() {
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategories(String newCategories) {
		String oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CATEGORIES, oldCategories, categories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelevanceLevel() {
		return relevanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevanceLevel(String newRelevanceLevel) {
		String oldRelevanceLevel = relevanceLevel;
		relevanceLevel = newRelevanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL, oldRelevanceLevel, relevanceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(String newConfidence) {
		String oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecommendation() {
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommendation(String newRecommendation) {
		String oldRecommendation = recommendation;
		recommendation = newRecommendation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__RECOMMENDATION, oldRecommendation, recommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCitations() {
		return citations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitations(String newCitations) {
		String oldCitations = citations;
		citations = newCitations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CITATIONS, oldCitations, citations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeKind getChangeKind() {
		return changeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeKind(ChangeKind newChangeKind) {
		ChangeKind oldChangeKind = changeKind;
		changeKind = newChangeKind == null ? CHANGE_KIND_EDEFAULT : newChangeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CHANGE_KIND, oldChangeKind, changeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReviewStatus() {
		return reviewStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewStatus(String newReviewStatus) {
		String oldReviewStatus = reviewStatus;
		reviewStatus = newReviewStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__REVIEW_STATUS, oldReviewStatus, reviewStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolutionJustification() {
		return resolutionJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolutionJustification(String newResolutionJustification) {
		String oldResolutionJustification = resolutionJustification;
		resolutionJustification = newResolutionJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__RESOLUTION_JUSTIFICATION, oldResolutionJustification, resolutionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecidedBy() {
		return decidedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecidedBy(String newDecidedBy) {
		String oldDecidedBy = decidedBy;
		decidedBy = newDecidedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__DECIDED_BY, oldDecidedBy, decidedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecidedAt() {
		return decidedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecidedAt(String newDecidedAt) {
		String oldDecidedAt = decidedAt;
		decidedAt = newDecidedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__DECIDED_AT, oldDecidedAt, decidedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrectionNote() {
		return correctionNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectionNote(String newCorrectionNote) {
		String oldCorrectionNote = correctionNote;
		correctionNote = newCorrectionNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CORRECTION_NOTE, oldCorrectionNote, correctionNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextId() {
		return contextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextId(String newContextId) {
		String oldContextId = contextId;
		contextId = newContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__CONTEXT_ID, oldContextId, contextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirementIds() {
		return requirementIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementIds(String newRequirementIds) {
		String oldRequirementIds = requirementIds;
		requirementIds = newRequirementIds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__REQUIREMENT_IDS, oldRequirementIds, requirementIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetId() {
		return assetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetId(String newAssetId) {
		String oldAssetId = assetId;
		assetId = newAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__ASSET_ID, oldAssetId, assetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFindingOrigin() {
		return findingOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindingOrigin(String newFindingOrigin) {
		String oldFindingOrigin = findingOrigin;
		findingOrigin = newFindingOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__FINDING_ORIGIN, oldFindingOrigin, findingOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTreatment() {
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreatment(String newTreatment) {
		String oldTreatment = treatment;
		treatment = newTreatment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__TREATMENT, oldTreatment, treatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRiskLevel() {
		return riskLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskLevel(String newRiskLevel) {
		String oldRiskLevel = riskLevel;
		riskLevel = newRiskLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__RISK_LEVEL, oldRiskLevel, riskLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeasureIds() {
		return measureIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasureIds(String newMeasureIds) {
		String oldMeasureIds = measureIds;
		measureIds = newMeasureIds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__MEASURE_IDS, oldMeasureIds, measureIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTreatmentNote() {
		return treatmentNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreatmentNote(String newTreatmentNote) {
		String oldTreatmentNote = treatmentNote;
		treatmentNote = newTreatmentNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__TREATMENT_NOTE, oldTreatmentNote, treatmentNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelegatedTo() {
		return delegatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegatedTo(String newDelegatedTo) {
		String oldDelegatedTo = delegatedTo;
		delegatedTo = newDelegatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__DELEGATED_TO, oldDelegatedTo, delegatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLawfulBases() {
		return lawfulBases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawfulBases(String newLawfulBases) {
		String oldLawfulBases = lawfulBases;
		lawfulBases = newLawfulBases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EVALUATION_ROW__LAWFUL_BASES, oldLawfulBases, lawfulBases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				return getRevisionNumber();
			case HistoryPackage.EVALUATION_ROW__ELEMENT_ID:
				return getElementId();
			case HistoryPackage.EVALUATION_ROW__ELEMENT_NAME:
				return getElementName();
			case HistoryPackage.EVALUATION_ROW__ELEMENT_PATH:
				return getElementPath();
			case HistoryPackage.EVALUATION_ROW__CHILD_ID:
				return getChildId();
			case HistoryPackage.EVALUATION_ROW__CHILD_NAME:
				return getChildName();
			case HistoryPackage.EVALUATION_ROW__CHILD_PATH:
				return getChildPath();
			case HistoryPackage.EVALUATION_ROW__TYPE_NAME:
				return getTypeName();
			case HistoryPackage.EVALUATION_ROW__CATEGORIES:
				return getCategories();
			case HistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				return getRelevanceLevel();
			case HistoryPackage.EVALUATION_ROW__CONFIDENCE:
				return getConfidence();
			case HistoryPackage.EVALUATION_ROW__RATIONALE:
				return getRationale();
			case HistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				return getRecommendation();
			case HistoryPackage.EVALUATION_ROW__CITATIONS:
				return getCitations();
			case HistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				return getChangeKind();
			case HistoryPackage.EVALUATION_ROW__PURPOSE:
				return getPurpose();
			case HistoryPackage.EVALUATION_ROW__REVIEW_STATUS:
				return getReviewStatus();
			case HistoryPackage.EVALUATION_ROW__RESOLUTION_JUSTIFICATION:
				return getResolutionJustification();
			case HistoryPackage.EVALUATION_ROW__DECIDED_BY:
				return getDecidedBy();
			case HistoryPackage.EVALUATION_ROW__DECIDED_AT:
				return getDecidedAt();
			case HistoryPackage.EVALUATION_ROW__CORRECTION_NOTE:
				return getCorrectionNote();
			case HistoryPackage.EVALUATION_ROW__CONTEXT_ID:
				return getContextId();
			case HistoryPackage.EVALUATION_ROW__REQUIREMENT_IDS:
				return getRequirementIds();
			case HistoryPackage.EVALUATION_ROW__ASSET_ID:
				return getAssetId();
			case HistoryPackage.EVALUATION_ROW__FINDING_ORIGIN:
				return getFindingOrigin();
			case HistoryPackage.EVALUATION_ROW__TREATMENT:
				return getTreatment();
			case HistoryPackage.EVALUATION_ROW__RISK_LEVEL:
				return getRiskLevel();
			case HistoryPackage.EVALUATION_ROW__MEASURE_IDS:
				return getMeasureIds();
			case HistoryPackage.EVALUATION_ROW__TREATMENT_NOTE:
				return getTreatmentNote();
			case HistoryPackage.EVALUATION_ROW__DELEGATED_TO:
				return getDelegatedTo();
			case HistoryPackage.EVALUATION_ROW__DUE_DATE:
				return getDueDate();
			case HistoryPackage.EVALUATION_ROW__LAWFUL_BASES:
				return getLawfulBases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_PATH:
				setElementPath((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CHILD_ID:
				setChildId((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CHILD_NAME:
				setChildName((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CHILD_PATH:
				setChildPath((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CATEGORIES:
				setCategories((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				setRelevanceLevel((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CONFIDENCE:
				setConfidence((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__RATIONALE:
				setRationale((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				setRecommendation((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CITATIONS:
				setCitations((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				setChangeKind((ChangeKind)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__PURPOSE:
				setPurpose((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__REVIEW_STATUS:
				setReviewStatus((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__RESOLUTION_JUSTIFICATION:
				setResolutionJustification((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__DECIDED_BY:
				setDecidedBy((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__DECIDED_AT:
				setDecidedAt((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CORRECTION_NOTE:
				setCorrectionNote((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__CONTEXT_ID:
				setContextId((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__REQUIREMENT_IDS:
				setRequirementIds((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__ASSET_ID:
				setAssetId((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__FINDING_ORIGIN:
				setFindingOrigin((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__TREATMENT:
				setTreatment((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__RISK_LEVEL:
				setRiskLevel((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__MEASURE_IDS:
				setMeasureIds((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__TREATMENT_NOTE:
				setTreatmentNote((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__DELEGATED_TO:
				setDelegatedTo((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case HistoryPackage.EVALUATION_ROW__LAWFUL_BASES:
				setLawfulBases((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_PATH:
				setElementPath(ELEMENT_PATH_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CHILD_ID:
				setChildId(CHILD_ID_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CHILD_NAME:
				setChildName(CHILD_NAME_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CHILD_PATH:
				setChildPath(CHILD_PATH_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CATEGORIES:
				setCategories(CATEGORIES_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				setRelevanceLevel(RELEVANCE_LEVEL_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				setRecommendation(RECOMMENDATION_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CITATIONS:
				setCitations(CITATIONS_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				setChangeKind(CHANGE_KIND_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__REVIEW_STATUS:
				setReviewStatus(REVIEW_STATUS_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__RESOLUTION_JUSTIFICATION:
				setResolutionJustification(RESOLUTION_JUSTIFICATION_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__DECIDED_BY:
				setDecidedBy(DECIDED_BY_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__DECIDED_AT:
				setDecidedAt(DECIDED_AT_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CORRECTION_NOTE:
				setCorrectionNote(CORRECTION_NOTE_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__CONTEXT_ID:
				setContextId(CONTEXT_ID_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__REQUIREMENT_IDS:
				setRequirementIds(REQUIREMENT_IDS_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__ASSET_ID:
				setAssetId(ASSET_ID_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__FINDING_ORIGIN:
				setFindingOrigin(FINDING_ORIGIN_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__TREATMENT:
				setTreatment(TREATMENT_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__RISK_LEVEL:
				setRiskLevel(RISK_LEVEL_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__MEASURE_IDS:
				setMeasureIds(MEASURE_IDS_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__TREATMENT_NOTE:
				setTreatmentNote(TREATMENT_NOTE_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__DELEGATED_TO:
				setDelegatedTo(DELEGATED_TO_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case HistoryPackage.EVALUATION_ROW__LAWFUL_BASES:
				setLawfulBases(LAWFUL_BASES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case HistoryPackage.EVALUATION_ROW__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case HistoryPackage.EVALUATION_ROW__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case HistoryPackage.EVALUATION_ROW__ELEMENT_PATH:
				return ELEMENT_PATH_EDEFAULT == null ? elementPath != null : !ELEMENT_PATH_EDEFAULT.equals(elementPath);
			case HistoryPackage.EVALUATION_ROW__CHILD_ID:
				return CHILD_ID_EDEFAULT == null ? childId != null : !CHILD_ID_EDEFAULT.equals(childId);
			case HistoryPackage.EVALUATION_ROW__CHILD_NAME:
				return CHILD_NAME_EDEFAULT == null ? childName != null : !CHILD_NAME_EDEFAULT.equals(childName);
			case HistoryPackage.EVALUATION_ROW__CHILD_PATH:
				return CHILD_PATH_EDEFAULT == null ? childPath != null : !CHILD_PATH_EDEFAULT.equals(childPath);
			case HistoryPackage.EVALUATION_ROW__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case HistoryPackage.EVALUATION_ROW__CATEGORIES:
				return CATEGORIES_EDEFAULT == null ? categories != null : !CATEGORIES_EDEFAULT.equals(categories);
			case HistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				return RELEVANCE_LEVEL_EDEFAULT == null ? relevanceLevel != null : !RELEVANCE_LEVEL_EDEFAULT.equals(relevanceLevel);
			case HistoryPackage.EVALUATION_ROW__CONFIDENCE:
				return CONFIDENCE_EDEFAULT == null ? confidence != null : !CONFIDENCE_EDEFAULT.equals(confidence);
			case HistoryPackage.EVALUATION_ROW__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case HistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				return RECOMMENDATION_EDEFAULT == null ? recommendation != null : !RECOMMENDATION_EDEFAULT.equals(recommendation);
			case HistoryPackage.EVALUATION_ROW__CITATIONS:
				return CITATIONS_EDEFAULT == null ? citations != null : !CITATIONS_EDEFAULT.equals(citations);
			case HistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				return changeKind != CHANGE_KIND_EDEFAULT;
			case HistoryPackage.EVALUATION_ROW__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case HistoryPackage.EVALUATION_ROW__REVIEW_STATUS:
				return REVIEW_STATUS_EDEFAULT == null ? reviewStatus != null : !REVIEW_STATUS_EDEFAULT.equals(reviewStatus);
			case HistoryPackage.EVALUATION_ROW__RESOLUTION_JUSTIFICATION:
				return RESOLUTION_JUSTIFICATION_EDEFAULT == null ? resolutionJustification != null : !RESOLUTION_JUSTIFICATION_EDEFAULT.equals(resolutionJustification);
			case HistoryPackage.EVALUATION_ROW__DECIDED_BY:
				return DECIDED_BY_EDEFAULT == null ? decidedBy != null : !DECIDED_BY_EDEFAULT.equals(decidedBy);
			case HistoryPackage.EVALUATION_ROW__DECIDED_AT:
				return DECIDED_AT_EDEFAULT == null ? decidedAt != null : !DECIDED_AT_EDEFAULT.equals(decidedAt);
			case HistoryPackage.EVALUATION_ROW__CORRECTION_NOTE:
				return CORRECTION_NOTE_EDEFAULT == null ? correctionNote != null : !CORRECTION_NOTE_EDEFAULT.equals(correctionNote);
			case HistoryPackage.EVALUATION_ROW__CONTEXT_ID:
				return CONTEXT_ID_EDEFAULT == null ? contextId != null : !CONTEXT_ID_EDEFAULT.equals(contextId);
			case HistoryPackage.EVALUATION_ROW__REQUIREMENT_IDS:
				return REQUIREMENT_IDS_EDEFAULT == null ? requirementIds != null : !REQUIREMENT_IDS_EDEFAULT.equals(requirementIds);
			case HistoryPackage.EVALUATION_ROW__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? assetId != null : !ASSET_ID_EDEFAULT.equals(assetId);
			case HistoryPackage.EVALUATION_ROW__FINDING_ORIGIN:
				return FINDING_ORIGIN_EDEFAULT == null ? findingOrigin != null : !FINDING_ORIGIN_EDEFAULT.equals(findingOrigin);
			case HistoryPackage.EVALUATION_ROW__TREATMENT:
				return TREATMENT_EDEFAULT == null ? treatment != null : !TREATMENT_EDEFAULT.equals(treatment);
			case HistoryPackage.EVALUATION_ROW__RISK_LEVEL:
				return RISK_LEVEL_EDEFAULT == null ? riskLevel != null : !RISK_LEVEL_EDEFAULT.equals(riskLevel);
			case HistoryPackage.EVALUATION_ROW__MEASURE_IDS:
				return MEASURE_IDS_EDEFAULT == null ? measureIds != null : !MEASURE_IDS_EDEFAULT.equals(measureIds);
			case HistoryPackage.EVALUATION_ROW__TREATMENT_NOTE:
				return TREATMENT_NOTE_EDEFAULT == null ? treatmentNote != null : !TREATMENT_NOTE_EDEFAULT.equals(treatmentNote);
			case HistoryPackage.EVALUATION_ROW__DELEGATED_TO:
				return DELEGATED_TO_EDEFAULT == null ? delegatedTo != null : !DELEGATED_TO_EDEFAULT.equals(delegatedTo);
			case HistoryPackage.EVALUATION_ROW__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case HistoryPackage.EVALUATION_ROW__LAWFUL_BASES:
				return LAWFUL_BASES_EDEFAULT == null ? lawfulBases != null : !LAWFUL_BASES_EDEFAULT.equals(lawfulBases);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (revisionNumber: ");
		result.append(revisionNumber);
		result.append(", elementId: ");
		result.append(elementId);
		result.append(", elementName: ");
		result.append(elementName);
		result.append(", elementPath: ");
		result.append(elementPath);
		result.append(", childId: ");
		result.append(childId);
		result.append(", childName: ");
		result.append(childName);
		result.append(", childPath: ");
		result.append(childPath);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", categories: ");
		result.append(categories);
		result.append(", relevanceLevel: ");
		result.append(relevanceLevel);
		result.append(", confidence: ");
		result.append(confidence);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", recommendation: ");
		result.append(recommendation);
		result.append(", citations: ");
		result.append(citations);
		result.append(", changeKind: ");
		result.append(changeKind);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", reviewStatus: ");
		result.append(reviewStatus);
		result.append(", resolutionJustification: ");
		result.append(resolutionJustification);
		result.append(", decidedBy: ");
		result.append(decidedBy);
		result.append(", decidedAt: ");
		result.append(decidedAt);
		result.append(", correctionNote: ");
		result.append(correctionNote);
		result.append(", contextId: ");
		result.append(contextId);
		result.append(", requirementIds: ");
		result.append(requirementIds);
		result.append(", assetId: ");
		result.append(assetId);
		result.append(", findingOrigin: ");
		result.append(findingOrigin);
		result.append(", treatment: ");
		result.append(treatment);
		result.append(", riskLevel: ");
		result.append(riskLevel);
		result.append(", measureIds: ");
		result.append(measureIds);
		result.append(", treatmentNote: ");
		result.append(treatmentNote);
		result.append(", delegatedTo: ");
		result.append(delegatedTo);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", lawfulBases: ");
		result.append(lawfulBases);
		result.append(')');
		return result.toString();
	}

} //EvaluationRowImpl
