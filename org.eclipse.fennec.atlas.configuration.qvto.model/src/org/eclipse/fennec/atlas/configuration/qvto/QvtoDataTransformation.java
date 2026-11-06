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
package org.eclipse.fennec.atlas.configuration.qvto;

import org.eclipse.fennec.atlas.configuration.DataTransformation;

import org.eclipse.fennec.m2x.model.qvtoperational.OperationalTransformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qvto Data Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DataTransformation written in QVT-O, given either as the compiled AST (transformation) or as the URI of its .qvto source (source), which the consuming runtime compiles when the configuration is applied.
 * Exactly one of the two must be set; setting both, or neither, is a configuration error.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoPackage#getQvtoDataTransformation()
 * @model
 * @generated
 */
@ProviderType
public interface QvtoDataTransformation extends DataTransformation {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executable QVT-O transformation: the compiled AST, referenced as an EObject (e.g. from an XMI next to the configuration, or from an EObject registry of the Model Atlas). Mutually exclusive with source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(OperationalTransformation)
	 * @see org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoPackage#getQvtoDataTransformation_Transformation()
	 * @model
	 * @generated
	 */
	OperationalTransformation getTransformation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(OperationalTransformation value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the .qvto source of the transformation, compiled by the consuming runtime when the configuration is applied. Mutually exclusive with transformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoPackage#getQvtoDataTransformation_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // QvtoDataTransformation
