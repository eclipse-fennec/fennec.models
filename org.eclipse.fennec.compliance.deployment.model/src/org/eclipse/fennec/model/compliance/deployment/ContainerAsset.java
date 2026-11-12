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

import org.eclipse.fennec.model.compliance.inventory.Asset;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container as an asset. The features declared here are read from the deployment model and replaced on each import; those inherited from Asset (owner, protection needs, relations) are curated and kept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getManagement <em>Management</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getStack <em>Stack</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#isStateful <em>Stateful</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getPublishedPorts <em>Published Ports</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getExposure <em>Exposure</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getSpecId <em>Spec Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset()
 * @model
 * @generated
 */
@ProviderType
public interface ContainerAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.deployment.ContainerRuntime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerRuntime
	 * @see #setRuntime(ContainerRuntime)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Runtime()
	 * @model
	 * @generated
	 */
	ContainerRuntime getRuntime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRuntime <em>Runtime</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Management()
	 * @model
	 * @generated
	 */
	ManagementKind getManagement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getManagement <em>Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.ManagementKind
	 * @see #getManagement()
	 * @generated
	 */
	void setManagement(ManagementKind value);

	/**
	 * Returns the value of the '<em><b>Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group the container is deployed with: a compose project or a systemd target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stack</em>' attribute.
	 * @see #setStack(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Stack()
	 * @model
	 * @generated
	 */
	String getStack();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getStack <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack</em>' attribute.
	 * @see #getStack()
	 * @generated
	 */
	void setStack(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the service within its stack: the compose service or the unit name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Service()
	 * @model
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the container at runtime; joins the declaration to what is observed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Name</em>' attribute.
	 * @see #setContainerName(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_ContainerName()
	 * @model
	 * @generated
	 */
	String getContainerName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getContainerName <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name</em>' attribute.
	 * @see #getContainerName()
	 * @generated
	 */
	void setContainerName(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(ImageRef)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Image()
	 * @model containment="true"
	 * @generated
	 */
	ImageRef getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(ImageRef value);

	/**
	 * Returns the value of the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when the container keeps data in a volume, e.g. a database. Stateful containers are not updated without a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stateful</em>' attribute.
	 * @see #setStateful(boolean)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Stateful()
	 * @model
	 * @generated
	 */
	boolean isStateful();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#isStateful <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateful</em>' attribute.
	 * @see #isStateful()
	 * @generated
	 */
	void setStateful(boolean value);

	/**
	 * Returns the value of the '<em><b>Published Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.deployment.PortPublication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published Ports</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_PublishedPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortPublication> getPublishedPorts();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Networks()
	 * @model
	 * @generated
	 */
	EList<String> getNetworks();

	/**
	 * Returns the value of the '<em><b>Exposure</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.deployment.Exposure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.Exposure
	 * @see #setExposure(Exposure)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Exposure()
	 * @model
	 * @generated
	 */
	Exposure getExposure();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.deployment.Exposure
	 * @see #getExposure()
	 * @generated
	 */
	void setExposure(Exposure value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.deployment.RouteExposure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouteExposure> getRoutes();

	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The default value is <code>"container"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind of asset for consumers that do not know this package; container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see #setAssetType(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_AssetType()
	 * @model default="container"
	 * @generated
	 */
	String getAssetType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(String value);

	/**
	 * Returns the value of the '<em><b>Spec Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the service specification the image is declared on. Several containers, also on other hosts, can share one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec Id</em>' attribute.
	 * @see #setSpecId(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerAsset_SpecId()
	 * @model
	 * @generated
	 */
	String getSpecId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getSpecId <em>Spec Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Id</em>' attribute.
	 * @see #getSpecId()
	 * @generated
	 */
	void setSpecId(String value);

} // ContainerAsset
