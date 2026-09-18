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
package org.eclipse.fennec.model.gdprReportHistory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.gdprReportHistory.ChangeKind;
import org.eclipse.fennec.model.gdprReportHistory.EvaluationRow;
import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getClassifierId <em>Classifier Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getClassifierUriFragment <em>Classifier Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getFeatureUriFragment <em>Feature Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getChangeKind <em>Change Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl#getPurpose <em>Purpose</em>}</li>
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
	 * The default value of the '{@link #getClassifierId() <em>Classifier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierId() <em>Classifier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierId()
	 * @generated
	 * @ordered
	 */
	protected String classifierId = CLASSIFIER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected String classifierName = CLASSIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierUriFragment() <em>Classifier Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierUriFragment()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_URI_FRAGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierUriFragment() <em>Classifier Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierUriFragment()
	 * @generated
	 * @ordered
	 */
	protected String classifierUriFragment = CLASSIFIER_URI_FRAGMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureId() <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureId() <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String featureId = FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureUriFragment() <em>Feature Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureUriFragment()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_URI_FRAGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureUriFragment() <em>Feature Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureUriFragment()
	 * @generated
	 * @ordered
	 */
	protected String featureUriFragment = FEATURE_URI_FRAGMENT_EDEFAULT;

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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
		return GDPRReportHistoryPackage.Literals.EVALUATION_ROW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassifierId() {
		return classifierId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifierId(String newClassifierId) {
		String oldClassifierId = classifierId;
		classifierId = newClassifierId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_ID, oldClassifierId, classifierId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassifierName() {
		return classifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifierName(String newClassifierName) {
		String oldClassifierName = classifierName;
		classifierName = newClassifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_NAME, oldClassifierName, classifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassifierUriFragment() {
		return classifierUriFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifierUriFragment(String newClassifierUriFragment) {
		String oldClassifierUriFragment = classifierUriFragment;
		classifierUriFragment = newClassifierUriFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT, oldClassifierUriFragment, classifierUriFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureId() {
		return featureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureId(String newFeatureId) {
		String oldFeatureId = featureId;
		featureId = newFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_ID, oldFeatureId, featureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureUriFragment() {
		return featureUriFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureUriFragment(String newFeatureUriFragment) {
		String oldFeatureUriFragment = featureUriFragment;
		featureUriFragment = newFeatureUriFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_URI_FRAGMENT, oldFeatureUriFragment, featureUriFragment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL, oldRelevanceLevel, relevanceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CONFIDENCE, oldConfidence, confidence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__RATIONALE, oldRationale, rationale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__RECOMMENDATION, oldRecommendation, recommendation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CITATIONS, oldCitations, citations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__CHANGE_KIND, oldChangeKind, changeKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.EVALUATION_ROW__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportHistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				return getRevisionNumber();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_ID:
				return getClassifierId();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_NAME:
				return getClassifierName();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT:
				return getClassifierUriFragment();
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_ID:
				return getFeatureId();
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_NAME:
				return getFeatureName();
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_URI_FRAGMENT:
				return getFeatureUriFragment();
			case GDPRReportHistoryPackage.EVALUATION_ROW__TYPE_NAME:
				return getTypeName();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CATEGORY:
				return getCategory();
			case GDPRReportHistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				return getRelevanceLevel();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CONFIDENCE:
				return getConfidence();
			case GDPRReportHistoryPackage.EVALUATION_ROW__RATIONALE:
				return getRationale();
			case GDPRReportHistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				return getRecommendation();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CITATIONS:
				return getCitations();
			case GDPRReportHistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				return getChangeKind();
			case GDPRReportHistoryPackage.EVALUATION_ROW__PURPOSE:
				return getPurpose();
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
			case GDPRReportHistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_ID:
				setClassifierId((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT:
				setClassifierUriFragment((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_ID:
				setFeatureId((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_URI_FRAGMENT:
				setFeatureUriFragment((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CATEGORY:
				setCategory((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				setRelevanceLevel((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CONFIDENCE:
				setConfidence((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__RATIONALE:
				setRationale((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				setRecommendation((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CITATIONS:
				setCitations((String)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				setChangeKind((ChangeKind)newValue);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__PURPOSE:
				setPurpose((String)newValue);
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
			case GDPRReportHistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_ID:
				setClassifierId(CLASSIFIER_ID_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT:
				setClassifierUriFragment(CLASSIFIER_URI_FRAGMENT_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_ID:
				setFeatureId(FEATURE_ID_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_URI_FRAGMENT:
				setFeatureUriFragment(FEATURE_URI_FRAGMENT_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				setRelevanceLevel(RELEVANCE_LEVEL_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				setRecommendation(RECOMMENDATION_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CITATIONS:
				setCitations(CITATIONS_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				setChangeKind(CHANGE_KIND_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.EVALUATION_ROW__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
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
			case GDPRReportHistoryPackage.EVALUATION_ROW__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_ID:
				return CLASSIFIER_ID_EDEFAULT == null ? classifierId != null : !CLASSIFIER_ID_EDEFAULT.equals(classifierId);
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? classifierName != null : !CLASSIFIER_NAME_EDEFAULT.equals(classifierName);
			case GDPRReportHistoryPackage.EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT:
				return CLASSIFIER_URI_FRAGMENT_EDEFAULT == null ? classifierUriFragment != null : !CLASSIFIER_URI_FRAGMENT_EDEFAULT.equals(classifierUriFragment);
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_ID:
				return FEATURE_ID_EDEFAULT == null ? featureId != null : !FEATURE_ID_EDEFAULT.equals(featureId);
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case GDPRReportHistoryPackage.EVALUATION_ROW__FEATURE_URI_FRAGMENT:
				return FEATURE_URI_FRAGMENT_EDEFAULT == null ? featureUriFragment != null : !FEATURE_URI_FRAGMENT_EDEFAULT.equals(featureUriFragment);
			case GDPRReportHistoryPackage.EVALUATION_ROW__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case GDPRReportHistoryPackage.EVALUATION_ROW__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case GDPRReportHistoryPackage.EVALUATION_ROW__RELEVANCE_LEVEL:
				return RELEVANCE_LEVEL_EDEFAULT == null ? relevanceLevel != null : !RELEVANCE_LEVEL_EDEFAULT.equals(relevanceLevel);
			case GDPRReportHistoryPackage.EVALUATION_ROW__CONFIDENCE:
				return CONFIDENCE_EDEFAULT == null ? confidence != null : !CONFIDENCE_EDEFAULT.equals(confidence);
			case GDPRReportHistoryPackage.EVALUATION_ROW__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case GDPRReportHistoryPackage.EVALUATION_ROW__RECOMMENDATION:
				return RECOMMENDATION_EDEFAULT == null ? recommendation != null : !RECOMMENDATION_EDEFAULT.equals(recommendation);
			case GDPRReportHistoryPackage.EVALUATION_ROW__CITATIONS:
				return CITATIONS_EDEFAULT == null ? citations != null : !CITATIONS_EDEFAULT.equals(citations);
			case GDPRReportHistoryPackage.EVALUATION_ROW__CHANGE_KIND:
				return changeKind != CHANGE_KIND_EDEFAULT;
			case GDPRReportHistoryPackage.EVALUATION_ROW__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		result.append(", classifierId: ");
		result.append(classifierId);
		result.append(", classifierName: ");
		result.append(classifierName);
		result.append(", classifierUriFragment: ");
		result.append(classifierUriFragment);
		result.append(", featureId: ");
		result.append(featureId);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(", featureUriFragment: ");
		result.append(featureUriFragment);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", category: ");
		result.append(category);
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
		result.append(')');
		return result.toString();
	}

} //EvaluationRowImpl
