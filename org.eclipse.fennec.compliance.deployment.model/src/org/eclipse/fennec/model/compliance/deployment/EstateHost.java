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
 * A representation of the model object '<em><b>Estate Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A host of an estate and where its deployment is described.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getManagement <em>Management</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDeploymentModel <em>Deployment Model</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDerivedFiles <em>Derived Files</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost()
 * @model
 * @generated
 */
@ProviderType
public interface EstateHost extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.deployment.ContainerRuntime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerRuntime
	 * @see #setRuntime(ContainerRuntime)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_Runtime()
	 * @model
	 * @generated
	 */
	ContainerRuntime getRuntime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerRuntime
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(ContainerRuntime value);

	/**
	 * Returns the value of the '<em><b>Management</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.deployment.ManagementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.ManagementKind
	 * @see #setManagement(ManagementKind)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_Management()
	 * @model
	 * @generated
	 */
	ManagementKind getManagement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getManagement <em>Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.ManagementKind
	 * @see #getManagement()
	 * @generated
	 */
	void setManagement(ManagementKind value);

	/**
	 * Returns the value of the '<em><b>Deployment Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path of the deployment model of the host, relative to the root of the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Model</em>' attribute.
	 * @see #setDeploymentModel(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_DeploymentModel()
	 * @model
	 * @generated
	 */
	String getDeploymentModel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDeploymentModel <em>Deployment Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Model</em>' attribute.
	 * @see #getDeploymentModel()
	 * @generated
	 */
	void setDeploymentModel(String value);

	/**
	 * Returns the value of the '<em><b>Derived Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path of the files the host deploys from (compose files, unit files), relative to the root of the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Files</em>' attribute.
	 * @see #setDerivedFiles(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstateHost_DerivedFiles()
	 * @model
	 * @generated
	 */
	String getDerivedFiles();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDerivedFiles <em>Derived Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Files</em>' attribute.
	 * @see #getDerivedFiles()
	 * @generated
	 */
	void setDerivedFiles(String value);

} // EstateHost
