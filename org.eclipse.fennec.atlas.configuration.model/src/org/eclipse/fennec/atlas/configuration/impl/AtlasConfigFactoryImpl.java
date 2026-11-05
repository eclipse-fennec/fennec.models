/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.atlas.configuration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.atlas.configuration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlasConfigFactoryImpl extends EFactoryImpl implements AtlasConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtlasConfigFactory init() {
		try {
			AtlasConfigFactory theAtlasConfigFactory = (AtlasConfigFactory)EPackage.Registry.INSTANCE.getEFactory(AtlasConfigPackage.eNS_URI);
			if (theAtlasConfigFactory != null) {
				return theAtlasConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtlasConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlasConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AtlasConfigPackage.CODEC_CONFIGURATION: return createCodecConfiguration();
			case AtlasConfigPackage.ROOT_TYPE_RULE: return createRootTypeRule();
			case AtlasConfigPackage.FILE_DATA_INPUT: return createFileDataInput();
			case AtlasConfigPackage.MONGO_DATA_INPUT: return createMongoDataInput();
			case AtlasConfigPackage.MQTT_DATA_INPUT: return createMqttDataInput();
			case AtlasConfigPackage.CONNECTION_PROPERTY: return createConnectionProperty();
			case AtlasConfigPackage.JDBC_DATA_SOURCE: return createJdbcDataSource();
			case AtlasConfigPackage.MONGO_DATA_SOURCE: return createMongoDataSource();
			case AtlasConfigPackage.MQTT_DATA_SOURCE: return createMqttDataSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AtlasConfigPackage.JDBC_DRIVER:
				return createJdbcDriverFromString(eDataType, initialValue);
			case AtlasConfigPackage.PAYLOAD_FORMAT:
				return createPayloadFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AtlasConfigPackage.JDBC_DRIVER:
				return convertJdbcDriverToString(eDataType, instanceValue);
			case AtlasConfigPackage.PAYLOAD_FORMAT:
				return convertPayloadFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodecConfiguration createCodecConfiguration() {
		CodecConfigurationImpl codecConfiguration = new CodecConfigurationImpl();
		return codecConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootTypeRule createRootTypeRule() {
		RootTypeRuleImpl rootTypeRule = new RootTypeRuleImpl();
		return rootTypeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileDataInput createFileDataInput() {
		FileDataInputImpl fileDataInput = new FileDataInputImpl();
		return fileDataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MongoDataInput createMongoDataInput() {
		MongoDataInputImpl mongoDataInput = new MongoDataInputImpl();
		return mongoDataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MqttDataInput createMqttDataInput() {
		MqttDataInputImpl mqttDataInput = new MqttDataInputImpl();
		return mqttDataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionProperty createConnectionProperty() {
		ConnectionPropertyImpl connectionProperty = new ConnectionPropertyImpl();
		return connectionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JdbcDataSource createJdbcDataSource() {
		JdbcDataSourceImpl jdbcDataSource = new JdbcDataSourceImpl();
		return jdbcDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MongoDataSource createMongoDataSource() {
		MongoDataSourceImpl mongoDataSource = new MongoDataSourceImpl();
		return mongoDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MqttDataSource createMqttDataSource() {
		MqttDataSourceImpl mqttDataSource = new MqttDataSourceImpl();
		return mqttDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdbcDriver createJdbcDriverFromString(EDataType eDataType, String initialValue) {
		JdbcDriver result = JdbcDriver.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJdbcDriverToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadFormat createPayloadFormatFromString(EDataType eDataType, String initialValue) {
		PayloadFormat result = PayloadFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayloadFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtlasConfigPackage getAtlasConfigPackage() {
		return (AtlasConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtlasConfigPackage getPackage() {
		return AtlasConfigPackage.eINSTANCE;
	}

} //AtlasConfigFactoryImpl
