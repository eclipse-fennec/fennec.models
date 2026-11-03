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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base type for any input that can stream EObjects into an atlas, e.g. EMF files (FileDataInput) or a MongoDB database (MongoDataInput). Atlas-specific configuration models add further kinds.
 * 
 * Intended as an abstract base - it is not meant to be instantiated directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataInput#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataInput#getSupportedEClasses <em>Supported EClasses</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataInput()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface DataInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of this data input, used to reference it from DataProviders.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataInput_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.DataInput#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Supported EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EClasses (model types, typically resolved against the Model Atlas) whose instances this input can provide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported EClasses</em>' reference list.
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataInput_SupportedEClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getSupportedEClasses();

} // DataInput
