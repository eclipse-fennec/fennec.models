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
package org.eclipse.fennec.model.compliance.inventory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.RiskLevel;
import org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Matrix Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl#getRisk <em>Risk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskMatrixCellImpl extends MinimalEObjectImpl.Container implements RiskMatrixCell {
	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel likelihood;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel severity;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel risk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskMatrixCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.RISK_MATRIX_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getLikelihood() {
		if (likelihood != null && likelihood.eIsProxy()) {
			InternalEObject oldLikelihood = (InternalEObject)likelihood;
			likelihood = (RiskLevel)eResolveProxy(oldLikelihood);
			if (likelihood != oldLikelihood) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.RISK_MATRIX_CELL__LIKELIHOOD, oldLikelihood, likelihood));
			}
		}
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(RiskLevel newLikelihood) {
		RiskLevel oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_MATRIX_CELL__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (RiskLevel)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.RISK_MATRIX_CELL__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(RiskLevel newSeverity) {
		RiskLevel oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_MATRIX_CELL__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getRisk() {
		if (risk != null && risk.eIsProxy()) {
			InternalEObject oldRisk = (InternalEObject)risk;
			risk = (RiskLevel)eResolveProxy(oldRisk);
			if (risk != oldRisk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.RISK_MATRIX_CELL__RISK, oldRisk, risk));
			}
		}
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRisk(RiskLevel newRisk) {
		RiskLevel oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_MATRIX_CELL__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.RISK_MATRIX_CELL__LIKELIHOOD:
				if (resolve) return getLikelihood();
				return basicGetLikelihood();
			case InventoryPackage.RISK_MATRIX_CELL__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case InventoryPackage.RISK_MATRIX_CELL__RISK:
				if (resolve) return getRisk();
				return basicGetRisk();
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
			case InventoryPackage.RISK_MATRIX_CELL__LIKELIHOOD:
				setLikelihood((RiskLevel)newValue);
				return;
			case InventoryPackage.RISK_MATRIX_CELL__SEVERITY:
				setSeverity((RiskLevel)newValue);
				return;
			case InventoryPackage.RISK_MATRIX_CELL__RISK:
				setRisk((RiskLevel)newValue);
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
			case InventoryPackage.RISK_MATRIX_CELL__LIKELIHOOD:
				setLikelihood((RiskLevel)null);
				return;
			case InventoryPackage.RISK_MATRIX_CELL__SEVERITY:
				setSeverity((RiskLevel)null);
				return;
			case InventoryPackage.RISK_MATRIX_CELL__RISK:
				setRisk((RiskLevel)null);
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
			case InventoryPackage.RISK_MATRIX_CELL__LIKELIHOOD:
				return likelihood != null;
			case InventoryPackage.RISK_MATRIX_CELL__SEVERITY:
				return severity != null;
			case InventoryPackage.RISK_MATRIX_CELL__RISK:
				return risk != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskMatrixCellImpl
