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
package org.eclipse.fennec.model.compliance.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.fennec.model.compliance.deployment.AuthMode;
import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.RouteExposure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl#getPathPrefix <em>Path Prefix</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl#getAuthMode <em>Auth Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl#getRouteId <em>Route Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteExposureImpl extends MinimalEObjectImpl.Container implements RouteExposure {
	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathPrefix() <em>Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPrefix() <em>Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPrefix()
	 * @generated
	 * @ordered
	 */
	protected String pathPrefix = PATH_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthMode() <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthMode()
	 * @generated
	 * @ordered
	 */
	protected static final AuthMode AUTH_MODE_EDEFAULT = AuthMode.NONE;

	/**
	 * The cached value of the '{@link #getAuthMode() <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthMode()
	 * @generated
	 * @ordered
	 */
	protected AuthMode authMode = AUTH_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> methods;

	/**
	 * The default value of the '{@link #getRouteId() <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteId() <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteId()
	 * @generated
	 * @ordered
	 */
	protected String routeId = ROUTE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteExposureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.ROUTE_EXPOSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ROUTE_EXPOSURE__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathPrefix() {
		return pathPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathPrefix(String newPathPrefix) {
		String oldPathPrefix = pathPrefix;
		pathPrefix = newPathPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ROUTE_EXPOSURE__PATH_PREFIX, oldPathPrefix, pathPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthMode getAuthMode() {
		return authMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthMode(AuthMode newAuthMode) {
		AuthMode oldAuthMode = authMode;
		authMode = newAuthMode == null ? AUTH_MODE_EDEFAULT : newAuthMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ROUTE_EXPOSURE__AUTH_MODE, oldAuthMode, authMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMethods() {
		if (methods == null) {
			methods = new EDataTypeUniqueEList<String>(String.class, this, DeploymentPackage.ROUTE_EXPOSURE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteId() {
		return routeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteId(String newRouteId) {
		String oldRouteId = routeId;
		routeId = newRouteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ROUTE_EXPOSURE__ROUTE_ID, oldRouteId, routeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.ROUTE_EXPOSURE__HOSTNAME:
				return getHostname();
			case DeploymentPackage.ROUTE_EXPOSURE__PATH_PREFIX:
				return getPathPrefix();
			case DeploymentPackage.ROUTE_EXPOSURE__AUTH_MODE:
				return getAuthMode();
			case DeploymentPackage.ROUTE_EXPOSURE__METHODS:
				return getMethods();
			case DeploymentPackage.ROUTE_EXPOSURE__ROUTE_ID:
				return getRouteId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.ROUTE_EXPOSURE__HOSTNAME:
				setHostname((String)newValue);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__PATH_PREFIX:
				setPathPrefix((String)newValue);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__AUTH_MODE:
				setAuthMode((AuthMode)newValue);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends String>)newValue);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__ROUTE_ID:
				setRouteId((String)newValue);
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
			case DeploymentPackage.ROUTE_EXPOSURE__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__PATH_PREFIX:
				setPathPrefix(PATH_PREFIX_EDEFAULT);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__AUTH_MODE:
				setAuthMode(AUTH_MODE_EDEFAULT);
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__METHODS:
				getMethods().clear();
				return;
			case DeploymentPackage.ROUTE_EXPOSURE__ROUTE_ID:
				setRouteId(ROUTE_ID_EDEFAULT);
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
			case DeploymentPackage.ROUTE_EXPOSURE__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case DeploymentPackage.ROUTE_EXPOSURE__PATH_PREFIX:
				return PATH_PREFIX_EDEFAULT == null ? pathPrefix != null : !PATH_PREFIX_EDEFAULT.equals(pathPrefix);
			case DeploymentPackage.ROUTE_EXPOSURE__AUTH_MODE:
				return authMode != AUTH_MODE_EDEFAULT;
			case DeploymentPackage.ROUTE_EXPOSURE__METHODS:
				return methods != null && !methods.isEmpty();
			case DeploymentPackage.ROUTE_EXPOSURE__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeId != null : !ROUTE_ID_EDEFAULT.equals(routeId);
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
		result.append(" (hostname: ");
		result.append(hostname);
		result.append(", pathPrefix: ");
		result.append(pathPrefix);
		result.append(", authMode: ");
		result.append(authMode);
		result.append(", methods: ");
		result.append(methods);
		result.append(", routeId: ");
		result.append(routeId);
		result.append(')');
		return result.toString();
	}

} //RouteExposureImpl
