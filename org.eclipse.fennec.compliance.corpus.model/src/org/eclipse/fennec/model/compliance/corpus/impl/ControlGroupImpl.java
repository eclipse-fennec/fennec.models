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
package org.eclipse.fennec.model.compliance.corpus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.corpus.Control;
import org.eclipse.fennec.model.compliance.corpus.ControlGroup;
import org.eclipse.fennec.model.compliance.corpus.ControlPart;
import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl#getGroupClass <em>Group Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlGroupImpl extends CitableImpl implements ControlGroup {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupClass() <em>Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupClass()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupClass() <em>Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupClass()
	 * @generated
	 * @ordered
	 */
	protected String groupClass = GROUP_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlPart> parts;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlGroup> groups;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.CONTROL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CONTROL_GROUP__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupClass() {
		return groupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupClass(String newGroupClass) {
		String oldGroupClass = groupClass;
		groupClass = newGroupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CONTROL_GROUP__GROUP_CLASS, oldGroupClass, groupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CorpusPackage.CONTROL_GROUP__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlPart> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<ControlPart>(ControlPart.class, this, CorpusPackage.CONTROL_GROUP__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<ControlGroup>(ControlGroup.class, this, CorpusPackage.CONTROL_GROUP__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, CorpusPackage.CONTROL_GROUP__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusPackage.CONTROL_GROUP__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CorpusPackage.CONTROL_GROUP__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case CorpusPackage.CONTROL_GROUP__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case CorpusPackage.CONTROL_GROUP__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case CorpusPackage.CONTROL_GROUP__TITLE:
				return getTitle();
			case CorpusPackage.CONTROL_GROUP__GROUP_CLASS:
				return getGroupClass();
			case CorpusPackage.CONTROL_GROUP__PROPERTIES:
				return getProperties();
			case CorpusPackage.CONTROL_GROUP__PARTS:
				return getParts();
			case CorpusPackage.CONTROL_GROUP__GROUPS:
				return getGroups();
			case CorpusPackage.CONTROL_GROUP__CONTROLS:
				return getControls();
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
			case CorpusPackage.CONTROL_GROUP__TITLE:
				setTitle((String)newValue);
				return;
			case CorpusPackage.CONTROL_GROUP__GROUP_CLASS:
				setGroupClass((String)newValue);
				return;
			case CorpusPackage.CONTROL_GROUP__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CorpusPackage.CONTROL_GROUP__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends ControlPart>)newValue);
				return;
			case CorpusPackage.CONTROL_GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ControlGroup>)newValue);
				return;
			case CorpusPackage.CONTROL_GROUP__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
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
			case CorpusPackage.CONTROL_GROUP__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorpusPackage.CONTROL_GROUP__GROUP_CLASS:
				setGroupClass(GROUP_CLASS_EDEFAULT);
				return;
			case CorpusPackage.CONTROL_GROUP__PROPERTIES:
				getProperties().clear();
				return;
			case CorpusPackage.CONTROL_GROUP__PARTS:
				getParts().clear();
				return;
			case CorpusPackage.CONTROL_GROUP__GROUPS:
				getGroups().clear();
				return;
			case CorpusPackage.CONTROL_GROUP__CONTROLS:
				getControls().clear();
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
			case CorpusPackage.CONTROL_GROUP__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorpusPackage.CONTROL_GROUP__GROUP_CLASS:
				return GROUP_CLASS_EDEFAULT == null ? groupClass != null : !GROUP_CLASS_EDEFAULT.equals(groupClass);
			case CorpusPackage.CONTROL_GROUP__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CorpusPackage.CONTROL_GROUP__PARTS:
				return parts != null && !parts.isEmpty();
			case CorpusPackage.CONTROL_GROUP__GROUPS:
				return groups != null && !groups.isEmpty();
			case CorpusPackage.CONTROL_GROUP__CONTROLS:
				return controls != null && !controls.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", groupClass: ");
		result.append(groupClass);
		result.append(')');
		return result.toString();
	}

} //ControlGroupImpl
