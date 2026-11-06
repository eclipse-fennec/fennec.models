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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A transformation of data from one model to another, independent of the engine that runs it. Engine bindings extend it in their own modules (e.g. QvtoDataTransformation in org.eclipse.fennec.atlas.configuration.qvto.model).
 * 
 * No cardinality contract: whether one source object has to map to exactly one result object (1:1) or a whole extent maps to a whole result (n:m, see ExtentTransformationInput) is a rule of the consumer that runs the transformation, not of the transformation.
 * 
 * Intended as an abstract base - it is not meant to be instantiated directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataTransformation#getSupportedEClasses <em>Supported EClasses</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataTransformation#getResultEClasses <em>Result EClasses</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataTransformation()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface DataTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Supported EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input EClasses this transformation accepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported EClasses</em>' reference list.
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataTransformation_SupportedEClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getSupportedEClasses();

	/**
	 * Returns the value of the '<em><b>Result EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output EClasses this transformation produces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result EClasses</em>' reference list.
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataTransformation_ResultEClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getResultEClasses();

} // DataTransformation
