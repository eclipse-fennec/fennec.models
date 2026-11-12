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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.PortPublication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Publication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl#getContainerPort <em>Container Port</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortPublicationImpl extends MinimalEObjectImpl.Container implements PortPublication {
	/**
	 * The default value of the '{@link #getHostAddress() <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostAddress() <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAddress()
	 * @generated
	 * @ordered
	 */
	protected String hostAddress = HOST_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected String hostPort = HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected String containerPort = CONTAINER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortPublicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.PORT_PUBLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostAddress() {
		return hostAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostAddress(String newHostAddress) {
		String oldHostAddress = hostAddress;
		hostAddress = newHostAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT_PUBLICATION__HOST_ADDRESS, oldHostAddress, hostAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostPort() {
		return hostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostPort(String newHostPort) {
		String oldHostPort = hostPort;
		hostPort = newHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT_PUBLICATION__HOST_PORT, oldHostPort, hostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerPort() {
		return containerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPort(String newContainerPort) {
		String oldContainerPort = containerPort;
		containerPort = newContainerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT_PUBLICATION__CONTAINER_PORT, oldContainerPort, containerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT_PUBLICATION__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.PORT_PUBLICATION__HOST_ADDRESS:
				return getHostAddress();
			case DeploymentPackage.PORT_PUBLICATION__HOST_PORT:
				return getHostPort();
			case DeploymentPackage.PORT_PUBLICATION__CONTAINER_PORT:
				return getContainerPort();
			case DeploymentPackage.PORT_PUBLICATION__PROTOCOL:
				return getProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.PORT_PUBLICATION__HOST_ADDRESS:
				setHostAddress((String)newValue);
				return;
			case DeploymentPackage.PORT_PUBLICATION__HOST_PORT:
				setHostPort((String)newValue);
				return;
			case DeploymentPackage.PORT_PUBLICATION__CONTAINER_PORT:
				setContainerPort((String)newValue);
				return;
			case DeploymentPackage.PORT_PUBLICATION__PROTOCOL:
				setProtocol((String)newValue);
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
			case DeploymentPackage.PORT_PUBLICATION__HOST_ADDRESS:
				setHostAddress(HOST_ADDRESS_EDEFAULT);
				return;
			case DeploymentPackage.PORT_PUBLICATION__HOST_PORT:
				setHostPort(HOST_PORT_EDEFAULT);
				return;
			case DeploymentPackage.PORT_PUBLICATION__CONTAINER_PORT:
				setContainerPort(CONTAINER_PORT_EDEFAULT);
				return;
			case DeploymentPackage.PORT_PUBLICATION__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case DeploymentPackage.PORT_PUBLICATION__HOST_ADDRESS:
				return HOST_ADDRESS_EDEFAULT == null ? hostAddress != null : !HOST_ADDRESS_EDEFAULT.equals(hostAddress);
			case DeploymentPackage.PORT_PUBLICATION__HOST_PORT:
				return HOST_PORT_EDEFAULT == null ? hostPort != null : !HOST_PORT_EDEFAULT.equals(hostPort);
			case DeploymentPackage.PORT_PUBLICATION__CONTAINER_PORT:
				return CONTAINER_PORT_EDEFAULT == null ? containerPort != null : !CONTAINER_PORT_EDEFAULT.equals(containerPort);
			case DeploymentPackage.PORT_PUBLICATION__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
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
		result.append(" (hostAddress: ");
		result.append(hostAddress);
		result.append(", hostPort: ");
		result.append(hostPort);
		result.append(", containerPort: ");
		result.append(containerPort);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //PortPublicationImpl
