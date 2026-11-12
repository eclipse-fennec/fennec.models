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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.deployment.ContainerAsset;
import org.eclipse.fennec.model.compliance.deployment.ContainerRuntime;
import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.Exposure;
import org.eclipse.fennec.model.compliance.deployment.ImageRef;
import org.eclipse.fennec.model.compliance.deployment.ManagementKind;
import org.eclipse.fennec.model.compliance.deployment.PortPublication;
import org.eclipse.fennec.model.compliance.deployment.RouteExposure;

import org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getManagement <em>Management</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getStack <em>Stack</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#isStateful <em>Stateful</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getPublishedPorts <em>Published Ports</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getExposure <em>Exposure</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ContainerAssetImpl#getSpecId <em>Spec Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerAssetImpl extends AssetImpl implements ContainerAsset {
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
	 * The default value of the '{@link #getStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected String stack = STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected String service = SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected String containerName = CONTAINER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected ImageRef image;

	/**
	 * The default value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateful()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATEFUL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateful()
	 * @generated
	 * @ordered
	 */
	protected boolean stateful = STATEFUL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublishedPorts() <em>Published Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortPublication> publishedPorts;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> networks;

	/**
	 * The default value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected static final Exposure EXPOSURE_EDEFAULT = Exposure.NONE;

	/**
	 * The cached value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected Exposure exposure = EXPOSURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteExposure> routes;

	/**
	 * The default value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_TYPE_EDEFAULT = "container";

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
	 * The default value of the '{@link #getSpecId() <em>Spec Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecId()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecId() <em>Spec Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecId()
	 * @generated
	 * @ordered
	 */
	protected String specId = SPEC_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.CONTAINER_ASSET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__RUNTIME, oldRuntime, runtime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__MANAGEMENT, oldManagement, management));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStack() {
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStack(String newStack) {
		String oldStack = stack;
		stack = newStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__STACK, oldStack, stack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(String newService) {
		String oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerName() {
		return containerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerName(String newContainerName) {
		String oldContainerName = containerName;
		containerName = newContainerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__CONTAINER_NAME, oldContainerName, containerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageRef getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(ImageRef newImage, NotificationChain msgs) {
		ImageRef oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(ImageRef newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.CONTAINER_ASSET__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.CONTAINER_ASSET__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStateful() {
		return stateful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateful(boolean newStateful) {
		boolean oldStateful = stateful;
		stateful = newStateful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__STATEFUL, oldStateful, stateful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortPublication> getPublishedPorts() {
		if (publishedPorts == null) {
			publishedPorts = new EObjectContainmentEList<PortPublication>(PortPublication.class, this, DeploymentPackage.CONTAINER_ASSET__PUBLISHED_PORTS);
		}
		return publishedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNetworks() {
		if (networks == null) {
			networks = new EDataTypeUniqueEList<String>(String.class, this, DeploymentPackage.CONTAINER_ASSET__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exposure getExposure() {
		return exposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposure(Exposure newExposure) {
		Exposure oldExposure = exposure;
		exposure = newExposure == null ? EXPOSURE_EDEFAULT : newExposure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__EXPOSURE, oldExposure, exposure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteExposure> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<RouteExposure>(RouteExposure.class, this, DeploymentPackage.CONTAINER_ASSET__ROUTES);
		}
		return routes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__ASSET_TYPE, oldAssetType, assetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecId() {
		return specId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecId(String newSpecId) {
		String oldSpecId = specId;
		specId = newSpecId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONTAINER_ASSET__SPEC_ID, oldSpecId, specId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.CONTAINER_ASSET__IMAGE:
				return basicSetImage(null, msgs);
			case DeploymentPackage.CONTAINER_ASSET__PUBLISHED_PORTS:
				return ((InternalEList<?>)getPublishedPorts()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.CONTAINER_ASSET__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.CONTAINER_ASSET__RUNTIME:
				return getRuntime();
			case DeploymentPackage.CONTAINER_ASSET__MANAGEMENT:
				return getManagement();
			case DeploymentPackage.CONTAINER_ASSET__STACK:
				return getStack();
			case DeploymentPackage.CONTAINER_ASSET__SERVICE:
				return getService();
			case DeploymentPackage.CONTAINER_ASSET__CONTAINER_NAME:
				return getContainerName();
			case DeploymentPackage.CONTAINER_ASSET__IMAGE:
				return getImage();
			case DeploymentPackage.CONTAINER_ASSET__STATEFUL:
				return isStateful();
			case DeploymentPackage.CONTAINER_ASSET__PUBLISHED_PORTS:
				return getPublishedPorts();
			case DeploymentPackage.CONTAINER_ASSET__NETWORKS:
				return getNetworks();
			case DeploymentPackage.CONTAINER_ASSET__EXPOSURE:
				return getExposure();
			case DeploymentPackage.CONTAINER_ASSET__ROUTES:
				return getRoutes();
			case DeploymentPackage.CONTAINER_ASSET__ASSET_TYPE:
				return getAssetType();
			case DeploymentPackage.CONTAINER_ASSET__SPEC_ID:
				return getSpecId();
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
			case DeploymentPackage.CONTAINER_ASSET__RUNTIME:
				setRuntime((ContainerRuntime)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__MANAGEMENT:
				setManagement((ManagementKind)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__STACK:
				setStack((String)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__SERVICE:
				setService((String)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__CONTAINER_NAME:
				setContainerName((String)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__IMAGE:
				setImage((ImageRef)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__STATEFUL:
				setStateful((Boolean)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__PUBLISHED_PORTS:
				getPublishedPorts().clear();
				getPublishedPorts().addAll((Collection<? extends PortPublication>)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends String>)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__EXPOSURE:
				setExposure((Exposure)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends RouteExposure>)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__ASSET_TYPE:
				setAssetType((String)newValue);
				return;
			case DeploymentPackage.CONTAINER_ASSET__SPEC_ID:
				setSpecId((String)newValue);
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
			case DeploymentPackage.CONTAINER_ASSET__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__MANAGEMENT:
				setManagement(MANAGEMENT_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__STACK:
				setStack(STACK_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__CONTAINER_NAME:
				setContainerName(CONTAINER_NAME_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__IMAGE:
				setImage((ImageRef)null);
				return;
			case DeploymentPackage.CONTAINER_ASSET__STATEFUL:
				setStateful(STATEFUL_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__PUBLISHED_PORTS:
				getPublishedPorts().clear();
				return;
			case DeploymentPackage.CONTAINER_ASSET__NETWORKS:
				getNetworks().clear();
				return;
			case DeploymentPackage.CONTAINER_ASSET__EXPOSURE:
				setExposure(EXPOSURE_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__ROUTES:
				getRoutes().clear();
				return;
			case DeploymentPackage.CONTAINER_ASSET__ASSET_TYPE:
				setAssetType(ASSET_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.CONTAINER_ASSET__SPEC_ID:
				setSpecId(SPEC_ID_EDEFAULT);
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
			case DeploymentPackage.CONTAINER_ASSET__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
			case DeploymentPackage.CONTAINER_ASSET__MANAGEMENT:
				return management != MANAGEMENT_EDEFAULT;
			case DeploymentPackage.CONTAINER_ASSET__STACK:
				return STACK_EDEFAULT == null ? stack != null : !STACK_EDEFAULT.equals(stack);
			case DeploymentPackage.CONTAINER_ASSET__SERVICE:
				return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
			case DeploymentPackage.CONTAINER_ASSET__CONTAINER_NAME:
				return CONTAINER_NAME_EDEFAULT == null ? containerName != null : !CONTAINER_NAME_EDEFAULT.equals(containerName);
			case DeploymentPackage.CONTAINER_ASSET__IMAGE:
				return image != null;
			case DeploymentPackage.CONTAINER_ASSET__STATEFUL:
				return stateful != STATEFUL_EDEFAULT;
			case DeploymentPackage.CONTAINER_ASSET__PUBLISHED_PORTS:
				return publishedPorts != null && !publishedPorts.isEmpty();
			case DeploymentPackage.CONTAINER_ASSET__NETWORKS:
				return networks != null && !networks.isEmpty();
			case DeploymentPackage.CONTAINER_ASSET__EXPOSURE:
				return exposure != EXPOSURE_EDEFAULT;
			case DeploymentPackage.CONTAINER_ASSET__ROUTES:
				return routes != null && !routes.isEmpty();
			case DeploymentPackage.CONTAINER_ASSET__ASSET_TYPE:
				return ASSET_TYPE_EDEFAULT == null ? assetType != null : !ASSET_TYPE_EDEFAULT.equals(assetType);
			case DeploymentPackage.CONTAINER_ASSET__SPEC_ID:
				return SPEC_ID_EDEFAULT == null ? specId != null : !SPEC_ID_EDEFAULT.equals(specId);
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
		result.append(" (runtime: ");
		result.append(runtime);
		result.append(", management: ");
		result.append(management);
		result.append(", stack: ");
		result.append(stack);
		result.append(", service: ");
		result.append(service);
		result.append(", containerName: ");
		result.append(containerName);
		result.append(", stateful: ");
		result.append(stateful);
		result.append(", networks: ");
		result.append(networks);
		result.append(", exposure: ");
		result.append(exposure);
		result.append(", assetType: ");
		result.append(assetType);
		result.append(", specId: ");
		result.append(specId);
		result.append(')');
		return result.toString();
	}

} //ContainerAssetImpl
