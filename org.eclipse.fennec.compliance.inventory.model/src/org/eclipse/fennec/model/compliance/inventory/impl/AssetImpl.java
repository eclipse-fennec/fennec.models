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

import org.eclipse.fennec.model.compliance.context.CategoryRef;

import org.eclipse.fennec.model.compliance.inventory.Aspect;
import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.AssetRelation;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment;
import org.eclipse.fennec.model.compliance.inventory.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getProtectionNeeds <em>Protection Needs</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
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
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRef> categories;

	/**
	 * The cached value of the '{@link #getProtectionNeeds() <em>Protection Needs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionNeedAssessment> protectionNeeds;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetRelation> relations;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> sources;

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
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.ASSET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ASSET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ASSET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ASSET__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ASSET__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, InventoryPackage.ASSET__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtectionNeedAssessment> getProtectionNeeds() {
		if (protectionNeeds == null) {
			protectionNeeds = new EObjectContainmentEList<ProtectionNeedAssessment>(ProtectionNeedAssessment.class, this, InventoryPackage.ASSET__PROTECTION_NEEDS);
		}
		return protectionNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssetRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<AssetRelation>(AssetRelation.class, this, InventoryPackage.ASSET__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceRef> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, InventoryPackage.ASSET__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, InventoryPackage.ASSET__ASPECTS);
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
			case InventoryPackage.ASSET__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case InventoryPackage.ASSET__PROTECTION_NEEDS:
				return ((InternalEList<?>)getProtectionNeeds()).basicRemove(otherEnd, msgs);
			case InventoryPackage.ASSET__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case InventoryPackage.ASSET__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case InventoryPackage.ASSET__ASPECTS:
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
			case InventoryPackage.ASSET__ID:
				return getId();
			case InventoryPackage.ASSET__NAME:
				return getName();
			case InventoryPackage.ASSET__DESCRIPTION:
				return getDescription();
			case InventoryPackage.ASSET__OWNER:
				return getOwner();
			case InventoryPackage.ASSET__CATEGORIES:
				return getCategories();
			case InventoryPackage.ASSET__PROTECTION_NEEDS:
				return getProtectionNeeds();
			case InventoryPackage.ASSET__RELATIONS:
				return getRelations();
			case InventoryPackage.ASSET__SOURCES:
				return getSources();
			case InventoryPackage.ASSET__ASPECTS:
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
			case InventoryPackage.ASSET__ID:
				setId((String)newValue);
				return;
			case InventoryPackage.ASSET__NAME:
				setName((String)newValue);
				return;
			case InventoryPackage.ASSET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.ASSET__OWNER:
				setOwner((String)newValue);
				return;
			case InventoryPackage.ASSET__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CategoryRef>)newValue);
				return;
			case InventoryPackage.ASSET__PROTECTION_NEEDS:
				getProtectionNeeds().clear();
				getProtectionNeeds().addAll((Collection<? extends ProtectionNeedAssessment>)newValue);
				return;
			case InventoryPackage.ASSET__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends AssetRelation>)newValue);
				return;
			case InventoryPackage.ASSET__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case InventoryPackage.ASSET__ASPECTS:
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
			case InventoryPackage.ASSET__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InventoryPackage.ASSET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.ASSET__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case InventoryPackage.ASSET__CATEGORIES:
				getCategories().clear();
				return;
			case InventoryPackage.ASSET__PROTECTION_NEEDS:
				getProtectionNeeds().clear();
				return;
			case InventoryPackage.ASSET__RELATIONS:
				getRelations().clear();
				return;
			case InventoryPackage.ASSET__SOURCES:
				getSources().clear();
				return;
			case InventoryPackage.ASSET__ASPECTS:
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
			case InventoryPackage.ASSET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InventoryPackage.ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InventoryPackage.ASSET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.ASSET__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case InventoryPackage.ASSET__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case InventoryPackage.ASSET__PROTECTION_NEEDS:
				return protectionNeeds != null && !protectionNeeds.isEmpty();
			case InventoryPackage.ASSET__RELATIONS:
				return relations != null && !relations.isEmpty();
			case InventoryPackage.ASSET__SOURCES:
				return sources != null && !sources.isEmpty();
			case InventoryPackage.ASSET__ASPECTS:
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
		result.append(", owner: ");
		result.append(owner);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
