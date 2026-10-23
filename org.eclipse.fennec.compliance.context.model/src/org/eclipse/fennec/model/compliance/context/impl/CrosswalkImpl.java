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
package org.eclipse.fennec.model.compliance.context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.ContextPackage;
import org.eclipse.fennec.model.compliance.context.ContextRef;
import org.eclipse.fennec.model.compliance.context.Crosswalk;
import org.eclipse.fennec.model.compliance.context.RequirementMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crosswalk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrosswalkImpl extends MinimalEObjectImpl.Container implements Crosswalk {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getLicence() <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicence()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicence() <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicence()
	 * @generated
	 * @ordered
	 */
	protected String licence = LICENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribution() <em>Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribution()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribution() <em>Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribution()
	 * @generated
	 * @ordered
	 */
	protected String attribution = ATTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ContextRef source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ContextRef target;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementMapping> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrosswalkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CROSSWALK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicence() {
		return licence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicence(String newLicence) {
		String oldLicence = licence;
		licence = newLicence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__LICENCE, oldLicence, licence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttribution() {
		return attribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribution(String newAttribution) {
		String oldAttribution = attribution;
		attribution = newAttribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__ATTRIBUTION, oldAttribution, attribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextRef getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ContextRef newSource, NotificationChain msgs) {
		ContextRef oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__SOURCE, oldSource, newSource);
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
	public void setSource(ContextRef newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.CROSSWALK__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.CROSSWALK__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextRef getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ContextRef newTarget, NotificationChain msgs) {
		ContextRef oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__TARGET, oldTarget, newTarget);
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
	public void setTarget(ContextRef newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.CROSSWALK__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.CROSSWALK__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CROSSWALK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<RequirementMapping>(RequirementMapping.class, this, ContextPackage.CROSSWALK__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.CROSSWALK__SOURCE:
				return basicSetSource(null, msgs);
			case ContextPackage.CROSSWALK__TARGET:
				return basicSetTarget(null, msgs);
			case ContextPackage.CROSSWALK__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.CROSSWALK__ID:
				return getId();
			case ContextPackage.CROSSWALK__NAME:
				return getName();
			case ContextPackage.CROSSWALK__VERSION:
				return getVersion();
			case ContextPackage.CROSSWALK__DESCRIPTION:
				return getDescription();
			case ContextPackage.CROSSWALK__LICENCE:
				return getLicence();
			case ContextPackage.CROSSWALK__ATTRIBUTION:
				return getAttribution();
			case ContextPackage.CROSSWALK__SOURCE:
				return getSource();
			case ContextPackage.CROSSWALK__TARGET:
				return getTarget();
			case ContextPackage.CROSSWALK__MAPPINGS:
				return getMappings();
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
			case ContextPackage.CROSSWALK__ID:
				setId((String)newValue);
				return;
			case ContextPackage.CROSSWALK__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.CROSSWALK__VERSION:
				setVersion((String)newValue);
				return;
			case ContextPackage.CROSSWALK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContextPackage.CROSSWALK__LICENCE:
				setLicence((String)newValue);
				return;
			case ContextPackage.CROSSWALK__ATTRIBUTION:
				setAttribution((String)newValue);
				return;
			case ContextPackage.CROSSWALK__SOURCE:
				setSource((ContextRef)newValue);
				return;
			case ContextPackage.CROSSWALK__TARGET:
				setTarget((ContextRef)newValue);
				return;
			case ContextPackage.CROSSWALK__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends RequirementMapping>)newValue);
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
			case ContextPackage.CROSSWALK__ID:
				setId(ID_EDEFAULT);
				return;
			case ContextPackage.CROSSWALK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.CROSSWALK__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ContextPackage.CROSSWALK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContextPackage.CROSSWALK__LICENCE:
				setLicence(LICENCE_EDEFAULT);
				return;
			case ContextPackage.CROSSWALK__ATTRIBUTION:
				setAttribution(ATTRIBUTION_EDEFAULT);
				return;
			case ContextPackage.CROSSWALK__SOURCE:
				setSource((ContextRef)null);
				return;
			case ContextPackage.CROSSWALK__TARGET:
				setTarget((ContextRef)null);
				return;
			case ContextPackage.CROSSWALK__MAPPINGS:
				getMappings().clear();
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
			case ContextPackage.CROSSWALK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContextPackage.CROSSWALK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.CROSSWALK__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ContextPackage.CROSSWALK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContextPackage.CROSSWALK__LICENCE:
				return LICENCE_EDEFAULT == null ? licence != null : !LICENCE_EDEFAULT.equals(licence);
			case ContextPackage.CROSSWALK__ATTRIBUTION:
				return ATTRIBUTION_EDEFAULT == null ? attribution != null : !ATTRIBUTION_EDEFAULT.equals(attribution);
			case ContextPackage.CROSSWALK__SOURCE:
				return source != null;
			case ContextPackage.CROSSWALK__TARGET:
				return target != null;
			case ContextPackage.CROSSWALK__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", licence: ");
		result.append(licence);
		result.append(", attribution: ");
		result.append(attribution);
		result.append(')');
		return result.toString();
	}

} //CrosswalkImpl
