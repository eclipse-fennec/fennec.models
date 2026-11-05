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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mqtt Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DataInput receiving the messages of MQTT topics from a broker. The topic a message arrives on is its source, e.g. for the root type rules of the codec configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.MqttDataInput#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.MqttDataInput#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getMqttDataInput()
 * @model
 * @generated
 */
@ProviderType
public interface MqttDataInput extends PayloadDataInput {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MQTT broker this input subscribes at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(MqttDataSource)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getMqttDataInput_DataSource()
	 * @model required="true"
	 * @generated
	 */
	MqttDataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.MqttDataInput#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(MqttDataSource value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The topic filters this input subscribes to, in MQTT syntax (+ for one level, # for the rest), e.g. 5g/ilsa/+/config.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topics</em>' attribute list.
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getMqttDataInput_Topics()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTopics();

} // MqttDataInput
