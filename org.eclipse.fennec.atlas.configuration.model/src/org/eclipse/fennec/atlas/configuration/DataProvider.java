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
package org.eclipse.fennec.atlas.configuration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base for anything an atlas provides data through (e.g. a service endpoint or a dataset).
 * Carries the common identity (id/name/description) and the DataInput the data comes from. Atlas-specific subtypes add what they need on top (e.g. transformations, distribution exports, publications).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataProvider#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataProvider#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataProvider#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataProvider#getDataInput <em>Data Input</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataProvider()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface DataProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of this data provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataProvider_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name of the data provider. Derives from the model annotation by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataProvider_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the data provider. Derives from the model annotation by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataProvider_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataInput this provider takes its data from. Atlas-specific subtypes define whether it is mandatory and how nested providers inherit it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Input</em>' reference.
	 * @see #setDataInput(DataInput)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataProvider_DataInput()
	 * @model
	 * @generated
	 */
	DataInput getDataInput();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getDataInput <em>Data Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Input</em>' reference.
	 * @see #getDataInput()
	 * @generated
	 */
	void setDataInput(DataInput value);

} // DataProvider
