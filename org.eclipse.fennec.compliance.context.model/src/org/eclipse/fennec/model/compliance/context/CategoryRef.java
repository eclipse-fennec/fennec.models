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
package org.eclipse.fennec.model.compliance.context;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Points at a category of a context taxonomy by id.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.CategoryRef#getTaxonomyId <em>Taxonomy Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.CategoryRef#getCategoryId <em>Category Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getCategoryRef()
 * @model
 * @generated
 */
@ProviderType
public interface CategoryRef extends ContextRef {
	/**
	 * Returns the value of the '<em><b>Taxonomy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the taxonomy within the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxonomy Id</em>' attribute.
	 * @see #setTaxonomyId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getCategoryRef_TaxonomyId()
	 * @model required="true"
	 * @generated
	 */
	String getTaxonomyId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.CategoryRef#getTaxonomyId <em>Taxonomy Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy Id</em>' attribute.
	 * @see #getTaxonomyId()
	 * @generated
	 */
	void setTaxonomyId(String value);

	/**
	 * Returns the value of the '<em><b>Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the category within the taxonomy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category Id</em>' attribute.
	 * @see #setCategoryId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getCategoryRef_CategoryId()
	 * @model required="true"
	 * @generated
	 */
	String getCategoryId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.CategoryRef#getCategoryId <em>Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Id</em>' attribute.
	 * @see #getCategoryId()
	 * @generated
	 */
	void setCategoryId(String value);

} // CategoryRef
