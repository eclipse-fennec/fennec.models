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

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;
import org.eclipse.fennec.atlas.configuration.CodecConfiguration;
import org.eclipse.fennec.atlas.configuration.PayloadFormat;
import org.eclipse.fennec.atlas.configuration.RootTypeRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Codec Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl#getTypeMapId <em>Type Map Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl#isUseNamesFromExtendedMetadata <em>Use Names From Extended Metadata</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl#getRootTypes <em>Root Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodecConfigurationImpl extends MinimalEObjectImpl.Container implements CodecConfiguration {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final PayloadFormat FORMAT_EDEFAULT = PayloadFormat.XMI;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected PayloadFormat format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * The default value of the '{@link #getTypeMapId() <em>Type Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMapId()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_MAP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeMapId() <em>Type Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMapId()
	 * @generated
	 * @ordered
	 */
	protected String typeMapId = TYPE_MAP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseNamesFromExtendedMetadata() <em>Use Names From Extended Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseNamesFromExtendedMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_NAMES_FROM_EXTENDED_METADATA_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseNamesFromExtendedMetadata() <em>Use Names From Extended Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseNamesFromExtendedMetadata()
	 * @generated
	 * @ordered
	 */
	protected boolean useNamesFromExtendedMetadata = USE_NAMES_FROM_EXTENDED_METADATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootTypes() <em>Root Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RootTypeRule> rootTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodecConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlasConfigPackage.Literals.CODEC_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayloadFormat getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(PayloadFormat newFormat) {
		PayloadFormat oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.CODEC_CONFIGURATION__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFormat() {
		PayloadFormat oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AtlasConfigPackage.CODEC_CONFIGURATION__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeMapId() {
		return typeMapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeMapId(String newTypeMapId) {
		String oldTypeMapId = typeMapId;
		typeMapId = newTypeMapId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.CODEC_CONFIGURATION__TYPE_MAP_ID, oldTypeMapId, typeMapId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseNamesFromExtendedMetadata() {
		return useNamesFromExtendedMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseNamesFromExtendedMetadata(boolean newUseNamesFromExtendedMetadata) {
		boolean oldUseNamesFromExtendedMetadata = useNamesFromExtendedMetadata;
		useNamesFromExtendedMetadata = newUseNamesFromExtendedMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA, oldUseNamesFromExtendedMetadata, useNamesFromExtendedMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootTypeRule> getRootTypes() {
		if (rootTypes == null) {
			rootTypes = new EObjectContainmentEList<RootTypeRule>(RootTypeRule.class, this, AtlasConfigPackage.CODEC_CONFIGURATION__ROOT_TYPES);
		}
		return rootTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlasConfigPackage.CODEC_CONFIGURATION__ROOT_TYPES:
				return ((InternalEList<?>)getRootTypes()).basicRemove(otherEnd, msgs);
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
			case AtlasConfigPackage.CODEC_CONFIGURATION__FORMAT:
				return getFormat();
			case AtlasConfigPackage.CODEC_CONFIGURATION__TYPE_MAP_ID:
				return getTypeMapId();
			case AtlasConfigPackage.CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA:
				return isUseNamesFromExtendedMetadata();
			case AtlasConfigPackage.CODEC_CONFIGURATION__ROOT_TYPES:
				return getRootTypes();
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
			case AtlasConfigPackage.CODEC_CONFIGURATION__FORMAT:
				setFormat((PayloadFormat)newValue);
				return;
			case AtlasConfigPackage.CODEC_CONFIGURATION__TYPE_MAP_ID:
				setTypeMapId((String)newValue);
				return;
			case AtlasConfigPackage.CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA:
				setUseNamesFromExtendedMetadata((Boolean)newValue);
				return;
			case AtlasConfigPackage.CODEC_CONFIGURATION__ROOT_TYPES:
				getRootTypes().clear();
				getRootTypes().addAll((Collection<? extends RootTypeRule>)newValue);
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
			case AtlasConfigPackage.CODEC_CONFIGURATION__FORMAT:
				unsetFormat();
				return;
			case AtlasConfigPackage.CODEC_CONFIGURATION__TYPE_MAP_ID:
				setTypeMapId(TYPE_MAP_ID_EDEFAULT);
				return;
			case AtlasConfigPackage.CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA:
				setUseNamesFromExtendedMetadata(USE_NAMES_FROM_EXTENDED_METADATA_EDEFAULT);
				return;
			case AtlasConfigPackage.CODEC_CONFIGURATION__ROOT_TYPES:
				getRootTypes().clear();
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
			case AtlasConfigPackage.CODEC_CONFIGURATION__FORMAT:
				return isSetFormat();
			case AtlasConfigPackage.CODEC_CONFIGURATION__TYPE_MAP_ID:
				return TYPE_MAP_ID_EDEFAULT == null ? typeMapId != null : !TYPE_MAP_ID_EDEFAULT.equals(typeMapId);
			case AtlasConfigPackage.CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA:
				return useNamesFromExtendedMetadata != USE_NAMES_FROM_EXTENDED_METADATA_EDEFAULT;
			case AtlasConfigPackage.CODEC_CONFIGURATION__ROOT_TYPES:
				return rootTypes != null && !rootTypes.isEmpty();
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
		result.append(" (format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(", typeMapId: ");
		result.append(typeMapId);
		result.append(", useNamesFromExtendedMetadata: ");
		result.append(useNamesFromExtendedMetadata);
		result.append(')');
		return result.toString();
	}

} //CodecConfigurationImpl
