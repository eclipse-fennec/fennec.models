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
package org.eclipse.fennec.model.gdprReport.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdprReport.ConfidenceType;
import org.eclipse.fennec.model.gdprReport.DataCategory;
import org.eclipse.fennec.model.gdprReport.DetectionSignal;
import org.eclipse.fennec.model.gdprReport.Evidence;
import org.eclipse.fennec.model.gdprReport.Finding;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.RelevanceLevelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getDetectedBy <em>Detected By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getSignalValues <em>Signal Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends MinimalEObjectImpl.Container implements Finding {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final DataCategory CATEGORY_EDEFAULT = DataCategory.NOT_PERSONAL_DATA;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected DataCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RelevanceLevelType RELEVANCE_LEVEL_EDEFAULT = RelevanceLevelType.NONE;

	/**
	 * The cached value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected RelevanceLevelType relevanceLevel = RELEVANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final ConfidenceType CONFIDENCE_EDEFAULT = ConfidenceType.LOW;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected ConfidenceType confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetectedBy() <em>Detected By</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectionSignal> detectedBy;

	/**
	 * The cached value of the '{@link #getSignalValues() <em>Signal Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> signalValues;

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
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> evidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(DataCategory newCategory) {
		DataCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelevanceLevelType getRelevanceLevel() {
		return relevanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevanceLevel(RelevanceLevelType newRelevanceLevel) {
		RelevanceLevelType oldRelevanceLevel = relevanceLevel;
		relevanceLevel = newRelevanceLevel == null ? RELEVANCE_LEVEL_EDEFAULT : newRelevanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING__RELEVANCE_LEVEL, oldRelevanceLevel, relevanceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceType getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(ConfidenceType newConfidence) {
		ConfidenceType oldConfidence = confidence;
		confidence = newConfidence == null ? CONFIDENCE_EDEFAULT : newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectionSignal> getDetectedBy() {
		if (detectedBy == null) {
			detectedBy = new EDataTypeUniqueEList<DetectionSignal>(DetectionSignal.class, this, GDPRReportPackage.FINDING__DETECTED_BY);
		}
		return detectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSignalValues() {
		if (signalValues == null) {
			signalValues = new EDataTypeUniqueEList<String>(String.class, this, GDPRReportPackage.FINDING__SIGNAL_VALUES);
		}
		return signalValues;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING__RATIONALE, oldRationale, rationale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING__RECOMMENDATION, oldRecommendation, recommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Evidence> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, GDPRReportPackage.FINDING__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportPackage.FINDING__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.FINDING__ID:
				return getId();
			case GDPRReportPackage.FINDING__CATEGORY:
				return getCategory();
			case GDPRReportPackage.FINDING__RELEVANCE_LEVEL:
				return getRelevanceLevel();
			case GDPRReportPackage.FINDING__CONFIDENCE:
				return getConfidence();
			case GDPRReportPackage.FINDING__DETECTED_BY:
				return getDetectedBy();
			case GDPRReportPackage.FINDING__SIGNAL_VALUES:
				return getSignalValues();
			case GDPRReportPackage.FINDING__RATIONALE:
				return getRationale();
			case GDPRReportPackage.FINDING__RECOMMENDATION:
				return getRecommendation();
			case GDPRReportPackage.FINDING__EVIDENCE:
				return getEvidence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GDPRReportPackage.FINDING__ID:
				setId((String)newValue);
				return;
			case GDPRReportPackage.FINDING__CATEGORY:
				setCategory((DataCategory)newValue);
				return;
			case GDPRReportPackage.FINDING__RELEVANCE_LEVEL:
				setRelevanceLevel((RelevanceLevelType)newValue);
				return;
			case GDPRReportPackage.FINDING__CONFIDENCE:
				setConfidence((ConfidenceType)newValue);
				return;
			case GDPRReportPackage.FINDING__DETECTED_BY:
				getDetectedBy().clear();
				getDetectedBy().addAll((Collection<? extends DetectionSignal>)newValue);
				return;
			case GDPRReportPackage.FINDING__SIGNAL_VALUES:
				getSignalValues().clear();
				getSignalValues().addAll((Collection<? extends String>)newValue);
				return;
			case GDPRReportPackage.FINDING__RATIONALE:
				setRationale((String)newValue);
				return;
			case GDPRReportPackage.FINDING__RECOMMENDATION:
				setRecommendation((String)newValue);
				return;
			case GDPRReportPackage.FINDING__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
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
			case GDPRReportPackage.FINDING__ID:
				setId(ID_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING__RELEVANCE_LEVEL:
				setRelevanceLevel(RELEVANCE_LEVEL_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING__DETECTED_BY:
				getDetectedBy().clear();
				return;
			case GDPRReportPackage.FINDING__SIGNAL_VALUES:
				getSignalValues().clear();
				return;
			case GDPRReportPackage.FINDING__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING__RECOMMENDATION:
				setRecommendation(RECOMMENDATION_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING__EVIDENCE:
				getEvidence().clear();
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
			case GDPRReportPackage.FINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GDPRReportPackage.FINDING__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case GDPRReportPackage.FINDING__RELEVANCE_LEVEL:
				return relevanceLevel != RELEVANCE_LEVEL_EDEFAULT;
			case GDPRReportPackage.FINDING__CONFIDENCE:
				return confidence != CONFIDENCE_EDEFAULT;
			case GDPRReportPackage.FINDING__DETECTED_BY:
				return detectedBy != null && !detectedBy.isEmpty();
			case GDPRReportPackage.FINDING__SIGNAL_VALUES:
				return signalValues != null && !signalValues.isEmpty();
			case GDPRReportPackage.FINDING__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case GDPRReportPackage.FINDING__RECOMMENDATION:
				return RECOMMENDATION_EDEFAULT == null ? recommendation != null : !RECOMMENDATION_EDEFAULT.equals(recommendation);
			case GDPRReportPackage.FINDING__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", category: ");
		result.append(category);
		result.append(", relevanceLevel: ");
		result.append(relevanceLevel);
		result.append(", confidence: ");
		result.append(confidence);
		result.append(", detectedBy: ");
		result.append(detectedBy);
		result.append(", signalValues: ");
		result.append(signalValues);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", recommendation: ");
		result.append(recommendation);
		result.append(')');
		return result.toString();
	}

} //FindingImpl
