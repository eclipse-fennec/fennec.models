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

import org.eclipse.fennec.model.compliance.inventory.Asset;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A host that runs containers, as an asset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getContainerRuntime <em>Container Runtime</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getKernel <em>Kernel</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#isRebootPending <em>Reboot Pending</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getObservedAt <em>Observed At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset()
 * @model
 * @generated
 */
@ProviderType
public interface HostAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_OsVersion()
	 * @model
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Container Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Runtime</em>' attribute.
	 * @see #setContainerRuntime(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_ContainerRuntime()
	 * @model
	 * @generated
	 */
	String getContainerRuntime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getContainerRuntime <em>Container Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Runtime</em>' attribute.
	 * @see #getContainerRuntime()
	 * @generated
	 */
	void setContainerRuntime(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Version</em>' attribute.
	 * @see #setRuntimeVersion(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_RuntimeVersion()
	 * @model
	 * @generated
	 */
	String getRuntimeVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getRuntimeVersion <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Version</em>' attribute.
	 * @see #getRuntimeVersion()
	 * @generated
	 */
	void setRuntimeVersion(String value);

	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The default value is <code>"host"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind of asset for consumers that do not know this package; host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see #setAssetType(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_AssetType()
	 * @model default="host"
	 * @generated
	 */
	String getAssetType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(String value);

	/**
	 * Returns the value of the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kernel the host runs, as the host reported it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kernel</em>' attribute.
	 * @see #setKernel(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_Kernel()
	 * @model
	 * @generated
	 */
	String getKernel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getKernel <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel</em>' attribute.
	 * @see #getKernel()
	 * @generated
	 */
	void setKernel(String value);

	/**
	 * Returns the value of the '<em><b>Reboot Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Installed updates wait for a reboot of the host; unset when the host did not report it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reboot Pending</em>' attribute.
	 * @see #isSetRebootPending()
	 * @see #unsetRebootPending()
	 * @see #setRebootPending(boolean)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_RebootPending()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isRebootPending();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#isRebootPending <em>Reboot Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reboot Pending</em>' attribute.
	 * @see #isSetRebootPending()
	 * @see #unsetRebootPending()
	 * @see #isRebootPending()
	 * @generated
	 */
	void setRebootPending(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#isRebootPending <em>Reboot Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRebootPending()
	 * @see #isRebootPending()
	 * @see #setRebootPending(boolean)
	 * @generated
	 */
	void unsetRebootPending();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#isRebootPending <em>Reboot Pending</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reboot Pending</em>' attribute is set.
	 * @see #unsetRebootPending()
	 * @see #isRebootPending()
	 * @see #setRebootPending(boolean)
	 * @generated
	 */
	boolean isSetRebootPending();

	/**
	 * Returns the value of the '<em><b>Observed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the host reported os, osVersion, kernel and rebootPending about itself, ISO 8601; unset when they were entered by hand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed At</em>' attribute.
	 * @see #setObservedAt(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getHostAsset_ObservedAt()
	 * @model
	 * @generated
	 */
	String getObservedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getObservedAt <em>Observed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed At</em>' attribute.
	 * @see #getObservedAt()
	 * @generated
	 */
	void setObservedAt(String value);

} // HostAsset
