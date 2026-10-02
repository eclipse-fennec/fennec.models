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

import org.eclipse.fennec.model.compliance.report.AssetSubject;
import org.eclipse.fennec.model.compliance.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.AssetSubjectImpl#getInventoryId <em>Inventory Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.AssetSubjectImpl#getAssetId <em>Asset Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.AssetSubjectImpl#getAssetName <em>Asset Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetSubjectImpl extends SubjectImpl implements AssetSubject {
	/**
	 * The default value of the '{@link #getInventoryId() <em>Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryId() <em>Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryId = INVENTORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected String assetId = ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetName() <em>Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetName() <em>Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetName()
	 * @generated
	 * @ordered
	 */
	protected String assetName = ASSET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.ASSET_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryId() {
		return inventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryId(String newInventoryId) {
		String oldInventoryId = inventoryId;
		inventoryId = newInventoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ASSET_SUBJECT__INVENTORY_ID, oldInventoryId, inventoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetId() {
		return assetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetId(String newAssetId) {
		String oldAssetId = assetId;
		assetId = newAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ASSET_SUBJECT__ASSET_ID, oldAssetId, assetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetName() {
		return assetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetName(String newAssetName) {
		String oldAssetName = assetName;
		assetName = newAssetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ASSET_SUBJECT__ASSET_NAME, oldAssetName, assetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.ASSET_SUBJECT__INVENTORY_ID:
				return getInventoryId();
			case ReportPackage.ASSET_SUBJECT__ASSET_ID:
				return getAssetId();
			case ReportPackage.ASSET_SUBJECT__ASSET_NAME:
				return getAssetName();
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
			case ReportPackage.ASSET_SUBJECT__INVENTORY_ID:
				setInventoryId((String)newValue);
				return;
			case ReportPackage.ASSET_SUBJECT__ASSET_ID:
				setAssetId((String)newValue);
				return;
			case ReportPackage.ASSET_SUBJECT__ASSET_NAME:
				setAssetName((String)newValue);
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
			case ReportPackage.ASSET_SUBJECT__INVENTORY_ID:
				setInventoryId(INVENTORY_ID_EDEFAULT);
				return;
			case ReportPackage.ASSET_SUBJECT__ASSET_ID:
				setAssetId(ASSET_ID_EDEFAULT);
				return;
			case ReportPackage.ASSET_SUBJECT__ASSET_NAME:
				setAssetName(ASSET_NAME_EDEFAULT);
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
			case ReportPackage.ASSET_SUBJECT__INVENTORY_ID:
				return INVENTORY_ID_EDEFAULT == null ? inventoryId != null : !INVENTORY_ID_EDEFAULT.equals(inventoryId);
			case ReportPackage.ASSET_SUBJECT__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? assetId != null : !ASSET_ID_EDEFAULT.equals(assetId);
			case ReportPackage.ASSET_SUBJECT__ASSET_NAME:
				return ASSET_NAME_EDEFAULT == null ? assetName != null : !ASSET_NAME_EDEFAULT.equals(assetName);
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
		result.append(" (inventoryId: ");
		result.append(inventoryId);
		result.append(", assetId: ");
		result.append(assetId);
		result.append(", assetName: ");
		result.append(assetName);
		result.append(')');
		return result.toString();
	}

} //AssetSubjectImpl
