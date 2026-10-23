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
package org.eclipse.fennec.model.compliance.report;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An asset of a compliance inventory as subject of a review, e.g. for a Grundschutz check.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.AssetSubject#getInventoryId <em>Inventory Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.AssetSubject#getAssetId <em>Asset Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.AssetSubject#getAssetName <em>Asset Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getAssetSubject()
 * @model
 * @generated
 */
@ProviderType
public interface AssetSubject extends Subject {
	/**
	 * Returns the value of the '<em><b>Inventory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the inventory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Id</em>' attribute.
	 * @see #setInventoryId(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getAssetSubject_InventoryId()
	 * @model required="true"
	 * @generated
	 */
	String getInventoryId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.AssetSubject#getInventoryId <em>Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Id</em>' attribute.
	 * @see #getInventoryId()
	 * @generated
	 */
	void setInventoryId(String value);

	/**
	 * Returns the value of the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the asset within the inventory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Id</em>' attribute.
	 * @see #setAssetId(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getAssetSubject_AssetId()
	 * @model required="true"
	 * @generated
	 */
	String getAssetId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.AssetSubject#getAssetId <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Id</em>' attribute.
	 * @see #getAssetId()
	 * @generated
	 */
	void setAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Asset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display name of the asset at review time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Name</em>' attribute.
	 * @see #setAssetName(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getAssetSubject_AssetName()
	 * @model
	 * @generated
	 */
	String getAssetName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.AssetSubject#getAssetName <em>Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Name</em>' attribute.
	 * @see #getAssetName()
	 * @generated
	 */
	void setAssetName(String value);

} // AssetSubject
