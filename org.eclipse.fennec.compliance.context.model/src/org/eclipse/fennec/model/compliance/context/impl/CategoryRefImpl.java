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

import org.eclipse.fennec.model.compliance.context.CategoryRef;
import org.eclipse.fennec.model.compliance.context.ContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CategoryRefImpl#getTaxonomyId <em>Taxonomy Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.CategoryRefImpl#getCategoryId <em>Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryRefImpl extends ContextRefImpl implements CategoryRef {
	/**
	 * The default value of the '{@link #getTaxonomyId() <em>Taxonomy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAXONOMY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxonomyId() <em>Taxonomy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomyId()
	 * @generated
	 * @ordered
	 */
	protected String taxonomyId = TAXONOMY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryId() <em>Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryId() <em>Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String categoryId = CATEGORY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CATEGORY_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxonomyId() {
		return taxonomyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxonomyId(String newTaxonomyId) {
		String oldTaxonomyId = taxonomyId;
		taxonomyId = newTaxonomyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CATEGORY_REF__TAXONOMY_ID, oldTaxonomyId, taxonomyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryId(String newCategoryId) {
		String oldCategoryId = categoryId;
		categoryId = newCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CATEGORY_REF__CATEGORY_ID, oldCategoryId, categoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CATEGORY_REF__TAXONOMY_ID:
				return getTaxonomyId();
			case ContextPackage.CATEGORY_REF__CATEGORY_ID:
				return getCategoryId();
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
			case ContextPackage.CATEGORY_REF__TAXONOMY_ID:
				setTaxonomyId((String)newValue);
				return;
			case ContextPackage.CATEGORY_REF__CATEGORY_ID:
				setCategoryId((String)newValue);
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
			case ContextPackage.CATEGORY_REF__TAXONOMY_ID:
				setTaxonomyId(TAXONOMY_ID_EDEFAULT);
				return;
			case ContextPackage.CATEGORY_REF__CATEGORY_ID:
				setCategoryId(CATEGORY_ID_EDEFAULT);
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
			case ContextPackage.CATEGORY_REF__TAXONOMY_ID:
				return TAXONOMY_ID_EDEFAULT == null ? taxonomyId != null : !TAXONOMY_ID_EDEFAULT.equals(taxonomyId);
			case ContextPackage.CATEGORY_REF__CATEGORY_ID:
				return CATEGORY_ID_EDEFAULT == null ? categoryId != null : !CATEGORY_ID_EDEFAULT.equals(categoryId);
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
		result.append(" (taxonomyId: ");
		result.append(taxonomyId);
		result.append(", categoryId: ");
		result.append(categoryId);
		result.append(')');
		return result.toString();
	}

} //CategoryRefImpl
