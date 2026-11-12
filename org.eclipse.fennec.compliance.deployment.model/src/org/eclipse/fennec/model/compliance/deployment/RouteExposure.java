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
 * A representation of the model object '<em><b>Route Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A gateway route that leads to the container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getPathPrefix <em>Path Prefix</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getAuthMode <em>Auth Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getRouteId <em>Route Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getRouteExposure()
 * @model
 * @generated
 */
@ProviderType
public interface RouteExposure extends EObject {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getRouteExposure_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Prefix</em>' attribute.
	 * @see #setPathPrefix(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getRouteExposure_PathPrefix()
	 * @model
	 * @generated
	 */
	String getPathPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getPathPrefix <em>Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Prefix</em>' attribute.
	 * @see #getPathPrefix()
	 * @generated
	 */
	void setPathPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Auth Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.deployment.AuthMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Mode</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.AuthMode
	 * @see #setAuthMode(AuthMode)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getRouteExposure_AuthMode()
	 * @model
	 * @generated
	 */
	AuthMode getAuthMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getAuthMode <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Mode</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.AuthMode
	 * @see #getAuthMode()
	 * @generated
	 */
	void setAuthMode(AuthMode value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getRouteExposure_Methods()
	 * @model
	 * @generated
	 */
	EList<String> getMethods();

	/**
	 * Returns the value of the '<em><b>Route Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the route in the gateway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Id</em>' attribute.
	 * @see #setRouteId(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getRouteExposure_RouteId()
	 * @model
	 * @generated
	 */
	String getRouteId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getRouteId <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Id</em>' attribute.
	 * @see #getRouteId()
	 * @generated
	 */
	void setRouteId(String value);

} // RouteExposure
