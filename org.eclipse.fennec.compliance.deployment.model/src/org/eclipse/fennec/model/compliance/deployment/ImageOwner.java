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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Maps images to the source repository they are built from. Marks an image as own software.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner#getImagePrefix <em>Image Prefix</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageOwner()
 * @model
 * @generated
 */
@ProviderType
public interface ImageOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registry and repository prefix, e.g. ghcr.io/eclipse-fennec/model.atlas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Prefix</em>' attribute.
	 * @see #setImagePrefix(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageOwner_ImagePrefix()
	 * @model required="true"
	 * @generated
	 */
	String getImagePrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner#getImagePrefix <em>Image Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Prefix</em>' attribute.
	 * @see #getImagePrefix()
	 * @generated
	 */
	void setImagePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source repository, e.g. eclipse-fennec/model.atlas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageOwner_Repository()
	 * @model required="true"
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

} // ImageOwner
