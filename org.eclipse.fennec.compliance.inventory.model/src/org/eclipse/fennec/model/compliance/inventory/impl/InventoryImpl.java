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

import org.eclipse.fennec.model.compliance.context.ContextRef;

import org.eclipse.fennec.model.compliance.inventory.Aspect;
import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.Inventory;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.Measure;
import org.eclipse.fennec.model.compliance.inventory.ProcessingActivity;
import org.eclipse.fennec.model.compliance.inventory.RequirementApplicability;
import org.eclipse.fennec.model.compliance.inventory.RiskMethodology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getApplicabilities <em>Applicabilities</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getProcessingActivities <em>Processing Activities</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getRiskMethodologies <em>Risk Methodologies</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextRef> contexts;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getApplicabilities() <em>Applicabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementApplicability> applicabilities;

	/**
	 * The cached value of the '{@link #getProcessingActivities() <em>Processing Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingActivity> processingActivities;

	/**
	 * The cached value of the '{@link #getRiskMethodologies() <em>Risk Methodologies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskMethodologies()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskMethodology> riskMethodologies;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> aspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextRef> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<ContextRef>(ContextRef.class, this, InventoryPackage.INVENTORY__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectContainmentEList<Asset>(Asset.class, this, InventoryPackage.INVENTORY__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentEList<Measure>(Measure.class, this, InventoryPackage.INVENTORY__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementApplicability> getApplicabilities() {
		if (applicabilities == null) {
			applicabilities = new EObjectContainmentEList<RequirementApplicability>(RequirementApplicability.class, this, InventoryPackage.INVENTORY__APPLICABILITIES);
		}
		return applicabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessingActivity> getProcessingActivities() {
		if (processingActivities == null) {
			processingActivities = new EObjectContainmentEList<ProcessingActivity>(ProcessingActivity.class, this, InventoryPackage.INVENTORY__PROCESSING_ACTIVITIES);
		}
		return processingActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RiskMethodology> getRiskMethodologies() {
		if (riskMethodologies == null) {
			riskMethodologies = new EObjectContainmentEList<RiskMethodology>(RiskMethodology.class, this, InventoryPackage.INVENTORY__RISK_METHODOLOGIES);
		}
		return riskMethodologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, InventoryPackage.INVENTORY__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.INVENTORY__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case InventoryPackage.INVENTORY__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case InventoryPackage.INVENTORY__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
			case InventoryPackage.INVENTORY__APPLICABILITIES:
				return ((InternalEList<?>)getApplicabilities()).basicRemove(otherEnd, msgs);
			case InventoryPackage.INVENTORY__PROCESSING_ACTIVITIES:
				return ((InternalEList<?>)getProcessingActivities()).basicRemove(otherEnd, msgs);
			case InventoryPackage.INVENTORY__RISK_METHODOLOGIES:
				return ((InternalEList<?>)getRiskMethodologies()).basicRemove(otherEnd, msgs);
			case InventoryPackage.INVENTORY__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.INVENTORY__ID:
				return getId();
			case InventoryPackage.INVENTORY__NAME:
				return getName();
			case InventoryPackage.INVENTORY__DESCRIPTION:
				return getDescription();
			case InventoryPackage.INVENTORY__SCOPE:
				return getScope();
			case InventoryPackage.INVENTORY__OWNER:
				return getOwner();
			case InventoryPackage.INVENTORY__CONTEXTS:
				return getContexts();
			case InventoryPackage.INVENTORY__ASSETS:
				return getAssets();
			case InventoryPackage.INVENTORY__MEASURES:
				return getMeasures();
			case InventoryPackage.INVENTORY__APPLICABILITIES:
				return getApplicabilities();
			case InventoryPackage.INVENTORY__PROCESSING_ACTIVITIES:
				return getProcessingActivities();
			case InventoryPackage.INVENTORY__RISK_METHODOLOGIES:
				return getRiskMethodologies();
			case InventoryPackage.INVENTORY__ASPECTS:
				return getAspects();
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
			case InventoryPackage.INVENTORY__ID:
				setId((String)newValue);
				return;
			case InventoryPackage.INVENTORY__NAME:
				setName((String)newValue);
				return;
			case InventoryPackage.INVENTORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.INVENTORY__SCOPE:
				setScope((String)newValue);
				return;
			case InventoryPackage.INVENTORY__OWNER:
				setOwner((String)newValue);
				return;
			case InventoryPackage.INVENTORY__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends ContextRef>)newValue);
				return;
			case InventoryPackage.INVENTORY__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InventoryPackage.INVENTORY__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case InventoryPackage.INVENTORY__APPLICABILITIES:
				getApplicabilities().clear();
				getApplicabilities().addAll((Collection<? extends RequirementApplicability>)newValue);
				return;
			case InventoryPackage.INVENTORY__PROCESSING_ACTIVITIES:
				getProcessingActivities().clear();
				getProcessingActivities().addAll((Collection<? extends ProcessingActivity>)newValue);
				return;
			case InventoryPackage.INVENTORY__RISK_METHODOLOGIES:
				getRiskMethodologies().clear();
				getRiskMethodologies().addAll((Collection<? extends RiskMethodology>)newValue);
				return;
			case InventoryPackage.INVENTORY__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends Aspect>)newValue);
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
			case InventoryPackage.INVENTORY__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY__CONTEXTS:
				getContexts().clear();
				return;
			case InventoryPackage.INVENTORY__ASSETS:
				getAssets().clear();
				return;
			case InventoryPackage.INVENTORY__MEASURES:
				getMeasures().clear();
				return;
			case InventoryPackage.INVENTORY__APPLICABILITIES:
				getApplicabilities().clear();
				return;
			case InventoryPackage.INVENTORY__PROCESSING_ACTIVITIES:
				getProcessingActivities().clear();
				return;
			case InventoryPackage.INVENTORY__RISK_METHODOLOGIES:
				getRiskMethodologies().clear();
				return;
			case InventoryPackage.INVENTORY__ASPECTS:
				getAspects().clear();
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
			case InventoryPackage.INVENTORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InventoryPackage.INVENTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InventoryPackage.INVENTORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.INVENTORY__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case InventoryPackage.INVENTORY__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case InventoryPackage.INVENTORY__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case InventoryPackage.INVENTORY__ASSETS:
				return assets != null && !assets.isEmpty();
			case InventoryPackage.INVENTORY__MEASURES:
				return measures != null && !measures.isEmpty();
			case InventoryPackage.INVENTORY__APPLICABILITIES:
				return applicabilities != null && !applicabilities.isEmpty();
			case InventoryPackage.INVENTORY__PROCESSING_ACTIVITIES:
				return processingActivities != null && !processingActivities.isEmpty();
			case InventoryPackage.INVENTORY__RISK_METHODOLOGIES:
				return riskMethodologies != null && !riskMethodologies.isEmpty();
			case InventoryPackage.INVENTORY__ASPECTS:
				return aspects != null && !aspects.isEmpty();
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
		result.append(", scope: ");
		result.append(scope);
		result.append(", owner: ");
		result.append(owner);
		result.append(')');
		return result.toString();
	}

} //InventoryImpl
