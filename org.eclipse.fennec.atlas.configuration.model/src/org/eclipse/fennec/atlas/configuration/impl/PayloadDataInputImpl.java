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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;
import org.eclipse.fennec.atlas.configuration.CodecConfiguration;
import org.eclipse.fennec.atlas.configuration.PayloadDataInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.PayloadDataInputImpl#getCodec <em>Codec</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PayloadDataInputImpl extends DataInputImpl implements PayloadDataInput {
	/**
	 * The cached value of the '{@link #getCodec() <em>Codec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodec()
	 * @generated
	 * @ordered
	 */
	protected CodecConfiguration codec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayloadDataInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlasConfigPackage.Literals.PAYLOAD_DATA_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodecConfiguration getCodec() {
		return codec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodec(CodecConfiguration newCodec, NotificationChain msgs) {
		CodecConfiguration oldCodec = codec;
		codec = newCodec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC, oldCodec, newCodec);
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
	public void setCodec(CodecConfiguration newCodec) {
		if (newCodec != codec) {
			NotificationChain msgs = null;
			if (codec != null)
				msgs = ((InternalEObject)codec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC, null, msgs);
			if (newCodec != null)
				msgs = ((InternalEObject)newCodec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC, null, msgs);
			msgs = basicSetCodec(newCodec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC, newCodec, newCodec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC:
				return basicSetCodec(null, msgs);
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
			case AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC:
				return getCodec();
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
			case AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC:
				setCodec((CodecConfiguration)newValue);
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
			case AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC:
				setCodec((CodecConfiguration)null);
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
			case AtlasConfigPackage.PAYLOAD_DATA_INPUT__CODEC:
				return codec != null;
		}
		return super.eIsSet(featureID);
	}

} //PayloadDataInputImpl
