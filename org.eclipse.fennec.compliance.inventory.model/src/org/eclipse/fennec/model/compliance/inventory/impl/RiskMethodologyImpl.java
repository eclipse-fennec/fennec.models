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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell;
import org.eclipse.fennec.model.compliance.inventory.RiskMethodology;
import org.eclipse.fennec.model.compliance.inventory.RiskScale;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Methodology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskMethodologyImpl extends MinimalEObjectImpl.Container implements RiskMethodology {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected RiskScale likelihood;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected RiskScale severity;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected RiskScale risk;

	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskMatrixCell> matrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskMethodologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.RISK_METHODOLOGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskScale getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLikelihood(RiskScale newLikelihood, NotificationChain msgs) {
		RiskScale oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD, oldLikelihood, newLikelihood);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(RiskScale newLikelihood) {
		if (newLikelihood != likelihood) {
			NotificationChain msgs = null;
			if (likelihood != null)
				msgs = ((InternalEObject)likelihood).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD, null, msgs);
			if (newLikelihood != null)
				msgs = ((InternalEObject)newLikelihood).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD, null, msgs);
			msgs = basicSetLikelihood(newLikelihood, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD, newLikelihood, newLikelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskScale getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(RiskScale newSeverity, NotificationChain msgs) {
		RiskScale oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(RiskScale newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.RISK_METHODOLOGY__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.RISK_METHODOLOGY__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskScale getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRisk(RiskScale newRisk, NotificationChain msgs) {
		RiskScale oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__RISK, oldRisk, newRisk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRisk(RiskScale newRisk) {
		if (newRisk != risk) {
			NotificationChain msgs = null;
			if (risk != null)
				msgs = ((InternalEObject)risk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.RISK_METHODOLOGY__RISK, null, msgs);
			if (newRisk != null)
				msgs = ((InternalEObject)newRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.RISK_METHODOLOGY__RISK, null, msgs);
			msgs = basicSetRisk(newRisk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RISK_METHODOLOGY__RISK, newRisk, newRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RiskMatrixCell> getMatrix() {
		if (matrix == null) {
			matrix = new EObjectContainmentEList<RiskMatrixCell>(RiskMatrixCell.class, this, InventoryPackage.RISK_METHODOLOGY__MATRIX);
		}
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD:
				return basicSetLikelihood(null, msgs);
			case InventoryPackage.RISK_METHODOLOGY__SEVERITY:
				return basicSetSeverity(null, msgs);
			case InventoryPackage.RISK_METHODOLOGY__RISK:
				return basicSetRisk(null, msgs);
			case InventoryPackage.RISK_METHODOLOGY__MATRIX:
				return ((InternalEList<?>)getMatrix()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.RISK_METHODOLOGY__ID:
				return getId();
			case InventoryPackage.RISK_METHODOLOGY__NAME:
				return getName();
			case InventoryPackage.RISK_METHODOLOGY__DESCRIPTION:
				return getDescription();
			case InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD:
				return getLikelihood();
			case InventoryPackage.RISK_METHODOLOGY__SEVERITY:
				return getSeverity();
			case InventoryPackage.RISK_METHODOLOGY__RISK:
				return getRisk();
			case InventoryPackage.RISK_METHODOLOGY__MATRIX:
				return getMatrix();
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
			case InventoryPackage.RISK_METHODOLOGY__ID:
				setId((String)newValue);
				return;
			case InventoryPackage.RISK_METHODOLOGY__NAME:
				setName((String)newValue);
				return;
			case InventoryPackage.RISK_METHODOLOGY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD:
				setLikelihood((RiskScale)newValue);
				return;
			case InventoryPackage.RISK_METHODOLOGY__SEVERITY:
				setSeverity((RiskScale)newValue);
				return;
			case InventoryPackage.RISK_METHODOLOGY__RISK:
				setRisk((RiskScale)newValue);
				return;
			case InventoryPackage.RISK_METHODOLOGY__MATRIX:
				getMatrix().clear();
				getMatrix().addAll((Collection<? extends RiskMatrixCell>)newValue);
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
			case InventoryPackage.RISK_METHODOLOGY__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.RISK_METHODOLOGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InventoryPackage.RISK_METHODOLOGY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD:
				setLikelihood((RiskScale)null);
				return;
			case InventoryPackage.RISK_METHODOLOGY__SEVERITY:
				setSeverity((RiskScale)null);
				return;
			case InventoryPackage.RISK_METHODOLOGY__RISK:
				setRisk((RiskScale)null);
				return;
			case InventoryPackage.RISK_METHODOLOGY__MATRIX:
				getMatrix().clear();
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
			case InventoryPackage.RISK_METHODOLOGY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InventoryPackage.RISK_METHODOLOGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InventoryPackage.RISK_METHODOLOGY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.RISK_METHODOLOGY__LIKELIHOOD:
				return likelihood != null;
			case InventoryPackage.RISK_METHODOLOGY__SEVERITY:
				return severity != null;
			case InventoryPackage.RISK_METHODOLOGY__RISK:
				return risk != null;
			case InventoryPackage.RISK_METHODOLOGY__MATRIX:
				return matrix != null && !matrix.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RiskMethodologyImpl
