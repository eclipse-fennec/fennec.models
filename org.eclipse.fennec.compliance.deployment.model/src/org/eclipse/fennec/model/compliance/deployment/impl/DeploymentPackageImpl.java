/**
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.compliance.context.ContextPackage;

import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;

import org.eclipse.fennec.model.compliance.deployment.AuthMode;
import org.eclipse.fennec.model.compliance.deployment.BumpKind;
import org.eclipse.fennec.model.compliance.deployment.ContainerAsset;
import org.eclipse.fennec.model.compliance.deployment.ContainerRuntime;
import org.eclipse.fennec.model.compliance.deployment.DeploymentFactory;
import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.Estate;
import org.eclipse.fennec.model.compliance.deployment.EstateConfiguration;
import org.eclipse.fennec.model.compliance.deployment.EstateHost;
import org.eclipse.fennec.model.compliance.deployment.Exposure;
import org.eclipse.fennec.model.compliance.deployment.HostAsset;
import org.eclipse.fennec.model.compliance.deployment.ImageOwner;
import org.eclipse.fennec.model.compliance.deployment.ImageRef;
import org.eclipse.fennec.model.compliance.deployment.ManagementKind;
import org.eclipse.fennec.model.compliance.deployment.PortPublication;
import org.eclipse.fennec.model.compliance.deployment.RouteExposure;

import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPublicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeExposureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estateHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerRuntimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum managementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exposureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bumpKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited) return (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentPackageImpl theDeploymentPackage = registeredDeploymentPackage instanceof DeploymentPackageImpl ? (DeploymentPackageImpl)registeredDeploymentPackage : new DeploymentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InventoryPackage.eINSTANCE.eClass();
		ContextPackage.eINSTANCE.eClass();
		CorpusPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageRef() {
		return imageRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_Registry() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_Repository() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_Tag() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_Digest() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_PullPolicy() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_Floating() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRef_BuiltLocally() {
		return (EAttribute)imageRefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortPublication() {
		return portPublicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPublication_HostAddress() {
		return (EAttribute)portPublicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPublication_HostPort() {
		return (EAttribute)portPublicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPublication_ContainerPort() {
		return (EAttribute)portPublicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortPublication_Protocol() {
		return (EAttribute)portPublicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouteExposure() {
		return routeExposureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteExposure_Hostname() {
		return (EAttribute)routeExposureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteExposure_PathPrefix() {
		return (EAttribute)routeExposureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteExposure_AuthMode() {
		return (EAttribute)routeExposureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteExposure_Methods() {
		return (EAttribute)routeExposureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouteExposure_RouteId() {
		return (EAttribute)routeExposureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerAsset() {
		return containerAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Runtime() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Management() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Stack() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Service() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_ContainerName() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerAsset_Image() {
		return (EReference)containerAssetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Stateful() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerAsset_PublishedPorts() {
		return (EReference)containerAssetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Networks() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_Exposure() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerAsset_Routes() {
		return (EReference)containerAssetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_AssetType() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerAsset_SpecId() {
		return (EAttribute)containerAssetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHostAsset() {
		return hostAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostAsset_Hostname() {
		return (EAttribute)hostAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostAsset_Os() {
		return (EAttribute)hostAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostAsset_OsVersion() {
		return (EAttribute)hostAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostAsset_ContainerRuntime() {
		return (EAttribute)hostAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostAsset_RuntimeVersion() {
		return (EAttribute)hostAssetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHostAsset_AssetType() {
		return (EAttribute)hostAssetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEstateConfiguration() {
		return estateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateConfiguration_Id() {
		return (EAttribute)estateConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateConfiguration_Tenant() {
		return (EAttribute)estateConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEstateConfiguration_Estates() {
		return (EReference)estateConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEstateConfiguration_ImageOwners() {
		return (EReference)estateConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEstate() {
		return estateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstate_Id() {
		return (EAttribute)estateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstate_Name() {
		return (EAttribute)estateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstate_Owner() {
		return (EAttribute)estateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstate_ContextIds() {
		return (EAttribute)estateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEstate_Hosts() {
		return (EReference)estateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEstateHost() {
		return estateHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_Id() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_Hostname() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_Description() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_Runtime() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_Management() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_DeploymentModel() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEstateHost_DerivedFiles() {
		return (EAttribute)estateHostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageOwner() {
		return imageOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageOwner_ImagePrefix() {
		return (EAttribute)imageOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageOwner_Repository() {
		return (EAttribute)imageOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContainerRuntime() {
		return containerRuntimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getManagementKind() {
		return managementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExposure() {
		return exposureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthMode() {
		return authModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBumpKind() {
		return bumpKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imageRefEClass = createEClass(IMAGE_REF);
		createEAttribute(imageRefEClass, IMAGE_REF__REGISTRY);
		createEAttribute(imageRefEClass, IMAGE_REF__REPOSITORY);
		createEAttribute(imageRefEClass, IMAGE_REF__TAG);
		createEAttribute(imageRefEClass, IMAGE_REF__DIGEST);
		createEAttribute(imageRefEClass, IMAGE_REF__PULL_POLICY);
		createEAttribute(imageRefEClass, IMAGE_REF__FLOATING);
		createEAttribute(imageRefEClass, IMAGE_REF__BUILT_LOCALLY);

		portPublicationEClass = createEClass(PORT_PUBLICATION);
		createEAttribute(portPublicationEClass, PORT_PUBLICATION__HOST_ADDRESS);
		createEAttribute(portPublicationEClass, PORT_PUBLICATION__HOST_PORT);
		createEAttribute(portPublicationEClass, PORT_PUBLICATION__CONTAINER_PORT);
		createEAttribute(portPublicationEClass, PORT_PUBLICATION__PROTOCOL);

		routeExposureEClass = createEClass(ROUTE_EXPOSURE);
		createEAttribute(routeExposureEClass, ROUTE_EXPOSURE__HOSTNAME);
		createEAttribute(routeExposureEClass, ROUTE_EXPOSURE__PATH_PREFIX);
		createEAttribute(routeExposureEClass, ROUTE_EXPOSURE__AUTH_MODE);
		createEAttribute(routeExposureEClass, ROUTE_EXPOSURE__METHODS);
		createEAttribute(routeExposureEClass, ROUTE_EXPOSURE__ROUTE_ID);

		containerAssetEClass = createEClass(CONTAINER_ASSET);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__RUNTIME);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__MANAGEMENT);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__STACK);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__SERVICE);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__CONTAINER_NAME);
		createEReference(containerAssetEClass, CONTAINER_ASSET__IMAGE);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__STATEFUL);
		createEReference(containerAssetEClass, CONTAINER_ASSET__PUBLISHED_PORTS);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__NETWORKS);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__EXPOSURE);
		createEReference(containerAssetEClass, CONTAINER_ASSET__ROUTES);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__ASSET_TYPE);
		createEAttribute(containerAssetEClass, CONTAINER_ASSET__SPEC_ID);

		hostAssetEClass = createEClass(HOST_ASSET);
		createEAttribute(hostAssetEClass, HOST_ASSET__HOSTNAME);
		createEAttribute(hostAssetEClass, HOST_ASSET__OS);
		createEAttribute(hostAssetEClass, HOST_ASSET__OS_VERSION);
		createEAttribute(hostAssetEClass, HOST_ASSET__CONTAINER_RUNTIME);
		createEAttribute(hostAssetEClass, HOST_ASSET__RUNTIME_VERSION);
		createEAttribute(hostAssetEClass, HOST_ASSET__ASSET_TYPE);

		estateConfigurationEClass = createEClass(ESTATE_CONFIGURATION);
		createEAttribute(estateConfigurationEClass, ESTATE_CONFIGURATION__ID);
		createEAttribute(estateConfigurationEClass, ESTATE_CONFIGURATION__TENANT);
		createEReference(estateConfigurationEClass, ESTATE_CONFIGURATION__ESTATES);
		createEReference(estateConfigurationEClass, ESTATE_CONFIGURATION__IMAGE_OWNERS);

		estateEClass = createEClass(ESTATE);
		createEAttribute(estateEClass, ESTATE__ID);
		createEAttribute(estateEClass, ESTATE__NAME);
		createEAttribute(estateEClass, ESTATE__OWNER);
		createEAttribute(estateEClass, ESTATE__CONTEXT_IDS);
		createEReference(estateEClass, ESTATE__HOSTS);

		estateHostEClass = createEClass(ESTATE_HOST);
		createEAttribute(estateHostEClass, ESTATE_HOST__ID);
		createEAttribute(estateHostEClass, ESTATE_HOST__HOSTNAME);
		createEAttribute(estateHostEClass, ESTATE_HOST__DESCRIPTION);
		createEAttribute(estateHostEClass, ESTATE_HOST__RUNTIME);
		createEAttribute(estateHostEClass, ESTATE_HOST__MANAGEMENT);
		createEAttribute(estateHostEClass, ESTATE_HOST__DEPLOYMENT_MODEL);
		createEAttribute(estateHostEClass, ESTATE_HOST__DERIVED_FILES);

		imageOwnerEClass = createEClass(IMAGE_OWNER);
		createEAttribute(imageOwnerEClass, IMAGE_OWNER__IMAGE_PREFIX);
		createEAttribute(imageOwnerEClass, IMAGE_OWNER__REPOSITORY);

		// Create enums
		containerRuntimeEEnum = createEEnum(CONTAINER_RUNTIME);
		managementKindEEnum = createEEnum(MANAGEMENT_KIND);
		exposureEEnum = createEEnum(EXPOSURE);
		authModeEEnum = createEEnum(AUTH_MODE);
		bumpKindEEnum = createEEnum(BUMP_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerAssetEClass.getESuperTypes().add(theInventoryPackage.getAsset());
		hostAssetEClass.getESuperTypes().add(theInventoryPackage.getAsset());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageRefEClass, ImageRef.class, "ImageRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageRef_Registry(), ecorePackage.getEString(), "registry", null, 0, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageRef_Repository(), ecorePackage.getEString(), "repository", null, 1, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageRef_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageRef_Digest(), ecorePackage.getEString(), "digest", null, 0, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageRef_PullPolicy(), ecorePackage.getEString(), "pullPolicy", null, 0, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageRef_Floating(), ecorePackage.getEBoolean(), "floating", null, 0, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageRef_BuiltLocally(), ecorePackage.getEBoolean(), "builtLocally", null, 0, 1, ImageRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPublicationEClass, PortPublication.class, "PortPublication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortPublication_HostAddress(), ecorePackage.getEString(), "hostAddress", null, 0, 1, PortPublication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPublication_HostPort(), ecorePackage.getEString(), "hostPort", null, 0, 1, PortPublication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPublication_ContainerPort(), ecorePackage.getEString(), "containerPort", null, 0, 1, PortPublication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortPublication_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, PortPublication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeExposureEClass, RouteExposure.class, "RouteExposure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteExposure_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, RouteExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteExposure_PathPrefix(), ecorePackage.getEString(), "pathPrefix", null, 0, 1, RouteExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteExposure_AuthMode(), this.getAuthMode(), "authMode", null, 0, 1, RouteExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteExposure_Methods(), ecorePackage.getEString(), "methods", null, 0, -1, RouteExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteExposure_RouteId(), ecorePackage.getEString(), "routeId", null, 0, 1, RouteExposure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerAssetEClass, ContainerAsset.class, "ContainerAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerAsset_Runtime(), this.getContainerRuntime(), "runtime", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_Management(), this.getManagementKind(), "management", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_Stack(), ecorePackage.getEString(), "stack", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_Service(), ecorePackage.getEString(), "service", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_ContainerName(), ecorePackage.getEString(), "containerName", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerAsset_Image(), this.getImageRef(), null, "image", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_Stateful(), ecorePackage.getEBoolean(), "stateful", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerAsset_PublishedPorts(), this.getPortPublication(), null, "publishedPorts", null, 0, -1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_Networks(), ecorePackage.getEString(), "networks", null, 0, -1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_Exposure(), this.getExposure(), "exposure", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerAsset_Routes(), this.getRouteExposure(), null, "routes", null, 0, -1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_AssetType(), ecorePackage.getEString(), "assetType", "container", 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAsset_SpecId(), ecorePackage.getEString(), "specId", null, 0, 1, ContainerAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostAssetEClass, HostAsset.class, "HostAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostAsset_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, HostAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostAsset_Os(), ecorePackage.getEString(), "os", null, 0, 1, HostAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostAsset_OsVersion(), ecorePackage.getEString(), "osVersion", null, 0, 1, HostAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostAsset_ContainerRuntime(), ecorePackage.getEString(), "containerRuntime", null, 0, 1, HostAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostAsset_RuntimeVersion(), ecorePackage.getEString(), "runtimeVersion", null, 0, 1, HostAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostAsset_AssetType(), ecorePackage.getEString(), "assetType", "host", 0, 1, HostAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estateConfigurationEClass, EstateConfiguration.class, "EstateConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstateConfiguration_Id(), ecorePackage.getEString(), "id", null, 1, 1, EstateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateConfiguration_Tenant(), ecorePackage.getEString(), "tenant", null, 1, 1, EstateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstateConfiguration_Estates(), this.getEstate(), null, "estates", null, 0, -1, EstateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstateConfiguration_ImageOwners(), this.getImageOwner(), null, "imageOwners", null, 0, -1, EstateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estateEClass, Estate.class, "Estate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstate_Id(), ecorePackage.getEString(), "id", null, 1, 1, Estate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Estate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstate_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, Estate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstate_ContextIds(), ecorePackage.getEString(), "contextIds", null, 0, -1, Estate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstate_Hosts(), this.getEstateHost(), null, "hosts", null, 0, -1, Estate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estateHostEClass, EstateHost.class, "EstateHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstateHost_Id(), ecorePackage.getEString(), "id", null, 1, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateHost_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateHost_Description(), ecorePackage.getEString(), "description", null, 0, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateHost_Runtime(), this.getContainerRuntime(), "runtime", null, 0, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateHost_Management(), this.getManagementKind(), "management", null, 0, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateHost_DeploymentModel(), ecorePackage.getEString(), "deploymentModel", null, 0, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstateHost_DerivedFiles(), ecorePackage.getEString(), "derivedFiles", null, 0, 1, EstateHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageOwnerEClass, ImageOwner.class, "ImageOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageOwner_ImagePrefix(), ecorePackage.getEString(), "imagePrefix", null, 1, 1, ImageOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageOwner_Repository(), ecorePackage.getEString(), "repository", null, 1, 1, ImageOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(containerRuntimeEEnum, ContainerRuntime.class, "ContainerRuntime");
		addEEnumLiteral(containerRuntimeEEnum, ContainerRuntime.OTHER);
		addEEnumLiteral(containerRuntimeEEnum, ContainerRuntime.PODMAN_QUADLET);
		addEEnumLiteral(containerRuntimeEEnum, ContainerRuntime.DOCKER_COMPOSE);
		addEEnumLiteral(containerRuntimeEEnum, ContainerRuntime.KUBERNETES);

		initEEnum(managementKindEEnum, ManagementKind.class, "ManagementKind");
		addEEnumLiteral(managementKindEEnum, ManagementKind.HAND_WRITTEN);
		addEEnumLiteral(managementKindEEnum, ManagementKind.GENERATED);

		initEEnum(exposureEEnum, Exposure.class, "Exposure");
		addEEnumLiteral(exposureEEnum, Exposure.NONE);
		addEEnumLiteral(exposureEEnum, Exposure.INTERNAL);
		addEEnumLiteral(exposureEEnum, Exposure.INDIRECT);
		addEEnumLiteral(exposureEEnum, Exposure.INTERNET_AUTHENTICATED);
		addEEnumLiteral(exposureEEnum, Exposure.HOST_PORT_PUBLIC);
		addEEnumLiteral(exposureEEnum, Exposure.INTERNET_PUBLIC);

		initEEnum(authModeEEnum, AuthMode.class, "AuthMode");
		addEEnumLiteral(authModeEEnum, AuthMode.NONE);
		addEEnumLiteral(authModeEEnum, AuthMode.OIDC);
		addEEnumLiteral(authModeEEnum, AuthMode.BASIC);
		addEEnumLiteral(authModeEEnum, AuthMode.KEY);
		addEEnumLiteral(authModeEEnum, AuthMode.OTHER);

		initEEnum(bumpKindEEnum, BumpKind.class, "BumpKind");
		addEEnumLiteral(bumpKindEEnum, BumpKind.DIGEST);
		addEEnumLiteral(bumpKindEEnum, BumpKind.PATCH);
		addEEnumLiteral(bumpKindEEnum, BumpKind.MINOR);
		addEEnumLiteral(bumpKindEEnum, BumpKind.MAJOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Declared deployment facts as inventory assets: which image a container runs, how it is reachable, what a host is; and the estates of a tenant the inventories are built from. Observed state (what is running right now) is not recorded here; it belongs to scan reports."
		   });
		addAnnotation
		  (containerRuntimeEEnum,
		   source,
		   new String[] {
			   "documentation", "How the container is run on its host."
		   });
		addAnnotation
		  (managementKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How the files a host deploys from relate to the deployment model."
		   });
		addAnnotation
		  (managementKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Written by hand and kept in step with the model, e.g. a compose file. A change of the model is repeated in the file."
		   });
		addAnnotation
		  (managementKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Generated from the deployment model."
		   });
		addAnnotation
		  (exposureEEnum,
		   source,
		   new String[] {
			   "documentation", "How far a container can be reached, ordered from least to most exposed. Used to rank findings."
		   });
		addAnnotation
		  (exposureEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "No listener reachable from other containers or hosts."
		   });
		addAnnotation
		  (exposureEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Reachable only from containers on the same host or from loopback."
		   });
		addAnnotation
		  (exposureEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Internal, but an internet-facing asset depends on it."
		   });
		addAnnotation
		  (exposureEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Reachable from the internet through a gateway route that requires authentication."
		   });
		addAnnotation
		  (exposureEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "A port published on a public address of the host, bypassing the gateway."
		   });
		addAnnotation
		  (exposureEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Reachable from the internet through a gateway route without authentication."
		   });
		addAnnotation
		  (authModeEEnum,
		   source,
		   new String[] {
			   "documentation", "What a gateway route asks of a caller."
		   });
		addAnnotation
		  (imageRefEClass,
		   source,
		   new String[] {
			   "documentation", "A container image as declared. The digest is what identifies the content; a tag alone can move."
		   });
		addAnnotation
		  (getImageRef_Digest(),
		   source,
		   new String[] {
			   "documentation", "Content digest, e.g. sha256:..., when the declaration pins one."
		   });
		addAnnotation
		  (getImageRef_PullPolicy(),
		   source,
		   new String[] {
			   "documentation", "Pull policy as declared, e.g. newer, always, missing."
		   });
		addAnnotation
		  (getImageRef_Floating(),
		   source,
		   new String[] {
			   "documentation", "True when the content can change without a change of the declaration: no digest, and a missing, moving or major-only tag."
		   });
		addAnnotation
		  (getImageRef_BuiltLocally(),
		   source,
		   new String[] {
			   "documentation", "True when the image is built on the host and has no registry to compare with."
		   });
		addAnnotation
		  (portPublicationEClass,
		   source,
		   new String[] {
			   "documentation", "A container port published on the host."
		   });
		addAnnotation
		  (getPortPublication_HostAddress(),
		   source,
		   new String[] {
			   "documentation", "Bind address on the host; empty means all addresses."
		   });
		addAnnotation
		  (routeExposureEClass,
		   source,
		   new String[] {
			   "documentation", "A gateway route that leads to the container."
		   });
		addAnnotation
		  (getRouteExposure_RouteId(),
		   source,
		   new String[] {
			   "documentation", "Id of the route in the gateway."
		   });
		addAnnotation
		  (containerAssetEClass,
		   source,
		   new String[] {
			   "documentation", "A container as an asset. The features declared here are read from the deployment model and replaced on each import; those inherited from Asset (owner, protection needs, relations) are curated and kept."
		   });
		addAnnotation
		  (getContainerAsset_Stack(),
		   source,
		   new String[] {
			   "documentation", "The group the container is deployed with: a compose project or a systemd target."
		   });
		addAnnotation
		  (getContainerAsset_Service(),
		   source,
		   new String[] {
			   "documentation", "Name of the service within its stack: the compose service or the unit name."
		   });
		addAnnotation
		  (getContainerAsset_ContainerName(),
		   source,
		   new String[] {
			   "documentation", "Name of the container at runtime; joins the declaration to what is observed."
		   });
		addAnnotation
		  (getContainerAsset_Stateful(),
		   source,
		   new String[] {
			   "documentation", "True when the container keeps data in a volume, e.g. a database. Stateful containers are not updated without a person."
		   });
		addAnnotation
		  (getContainerAsset_AssetType(),
		   source,
		   new String[] {
			   "documentation", "Kind of asset for consumers that do not know this package; container."
		   });
		addAnnotation
		  (getContainerAsset_SpecId(),
		   source,
		   new String[] {
			   "documentation", "Id of the service specification the image is declared on. Several containers, also on other hosts, can share one."
		   });
		addAnnotation
		  (hostAssetEClass,
		   source,
		   new String[] {
			   "documentation", "A host that runs containers, as an asset."
		   });
		addAnnotation
		  (getHostAsset_AssetType(),
		   source,
		   new String[] {
			   "documentation", "Kind of asset for consumers that do not know this package; host."
		   });
		addAnnotation
		  (bumpKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How far an update moves, ordered from smallest to largest."
		   });
		addAnnotation
		  (bumpKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Same tag, new content."
		   });
		addAnnotation
		  (estateConfigurationEClass,
		   source,
		   new String[] {
			   "documentation", "The estates of one tenant and who owns which image. The input of the inventory import."
		   });
		addAnnotation
		  (getEstateConfiguration_ImageOwners(),
		   source,
		   new String[] {
			   "documentation", "Evaluated in order; the first prefix that matches an image applies. An image without a match is an upstream image."
		   });
		addAnnotation
		  (estateEClass,
		   source,
		   new String[] {
			   "documentation", "A group of hosts that is inventoried together; one inventory per estate."
		   });
		addAnnotation
		  (getEstate_ContextIds(),
		   source,
		   new String[] {
			   "documentation", "Ids of the compliance contexts the estate is evaluated against."
		   });
		addAnnotation
		  (estateHostEClass,
		   source,
		   new String[] {
			   "documentation", "A host of an estate and where its deployment is described."
		   });
		addAnnotation
		  (getEstateHost_DeploymentModel(),
		   source,
		   new String[] {
			   "documentation", "Path of the deployment model of the host, relative to the root of the repository."
		   });
		addAnnotation
		  (getEstateHost_DerivedFiles(),
		   source,
		   new String[] {
			   "documentation", "Path of the files the host deploys from (compose files, unit files), relative to the root of the repository."
		   });
		addAnnotation
		  (imageOwnerEClass,
		   source,
		   new String[] {
			   "documentation", "Maps images to the source repository they are built from. Marks an image as own software."
		   });
		addAnnotation
		  (getImageOwner_ImagePrefix(),
		   source,
		   new String[] {
			   "documentation", "Registry and repository prefix, e.g. ghcr.io/eclipse-fennec/model.atlas."
		   });
		addAnnotation
		  (getImageOwner_Repository(),
		   source,
		   new String[] {
			   "documentation", "The source repository, e.g. eclipse-fennec/model.atlas."
		   });
	}

} //DeploymentPackageImpl
