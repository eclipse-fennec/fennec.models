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
package org.eclipse.fennec.atlas.configuration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;
import org.eclipse.fennec.atlas.configuration.RootTypeRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.RootTypeRuleImpl#getSourcePattern <em>Source Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.RootTypeRuleImpl#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootTypeRuleImpl extends MinimalEObjectImpl.Container implements RootTypeRule {
	/**
	 * The default value of the '{@link #getSourcePattern() <em>Source Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePattern() <em>Source Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePattern()
	 * @generated
	 * @ordered
	 */
	protected String sourcePattern = SOURCE_PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootType() <em>Root Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootType()
	 * @generated
	 * @ordered
	 */
	protected EClass rootType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootTypeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlasConfigPackage.Literals.ROOT_TYPE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourcePattern() {
		return sourcePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePattern(String newSourcePattern) {
		String oldSourcePattern = sourcePattern;
		sourcePattern = newSourcePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.ROOT_TYPE_RULE__SOURCE_PATTERN, oldSourcePattern, sourcePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootType() {
		if (rootType != null && rootType.eIsProxy()) {
			InternalEObject oldRootType = (InternalEObject)rootType;
			rootType = (EClass)eResolveProxy(oldRootType);
			if (rootType != oldRootType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlasConfigPackage.ROOT_TYPE_RULE__ROOT_TYPE, oldRootType, rootType));
			}
		}
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootType() {
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootType(EClass newRootType) {
		EClass oldRootType = rootType;
		rootType = newRootType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.ROOT_TYPE_RULE__ROOT_TYPE, oldRootType, rootType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtlasConfigPackage.ROOT_TYPE_RULE__SOURCE_PATTERN:
				return getSourcePattern();
			case AtlasConfigPackage.ROOT_TYPE_RULE__ROOT_TYPE:
				if (resolve) return getRootType();
				return basicGetRootType();
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
			case AtlasConfigPackage.ROOT_TYPE_RULE__SOURCE_PATTERN:
				setSourcePattern((String)newValue);
				return;
			case AtlasConfigPackage.ROOT_TYPE_RULE__ROOT_TYPE:
				setRootType((EClass)newValue);
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
			case AtlasConfigPackage.ROOT_TYPE_RULE__SOURCE_PATTERN:
				setSourcePattern(SOURCE_PATTERN_EDEFAULT);
				return;
			case AtlasConfigPackage.ROOT_TYPE_RULE__ROOT_TYPE:
				setRootType((EClass)null);
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
			case AtlasConfigPackage.ROOT_TYPE_RULE__SOURCE_PATTERN:
				return SOURCE_PATTERN_EDEFAULT == null ? sourcePattern != null : !SOURCE_PATTERN_EDEFAULT.equals(sourcePattern);
			case AtlasConfigPackage.ROOT_TYPE_RULE__ROOT_TYPE:
				return rootType != null;
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
		result.append(" (sourcePattern: ");
		result.append(sourcePattern);
		result.append(')');
		return result.toString();
	}

} //RootTypeRuleImpl
