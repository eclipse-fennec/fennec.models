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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.deployment.DeploymentPackage;
import org.eclipse.fennec.model.compliance.deployment.ImageOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageOwnerImpl#getImagePrefix <em>Image Prefix</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageOwnerImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageOwnerImpl extends MinimalEObjectImpl.Container implements ImageOwner {
	/**
	 * The default value of the '{@link #getImagePrefix() <em>Image Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePrefix() <em>Image Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePrefix()
	 * @generated
	 * @ordered
	 */
	protected String imagePrefix = IMAGE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected String repository = REPOSITORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.IMAGE_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImagePrefix() {
		return imagePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagePrefix(String newImagePrefix) {
		String oldImagePrefix = imagePrefix;
		imagePrefix = newImagePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_OWNER__IMAGE_PREFIX, oldImagePrefix, imagePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository(String newRepository) {
		String oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_OWNER__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.IMAGE_OWNER__IMAGE_PREFIX:
				return getImagePrefix();
			case DeploymentPackage.IMAGE_OWNER__REPOSITORY:
				return getRepository();
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
			case DeploymentPackage.IMAGE_OWNER__IMAGE_PREFIX:
				setImagePrefix((String)newValue);
				return;
			case DeploymentPackage.IMAGE_OWNER__REPOSITORY:
				setRepository((String)newValue);
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
			case DeploymentPackage.IMAGE_OWNER__IMAGE_PREFIX:
				setImagePrefix(IMAGE_PREFIX_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_OWNER__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
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
			case DeploymentPackage.IMAGE_OWNER__IMAGE_PREFIX:
				return IMAGE_PREFIX_EDEFAULT == null ? imagePrefix != null : !IMAGE_PREFIX_EDEFAULT.equals(imagePrefix);
			case DeploymentPackage.IMAGE_OWNER__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
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
		result.append(" (imagePrefix: ");
		result.append(imagePrefix);
		result.append(", repository: ");
		result.append(repository);
		result.append(')');
		return result.toString();
	}

} //ImageOwnerImpl
