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
import org.eclipse.fennec.model.compliance.deployment.ImageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#getRegistry <em>Registry</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#getPullPolicy <em>Pull Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#isFloating <em>Floating</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.impl.ImageRefImpl#isBuiltLocally <em>Built Locally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageRefImpl extends MinimalEObjectImpl.Container implements ImageRef {
	/**
	 * The default value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected String registry = REGISTRY_EDEFAULT;

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
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigest() <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigest()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigest() <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigest()
	 * @generated
	 * @ordered
	 */
	protected String digest = DIGEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPullPolicy() <em>Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String PULL_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPullPolicy() <em>Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullPolicy()
	 * @generated
	 * @ordered
	 */
	protected String pullPolicy = PULL_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFloating() <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFloating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLOATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFloating() <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFloating()
	 * @generated
	 * @ordered
	 */
	protected boolean floating = FLOATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isBuiltLocally() <em>Built Locally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuiltLocally()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUILT_LOCALLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuiltLocally() <em>Built Locally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuiltLocally()
	 * @generated
	 * @ordered
	 */
	protected boolean builtLocally = BUILT_LOCALLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.IMAGE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistry() {
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistry(String newRegistry) {
		String oldRegistry = registry;
		registry = newRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__REGISTRY, oldRegistry, registry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDigest() {
		return digest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigest(String newDigest) {
		String oldDigest = digest;
		digest = newDigest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__DIGEST, oldDigest, digest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPullPolicy() {
		return pullPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPullPolicy(String newPullPolicy) {
		String oldPullPolicy = pullPolicy;
		pullPolicy = newPullPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__PULL_POLICY, oldPullPolicy, pullPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFloating() {
		return floating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloating(boolean newFloating) {
		boolean oldFloating = floating;
		floating = newFloating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__FLOATING, oldFloating, floating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBuiltLocally() {
		return builtLocally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuiltLocally(boolean newBuiltLocally) {
		boolean oldBuiltLocally = builtLocally;
		builtLocally = newBuiltLocally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.IMAGE_REF__BUILT_LOCALLY, oldBuiltLocally, builtLocally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.IMAGE_REF__REGISTRY:
				return getRegistry();
			case DeploymentPackage.IMAGE_REF__REPOSITORY:
				return getRepository();
			case DeploymentPackage.IMAGE_REF__TAG:
				return getTag();
			case DeploymentPackage.IMAGE_REF__DIGEST:
				return getDigest();
			case DeploymentPackage.IMAGE_REF__PULL_POLICY:
				return getPullPolicy();
			case DeploymentPackage.IMAGE_REF__FLOATING:
				return isFloating();
			case DeploymentPackage.IMAGE_REF__BUILT_LOCALLY:
				return isBuiltLocally();
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
			case DeploymentPackage.IMAGE_REF__REGISTRY:
				setRegistry((String)newValue);
				return;
			case DeploymentPackage.IMAGE_REF__REPOSITORY:
				setRepository((String)newValue);
				return;
			case DeploymentPackage.IMAGE_REF__TAG:
				setTag((String)newValue);
				return;
			case DeploymentPackage.IMAGE_REF__DIGEST:
				setDigest((String)newValue);
				return;
			case DeploymentPackage.IMAGE_REF__PULL_POLICY:
				setPullPolicy((String)newValue);
				return;
			case DeploymentPackage.IMAGE_REF__FLOATING:
				setFloating((Boolean)newValue);
				return;
			case DeploymentPackage.IMAGE_REF__BUILT_LOCALLY:
				setBuiltLocally((Boolean)newValue);
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
			case DeploymentPackage.IMAGE_REF__REGISTRY:
				setRegistry(REGISTRY_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_REF__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_REF__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_REF__DIGEST:
				setDigest(DIGEST_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_REF__PULL_POLICY:
				setPullPolicy(PULL_POLICY_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_REF__FLOATING:
				setFloating(FLOATING_EDEFAULT);
				return;
			case DeploymentPackage.IMAGE_REF__BUILT_LOCALLY:
				setBuiltLocally(BUILT_LOCALLY_EDEFAULT);
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
			case DeploymentPackage.IMAGE_REF__REGISTRY:
				return REGISTRY_EDEFAULT == null ? registry != null : !REGISTRY_EDEFAULT.equals(registry);
			case DeploymentPackage.IMAGE_REF__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
			case DeploymentPackage.IMAGE_REF__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case DeploymentPackage.IMAGE_REF__DIGEST:
				return DIGEST_EDEFAULT == null ? digest != null : !DIGEST_EDEFAULT.equals(digest);
			case DeploymentPackage.IMAGE_REF__PULL_POLICY:
				return PULL_POLICY_EDEFAULT == null ? pullPolicy != null : !PULL_POLICY_EDEFAULT.equals(pullPolicy);
			case DeploymentPackage.IMAGE_REF__FLOATING:
				return floating != FLOATING_EDEFAULT;
			case DeploymentPackage.IMAGE_REF__BUILT_LOCALLY:
				return builtLocally != BUILT_LOCALLY_EDEFAULT;
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
		result.append(" (registry: ");
		result.append(registry);
		result.append(", repository: ");
		result.append(repository);
		result.append(", tag: ");
		result.append(tag);
		result.append(", digest: ");
		result.append(digest);
		result.append(", pullPolicy: ");
		result.append(pullPolicy);
		result.append(", floating: ");
		result.append(floating);
		result.append(", builtLocally: ");
		result.append(builtLocally);
		result.append(')');
		return result.toString();
	}

} //ImageRefImpl
