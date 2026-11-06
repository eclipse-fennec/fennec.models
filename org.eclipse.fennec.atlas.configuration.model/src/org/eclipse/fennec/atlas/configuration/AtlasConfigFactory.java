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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage
 * @generated
 */
@ProviderType
public interface AtlasConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlasConfigFactory eINSTANCE = org.eclipse.fennec.atlas.configuration.impl.AtlasConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Codec Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codec Configuration</em>'.
	 * @generated
	 */
	CodecConfiguration createCodecConfiguration();

	/**
	 * Returns a new object of class '<em>Root Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Type Rule</em>'.
	 * @generated
	 */
	RootTypeRule createRootTypeRule();

	/**
	 * Returns a new object of class '<em>File Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Data Input</em>'.
	 * @generated
	 */
	FileDataInput createFileDataInput();

	/**
	 * Returns a new object of class '<em>Mongo Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mongo Data Input</em>'.
	 * @generated
	 */
	MongoDataInput createMongoDataInput();

	/**
	 * Returns a new object of class '<em>Mqtt Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mqtt Data Input</em>'.
	 * @generated
	 */
	MqttDataInput createMqttDataInput();

	/**
	 * Returns a new object of class '<em>Extent Transformation Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent Transformation Input</em>'.
	 * @generated
	 */
	ExtentTransformationInput createExtentTransformationInput();

	/**
	 * Returns a new object of class '<em>Connection Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Property</em>'.
	 * @generated
	 */
	ConnectionProperty createConnectionProperty();

	/**
	 * Returns a new object of class '<em>Jdbc Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jdbc Data Source</em>'.
	 * @generated
	 */
	JdbcDataSource createJdbcDataSource();

	/**
	 * Returns a new object of class '<em>Mongo Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mongo Data Source</em>'.
	 * @generated
	 */
	MongoDataSource createMongoDataSource();

	/**
	 * Returns a new object of class '<em>Mqtt Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mqtt Data Source</em>'.
	 * @generated
	 */
	MqttDataSource createMqttDataSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtlasConfigPackage getAtlasConfigPackage();

} //AtlasConfigFactory
