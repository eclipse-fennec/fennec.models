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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base for inputs that receive serialized payloads (files, messages, HTTP bodies) and turn them into EObjects through the EMF codec. The codec configuration says how; without one the input uses the codec's defaults (the payload has to name its own model, as XMI does).
 * 
 * Intended as an abstract base - it is not meant to be instantiated directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.PayloadDataInput#getCodec <em>Codec</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getPayloadDataInput()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface PayloadDataInput extends DataInput {
	/**
	 * Returns the value of the '<em><b>Codec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How this input deserializes its payloads. Unset = the codec's defaults.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Codec</em>' containment reference.
	 * @see #setCodec(CodecConfiguration)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getPayloadDataInput_Codec()
	 * @model containment="true"
	 * @generated
	 */
	CodecConfiguration getCodec();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.PayloadDataInput#getCodec <em>Codec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codec</em>' containment reference.
	 * @see #getCodec()
	 * @generated
	 */
	void setCodec(CodecConfiguration value);

} // PayloadDataInput
