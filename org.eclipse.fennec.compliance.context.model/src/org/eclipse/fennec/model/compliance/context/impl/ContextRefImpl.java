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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.context.ContextPackage;
import org.eclipse.fennec.model.compliance.context.ContextRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ContextRefImpl#getContextId <em>Context Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ContextRefImpl#getContextVersion <em>Context Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextRefImpl extends MinimalEObjectImpl.Container implements ContextRef {
	/**
	 * The default value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected String contextId = CONTEXT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextVersion() <em>Context Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextVersion() <em>Context Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextVersion()
	 * @generated
	 * @ordered
	 */
	protected String contextVersion = CONTEXT_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextId() {
		return contextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextId(String newContextId) {
		String oldContextId = contextId;
		contextId = newContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_REF__CONTEXT_ID, oldContextId, contextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextVersion() {
		return contextVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextVersion(String newContextVersion) {
		String oldContextVersion = contextVersion;
		contextVersion = newContextVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_REF__CONTEXT_VERSION, oldContextVersion, contextVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CONTEXT_REF__CONTEXT_ID:
				return getContextId();
			case ContextPackage.CONTEXT_REF__CONTEXT_VERSION:
				return getContextVersion();
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
			case ContextPackage.CONTEXT_REF__CONTEXT_ID:
				setContextId((String)newValue);
				return;
			case ContextPackage.CONTEXT_REF__CONTEXT_VERSION:
				setContextVersion((String)newValue);
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
			case ContextPackage.CONTEXT_REF__CONTEXT_ID:
				setContextId(CONTEXT_ID_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_REF__CONTEXT_VERSION:
				setContextVersion(CONTEXT_VERSION_EDEFAULT);
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
			case ContextPackage.CONTEXT_REF__CONTEXT_ID:
				return CONTEXT_ID_EDEFAULT == null ? contextId != null : !CONTEXT_ID_EDEFAULT.equals(contextId);
			case ContextPackage.CONTEXT_REF__CONTEXT_VERSION:
				return CONTEXT_VERSION_EDEFAULT == null ? contextVersion != null : !CONTEXT_VERSION_EDEFAULT.equals(contextVersion);
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
		result.append(" (contextId: ");
		result.append(contextId);
		result.append(", contextVersion: ");
		result.append(contextVersion);
		result.append(')');
		return result.toString();
	}

} //ContextRefImpl
