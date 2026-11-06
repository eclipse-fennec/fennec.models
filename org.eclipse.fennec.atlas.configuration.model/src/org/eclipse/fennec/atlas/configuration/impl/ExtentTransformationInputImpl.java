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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;
import org.eclipse.fennec.atlas.configuration.DataInput;
import org.eclipse.fennec.atlas.configuration.DataTransformation;
import org.eclipse.fennec.atlas.configuration.ExtentTransformationInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extent Transformation Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.ExtentTransformationInputImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.ExtentTransformationInputImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.ExtentTransformationInputImpl#getSourceEClasses <em>Source EClasses</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.impl.ExtentTransformationInputImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtentTransformationInputImpl extends DataInputImpl implements ExtentTransformationInput {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DataInput source;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected DataTransformation transformation;

	/**
	 * The cached value of the '{@link #getSourceEClasses() <em>Source EClasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> sourceEClasses;

	/**
	 * The default value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long REFRESH_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected Long refreshInterval = REFRESH_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtentTransformationInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlasConfigPackage.Literals.EXTENT_TRANSFORMATION_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataInput getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (DataInput)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(DataInput newSource) {
		DataInput oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (DataTransformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformation(DataTransformation newTransformation) {
		DataTransformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getSourceEClasses() {
		if (sourceEClasses == null) {
			sourceEClasses = new EObjectResolvingEList<EClass>(EClass.class, this, AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE_ECLASSES);
		}
		return sourceEClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRefreshInterval() {
		return refreshInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshInterval(Long newRefreshInterval) {
		Long oldRefreshInterval = refreshInterval;
		refreshInterval = newRefreshInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE_ECLASSES:
				return getSourceEClasses();
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__REFRESH_INTERVAL:
				return getRefreshInterval();
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
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE:
				setSource((DataInput)newValue);
				return;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__TRANSFORMATION:
				setTransformation((DataTransformation)newValue);
				return;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE_ECLASSES:
				getSourceEClasses().clear();
				getSourceEClasses().addAll((Collection<? extends EClass>)newValue);
				return;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__REFRESH_INTERVAL:
				setRefreshInterval((Long)newValue);
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
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE:
				setSource((DataInput)null);
				return;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__TRANSFORMATION:
				setTransformation((DataTransformation)null);
				return;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE_ECLASSES:
				getSourceEClasses().clear();
				return;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
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
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE:
				return source != null;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__TRANSFORMATION:
				return transformation != null;
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__SOURCE_ECLASSES:
				return sourceEClasses != null && !sourceEClasses.isEmpty();
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT__REFRESH_INTERVAL:
				return REFRESH_INTERVAL_EDEFAULT == null ? refreshInterval != null : !REFRESH_INTERVAL_EDEFAULT.equals(refreshInterval);
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
		result.append(" (refreshInterval: ");
		result.append(refreshInterval);
		result.append(')');
		return result.toString();
	}

} //ExtentTransformationInputImpl
