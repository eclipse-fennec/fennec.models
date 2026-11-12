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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Declared deployment facts as inventory assets: which image a container runs, how it is reachable, what a host is; and the estates of a tenant the inventories are built from. Observed state (what is running right now) is not recorded here; it belongs to scan reports.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DeploymentPackage.eNS_URI, fingerprint = "fp1:61c081b8adced0d4e318c3c9d0fe458f8377ce488f14e931dd64cde1c51a09fe", genModel = "/model/deployment.genmodel", genModelSourceLocations = {"model/deployment.genmodel","org.eclipse.fennec.compliance.deployment.model/model/deployment.genmodel"}, ecore = "/model/deployment.ecore", ecoreSourceLocations = "/model/deployment.ecore")
public interface DeploymentPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/compliance/deployment/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdeployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentPackage eINSTANCE = org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl <em>Image Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getImageRef()
	 * @generated
	 */
	int IMAGE_REF = 0;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__TAG = 2;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__DIGEST = 3;

	/**
	 * The feature id for the '<em><b>Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__PULL_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__FLOATING = 5;

	/**
	 * The feature id for the '<em><b>Built Locally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__BUILT_LOCALLY = 6;

	/**
	 * The number of structural features of the '<em>Image Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Image Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl <em>Port Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getPortPublication()
	 * @generated
	 */
	int PORT_PUBLICATION = 1;

	/**
	 * The feature id for the '<em><b>Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PUBLICATION__HOST_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PUBLICATION__HOST_PORT = 1;

	/**
	 * The feature id for the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PUBLICATION__CONTAINER_PORT = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PUBLICATION__PROTOCOL = 3;

	/**
	 * The number of structural features of the '<em>Port Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PUBLICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PUBLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl <em>Route Exposure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getRouteExposure()
	 * @generated
	 */
	int ROUTE_EXPOSURE = 2;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Path Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE__PATH_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Auth Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE__AUTH_MODE = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE__METHODS = 3;

	/**
	 * The feature id for the '<em><b>Route Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE__ROUTE_ID = 4;

	/**
	 * The number of structural features of the '<em>Route Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Route Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_EXPOSURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl <em>Container Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getContainerAsset()
	 * @generated
	 */
	int CONTAINER_ASSET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__ID = InventoryPackage.ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__NAME = InventoryPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__DESCRIPTION = InventoryPackage.ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__OWNER = InventoryPackage.ASSET__OWNER;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__CATEGORIES = InventoryPackage.ASSET__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Protection Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__PROTECTION_NEEDS = InventoryPackage.ASSET__PROTECTION_NEEDS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__RELATIONS = InventoryPackage.ASSET__RELATIONS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__SOURCES = InventoryPackage.ASSET__SOURCES;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__ASPECTS = InventoryPackage.ASSET__ASPECTS;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__RUNTIME = InventoryPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__MANAGEMENT = InventoryPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__STACK = InventoryPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__SERVICE = InventoryPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__CONTAINER_NAME = InventoryPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__IMAGE = InventoryPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__STATEFUL = InventoryPackage.ASSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Published Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__PUBLISHED_PORTS = InventoryPackage.ASSET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__NETWORKS = InventoryPackage.ASSET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__EXPOSURE = InventoryPackage.ASSET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__ROUTES = InventoryPackage.ASSET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__ASSET_TYPE = InventoryPackage.ASSET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Spec Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET__SPEC_ID = InventoryPackage.ASSET_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Container Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET_FEATURE_COUNT = InventoryPackage.ASSET_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Container Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ASSET_OPERATION_COUNT = InventoryPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl <em>Host Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getHostAsset()
	 * @generated
	 */
	int HOST_ASSET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__ID = InventoryPackage.ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__NAME = InventoryPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__DESCRIPTION = InventoryPackage.ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__OWNER = InventoryPackage.ASSET__OWNER;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__CATEGORIES = InventoryPackage.ASSET__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Protection Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__PROTECTION_NEEDS = InventoryPackage.ASSET__PROTECTION_NEEDS;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__RELATIONS = InventoryPackage.ASSET__RELATIONS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__SOURCES = InventoryPackage.ASSET__SOURCES;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__ASPECTS = InventoryPackage.ASSET__ASPECTS;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__HOSTNAME = InventoryPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__OS = InventoryPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__OS_VERSION = InventoryPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__CONTAINER_RUNTIME = InventoryPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Runtime Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__RUNTIME_VERSION = InventoryPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET__ASSET_TYPE = InventoryPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Host Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET_FEATURE_COUNT = InventoryPackage.ASSET_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Host Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ASSET_OPERATION_COUNT = InventoryPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl <em>Estate Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getEstateConfiguration()
	 * @generated
	 */
	int ESTATE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_CONFIGURATION__TENANT = 1;

	/**
	 * The feature id for the '<em><b>Estates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_CONFIGURATION__ESTATES = 2;

	/**
	 * The feature id for the '<em><b>Image Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_CONFIGURATION__IMAGE_OWNERS = 3;

	/**
	 * The number of structural features of the '<em>Estate Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Estate Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateImpl <em>Estate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.EstateImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getEstate()
	 * @generated
	 */
	int ESTATE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Context Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__CONTEXT_IDS = 3;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE__HOSTS = 4;

	/**
	 * The number of structural features of the '<em>Estate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Estate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl <em>Estate Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getEstateHost()
	 * @generated
	 */
	int ESTATE_HOST = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__ID = 0;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__HOSTNAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__RUNTIME = 3;

	/**
	 * The feature id for the '<em><b>Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__MANAGEMENT = 4;

	/**
	 * The feature id for the '<em><b>Deployment Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__DEPLOYMENT_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Derived Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST__DERIVED_FILES = 6;

	/**
	 * The number of structural features of the '<em>Estate Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Estate Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATE_HOST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageOwnerImpl <em>Image Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.ImageOwnerImpl
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getImageOwner()
	 * @generated
	 */
	int IMAGE_OWNER = 8;

	/**
	 * The feature id for the '<em><b>Image Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OWNER__IMAGE_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OWNER__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Image Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerRuntime <em>Container Runtime</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerRuntime
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getContainerRuntime()
	 * @generated
	 */
	int CONTAINER_RUNTIME = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.ManagementKind <em>Management Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.ManagementKind
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getManagementKind()
	 * @generated
	 */
	int MANAGEMENT_KIND = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.Exposure <em>Exposure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.Exposure
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getExposure()
	 * @generated
	 */
	int EXPOSURE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.AuthMode <em>Auth Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.AuthMode
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getAuthMode()
	 * @generated
	 */
	int AUTH_MODE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.deployment.BumpKind <em>Bump Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.deployment.BumpKind
	 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getBumpKind()
	 * @generated
	 */
	int BUMP_KIND = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Ref</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef
	 * @generated
	 */
	EClass getImageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#getRegistry()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Registry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#getRepository()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#getTag()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getDigest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#getDigest()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Digest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getPullPolicy <em>Pull Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pull Policy</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#getPullPolicy()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_PullPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#isFloating <em>Floating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#isFloating()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Floating();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#isBuiltLocally <em>Built Locally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built Locally</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageRef#isBuiltLocally()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_BuiltLocally();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication <em>Port Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Publication</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.PortPublication
	 * @generated
	 */
	EClass getPortPublication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostAddress <em>Host Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Address</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostAddress()
	 * @see #getPortPublication()
	 * @generated
	 */
	EAttribute getPortPublication_HostAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostPort <em>Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Port</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.PortPublication#getHostPort()
	 * @see #getPortPublication()
	 * @generated
	 */
	EAttribute getPortPublication_HostPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Port</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.PortPublication#getContainerPort()
	 * @see #getPortPublication()
	 * @generated
	 */
	EAttribute getPortPublication_ContainerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.PortPublication#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.PortPublication#getProtocol()
	 * @see #getPortPublication()
	 * @generated
	 */
	EAttribute getPortPublication_Protocol();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure <em>Route Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Exposure</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.RouteExposure
	 * @generated
	 */
	EClass getRouteExposure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.RouteExposure#getHostname()
	 * @see #getRouteExposure()
	 * @generated
	 */
	EAttribute getRouteExposure_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getPathPrefix <em>Path Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Prefix</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.RouteExposure#getPathPrefix()
	 * @see #getRouteExposure()
	 * @generated
	 */
	EAttribute getRouteExposure_PathPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getAuthMode <em>Auth Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Mode</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.RouteExposure#getAuthMode()
	 * @see #getRouteExposure()
	 * @generated
	 */
	EAttribute getRouteExposure_AuthMode();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Methods</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.RouteExposure#getMethods()
	 * @see #getRouteExposure()
	 * @generated
	 */
	EAttribute getRouteExposure_Methods();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.RouteExposure#getRouteId <em>Route Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.RouteExposure#getRouteId()
	 * @see #getRouteExposure()
	 * @generated
	 */
	EAttribute getRouteExposure_RouteId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset <em>Container Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Asset</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset
	 * @generated
	 */
	EClass getContainerAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRuntime()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Runtime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getManagement <em>Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getManagement()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Management();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getStack()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Stack();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getService()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getContainerName <em>Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getContainerName()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_ContainerName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getImage()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EReference getContainerAsset_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#isStateful <em>Stateful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateful</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#isStateful()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Stateful();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getPublishedPorts <em>Published Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Published Ports</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getPublishedPorts()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EReference getContainerAsset_PublishedPorts();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Networks</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getNetworks()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Networks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getExposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getExposure()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_Exposure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getRoutes()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EReference getContainerAsset_Routes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getAssetType()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_AssetType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getSpecId <em>Spec Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerAsset#getSpecId()
	 * @see #getContainerAsset()
	 * @generated
	 */
	EAttribute getContainerAsset_SpecId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset <em>Host Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Asset</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset
	 * @generated
	 */
	EClass getHostAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset#getHostname()
	 * @see #getHostAsset()
	 * @generated
	 */
	EAttribute getHostAsset_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset#getOs()
	 * @see #getHostAsset()
	 * @generated
	 */
	EAttribute getHostAsset_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset#getOsVersion()
	 * @see #getHostAsset()
	 * @generated
	 */
	EAttribute getHostAsset_OsVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getContainerRuntime <em>Container Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Runtime</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset#getContainerRuntime()
	 * @see #getHostAsset()
	 * @generated
	 */
	EAttribute getHostAsset_ContainerRuntime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getRuntimeVersion <em>Runtime Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset#getRuntimeVersion()
	 * @see #getHostAsset()
	 * @generated
	 */
	EAttribute getHostAsset_RuntimeVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.HostAsset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.HostAsset#getAssetType()
	 * @see #getHostAsset()
	 * @generated
	 */
	EAttribute getHostAsset_AssetType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration <em>Estate Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estate Configuration</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateConfiguration
	 * @generated
	 */
	EClass getEstateConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getId()
	 * @see #getEstateConfiguration()
	 * @generated
	 */
	EAttribute getEstateConfiguration_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getTenant()
	 * @see #getEstateConfiguration()
	 * @generated
	 */
	EAttribute getEstateConfiguration_Tenant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getEstates <em>Estates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estates</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getEstates()
	 * @see #getEstateConfiguration()
	 * @generated
	 */
	EReference getEstateConfiguration_Estates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getImageOwners <em>Image Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Owners</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateConfiguration#getImageOwners()
	 * @see #getEstateConfiguration()
	 * @generated
	 */
	EReference getEstateConfiguration_ImageOwners();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.Estate <em>Estate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estate</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Estate
	 * @generated
	 */
	EClass getEstate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Estate#getId()
	 * @see #getEstate()
	 * @generated
	 */
	EAttribute getEstate_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Estate#getName()
	 * @see #getEstate()
	 * @generated
	 */
	EAttribute getEstate_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Estate#getOwner()
	 * @see #getEstate()
	 * @generated
	 */
	EAttribute getEstate_Owner();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getContextIds <em>Context Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context Ids</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Estate#getContextIds()
	 * @see #getEstate()
	 * @generated
	 */
	EAttribute getEstate_ContextIds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Estate#getHosts()
	 * @see #getEstate()
	 * @generated
	 */
	EReference getEstate_Hosts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost <em>Estate Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estate Host</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost
	 * @generated
	 */
	EClass getEstateHost();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getId()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getHostname()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getDescription()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getRuntime()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_Runtime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getManagement <em>Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getManagement()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_Management();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDeploymentModel <em>Deployment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Model</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getDeploymentModel()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_DeploymentModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.EstateHost#getDerivedFiles <em>Derived Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Files</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.EstateHost#getDerivedFiles()
	 * @see #getEstateHost()
	 * @generated
	 */
	EAttribute getEstateHost_DerivedFiles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner <em>Image Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Owner</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageOwner
	 * @generated
	 */
	EClass getImageOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner#getImagePrefix <em>Image Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Prefix</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageOwner#getImagePrefix()
	 * @see #getImageOwner()
	 * @generated
	 */
	EAttribute getImageOwner_ImagePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.deployment.ImageOwner#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ImageOwner#getRepository()
	 * @see #getImageOwner()
	 * @generated
	 */
	EAttribute getImageOwner_Repository();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.deployment.ContainerRuntime <em>Container Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Runtime</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ContainerRuntime
	 * @generated
	 */
	EEnum getContainerRuntime();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.deployment.ManagementKind <em>Management Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Management Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.ManagementKind
	 * @generated
	 */
	EEnum getManagementKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.deployment.Exposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exposure</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.Exposure
	 * @generated
	 */
	EEnum getExposure();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.deployment.AuthMode <em>Auth Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auth Mode</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.AuthMode
	 * @generated
	 */
	EEnum getAuthMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.deployment.BumpKind <em>Bump Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bump Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.deployment.BumpKind
	 * @generated
	 */
	EEnum getBumpKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl <em>Image Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getImageRef()
		 * @generated
		 */
		EClass IMAGE_REF = eINSTANCE.getImageRef();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__REGISTRY = eINSTANCE.getImageRef_Registry();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__REPOSITORY = eINSTANCE.getImageRef_Repository();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__TAG = eINSTANCE.getImageRef_Tag();

		/**
		 * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__DIGEST = eINSTANCE.getImageRef_Digest();

		/**
		 * The meta object literal for the '<em><b>Pull Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__PULL_POLICY = eINSTANCE.getImageRef_PullPolicy();

		/**
		 * The meta object literal for the '<em><b>Floating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__FLOATING = eINSTANCE.getImageRef_Floating();

		/**
		 * The meta object literal for the '<em><b>Built Locally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__BUILT_LOCALLY = eINSTANCE.getImageRef_BuiltLocally();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl <em>Port Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.PortPublicationImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getPortPublication()
		 * @generated
		 */
		EClass PORT_PUBLICATION = eINSTANCE.getPortPublication();

		/**
		 * The meta object literal for the '<em><b>Host Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PUBLICATION__HOST_ADDRESS = eINSTANCE.getPortPublication_HostAddress();

		/**
		 * The meta object literal for the '<em><b>Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PUBLICATION__HOST_PORT = eINSTANCE.getPortPublication_HostPort();

		/**
		 * The meta object literal for the '<em><b>Container Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PUBLICATION__CONTAINER_PORT = eINSTANCE.getPortPublication_ContainerPort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PUBLICATION__PROTOCOL = eINSTANCE.getPortPublication_Protocol();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl <em>Route Exposure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.RouteExposureImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getRouteExposure()
		 * @generated
		 */
		EClass ROUTE_EXPOSURE = eINSTANCE.getRouteExposure();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_EXPOSURE__HOSTNAME = eINSTANCE.getRouteExposure_Hostname();

		/**
		 * The meta object literal for the '<em><b>Path Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_EXPOSURE__PATH_PREFIX = eINSTANCE.getRouteExposure_PathPrefix();

		/**
		 * The meta object literal for the '<em><b>Auth Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_EXPOSURE__AUTH_MODE = eINSTANCE.getRouteExposure_AuthMode();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_EXPOSURE__METHODS = eINSTANCE.getRouteExposure_Methods();

		/**
		 * The meta object literal for the '<em><b>Route Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_EXPOSURE__ROUTE_ID = eINSTANCE.getRouteExposure_RouteId();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl <em>Container Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getContainerAsset()
		 * @generated
		 */
		EClass CONTAINER_ASSET = eINSTANCE.getContainerAsset();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__RUNTIME = eINSTANCE.getContainerAsset_Runtime();

		/**
		 * The meta object literal for the '<em><b>Management</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__MANAGEMENT = eINSTANCE.getContainerAsset_Management();

		/**
		 * The meta object literal for the '<em><b>Stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__STACK = eINSTANCE.getContainerAsset_Stack();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__SERVICE = eINSTANCE.getContainerAsset_Service();

		/**
		 * The meta object literal for the '<em><b>Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__CONTAINER_NAME = eINSTANCE.getContainerAsset_ContainerName();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ASSET__IMAGE = eINSTANCE.getContainerAsset_Image();

		/**
		 * The meta object literal for the '<em><b>Stateful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__STATEFUL = eINSTANCE.getContainerAsset_Stateful();

		/**
		 * The meta object literal for the '<em><b>Published Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ASSET__PUBLISHED_PORTS = eINSTANCE.getContainerAsset_PublishedPorts();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__NETWORKS = eINSTANCE.getContainerAsset_Networks();

		/**
		 * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__EXPOSURE = eINSTANCE.getContainerAsset_Exposure();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ASSET__ROUTES = eINSTANCE.getContainerAsset_Routes();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__ASSET_TYPE = eINSTANCE.getContainerAsset_AssetType();

		/**
		 * The meta object literal for the '<em><b>Spec Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ASSET__SPEC_ID = eINSTANCE.getContainerAsset_SpecId();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl <em>Host Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.HostAssetImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getHostAsset()
		 * @generated
		 */
		EClass HOST_ASSET = eINSTANCE.getHostAsset();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ASSET__HOSTNAME = eINSTANCE.getHostAsset_Hostname();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ASSET__OS = eINSTANCE.getHostAsset_Os();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ASSET__OS_VERSION = eINSTANCE.getHostAsset_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Container Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ASSET__CONTAINER_RUNTIME = eINSTANCE.getHostAsset_ContainerRuntime();

		/**
		 * The meta object literal for the '<em><b>Runtime Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ASSET__RUNTIME_VERSION = eINSTANCE.getHostAsset_RuntimeVersion();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ASSET__ASSET_TYPE = eINSTANCE.getHostAsset_AssetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl <em>Estate Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.EstateConfigurationImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getEstateConfiguration()
		 * @generated
		 */
		EClass ESTATE_CONFIGURATION = eINSTANCE.getEstateConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_CONFIGURATION__ID = eINSTANCE.getEstateConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_CONFIGURATION__TENANT = eINSTANCE.getEstateConfiguration_Tenant();

		/**
		 * The meta object literal for the '<em><b>Estates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTATE_CONFIGURATION__ESTATES = eINSTANCE.getEstateConfiguration_Estates();

		/**
		 * The meta object literal for the '<em><b>Image Owners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTATE_CONFIGURATION__IMAGE_OWNERS = eINSTANCE.getEstateConfiguration_ImageOwners();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateImpl <em>Estate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.EstateImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getEstate()
		 * @generated
		 */
		EClass ESTATE = eINSTANCE.getEstate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE__ID = eINSTANCE.getEstate_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE__NAME = eINSTANCE.getEstate_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE__OWNER = eINSTANCE.getEstate_Owner();

		/**
		 * The meta object literal for the '<em><b>Context Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE__CONTEXT_IDS = eINSTANCE.getEstate_ContextIds();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTATE__HOSTS = eINSTANCE.getEstate_Hosts();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl <em>Estate Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.EstateHostImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getEstateHost()
		 * @generated
		 */
		EClass ESTATE_HOST = eINSTANCE.getEstateHost();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__ID = eINSTANCE.getEstateHost_Id();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__HOSTNAME = eINSTANCE.getEstateHost_Hostname();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__DESCRIPTION = eINSTANCE.getEstateHost_Description();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__RUNTIME = eINSTANCE.getEstateHost_Runtime();

		/**
		 * The meta object literal for the '<em><b>Management</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__MANAGEMENT = eINSTANCE.getEstateHost_Management();

		/**
		 * The meta object literal for the '<em><b>Deployment Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__DEPLOYMENT_MODEL = eINSTANCE.getEstateHost_DeploymentModel();

		/**
		 * The meta object literal for the '<em><b>Derived Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATE_HOST__DERIVED_FILES = eINSTANCE.getEstateHost_DerivedFiles();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageOwnerImpl <em>Image Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.ImageOwnerImpl
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getImageOwner()
		 * @generated
		 */
		EClass IMAGE_OWNER = eINSTANCE.getImageOwner();

		/**
		 * The meta object literal for the '<em><b>Image Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_OWNER__IMAGE_PREFIX = eINSTANCE.getImageOwner_ImagePrefix();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_OWNER__REPOSITORY = eINSTANCE.getImageOwner_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.ContainerRuntime <em>Container Runtime</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.ContainerRuntime
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getContainerRuntime()
		 * @generated
		 */
		EEnum CONTAINER_RUNTIME = eINSTANCE.getContainerRuntime();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.ManagementKind <em>Management Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.ManagementKind
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getManagementKind()
		 * @generated
		 */
		EEnum MANAGEMENT_KIND = eINSTANCE.getManagementKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.Exposure <em>Exposure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.Exposure
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getExposure()
		 * @generated
		 */
		EEnum EXPOSURE = eINSTANCE.getExposure();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.AuthMode <em>Auth Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.AuthMode
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getAuthMode()
		 * @generated
		 */
		EEnum AUTH_MODE = eINSTANCE.getAuthMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.deployment.BumpKind <em>Bump Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.deployment.BumpKind
		 * @see org.eclipse.fennec.model.compliance.deployment.impl.DeploymentPackageImpl#getBumpKind()
		 * @generated
		 */
		EEnum BUMP_KIND = eINSTANCE.getBumpKind();

	}

} //DeploymentPackage
