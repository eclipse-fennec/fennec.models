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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdprReport.CombinationFinding;
import org.eclipse.fennec.model.gdprReport.Evaluation;
import org.eclipse.fennec.model.gdprReport.Finding;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvaluationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvaluationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvaluationImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvaluationImpl#getPartOfCombinations <em>Part Of Combinations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EvaluationImpl extends MinimalEObjectImpl.Container implements Evaluation {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFindings() <em>Findings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Finding> findings;

	/**
	 * The cached value of the '{@link #getPartOfCombinations() <em>Part Of Combinations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfCombinations()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinationFinding> partOfCombinations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.EVALUATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVALUATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVALUATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Finding> getFindings() {
		if (findings == null) {
			findings = new EObjectContainmentEList<Finding>(Finding.class, this, GDPRReportPackage.EVALUATION__FINDINGS);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CombinationFinding> getPartOfCombinations() {
		if (partOfCombinations == null) {
			partOfCombinations = new EObjectWithInverseResolvingEList.ManyInverse<CombinationFinding>(CombinationFinding.class, this, GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS, GDPRReportPackage.COMBINATION_FINDING__FEATURES);
		}
		return partOfCombinations;
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
			case GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOfCombinations()).basicAdd(otherEnd, msgs);
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
			case GDPRReportPackage.EVALUATION__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS:
				return ((InternalEList<?>)getPartOfCombinations()).basicRemove(otherEnd, msgs);
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
			case GDPRReportPackage.EVALUATION__ID:
				return getId();
			case GDPRReportPackage.EVALUATION__NAME:
				return getName();
			case GDPRReportPackage.EVALUATION__FINDINGS:
				return getFindings();
			case GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS:
				return getPartOfCombinations();
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
			case GDPRReportPackage.EVALUATION__ID:
				setId((String)newValue);
				return;
			case GDPRReportPackage.EVALUATION__NAME:
				setName((String)newValue);
				return;
			case GDPRReportPackage.EVALUATION__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Finding>)newValue);
				return;
			case GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS:
				getPartOfCombinations().clear();
				getPartOfCombinations().addAll((Collection<? extends CombinationFinding>)newValue);
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
			case GDPRReportPackage.EVALUATION__ID:
				setId(ID_EDEFAULT);
				return;
			case GDPRReportPackage.EVALUATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GDPRReportPackage.EVALUATION__FINDINGS:
				getFindings().clear();
				return;
			case GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS:
				getPartOfCombinations().clear();
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
			case GDPRReportPackage.EVALUATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GDPRReportPackage.EVALUATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GDPRReportPackage.EVALUATION__FINDINGS:
				return findings != null && !findings.isEmpty();
			case GDPRReportPackage.EVALUATION__PART_OF_COMBINATIONS:
				return partOfCombinations != null && !partOfCombinations.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
