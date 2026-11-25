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

import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.HostAsset;

import org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getContainerRuntime <em>Container Runtime</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getKernel <em>Kernel</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#isRebootPending <em>Reboot Pending</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl#getObservedAt <em>Observed At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostAssetImpl extends AssetImpl implements HostAsset {
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
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerRuntime() <em>Container Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_RUNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerRuntime() <em>Container Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRuntime()
	 * @generated
	 * @ordered
	 */
	protected String containerRuntime = CONTAINER_RUNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeVersion() <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeVersion() <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeVersion()
	 * @generated
	 * @ordered
	 */
	protected String runtimeVersion = RUNTIME_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_TYPE_EDEFAULT = "host";

	/**
	 * The cached value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected String assetType = ASSET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel()
	 * @generated
	 * @ordered
	 */
	protected static final String KERNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel()
	 * @generated
	 * @ordered
	 */
	protected String kernel = KERNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRebootPending() <em>Reboot Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRebootPending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REBOOT_PENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRebootPending() <em>Reboot Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRebootPending()
	 * @generated
	 * @ordered
	 */
	protected boolean rebootPending = REBOOT_PENDING_EDEFAULT;

	/**
	 * This is true if the Reboot Pending attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rebootPendingESet;

	/**
	 * The default value of the '{@link #getObservedAt() <em>Observed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservedAt() <em>Observed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAt()
	 * @generated
	 * @ordered
	 */
	protected String observedAt = OBSERVED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HOST_ASSET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsVersion(String newOsVersion) {
		String oldOsVersion = osVersion;
		osVersion = newOsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__OS_VERSION, oldOsVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerRuntime() {
		return containerRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerRuntime(String newContainerRuntime) {
		String oldContainerRuntime = containerRuntime;
		containerRuntime = newContainerRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__CONTAINER_RUNTIME, oldContainerRuntime, containerRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntimeVersion() {
		return runtimeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeVersion(String newRuntimeVersion) {
		String oldRuntimeVersion = runtimeVersion;
		runtimeVersion = newRuntimeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__RUNTIME_VERSION, oldRuntimeVersion, runtimeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetType() {
		return assetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetType(String newAssetType) {
		String oldAssetType = assetType;
		assetType = newAssetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__ASSET_TYPE, oldAssetType, assetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKernel() {
		return kernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernel(String newKernel) {
		String oldKernel = kernel;
		kernel = newKernel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__KERNEL, oldKernel, kernel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRebootPending() {
		return rebootPending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRebootPending(boolean newRebootPending) {
		boolean oldRebootPending = rebootPending;
		rebootPending = newRebootPending;
		boolean oldRebootPendingESet = rebootPendingESet;
		rebootPendingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__REBOOT_PENDING, oldRebootPending, rebootPending, !oldRebootPendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRebootPending() {
		boolean oldRebootPending = rebootPending;
		boolean oldRebootPendingESet = rebootPendingESet;
		rebootPending = REBOOT_PENDING_EDEFAULT;
		rebootPendingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DeploymentPackage.HOST_ASSET__REBOOT_PENDING, oldRebootPending, REBOOT_PENDING_EDEFAULT, oldRebootPendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRebootPending() {
		return rebootPendingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservedAt() {
		return observedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservedAt(String newObservedAt) {
		String oldObservedAt = observedAt;
		observedAt = newObservedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HOST_ASSET__OBSERVED_AT, oldObservedAt, observedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.HOST_ASSET__HOSTNAME:
				return getHostname();
			case DeploymentPackage.HOST_ASSET__OS:
				return getOs();
			case DeploymentPackage.HOST_ASSET__OS_VERSION:
				return getOsVersion();
			case DeploymentPackage.HOST_ASSET__CONTAINER_RUNTIME:
				return getContainerRuntime();
			case DeploymentPackage.HOST_ASSET__RUNTIME_VERSION:
				return getRuntimeVersion();
			case DeploymentPackage.HOST_ASSET__ASSET_TYPE:
				return getAssetType();
			case DeploymentPackage.HOST_ASSET__KERNEL:
				return getKernel();
			case DeploymentPackage.HOST_ASSET__REBOOT_PENDING:
				return isRebootPending();
			case DeploymentPackage.HOST_ASSET__OBSERVED_AT:
				return getObservedAt();
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
			case DeploymentPackage.HOST_ASSET__HOSTNAME:
				setHostname((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__OS:
				setOs((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__CONTAINER_RUNTIME:
				setContainerRuntime((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__RUNTIME_VERSION:
				setRuntimeVersion((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__ASSET_TYPE:
				setAssetType((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__KERNEL:
				setKernel((String)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__REBOOT_PENDING:
				setRebootPending((Boolean)newValue);
				return;
			case DeploymentPackage.HOST_ASSET__OBSERVED_AT:
				setObservedAt((String)newValue);
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
			case DeploymentPackage.HOST_ASSET__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__OS:
				setOs(OS_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__CONTAINER_RUNTIME:
				setContainerRuntime(CONTAINER_RUNTIME_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__RUNTIME_VERSION:
				setRuntimeVersion(RUNTIME_VERSION_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__ASSET_TYPE:
				setAssetType(ASSET_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__KERNEL:
				setKernel(KERNEL_EDEFAULT);
				return;
			case DeploymentPackage.HOST_ASSET__REBOOT_PENDING:
				unsetRebootPending();
				return;
			case DeploymentPackage.HOST_ASSET__OBSERVED_AT:
				setObservedAt(OBSERVED_AT_EDEFAULT);
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
			case DeploymentPackage.HOST_ASSET__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case DeploymentPackage.HOST_ASSET__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case DeploymentPackage.HOST_ASSET__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case DeploymentPackage.HOST_ASSET__CONTAINER_RUNTIME:
				return CONTAINER_RUNTIME_EDEFAULT == null ? containerRuntime != null : !CONTAINER_RUNTIME_EDEFAULT.equals(containerRuntime);
			case DeploymentPackage.HOST_ASSET__RUNTIME_VERSION:
				return RUNTIME_VERSION_EDEFAULT == null ? runtimeVersion != null : !RUNTIME_VERSION_EDEFAULT.equals(runtimeVersion);
			case DeploymentPackage.HOST_ASSET__ASSET_TYPE:
				return ASSET_TYPE_EDEFAULT == null ? assetType != null : !ASSET_TYPE_EDEFAULT.equals(assetType);
			case DeploymentPackage.HOST_ASSET__KERNEL:
				return KERNEL_EDEFAULT == null ? kernel != null : !KERNEL_EDEFAULT.equals(kernel);
			case DeploymentPackage.HOST_ASSET__REBOOT_PENDING:
				return isSetRebootPending();
			case DeploymentPackage.HOST_ASSET__OBSERVED_AT:
				return OBSERVED_AT_EDEFAULT == null ? observedAt != null : !OBSERVED_AT_EDEFAULT.equals(observedAt);
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
		result.append(", os: ");
		result.append(os);
		result.append(", osVersion: ");
		result.append(osVersion);
		result.append(", containerRuntime: ");
		result.append(containerRuntime);
		result.append(", runtimeVersion: ");
		result.append(runtimeVersion);
		result.append(", assetType: ");
		result.append(assetType);
		result.append(", kernel: ");
		result.append(kernel);
		result.append(", rebootPending: ");
		if (rebootPendingESet) result.append(rebootPending); else result.append("<unset>");
		result.append(", observedAt: ");
		result.append(observedAt);
		result.append(')');
		return result.toString();
	}

} //HostAssetImpl
