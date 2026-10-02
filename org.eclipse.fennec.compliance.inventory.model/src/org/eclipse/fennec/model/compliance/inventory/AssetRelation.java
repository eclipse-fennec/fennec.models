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
package org.eclipse.fennec.model.compliance.inventory;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A typed relation from the owning asset to another asset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAssetRelation()
 * @model
 * @generated
 */
@ProviderType
public interface AssetRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.AssetRelationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind of relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelationKind
	 * @see #setKind(AssetRelationKind)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAssetRelation_Kind()
	 * @model required="true"
	 * @generated
	 */
	AssetRelationKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AssetRelationKind value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related asset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Asset)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAssetRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Asset getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Asset value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the relation exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAssetRelation_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

} // AssetRelation
