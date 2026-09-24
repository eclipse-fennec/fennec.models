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

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdprReport.CombinationFinding;
import org.eclipse.fennec.model.gdprReport.CombinationKind;
import org.eclipse.fennec.model.gdprReport.Evaluation;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combination Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.CombinationFindingImpl#getCombinationKind <em>Combination Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.CombinationFindingImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinationFindingImpl extends FindingImpl implements CombinationFinding {
	/**
	 * The default value of the '{@link #getCombinationKind() <em>Combination Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationKind()
	 * @generated
	 * @ordered
	 */
	protected static final CombinationKind COMBINATION_KIND_EDEFAULT = CombinationKind.QUASI_IDENTIFIER_SET;

	/**
	 * The cached value of the '{@link #getCombinationKind() <em>Combination Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationKind()
	 * @generated
	 * @ordered
	 */
	protected CombinationKind combinationKind = COMBINATION_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinationFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.COMBINATION_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinationKind getCombinationKind() {
		return combinationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCombinationKind(CombinationKind newCombinationKind) {
		CombinationKind oldCombinationKind = combinationKind;
		combinationKind = newCombinationKind == null ? COMBINATION_KIND_EDEFAULT : newCombinationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.COMBINATION_FINDING__COMBINATION_KIND, oldCombinationKind, combinationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Evaluation> getFeatures() {
		if (features == null) {
			features = new EObjectWithInverseEList.ManyInverse<Evaluation>(Evaluation.class, this, GDPRReportPackage.COMBINATION_FINDING__FEATURES, GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportPackage.COMBINATION_FINDING__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportPackage.COMBINATION_FINDING__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case GDPRReportPackage.COMBINATION_FINDING__COMBINATION_KIND:
				return getCombinationKind();
			case GDPRReportPackage.COMBINATION_FINDING__FEATURES:
				return getFeatures();
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
			case GDPRReportPackage.COMBINATION_FINDING__COMBINATION_KIND:
				setCombinationKind((CombinationKind)newValue);
				return;
			case GDPRReportPackage.COMBINATION_FINDING__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Evaluation>)newValue);
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
			case GDPRReportPackage.COMBINATION_FINDING__COMBINATION_KIND:
				setCombinationKind(COMBINATION_KIND_EDEFAULT);
				return;
			case GDPRReportPackage.COMBINATION_FINDING__FEATURES:
				getFeatures().clear();
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
			case GDPRReportPackage.COMBINATION_FINDING__COMBINATION_KIND:
				return combinationKind != COMBINATION_KIND_EDEFAULT;
			case GDPRReportPackage.COMBINATION_FINDING__FEATURES:
				return features != null && !features.isEmpty();
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
		result.append(" (combinationKind: ");
		result.append(combinationKind);
		result.append(')');
		return result.toString();
	}

} //CombinationFindingImpl
