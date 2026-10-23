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
package org.eclipse.fennec.model.compliance.report.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.report.ReportPackage;
import org.eclipse.fennec.model.compliance.report.RiskAssessment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.RiskAssessmentImpl#getMethodologyId <em>Methodology Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.RiskAssessmentImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.RiskAssessmentImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.RiskAssessmentImpl#getRiskLevel <em>Risk Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentImpl extends MinimalEObjectImpl.Container implements RiskAssessment {
	/**
	 * The default value of the '{@link #getMethodologyId() <em>Methodology Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodologyId()
	 * @generated
	 * @ordered
	 */
	protected static final String METHODOLOGY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodologyId() <em>Methodology Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodologyId()
	 * @generated
	 * @ordered
	 */
	protected String methodologyId = METHODOLOGY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final String LIKELIHOOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected String likelihood = LIKELIHOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.RISK_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodologyId() {
		return methodologyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodologyId(String newMethodologyId) {
		String oldMethodologyId = methodologyId;
		methodologyId = newMethodologyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.RISK_ASSESSMENT__METHODOLOGY_ID, oldMethodologyId, methodologyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(String newLikelihood) {
		String oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.RISK_ASSESSMENT__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.RISK_ASSESSMENT__SEVERITY, oldSeverity, severity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.RISK_ASSESSMENT__RISK_LEVEL, oldRiskLevel, riskLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.RISK_ASSESSMENT__METHODOLOGY_ID:
				return getMethodologyId();
			case ReportPackage.RISK_ASSESSMENT__LIKELIHOOD:
				return getLikelihood();
			case ReportPackage.RISK_ASSESSMENT__SEVERITY:
				return getSeverity();
			case ReportPackage.RISK_ASSESSMENT__RISK_LEVEL:
				return getRiskLevel();
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
			case ReportPackage.RISK_ASSESSMENT__METHODOLOGY_ID:
				setMethodologyId((String)newValue);
				return;
			case ReportPackage.RISK_ASSESSMENT__LIKELIHOOD:
				setLikelihood((String)newValue);
				return;
			case ReportPackage.RISK_ASSESSMENT__SEVERITY:
				setSeverity((String)newValue);
				return;
			case ReportPackage.RISK_ASSESSMENT__RISK_LEVEL:
				setRiskLevel((String)newValue);
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
			case ReportPackage.RISK_ASSESSMENT__METHODOLOGY_ID:
				setMethodologyId(METHODOLOGY_ID_EDEFAULT);
				return;
			case ReportPackage.RISK_ASSESSMENT__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
				return;
			case ReportPackage.RISK_ASSESSMENT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case ReportPackage.RISK_ASSESSMENT__RISK_LEVEL:
				setRiskLevel(RISK_LEVEL_EDEFAULT);
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
			case ReportPackage.RISK_ASSESSMENT__METHODOLOGY_ID:
				return METHODOLOGY_ID_EDEFAULT == null ? methodologyId != null : !METHODOLOGY_ID_EDEFAULT.equals(methodologyId);
			case ReportPackage.RISK_ASSESSMENT__LIKELIHOOD:
				return LIKELIHOOD_EDEFAULT == null ? likelihood != null : !LIKELIHOOD_EDEFAULT.equals(likelihood);
			case ReportPackage.RISK_ASSESSMENT__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case ReportPackage.RISK_ASSESSMENT__RISK_LEVEL:
				return RISK_LEVEL_EDEFAULT == null ? riskLevel != null : !RISK_LEVEL_EDEFAULT.equals(riskLevel);
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
		result.append(" (methodologyId: ");
		result.append(methodologyId);
		result.append(", likelihood: ");
		result.append(likelihood);
		result.append(", severity: ");
		result.append(severity);
		result.append(", riskLevel: ");
		result.append(riskLevel);
		result.append(')');
		return result.toString();
	}

} //RiskAssessmentImpl
