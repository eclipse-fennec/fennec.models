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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.model.compliance.context.CategoryRef;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something to protect: a host, a container, a network, a volume, an application, a data set. Generated from deployment and service specifications where possible, then curated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getProtectionNeeds <em>Protection Needs</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Asset#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset()
 * @model
 * @generated
 */
@ProviderType
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures and processing activities, so references are written by id and survive reordering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsible role or person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification, e.g. the BSI target object type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getCategories();

	/**
	 * Returns the value of the '<em><b>Protection Needs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protection need assessments, oldest first. The last one is current.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Needs</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_ProtectionNeeds()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtectionNeedAssessment> getProtectionNeeds();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.AssetRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relations to other assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssetRelation> getRelations();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the asset is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceRef> getSources();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Aspect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context-specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getAsset_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aspect> getAspects();

} // Asset
