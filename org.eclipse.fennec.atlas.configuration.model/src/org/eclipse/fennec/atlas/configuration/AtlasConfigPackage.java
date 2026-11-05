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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Configuration building blocks shared by the Fennec atlases (Data Atlas, Model Atlas, Event Atlas, ...).
 * 
 * The atlas-specific configuration models reference or extend these types instead of defining their own, so that e.g. a data source or a data input looks the same in every atlas:
 * - DataSource (JdbcDataSource, MongoDataSource, MqttDataSource): where the data lives and how to connect to it.
 * - DataInput (FileDataInput, MqttDataInput, MongoDataInput): what streams EObjects into an atlas. Inputs receiving serialized payloads (PayloadDataInput) carry a CodecConfiguration saying how the EMF codec reads them.
 * - DataProvider and DataService: the common base of anything an atlas provides data through, and of the endpoints it publishes; atlas-specific subtypes add their own features (transformations, exports, ...).
 * 
 * Inputs that need further models live in their own modules (e.g. JPADataInput in org.eclipse.fennec.atlas.configuration.jpa.model), so this model stays free of dependencies.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AtlasConfigPackage.eNS_URI, fingerprint = "fp1:73dce0f622ea460cd0cefc14c14606370937e5c3d1a9e7870df13213feda2ec8", genModel = "/model/configuration.genmodel", genModelSourceLocations = {"model/configuration.genmodel","org.eclipse.fennec.atlas.configuration.model/model/configuration.genmodel"}, ecore = "/model/configuration.ecore", ecoreSourceLocations = "/model/configuration.ecore")
public interface AtlasConfigPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/atlas/configuration/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atlasconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlasConfigPackage eINSTANCE = org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataProviderImpl <em>Data Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DataProviderImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataProvider()
	 * @generated
	 */
	int DATA_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__DATA_INPUT = 3;

	/**
	 * The number of structural features of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataServiceImpl <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DataServiceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ID = DATA_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__NAME = DATA_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__DESCRIPTION = DATA_PROVIDER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__DATA_INPUT = DATA_PROVIDER__DATA_INPUT;

	/**
	 * The feature id for the '<em><b>Url Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__URL_CONTEXT = DATA_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = DATA_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_OPERATION_COUNT = DATA_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataInputImpl <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__SUPPORTED_ECLASSES = 1;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.PayloadDataInputImpl <em>Payload Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.PayloadDataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getPayloadDataInput()
	 * @generated
	 */
	int PAYLOAD_DATA_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_DATA_INPUT__ID = DATA_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_DATA_INPUT__SUPPORTED_ECLASSES = DATA_INPUT__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Codec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_DATA_INPUT__CODEC = DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Payload Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_DATA_INPUT_FEATURE_COUNT = DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Payload Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_DATA_INPUT_OPERATION_COUNT = DATA_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl <em>Codec Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getCodecConfiguration()
	 * @generated
	 */
	int CODEC_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEC_CONFIGURATION__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Type Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEC_CONFIGURATION__TYPE_MAP_ID = 1;

	/**
	 * The feature id for the '<em><b>Use Names From Extended Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Root Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEC_CONFIGURATION__ROOT_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Codec Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEC_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Codec Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEC_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.RootTypeRuleImpl <em>Root Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.RootTypeRuleImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getRootTypeRule()
	 * @generated
	 */
	int ROOT_TYPE_RULE = 5;

	/**
	 * The feature id for the '<em><b>Source Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_RULE__SOURCE_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_RULE__ROOT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Root Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.FileDataInputImpl <em>File Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.FileDataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getFileDataInput()
	 * @generated
	 */
	int FILE_DATA_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__ID = PAYLOAD_DATA_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__SUPPORTED_ECLASSES = PAYLOAD_DATA_INPUT__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Codec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__CODEC = PAYLOAD_DATA_INPUT__CODEC;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__URI = PAYLOAD_DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT_FEATURE_COUNT = PAYLOAD_DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT_OPERATION_COUNT = PAYLOAD_DATA_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.MongoDataInputImpl <em>Mongo Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.MongoDataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMongoDataInput()
	 * @generated
	 */
	int MONGO_DATA_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_INPUT__ID = DATA_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_INPUT__SUPPORTED_ECLASSES = DATA_INPUT__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_INPUT__DATA_SOURCE = DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mongo Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_INPUT_FEATURE_COUNT = DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mongo Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_INPUT_OPERATION_COUNT = DATA_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.MqttDataInputImpl <em>Mqtt Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.MqttDataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMqttDataInput()
	 * @generated
	 */
	int MQTT_DATA_INPUT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT__ID = PAYLOAD_DATA_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT__SUPPORTED_ECLASSES = PAYLOAD_DATA_INPUT__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Codec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT__CODEC = PAYLOAD_DATA_INPUT__CODEC;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT__DATA_SOURCE = PAYLOAD_DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT__TOPICS = PAYLOAD_DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mqtt Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT_FEATURE_COUNT = PAYLOAD_DATA_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mqtt Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_INPUT_OPERATION_COUNT = PAYLOAD_DATA_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FILTER = 3;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.ServerDataSourceImpl <em>Server Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.ServerDataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getServerDataSource()
	 * @generated
	 */
	int SERVER_DATA_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__ID = DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__DESCRIPTION = DATA_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__FILTER = DATA_SOURCE__FILTER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__HOST = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__PORT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__USER = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__PASSWORD = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE__PROPERTIES = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Server Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Server Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DATA_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl <em>Database Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDatabaseDataSource()
	 * @generated
	 */
	int DATABASE_DATA_SOURCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__ID = SERVER_DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__NAME = SERVER_DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__DESCRIPTION = SERVER_DATA_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__FILTER = SERVER_DATA_SOURCE__FILTER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__HOST = SERVER_DATA_SOURCE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__PORT = SERVER_DATA_SOURCE__PORT;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__USER = SERVER_DATA_SOURCE__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__PASSWORD = SERVER_DATA_SOURCE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__PROPERTIES = SERVER_DATA_SOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__DATABASE = SERVER_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE_FEATURE_COUNT = SERVER_DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Database Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE_OPERATION_COUNT = SERVER_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.ConnectionPropertyImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getConnectionProperty()
	 * @generated
	 */
	int CONNECTION_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Connection Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.JdbcDataSourceImpl <em>Jdbc Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.JdbcDataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getJdbcDataSource()
	 * @generated
	 */
	int JDBC_DATA_SOURCE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__ID = DATABASE_DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__NAME = DATABASE_DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__DESCRIPTION = DATABASE_DATA_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__FILTER = DATABASE_DATA_SOURCE__FILTER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__HOST = DATABASE_DATA_SOURCE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__PORT = DATABASE_DATA_SOURCE__PORT;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__USER = DATABASE_DATA_SOURCE__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__PASSWORD = DATABASE_DATA_SOURCE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__PROPERTIES = DATABASE_DATA_SOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__DATABASE = DATABASE_DATA_SOURCE__DATABASE;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__DRIVER = DATABASE_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__SCHEMA = DATABASE_DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jdbc Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE_FEATURE_COUNT = DATABASE_DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Jdbc Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE_OPERATION_COUNT = DATABASE_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.MongoDataSourceImpl <em>Mongo Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.MongoDataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMongoDataSource()
	 * @generated
	 */
	int MONGO_DATA_SOURCE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__ID = DATABASE_DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__NAME = DATABASE_DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__DESCRIPTION = DATABASE_DATA_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__FILTER = DATABASE_DATA_SOURCE__FILTER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__HOST = DATABASE_DATA_SOURCE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__PORT = DATABASE_DATA_SOURCE__PORT;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__USER = DATABASE_DATA_SOURCE__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__PASSWORD = DATABASE_DATA_SOURCE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__PROPERTIES = DATABASE_DATA_SOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__DATABASE = DATABASE_DATA_SOURCE__DATABASE;

	/**
	 * The feature id for the '<em><b>Auth Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__AUTH_SOURCE = DATABASE_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__FLAVOR = DATABASE_DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mongo Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE_FEATURE_COUNT = DATABASE_DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mongo Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE_OPERATION_COUNT = DATABASE_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.MqttDataSourceImpl <em>Mqtt Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.MqttDataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMqttDataSource()
	 * @generated
	 */
	int MQTT_DATA_SOURCE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__ID = SERVER_DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__NAME = SERVER_DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__DESCRIPTION = SERVER_DATA_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__FILTER = SERVER_DATA_SOURCE__FILTER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__HOST = SERVER_DATA_SOURCE__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__PORT = SERVER_DATA_SOURCE__PORT;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__USER = SERVER_DATA_SOURCE__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__PASSWORD = SERVER_DATA_SOURCE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__PROPERTIES = SERVER_DATA_SOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE__PROTOCOL = SERVER_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mqtt Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE_FEATURE_COUNT = SERVER_DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mqtt Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DATA_SOURCE_OPERATION_COUNT = SERVER_DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.JdbcDriver <em>Jdbc Driver</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getJdbcDriver()
	 * @generated
	 */
	int JDBC_DRIVER = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.PayloadFormat <em>Payload Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.PayloadFormat
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getPayloadFormat()
	 * @generated
	 */
	int PAYLOAD_FORMAT = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.DataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Provider</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataProvider
	 * @generated
	 */
	EClass getDataProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataProvider#getId()
	 * @see #getDataProvider()
	 * @generated
	 */
	EAttribute getDataProvider_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataProvider#getName()
	 * @see #getDataProvider()
	 * @generated
	 */
	EAttribute getDataProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataProvider#getDescription()
	 * @see #getDataProvider()
	 * @generated
	 */
	EAttribute getDataProvider_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.atlas.configuration.DataProvider#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataProvider#getDataInput()
	 * @see #getDataProvider()
	 * @generated
	 */
	EReference getDataProvider_DataInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataService#getUrlContext <em>Url Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Context</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataService#getUrlContext()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_UrlContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataInput#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataInput#getId()
	 * @see #getDataInput()
	 * @generated
	 */
	EAttribute getDataInput_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.atlas.configuration.DataInput#getSupportedEClasses <em>Supported EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported EClasses</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataInput#getSupportedEClasses()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_SupportedEClasses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.PayloadDataInput <em>Payload Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.PayloadDataInput
	 * @generated
	 */
	EClass getPayloadDataInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.atlas.configuration.PayloadDataInput#getCodec <em>Codec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codec</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.PayloadDataInput#getCodec()
	 * @see #getPayloadDataInput()
	 * @generated
	 */
	EReference getPayloadDataInput_Codec();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration <em>Codec Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codec Configuration</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.CodecConfiguration
	 * @generated
	 */
	EClass getCodecConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.CodecConfiguration#getFormat()
	 * @see #getCodecConfiguration()
	 * @generated
	 */
	EAttribute getCodecConfiguration_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getTypeMapId <em>Type Map Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Map Id</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.CodecConfiguration#getTypeMapId()
	 * @see #getCodecConfiguration()
	 * @generated
	 */
	EAttribute getCodecConfiguration_TypeMapId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#isUseNamesFromExtendedMetadata <em>Use Names From Extended Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Names From Extended Metadata</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.CodecConfiguration#isUseNamesFromExtendedMetadata()
	 * @see #getCodecConfiguration()
	 * @generated
	 */
	EAttribute getCodecConfiguration_UseNamesFromExtendedMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getRootTypes <em>Root Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Types</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.CodecConfiguration#getRootTypes()
	 * @see #getCodecConfiguration()
	 * @generated
	 */
	EReference getCodecConfiguration_RootTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.RootTypeRule <em>Root Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Type Rule</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.RootTypeRule
	 * @generated
	 */
	EClass getRootTypeRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.RootTypeRule#getSourcePattern <em>Source Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Pattern</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.RootTypeRule#getSourcePattern()
	 * @see #getRootTypeRule()
	 * @generated
	 */
	EAttribute getRootTypeRule_SourcePattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.atlas.configuration.RootTypeRule#getRootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Type</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.RootTypeRule#getRootType()
	 * @see #getRootTypeRule()
	 * @generated
	 */
	EReference getRootTypeRule_RootType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.FileDataInput <em>File Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.FileDataInput
	 * @generated
	 */
	EClass getFileDataInput();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.FileDataInput#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.FileDataInput#getUri()
	 * @see #getFileDataInput()
	 * @generated
	 */
	EAttribute getFileDataInput_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.MongoDataInput <em>Mongo Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MongoDataInput
	 * @generated
	 */
	EClass getMongoDataInput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.atlas.configuration.MongoDataInput#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MongoDataInput#getDataSource()
	 * @see #getMongoDataInput()
	 * @generated
	 */
	EReference getMongoDataInput_DataSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.MqttDataInput <em>Mqtt Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MqttDataInput
	 * @generated
	 */
	EClass getMqttDataInput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.atlas.configuration.MqttDataInput#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MqttDataInput#getDataSource()
	 * @see #getMqttDataInput()
	 * @generated
	 */
	EReference getMqttDataInput_DataSource();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.atlas.configuration.MqttDataInput#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Topics</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MqttDataInput#getTopics()
	 * @see #getMqttDataInput()
	 * @generated
	 */
	EAttribute getMqttDataInput_Topics();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataSource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataSource#getId()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataSource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataSource#getDescription()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DataSource#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DataSource#getFilter()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Filter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.ServerDataSource <em>Server Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ServerDataSource
	 * @generated
	 */
	EClass getServerDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.ServerDataSource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ServerDataSource#getHost()
	 * @see #getServerDataSource()
	 * @generated
	 */
	EAttribute getServerDataSource_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.ServerDataSource#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ServerDataSource#getPort()
	 * @see #getServerDataSource()
	 * @generated
	 */
	EAttribute getServerDataSource_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.ServerDataSource#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ServerDataSource#getUser()
	 * @see #getServerDataSource()
	 * @generated
	 */
	EAttribute getServerDataSource_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.ServerDataSource#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ServerDataSource#getPassword()
	 * @see #getServerDataSource()
	 * @generated
	 */
	EAttribute getServerDataSource_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.atlas.configuration.ServerDataSource#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ServerDataSource#getProperties()
	 * @see #getServerDataSource()
	 * @generated
	 */
	EReference getServerDataSource_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource <em>Database Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource
	 * @generated
	 */
	EClass getDatabaseDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getDatabase()
	 * @see #getDatabaseDataSource()
	 * @generated
	 */
	EAttribute getDatabaseDataSource_Database();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.ConnectionProperty <em>Connection Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Property</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ConnectionProperty
	 * @generated
	 */
	EClass getConnectionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.ConnectionProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ConnectionProperty#getKey()
	 * @see #getConnectionProperty()
	 * @generated
	 */
	EAttribute getConnectionProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.ConnectionProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.ConnectionProperty#getValue()
	 * @see #getConnectionProperty()
	 * @generated
	 */
	EAttribute getConnectionProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource <em>Jdbc Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jdbc Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDataSource
	 * @generated
	 */
	EClass getJdbcDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDataSource#getDriver()
	 * @see #getJdbcDataSource()
	 * @generated
	 */
	EAttribute getJdbcDataSource_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDataSource#getSchema()
	 * @see #getJdbcDataSource()
	 * @generated
	 */
	EAttribute getJdbcDataSource_Schema();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.MongoDataSource <em>Mongo Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MongoDataSource
	 * @generated
	 */
	EClass getMongoDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.MongoDataSource#getAuthSource <em>Auth Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MongoDataSource#getAuthSource()
	 * @see #getMongoDataSource()
	 * @generated
	 */
	EAttribute getMongoDataSource_AuthSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.MongoDataSource#getFlavor <em>Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MongoDataSource#getFlavor()
	 * @see #getMongoDataSource()
	 * @generated
	 */
	EAttribute getMongoDataSource_Flavor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.MqttDataSource <em>Mqtt Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MqttDataSource
	 * @generated
	 */
	EClass getMqttDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.MqttDataSource#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.MqttDataSource#getProtocol()
	 * @see #getMqttDataSource()
	 * @generated
	 */
	EAttribute getMqttDataSource_Protocol();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.atlas.configuration.JdbcDriver <em>Jdbc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jdbc Driver</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
	 * @generated
	 */
	EEnum getJdbcDriver();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.atlas.configuration.PayloadFormat <em>Payload Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payload Format</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.PayloadFormat
	 * @generated
	 */
	EEnum getPayloadFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlasConfigFactory getAtlasConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataProviderImpl <em>Data Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.DataProviderImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataProvider()
		 * @generated
		 */
		EClass DATA_PROVIDER = eINSTANCE.getDataProvider();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROVIDER__ID = eINSTANCE.getDataProvider_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROVIDER__NAME = eINSTANCE.getDataProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROVIDER__DESCRIPTION = eINSTANCE.getDataProvider_Description();

		/**
		 * The meta object literal for the '<em><b>Data Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROVIDER__DATA_INPUT = eINSTANCE.getDataProvider_DataInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataServiceImpl <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.DataServiceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Url Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__URL_CONTEXT = eINSTANCE.getDataService_UrlContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataInputImpl <em>Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.DataInputImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INPUT__ID = eINSTANCE.getDataInput_Id();

		/**
		 * The meta object literal for the '<em><b>Supported EClasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INPUT__SUPPORTED_ECLASSES = eINSTANCE.getDataInput_SupportedEClasses();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.PayloadDataInputImpl <em>Payload Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.PayloadDataInputImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getPayloadDataInput()
		 * @generated
		 */
		EClass PAYLOAD_DATA_INPUT = eINSTANCE.getPayloadDataInput();

		/**
		 * The meta object literal for the '<em><b>Codec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD_DATA_INPUT__CODEC = eINSTANCE.getPayloadDataInput_Codec();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl <em>Codec Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.CodecConfigurationImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getCodecConfiguration()
		 * @generated
		 */
		EClass CODEC_CONFIGURATION = eINSTANCE.getCodecConfiguration();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEC_CONFIGURATION__FORMAT = eINSTANCE.getCodecConfiguration_Format();

		/**
		 * The meta object literal for the '<em><b>Type Map Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEC_CONFIGURATION__TYPE_MAP_ID = eINSTANCE.getCodecConfiguration_TypeMapId();

		/**
		 * The meta object literal for the '<em><b>Use Names From Extended Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA = eINSTANCE.getCodecConfiguration_UseNamesFromExtendedMetadata();

		/**
		 * The meta object literal for the '<em><b>Root Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEC_CONFIGURATION__ROOT_TYPES = eINSTANCE.getCodecConfiguration_RootTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.RootTypeRuleImpl <em>Root Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.RootTypeRuleImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getRootTypeRule()
		 * @generated
		 */
		EClass ROOT_TYPE_RULE = eINSTANCE.getRootTypeRule();

		/**
		 * The meta object literal for the '<em><b>Source Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_TYPE_RULE__SOURCE_PATTERN = eINSTANCE.getRootTypeRule_SourcePattern();

		/**
		 * The meta object literal for the '<em><b>Root Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_TYPE_RULE__ROOT_TYPE = eINSTANCE.getRootTypeRule_RootType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.FileDataInputImpl <em>File Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.FileDataInputImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getFileDataInput()
		 * @generated
		 */
		EClass FILE_DATA_INPUT = eINSTANCE.getFileDataInput();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DATA_INPUT__URI = eINSTANCE.getFileDataInput_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.MongoDataInputImpl <em>Mongo Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.MongoDataInputImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMongoDataInput()
		 * @generated
		 */
		EClass MONGO_DATA_INPUT = eINSTANCE.getMongoDataInput();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONGO_DATA_INPUT__DATA_SOURCE = eINSTANCE.getMongoDataInput_DataSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.MqttDataInputImpl <em>Mqtt Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.MqttDataInputImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMqttDataInput()
		 * @generated
		 */
		EClass MQTT_DATA_INPUT = eINSTANCE.getMqttDataInput();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MQTT_DATA_INPUT__DATA_SOURCE = eINSTANCE.getMqttDataInput_DataSource();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_DATA_INPUT__TOPICS = eINSTANCE.getMqttDataInput_Topics();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.DataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__ID = eINSTANCE.getDataSource_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__DESCRIPTION = eINSTANCE.getDataSource_Description();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__FILTER = eINSTANCE.getDataSource_Filter();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.ServerDataSourceImpl <em>Server Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.ServerDataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getServerDataSource()
		 * @generated
		 */
		EClass SERVER_DATA_SOURCE = eINSTANCE.getServerDataSource();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_DATA_SOURCE__HOST = eINSTANCE.getServerDataSource_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_DATA_SOURCE__PORT = eINSTANCE.getServerDataSource_Port();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_DATA_SOURCE__USER = eINSTANCE.getServerDataSource_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_DATA_SOURCE__PASSWORD = eINSTANCE.getServerDataSource_Password();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DATA_SOURCE__PROPERTIES = eINSTANCE.getServerDataSource_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl <em>Database Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDatabaseDataSource()
		 * @generated
		 */
		EClass DATABASE_DATA_SOURCE = eINSTANCE.getDatabaseDataSource();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_DATA_SOURCE__DATABASE = eINSTANCE.getDatabaseDataSource_Database();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.ConnectionPropertyImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getConnectionProperty()
		 * @generated
		 */
		EClass CONNECTION_PROPERTY = eINSTANCE.getConnectionProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_PROPERTY__KEY = eINSTANCE.getConnectionProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_PROPERTY__VALUE = eINSTANCE.getConnectionProperty_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.JdbcDataSourceImpl <em>Jdbc Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.JdbcDataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getJdbcDataSource()
		 * @generated
		 */
		EClass JDBC_DATA_SOURCE = eINSTANCE.getJdbcDataSource();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDBC_DATA_SOURCE__DRIVER = eINSTANCE.getJdbcDataSource_Driver();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDBC_DATA_SOURCE__SCHEMA = eINSTANCE.getJdbcDataSource_Schema();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.MongoDataSourceImpl <em>Mongo Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.MongoDataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMongoDataSource()
		 * @generated
		 */
		EClass MONGO_DATA_SOURCE = eINSTANCE.getMongoDataSource();

		/**
		 * The meta object literal for the '<em><b>Auth Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DATA_SOURCE__AUTH_SOURCE = eINSTANCE.getMongoDataSource_AuthSource();

		/**
		 * The meta object literal for the '<em><b>Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DATA_SOURCE__FLAVOR = eINSTANCE.getMongoDataSource_Flavor();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.MqttDataSourceImpl <em>Mqtt Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.MqttDataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMqttDataSource()
		 * @generated
		 */
		EClass MQTT_DATA_SOURCE = eINSTANCE.getMqttDataSource();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_DATA_SOURCE__PROTOCOL = eINSTANCE.getMqttDataSource_Protocol();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.JdbcDriver <em>Jdbc Driver</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getJdbcDriver()
		 * @generated
		 */
		EEnum JDBC_DRIVER = eINSTANCE.getJdbcDriver();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.PayloadFormat <em>Payload Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.PayloadFormat
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getPayloadFormat()
		 * @generated
		 */
		EEnum PAYLOAD_FORMAT = eINSTANCE.getPayloadFormat();

	}

} //AtlasConfigPackage
