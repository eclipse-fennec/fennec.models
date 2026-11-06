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
 * A representation of the model object '<em><b>Extent Transformation Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DataInput serving the result of transforming a whole source extent: all instances of the sourceEClasses the source input provides are handed to the transformation in one run (n:m - no correspondence between source and result objects is assumed). The result is cached and served until refreshInterval has passed, then recomputed.
 * The inherited supportedEClasses are the served result classes.
 * 
 * Runtime semantics, implemented by each atlas runtime: if a recomputation fails, the last good result stays served; if the first computation fails, the input stays down.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getSourceEClasses <em>Source EClasses</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getRefreshInterval <em>Refresh Interval</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getExtentTransformationInput()
 * @model
 * @generated
 */
@ProviderType
public interface ExtentTransformationInput extends DataInput {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataInput providing the source extent. A reference: the input lives in a registry of the consuming atlas configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DataInput)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getExtentTransformationInput_Source()
	 * @model required="true"
	 * @generated
	 */
	DataInput getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataInput value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transformation run on the source extent. A reference: the transformation lives in a registry of the consuming atlas configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(DataTransformation)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getExtentTransformationInput_Transformation()
	 * @model required="true"
	 * @generated
	 */
	DataTransformation getTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(DataTransformation value);

	/**
	 * Returns the value of the '<em><b>Source EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EClasses whose instances in the source input form the input extent of the transformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source EClasses</em>' reference list.
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getExtentTransformationInput_SourceEClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getSourceEClasses();

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How long, in seconds, a computed result is served before it is recomputed. Unset or not positive = computed once when the input starts and never recomputed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(Long)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getExtentTransformationInput_RefreshInterval()
	 * @model
	 * @generated
	 */
	Long getRefreshInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.ExtentTransformationInput#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(Long value);

} // ExtentTransformationInput
