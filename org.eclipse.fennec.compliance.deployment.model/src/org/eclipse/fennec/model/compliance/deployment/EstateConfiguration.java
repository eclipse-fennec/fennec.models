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
package org.eclipse.fennec.model.compliance.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estate Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The estates of one tenant and who owns which image. The input of the inventory import.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getEstates <em>Estates</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getImageOwners <em>Image Owners</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface EstateConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateConfiguration_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateConfiguration_Tenant()
	 * @model required="true"
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);

	/**
	 * Returns the value of the '<em><b>Estates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.deployment.Estate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estates</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateConfiguration_Estates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Estate> getEstates();

	/**
	 * Returns the value of the '<em><b>Image Owners</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.deployment.ImageOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluated in order; the first prefix that matches an image applies. An image without a match is an upstream image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Owners</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateConfiguration_ImageOwners()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageOwner> getImageOwners();

} // EstateConfiguration
