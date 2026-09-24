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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.gdprReport.FlowEvaluation;
import org.eclipse.fennec.model.gdprReport.FlowKind;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.RelevanceLevelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getSourceNsURI <em>Source Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getTargetNsURI <em>Target Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getFlowKind <em>Flow Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FlowEvaluationImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowEvaluationImpl extends EvaluationImpl implements FlowEvaluation {
	/**
	 * The default value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected String mapping = MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceNsURI() <em>Source Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceNsURI() <em>Source Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNsURI()
	 * @generated
	 * @ordered
	 */
	protected String sourceNsURI = SOURCE_NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceFeature() <em>Source Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFeature() <em>Source Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected String sourceFeature = SOURCE_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNsURI() <em>Target Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNsURI() <em>Target Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNsURI()
	 * @generated
	 * @ordered
	 */
	protected String targetNsURI = TARGET_NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFeature() <em>Target Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFeature() <em>Target Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected String targetFeature = TARGET_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowKind() <em>Flow Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowKind()
	 * @generated
	 * @ordered
	 */
	protected static final FlowKind FLOW_KIND_EDEFAULT = FlowKind.DIRECT;

	/**
	 * The cached value of the '{@link #getFlowKind() <em>Flow Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowKind()
	 * @generated
	 * @ordered
	 */
	protected FlowKind flowKind = FLOW_KIND_EDEFAULT;

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
	protected FlowEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.FLOW_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapping(String newMapping) {
		String oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceNsURI() {
		return sourceNsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceNsURI(String newSourceNsURI) {
		String oldSourceNsURI = sourceNsURI;
		sourceNsURI = newSourceNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__SOURCE_NS_URI, oldSourceNsURI, sourceNsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceFeature() {
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceFeature(String newSourceFeature) {
		String oldSourceFeature = sourceFeature;
		sourceFeature = newSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNsURI() {
		return targetNsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNsURI(String newTargetNsURI) {
		String oldTargetNsURI = targetNsURI;
		targetNsURI = newTargetNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__TARGET_NS_URI, oldTargetNsURI, targetNsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetFeature() {
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetFeature(String newTargetFeature) {
		String oldTargetFeature = targetFeature;
		targetFeature = newTargetFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__TARGET_FEATURE, oldTargetFeature, targetFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowKind getFlowKind() {
		return flowKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowKind(FlowKind newFlowKind) {
		FlowKind oldFlowKind = flowKind;
		flowKind = newFlowKind == null ? FLOW_KIND_EDEFAULT : newFlowKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__FLOW_KIND, oldFlowKind, flowKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__RELEVANCE_LEVEL, oldRelevanceLevel, relevanceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FLOW_EVALUATION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.FLOW_EVALUATION__MAPPING:
				return getMapping();
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_NS_URI:
				return getSourceNsURI();
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_FEATURE:
				return getSourceFeature();
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_NS_URI:
				return getTargetNsURI();
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_FEATURE:
				return getTargetFeature();
			case GDPRReportPackage.FLOW_EVALUATION__FLOW_KIND:
				return getFlowKind();
			case GDPRReportPackage.FLOW_EVALUATION__RELEVANCE_LEVEL:
				return getRelevanceLevel();
			case GDPRReportPackage.FLOW_EVALUATION__PURPOSE:
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
			case GDPRReportPackage.FLOW_EVALUATION__MAPPING:
				setMapping((String)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_NS_URI:
				setSourceNsURI((String)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_FEATURE:
				setSourceFeature((String)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_NS_URI:
				setTargetNsURI((String)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_FEATURE:
				setTargetFeature((String)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__FLOW_KIND:
				setFlowKind((FlowKind)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__RELEVANCE_LEVEL:
				setRelevanceLevel((RelevanceLevelType)newValue);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__PURPOSE:
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
			case GDPRReportPackage.FLOW_EVALUATION__MAPPING:
				setMapping(MAPPING_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_NS_URI:
				setSourceNsURI(SOURCE_NS_URI_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_FEATURE:
				setSourceFeature(SOURCE_FEATURE_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_NS_URI:
				setTargetNsURI(TARGET_NS_URI_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_FEATURE:
				setTargetFeature(TARGET_FEATURE_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__FLOW_KIND:
				setFlowKind(FLOW_KIND_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__RELEVANCE_LEVEL:
				setRelevanceLevel(RELEVANCE_LEVEL_EDEFAULT);
				return;
			case GDPRReportPackage.FLOW_EVALUATION__PURPOSE:
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
			case GDPRReportPackage.FLOW_EVALUATION__MAPPING:
				return MAPPING_EDEFAULT == null ? mapping != null : !MAPPING_EDEFAULT.equals(mapping);
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_NS_URI:
				return SOURCE_NS_URI_EDEFAULT == null ? sourceNsURI != null : !SOURCE_NS_URI_EDEFAULT.equals(sourceNsURI);
			case GDPRReportPackage.FLOW_EVALUATION__SOURCE_FEATURE:
				return SOURCE_FEATURE_EDEFAULT == null ? sourceFeature != null : !SOURCE_FEATURE_EDEFAULT.equals(sourceFeature);
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_NS_URI:
				return TARGET_NS_URI_EDEFAULT == null ? targetNsURI != null : !TARGET_NS_URI_EDEFAULT.equals(targetNsURI);
			case GDPRReportPackage.FLOW_EVALUATION__TARGET_FEATURE:
				return TARGET_FEATURE_EDEFAULT == null ? targetFeature != null : !TARGET_FEATURE_EDEFAULT.equals(targetFeature);
			case GDPRReportPackage.FLOW_EVALUATION__FLOW_KIND:
				return flowKind != FLOW_KIND_EDEFAULT;
			case GDPRReportPackage.FLOW_EVALUATION__RELEVANCE_LEVEL:
				return relevanceLevel != RELEVANCE_LEVEL_EDEFAULT;
			case GDPRReportPackage.FLOW_EVALUATION__PURPOSE:
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
		result.append(" (mapping: ");
		result.append(mapping);
		result.append(", sourceNsURI: ");
		result.append(sourceNsURI);
		result.append(", sourceFeature: ");
		result.append(sourceFeature);
		result.append(", targetNsURI: ");
		result.append(targetNsURI);
		result.append(", targetFeature: ");
		result.append(targetFeature);
		result.append(", flowKind: ");
		result.append(flowKind);
		result.append(", relevanceLevel: ");
		result.append(relevanceLevel);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //FlowEvaluationImpl
