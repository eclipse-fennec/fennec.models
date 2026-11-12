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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage
 * @generated
 */
@ProviderType
public interface DeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentFactory eINSTANCE = org.eclipse.fennec.model.compliance.deployment.impl.DeploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Image Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Ref</em>'.
	 * @generated
	 */
	ImageRef createImageRef();

	/**
	 * Returns a new object of class '<em>Port Publication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Publication</em>'.
	 * @generated
	 */
	PortPublication createPortPublication();

	/**
	 * Returns a new object of class '<em>Route Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Exposure</em>'.
	 * @generated
	 */
	RouteExposure createRouteExposure();

	/**
	 * Returns a new object of class '<em>Container Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Asset</em>'.
	 * @generated
	 */
	ContainerAsset createContainerAsset();

	/**
	 * Returns a new object of class '<em>Host Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Asset</em>'.
	 * @generated
	 */
	HostAsset createHostAsset();

	/**
	 * Returns a new object of class '<em>Estate Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estate Configuration</em>'.
	 * @generated
	 */
	EstateConfiguration createEstateConfiguration();

	/**
	 * Returns a new object of class '<em>Estate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estate</em>'.
	 * @generated
	 */
	Estate createEstate();

	/**
	 * Returns a new object of class '<em>Estate Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estate Host</em>'.
	 * @generated
	 */
	EstateHost createEstateHost();

	/**
	 * Returns a new object of class '<em>Image Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Owner</em>'.
	 * @generated
	 */
	ImageOwner createImageOwner();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentPackage getDeploymentPackage();

} //DeploymentFactory
