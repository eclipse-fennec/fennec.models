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
 * A representation of the model object '<em><b>Port Publication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container port published on the host.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getContainerPort <em>Container Port</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getPortPublication()
 * @model
 * @generated
 */
@ProviderType
public interface PortPublication extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bind address on the host; empty means all addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Address</em>' attribute.
	 * @see #setHostAddress(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getPortPublication_HostAddress()
	 * @model
	 * @generated
	 */
	String getHostAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostAddress <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Address</em>' attribute.
	 * @see #getHostAddress()
	 * @generated
	 */
	void setHostAddress(String value);

	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getPortPublication_HostPort()
	 * @model
	 * @generated
	 */
	String getHostPort();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(String value);

	/**
	 * Returns the value of the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Port</em>' attribute.
	 * @see #setContainerPort(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getPortPublication_ContainerPort()
	 * @model
	 * @generated
	 */
	String getContainerPort();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getContainerPort <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Port</em>' attribute.
	 * @see #getContainerPort()
	 * @generated
	 */
	void setContainerPort(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getPortPublication_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // PortPublication
