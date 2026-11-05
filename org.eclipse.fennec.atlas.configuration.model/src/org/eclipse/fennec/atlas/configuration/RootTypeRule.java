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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Type Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reads the payloads of matching sources as one EClass (codec load option CODEC_ROOT_TYPE).
 * 
 * The rule is a fallback for payloads the codec cannot type on its own: a model whose payloads carry no discriminator value (e.g. a LoRaWAN uplink with a fresh UUID per message) can only be typed by the source it arrives from. A model that does annotate a discriminator still picks its own type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.RootTypeRule#getSourcePattern <em>Source Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.RootTypeRule#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getRootTypeRule()
 * @model
 * @generated
 */
@ProviderType
public interface RootTypeRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern matched against the payload's source - the MQTT topic, the file path, the request path - where * and # stand for any text, e.g. iotraffic/#.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Pattern</em>' attribute.
	 * @see #setSourcePattern(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getRootTypeRule_SourcePattern()
	 * @model required="true"
	 * @generated
	 */
	String getSourcePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.RootTypeRule#getSourcePattern <em>Source Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pattern</em>' attribute.
	 * @see #getSourcePattern()
	 * @generated
	 */
	void setSourcePattern(String value);

	/**
	 * Returns the value of the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EClass the matching payloads are read as (typically resolved against the Model Atlas).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Type</em>' reference.
	 * @see #setRootType(EClass)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getRootTypeRule_RootType()
	 * @model required="true"
	 * @generated
	 */
	EClass getRootType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.RootTypeRule#getRootType <em>Root Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Type</em>' reference.
	 * @see #getRootType()
	 * @generated
	 */
	void setRootType(EClass value);

} // RootTypeRule
