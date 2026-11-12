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
package org.eclipse.fennec.model.compliance.deployment.impl;

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

import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.Estate;
import org.eclipse.fennec.model.compliance.deployment.EstateConfiguration;
import org.eclipse.fennec.model.compliance.deployment.ImageOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estate Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl#getEstates <em>Estates</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl#getImageOwners <em>Image Owners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstateConfigurationImpl extends MinimalEObjectImpl.Container implements EstateConfiguration {
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
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstates() <em>Estates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstates()
	 * @generated
	 * @ordered
	 */
	protected EList<Estate> estates;

	/**
	 * The cached value of the '{@link #getImageOwners() <em>Image Owners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageOwners()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageOwner> imageOwners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstateConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.ESTATE_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_CONFIGURATION__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Estate> getEstates() {
		if (estates == null) {
			estates = new EObjectContainmentEList<Estate>(Estate.class, this, DeploymentPackage.ESTATE_CONFIGURATION__ESTATES);
		}
		return estates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImageOwner> getImageOwners() {
		if (imageOwners == null) {
			imageOwners = new EObjectContainmentEList<ImageOwner>(ImageOwner.class, this, DeploymentPackage.ESTATE_CONFIGURATION__IMAGE_OWNERS);
		}
		return imageOwners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.ESTATE_CONFIGURATION__ESTATES:
				return ((InternalEList<?>)getEstates()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.ESTATE_CONFIGURATION__IMAGE_OWNERS:
				return ((InternalEList<?>)getImageOwners()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.ESTATE_CONFIGURATION__ID:
				return getId();
			case DeploymentPackage.ESTATE_CONFIGURATION__TENANT:
				return getTenant();
			case DeploymentPackage.ESTATE_CONFIGURATION__ESTATES:
				return getEstates();
			case DeploymentPackage.ESTATE_CONFIGURATION__IMAGE_OWNERS:
				return getImageOwners();
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
			case DeploymentPackage.ESTATE_CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case DeploymentPackage.ESTATE_CONFIGURATION__TENANT:
				setTenant((String)newValue);
				return;
			case DeploymentPackage.ESTATE_CONFIGURATION__ESTATES:
				getEstates().clear();
				getEstates().addAll((Collection<? extends Estate>)newValue);
				return;
			case DeploymentPackage.ESTATE_CONFIGURATION__IMAGE_OWNERS:
				getImageOwners().clear();
				getImageOwners().addAll((Collection<? extends ImageOwner>)newValue);
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
			case DeploymentPackage.ESTATE_CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_CONFIGURATION__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_CONFIGURATION__ESTATES:
				getEstates().clear();
				return;
			case DeploymentPackage.ESTATE_CONFIGURATION__IMAGE_OWNERS:
				getImageOwners().clear();
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
			case DeploymentPackage.ESTATE_CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DeploymentPackage.ESTATE_CONFIGURATION__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case DeploymentPackage.ESTATE_CONFIGURATION__ESTATES:
				return estates != null && !estates.isEmpty();
			case DeploymentPackage.ESTATE_CONFIGURATION__IMAGE_OWNERS:
				return imageOwners != null && !imageOwners.isEmpty();
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
		result.append(", tenant: ");
		result.append(tenant);
		result.append(')');
		return result.toString();
	}

} //EstateConfigurationImpl
