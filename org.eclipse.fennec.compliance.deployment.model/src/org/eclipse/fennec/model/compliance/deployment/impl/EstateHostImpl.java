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

import org.eclipse.fennec.model.compliance.deployment.ContainerRuntime;
import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.EstateHost;
import org.eclipse.fennec.model.compliance.deployment.ManagementKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estate Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getManagement <em>Management</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getDeploymentModel <em>Deployment Model</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl#getDerivedFiles <em>Derived Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstateHostImpl extends MinimalEObjectImpl.Container implements EstateHost {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerRuntime RUNTIME_EDEFAULT = ContainerRuntime.OTHER;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected ContainerRuntime runtime = RUNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagement() <em>Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagement()
	 * @generated
	 * @ordered
	 */
	protected static final ManagementKind MANAGEMENT_EDEFAULT = ManagementKind.HAND_WRITTEN;

	/**
	 * The cached value of the '{@link #getManagement() <em>Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagement()
	 * @generated
	 * @ordered
	 */
	protected ManagementKind management = MANAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentModel() <em>Deployment Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentModel()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentModel() <em>Deployment Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentModel()
	 * @generated
	 * @ordered
	 */
	protected String deploymentModel = DEPLOYMENT_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedFiles() <em>Derived Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFiles()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedFiles() <em>Derived Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFiles()
	 * @generated
	 * @ordered
	 */
	protected String derivedFiles = DERIVED_FILES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstateHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.ESTATE_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerRuntime getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(ContainerRuntime newRuntime) {
		ContainerRuntime oldRuntime = runtime;
		runtime = newRuntime == null ? RUNTIME_EDEFAULT : newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManagementKind getManagement() {
		return management;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagement(ManagementKind newManagement) {
		ManagementKind oldManagement = management;
		management = newManagement == null ? MANAGEMENT_EDEFAULT : newManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__MANAGEMENT, oldManagement, management));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeploymentModel() {
		return deploymentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentModel(String newDeploymentModel) {
		String oldDeploymentModel = deploymentModel;
		deploymentModel = newDeploymentModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__DEPLOYMENT_MODEL, oldDeploymentModel, deploymentModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDerivedFiles() {
		return derivedFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedFiles(String newDerivedFiles) {
		String oldDerivedFiles = derivedFiles;
		derivedFiles = newDerivedFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ESTATE_HOST__DERIVED_FILES, oldDerivedFiles, derivedFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.ESTATE_HOST__ID:
				return getId();
			case DeploymentPackage.ESTATE_HOST__HOSTNAME:
				return getHostname();
			case DeploymentPackage.ESTATE_HOST__DESCRIPTION:
				return getDescription();
			case DeploymentPackage.ESTATE_HOST__RUNTIME:
				return getRuntime();
			case DeploymentPackage.ESTATE_HOST__MANAGEMENT:
				return getManagement();
			case DeploymentPackage.ESTATE_HOST__DEPLOYMENT_MODEL:
				return getDeploymentModel();
			case DeploymentPackage.ESTATE_HOST__DERIVED_FILES:
				return getDerivedFiles();
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
			case DeploymentPackage.ESTATE_HOST__ID:
				setId((String)newValue);
				return;
			case DeploymentPackage.ESTATE_HOST__HOSTNAME:
				setHostname((String)newValue);
				return;
			case DeploymentPackage.ESTATE_HOST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DeploymentPackage.ESTATE_HOST__RUNTIME:
				setRuntime((ContainerRuntime)newValue);
				return;
			case DeploymentPackage.ESTATE_HOST__MANAGEMENT:
				setManagement((ManagementKind)newValue);
				return;
			case DeploymentPackage.ESTATE_HOST__DEPLOYMENT_MODEL:
				setDeploymentModel((String)newValue);
				return;
			case DeploymentPackage.ESTATE_HOST__DERIVED_FILES:
				setDerivedFiles((String)newValue);
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
			case DeploymentPackage.ESTATE_HOST__ID:
				setId(ID_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_HOST__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_HOST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_HOST__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_HOST__MANAGEMENT:
				setManagement(MANAGEMENT_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_HOST__DEPLOYMENT_MODEL:
				setDeploymentModel(DEPLOYMENT_MODEL_EDEFAULT);
				return;
			case DeploymentPackage.ESTATE_HOST__DERIVED_FILES:
				setDerivedFiles(DERIVED_FILES_EDEFAULT);
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
			case DeploymentPackage.ESTATE_HOST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DeploymentPackage.ESTATE_HOST__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case DeploymentPackage.ESTATE_HOST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DeploymentPackage.ESTATE_HOST__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
			case DeploymentPackage.ESTATE_HOST__MANAGEMENT:
				return management != MANAGEMENT_EDEFAULT;
			case DeploymentPackage.ESTATE_HOST__DEPLOYMENT_MODEL:
				return DEPLOYMENT_MODEL_EDEFAULT == null ? deploymentModel != null : !DEPLOYMENT_MODEL_EDEFAULT.equals(deploymentModel);
			case DeploymentPackage.ESTATE_HOST__DERIVED_FILES:
				return DERIVED_FILES_EDEFAULT == null ? derivedFiles != null : !DERIVED_FILES_EDEFAULT.equals(derivedFiles);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", description: ");
		result.append(description);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(", management: ");
		result.append(management);
		result.append(", deploymentModel: ");
		result.append(deploymentModel);
		result.append(", derivedFiles: ");
		result.append(derivedFiles);
		result.append(')');
		return result.toString();
	}

} //EstateHostImpl
