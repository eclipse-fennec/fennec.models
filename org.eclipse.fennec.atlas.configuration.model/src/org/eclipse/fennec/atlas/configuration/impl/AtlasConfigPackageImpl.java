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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.atlas.configuration.AtlasConfigFactory;
import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;
import org.eclipse.fennec.atlas.configuration.CodecConfiguration;
import org.eclipse.fennec.atlas.configuration.ConnectionProperty;
import org.eclipse.fennec.atlas.configuration.DataInput;
import org.eclipse.fennec.atlas.configuration.DataProvider;
import org.eclipse.fennec.atlas.configuration.DataService;
import org.eclipse.fennec.atlas.configuration.DataSource;
import org.eclipse.fennec.atlas.configuration.DatabaseDataSource;
import org.eclipse.fennec.atlas.configuration.FileDataInput;
import org.eclipse.fennec.atlas.configuration.JdbcDataSource;
import org.eclipse.fennec.atlas.configuration.JdbcDriver;
import org.eclipse.fennec.atlas.configuration.MongoDataInput;
import org.eclipse.fennec.atlas.configuration.MongoDataSource;
import org.eclipse.fennec.atlas.configuration.MqttDataInput;
import org.eclipse.fennec.atlas.configuration.MqttDataSource;
import org.eclipse.fennec.atlas.configuration.PayloadDataInput;
import org.eclipse.fennec.atlas.configuration.PayloadFormat;
import org.eclipse.fennec.atlas.configuration.RootTypeRule;
import org.eclipse.fennec.atlas.configuration.ServerDataSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlasConfigPackageImpl extends EPackageImpl implements AtlasConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payloadDataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codecConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootTypeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongoDataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttDataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdbcDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongoDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jdbcDriverEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payloadFormatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtlasConfigPackageImpl() {
		super(eNS_URI, AtlasConfigFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AtlasConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtlasConfigPackage init() {
		if (isInited) return (AtlasConfigPackage)EPackage.Registry.INSTANCE.getEPackage(AtlasConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtlasConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtlasConfigPackageImpl theAtlasConfigPackage = registeredAtlasConfigPackage instanceof AtlasConfigPackageImpl ? (AtlasConfigPackageImpl)registeredAtlasConfigPackage : new AtlasConfigPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAtlasConfigPackage.createPackageContents();

		// Initialize created meta-data
		theAtlasConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtlasConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtlasConfigPackage.eNS_URI, theAtlasConfigPackage);
		return theAtlasConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataProvider() {
		return dataProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataProvider_Id() {
		return (EAttribute)dataProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataProvider_Name() {
		return (EAttribute)dataProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataProvider_Description() {
		return (EAttribute)dataProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataProvider_DataInput() {
		return (EReference)dataProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataService_UrlContext() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataInput() {
		return dataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataInput_Id() {
		return (EAttribute)dataInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataInput_SupportedEClasses() {
		return (EReference)dataInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayloadDataInput() {
		return payloadDataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayloadDataInput_Codec() {
		return (EReference)payloadDataInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodecConfiguration() {
		return codecConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodecConfiguration_Format() {
		return (EAttribute)codecConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodecConfiguration_TypeMapId() {
		return (EAttribute)codecConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodecConfiguration_UseNamesFromExtendedMetadata() {
		return (EAttribute)codecConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodecConfiguration_RootTypes() {
		return (EReference)codecConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootTypeRule() {
		return rootTypeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRootTypeRule_SourcePattern() {
		return (EAttribute)rootTypeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRootTypeRule_RootType() {
		return (EReference)rootTypeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileDataInput() {
		return fileDataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileDataInput_Uri() {
		return (EAttribute)fileDataInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMongoDataInput() {
		return mongoDataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMongoDataInput_DataSource() {
		return (EReference)mongoDataInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMqttDataInput() {
		return mqttDataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMqttDataInput_DataSource() {
		return (EReference)mqttDataInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttDataInput_Topics() {
		return (EAttribute)mqttDataInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Id() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Name() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Description() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Filter() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerDataSource() {
		return serverDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerDataSource_Host() {
		return (EAttribute)serverDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerDataSource_Port() {
		return (EAttribute)serverDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerDataSource_User() {
		return (EAttribute)serverDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerDataSource_Password() {
		return (EAttribute)serverDataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerDataSource_Properties() {
		return (EReference)serverDataSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseDataSource() {
		return databaseDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseDataSource_Database() {
		return (EAttribute)databaseDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionProperty() {
		return connectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionProperty_Key() {
		return (EAttribute)connectionPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionProperty_Value() {
		return (EAttribute)connectionPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJdbcDataSource() {
		return jdbcDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJdbcDataSource_Driver() {
		return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJdbcDataSource_Schema() {
		return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMongoDataSource() {
		return mongoDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDataSource_AuthSource() {
		return (EAttribute)mongoDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDataSource_Flavor() {
		return (EAttribute)mongoDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMqttDataSource() {
		return mqttDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttDataSource_Protocol() {
		return (EAttribute)mqttDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJdbcDriver() {
		return jdbcDriverEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPayloadFormat() {
		return payloadFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtlasConfigFactory getAtlasConfigFactory() {
		return (AtlasConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataProviderEClass = createEClass(DATA_PROVIDER);
		createEAttribute(dataProviderEClass, DATA_PROVIDER__ID);
		createEAttribute(dataProviderEClass, DATA_PROVIDER__NAME);
		createEAttribute(dataProviderEClass, DATA_PROVIDER__DESCRIPTION);
		createEReference(dataProviderEClass, DATA_PROVIDER__DATA_INPUT);

		dataServiceEClass = createEClass(DATA_SERVICE);
		createEAttribute(dataServiceEClass, DATA_SERVICE__URL_CONTEXT);

		dataInputEClass = createEClass(DATA_INPUT);
		createEAttribute(dataInputEClass, DATA_INPUT__ID);
		createEReference(dataInputEClass, DATA_INPUT__SUPPORTED_ECLASSES);

		payloadDataInputEClass = createEClass(PAYLOAD_DATA_INPUT);
		createEReference(payloadDataInputEClass, PAYLOAD_DATA_INPUT__CODEC);

		codecConfigurationEClass = createEClass(CODEC_CONFIGURATION);
		createEAttribute(codecConfigurationEClass, CODEC_CONFIGURATION__FORMAT);
		createEAttribute(codecConfigurationEClass, CODEC_CONFIGURATION__TYPE_MAP_ID);
		createEAttribute(codecConfigurationEClass, CODEC_CONFIGURATION__USE_NAMES_FROM_EXTENDED_METADATA);
		createEReference(codecConfigurationEClass, CODEC_CONFIGURATION__ROOT_TYPES);

		rootTypeRuleEClass = createEClass(ROOT_TYPE_RULE);
		createEAttribute(rootTypeRuleEClass, ROOT_TYPE_RULE__SOURCE_PATTERN);
		createEReference(rootTypeRuleEClass, ROOT_TYPE_RULE__ROOT_TYPE);

		fileDataInputEClass = createEClass(FILE_DATA_INPUT);
		createEAttribute(fileDataInputEClass, FILE_DATA_INPUT__URI);

		mongoDataInputEClass = createEClass(MONGO_DATA_INPUT);
		createEReference(mongoDataInputEClass, MONGO_DATA_INPUT__DATA_SOURCE);

		mqttDataInputEClass = createEClass(MQTT_DATA_INPUT);
		createEReference(mqttDataInputEClass, MQTT_DATA_INPUT__DATA_SOURCE);
		createEAttribute(mqttDataInputEClass, MQTT_DATA_INPUT__TOPICS);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__ID);
		createEAttribute(dataSourceEClass, DATA_SOURCE__NAME);
		createEAttribute(dataSourceEClass, DATA_SOURCE__DESCRIPTION);
		createEAttribute(dataSourceEClass, DATA_SOURCE__FILTER);

		serverDataSourceEClass = createEClass(SERVER_DATA_SOURCE);
		createEAttribute(serverDataSourceEClass, SERVER_DATA_SOURCE__HOST);
		createEAttribute(serverDataSourceEClass, SERVER_DATA_SOURCE__PORT);
		createEAttribute(serverDataSourceEClass, SERVER_DATA_SOURCE__USER);
		createEAttribute(serverDataSourceEClass, SERVER_DATA_SOURCE__PASSWORD);
		createEReference(serverDataSourceEClass, SERVER_DATA_SOURCE__PROPERTIES);

		databaseDataSourceEClass = createEClass(DATABASE_DATA_SOURCE);
		createEAttribute(databaseDataSourceEClass, DATABASE_DATA_SOURCE__DATABASE);

		connectionPropertyEClass = createEClass(CONNECTION_PROPERTY);
		createEAttribute(connectionPropertyEClass, CONNECTION_PROPERTY__KEY);
		createEAttribute(connectionPropertyEClass, CONNECTION_PROPERTY__VALUE);

		jdbcDataSourceEClass = createEClass(JDBC_DATA_SOURCE);
		createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__DRIVER);
		createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__SCHEMA);

		mongoDataSourceEClass = createEClass(MONGO_DATA_SOURCE);
		createEAttribute(mongoDataSourceEClass, MONGO_DATA_SOURCE__AUTH_SOURCE);
		createEAttribute(mongoDataSourceEClass, MONGO_DATA_SOURCE__FLAVOR);

		mqttDataSourceEClass = createEClass(MQTT_DATA_SOURCE);
		createEAttribute(mqttDataSourceEClass, MQTT_DATA_SOURCE__PROTOCOL);

		// Create enums
		jdbcDriverEEnum = createEEnum(JDBC_DRIVER);
		payloadFormatEEnum = createEEnum(PAYLOAD_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataServiceEClass.getESuperTypes().add(this.getDataProvider());
		payloadDataInputEClass.getESuperTypes().add(this.getDataInput());
		fileDataInputEClass.getESuperTypes().add(this.getPayloadDataInput());
		mongoDataInputEClass.getESuperTypes().add(this.getDataInput());
		mqttDataInputEClass.getESuperTypes().add(this.getPayloadDataInput());
		serverDataSourceEClass.getESuperTypes().add(this.getDataSource());
		databaseDataSourceEClass.getESuperTypes().add(this.getServerDataSource());
		jdbcDataSourceEClass.getESuperTypes().add(this.getDatabaseDataSource());
		mongoDataSourceEClass.getESuperTypes().add(this.getDatabaseDataSource());
		mqttDataSourceEClass.getESuperTypes().add(this.getServerDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataProviderEClass, DataProvider.class, "DataProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataProvider_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProvider_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProvider_Description(), ecorePackage.getEString(), "description", null, 1, 1, DataProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProvider_DataInput(), this.getDataInput(), null, "dataInput", null, 0, 1, DataProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataServiceEClass, DataService.class, "DataService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataService_UrlContext(), ecorePackage.getEString(), "urlContext", null, 1, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataInputEClass, DataInput.class, "DataInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataInput_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataInput_SupportedEClasses(), ecorePackage.getEClass(), null, "supportedEClasses", null, 0, -1, DataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payloadDataInputEClass, PayloadDataInput.class, "PayloadDataInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayloadDataInput_Codec(), this.getCodecConfiguration(), null, "codec", null, 0, 1, PayloadDataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codecConfigurationEClass, CodecConfiguration.class, "CodecConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodecConfiguration_Format(), this.getPayloadFormat(), "format", null, 0, 1, CodecConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodecConfiguration_TypeMapId(), ecorePackage.getEString(), "typeMapId", null, 0, 1, CodecConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodecConfiguration_UseNamesFromExtendedMetadata(), ecorePackage.getEBoolean(), "useNamesFromExtendedMetadata", "true", 0, 1, CodecConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodecConfiguration_RootTypes(), this.getRootTypeRule(), null, "rootTypes", null, 0, -1, CodecConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootTypeRuleEClass, RootTypeRule.class, "RootTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootTypeRule_SourcePattern(), ecorePackage.getEString(), "sourcePattern", null, 1, 1, RootTypeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootTypeRule_RootType(), ecorePackage.getEClass(), null, "rootType", null, 1, 1, RootTypeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDataInputEClass, FileDataInput.class, "FileDataInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDataInput_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, FileDataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mongoDataInputEClass, MongoDataInput.class, "MongoDataInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMongoDataInput_DataSource(), this.getMongoDataSource(), null, "dataSource", null, 1, 1, MongoDataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mqttDataInputEClass, MqttDataInput.class, "MqttDataInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMqttDataInput_DataSource(), this.getMqttDataSource(), null, "dataSource", null, 1, 1, MqttDataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMqttDataInput_Topics(), ecorePackage.getEString(), "topics", null, 1, -1, MqttDataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Filter(), ecorePackage.getEString(), "filter", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverDataSourceEClass, ServerDataSource.class, "ServerDataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerDataSource_Host(), ecorePackage.getEString(), "host", null, 0, 1, ServerDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerDataSource_Port(), ecorePackage.getEIntegerObject(), "port", null, 0, 1, ServerDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerDataSource_User(), ecorePackage.getEString(), "user", null, 0, 1, ServerDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerDataSource_Password(), ecorePackage.getEString(), "password", null, 0, 1, ServerDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerDataSource_Properties(), this.getConnectionProperty(), null, "properties", null, 0, -1, ServerDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseDataSourceEClass, DatabaseDataSource.class, "DatabaseDataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseDataSource_Database(), ecorePackage.getEString(), "database", null, 0, 1, DatabaseDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPropertyEClass, ConnectionProperty.class, "ConnectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionProperty_Key(), ecorePackage.getEString(), "key", null, 1, 1, ConnectionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, ConnectionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdbcDataSourceEClass, JdbcDataSource.class, "JdbcDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdbcDataSource_Driver(), this.getJdbcDriver(), "driver", null, 0, 1, JdbcDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdbcDataSource_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, JdbcDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mongoDataSourceEClass, MongoDataSource.class, "MongoDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMongoDataSource_AuthSource(), ecorePackage.getEString(), "authSource", null, 0, 1, MongoDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDataSource_Flavor(), ecorePackage.getEString(), "flavor", null, 0, 1, MongoDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mqttDataSourceEClass, MqttDataSource.class, "MqttDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMqttDataSource_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, MqttDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jdbcDriverEEnum, JdbcDriver.class, "JdbcDriver");
		addEEnumLiteral(jdbcDriverEEnum, JdbcDriver.POSTGRESQL);
		addEEnumLiteral(jdbcDriverEEnum, JdbcDriver.H2);

		initEEnum(payloadFormatEEnum, PayloadFormat.class, "PayloadFormat");
		addEEnumLiteral(payloadFormatEEnum, PayloadFormat.XMI);
		addEEnumLiteral(payloadFormatEEnum, PayloadFormat.JSON);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Configuration building blocks shared by the Fennec atlases (Data Atlas, Model Atlas, Event Atlas, ...).\n\nThe atlas-specific configuration models reference or extend these types instead of defining their own, so that e.g. a data source or a data input looks the same in every atlas:\n- DataSource (JdbcDataSource, MongoDataSource, MqttDataSource): where the data lives and how to connect to it.\n- DataInput (FileDataInput, MqttDataInput, MongoDataInput): what streams EObjects into an atlas. Inputs receiving serialized payloads (PayloadDataInput) carry a CodecConfiguration saying how the EMF codec reads them.\n- DataProvider and DataService: the common base of anything an atlas provides data through, and of the endpoints it publishes; atlas-specific subtypes add their own features (transformations, exports, ...).\n\nInputs that need further models live in their own modules (e.g. JPADataInput in org.eclipse.fennec.atlas.configuration.jpa.model), so this model stays free of dependencies."
		   });
		addAnnotation
		  (dataProviderEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base for anything an atlas provides data through (e.g. a service endpoint or a dataset).\nCarries the common identity (id/name/description) and the DataInput the data comes from. Atlas-specific subtypes add what they need on top (e.g. transformations, distribution exports, publications)."
		   });
		addAnnotation
		  (getDataProvider_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier of this data provider."
		   });
		addAnnotation
		  (getDataProvider_Name(),
		   source,
		   new String[] {
			   "documentation", "Human-readable name of the data provider. Derives from the model annotation by default."
		   });
		addAnnotation
		  (getDataProvider_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of the data provider. Derives from the model annotation by default."
		   });
		addAnnotation
		  (getDataProvider_DataInput(),
		   source,
		   new String[] {
			   "documentation", "The DataInput this provider takes its data from. Atlas-specific subtypes define whether it is mandatory and how nested providers inherit it."
		   });
		addAnnotation
		  (dataServiceEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract definition of an endpoint an atlas publishes data through. Atlas-specific subtypes define the protocol (REST, OData, OGC, ...) and what the service serves."
		   });
		addAnnotation
		  (getDataService_UrlContext(),
		   source,
		   new String[] {
			   "documentation", "Base URL context (path prefix) under which this service is published."
		   });
		addAnnotation
		  (dataInputEClass,
		   source,
		   new String[] {
			   "documentation", "Base type for any input that can stream EObjects into an atlas, e.g. EMF files (FileDataInput) or a MongoDB database (MongoDataInput). Atlas-specific configuration models add further kinds.\n\nIntended as an abstract base - it is not meant to be instantiated directly."
		   });
		addAnnotation
		  (getDataInput_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier of this data input, used to reference it from DataProviders."
		   });
		addAnnotation
		  (getDataInput_SupportedEClasses(),
		   source,
		   new String[] {
			   "documentation", "The EClasses (model types, typically resolved against the Model Atlas) whose instances this input can provide."
		   });
		addAnnotation
		  (payloadDataInputEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base for inputs that receive serialized payloads (files, messages, HTTP bodies) and turn them into EObjects through the EMF codec. The codec configuration says how; without one the input uses the codec\'s defaults (the payload has to name its own model, as XMI does).\n\nIntended as an abstract base - it is not meant to be instantiated directly."
		   });
		addAnnotation
		  (getPayloadDataInput_Codec(),
		   source,
		   new String[] {
			   "documentation", "How this input deserializes its payloads. Unset = the codec\'s defaults."
		   });
		addAnnotation
		  (codecConfigurationEClass,
		   source,
		   new String[] {
			   "documentation", "The rules for turning a payload into EObjects with the EMF codec: format, type map, root type per source and name handling. The consuming runtime translates them into the codec\'s load options."
		   });
		addAnnotation
		  (getCodecConfiguration_Format(),
		   source,
		   new String[] {
			   "documentation", "The serialization format of the payloads. Unset = the input derives it per payload (e.g. from the file extension or the content type)."
		   });
		addAnnotation
		  (getCodecConfiguration_TypeMapId(),
		   source,
		   new String[] {
			   "documentation", "The codec\'s type-mapping registry id (codec load option codec.typeMapId). Formats that do not name their own model - JSON, unlike XMI - are typed by the codec\'s discriminator, which the models declare in eAnnotations with source http://eclipse.org/fennec/codec/typeMapping/<typeMapId>. Unset = the codec\'s defaults, so untyped JSON yields no objects unless a root type applies."
		   });
		addAnnotation
		  (getCodecConfiguration_UseNamesFromExtendedMetadata(),
		   source,
		   new String[] {
			   "documentation", "Whether the codec reads property names from the models\' ExtendedMetaData annotations (codec load option codec.useNamesFromExtendedMetadata) instead of the feature names. Default true: models generated from external payloads record the original names there."
		   });
		addAnnotation
		  (getCodecConfiguration_RootTypes(),
		   source,
		   new String[] {
			   "documentation", "The root type to read payloads as, per source. The first rule whose sourcePattern matches the payload\'s source wins; without a match the codec resolves the type itself (discriminator, or the type the payload names)."
		   });
		addAnnotation
		  (rootTypeRuleEClass,
		   source,
		   new String[] {
			   "documentation", "Reads the payloads of matching sources as one EClass (codec load option CODEC_ROOT_TYPE).\n\nThe rule is a fallback for payloads the codec cannot type on its own: a model whose payloads carry no discriminator value (e.g. a LoRaWAN uplink with a fresh UUID per message) can only be typed by the source it arrives from. A model that does annotate a discriminator still picks its own type."
		   });
		addAnnotation
		  (getRootTypeRule_SourcePattern(),
		   source,
		   new String[] {
			   "documentation", "Pattern matched against the payload\'s source - the MQTT topic, the file path, the request path - where * and # stand for any text, e.g. iotraffic/#."
		   });
		addAnnotation
		  (getRootTypeRule_RootType(),
		   source,
		   new String[] {
			   "documentation", "The EClass the matching payloads are read as (typically resolved against the Model Atlas)."
		   });
		addAnnotation
		  (payloadFormatEEnum,
		   source,
		   new String[] {
			   "documentation", "The serialization formats a PayloadDataInput can read. The literal is the file extension that selects the EMF resource factory."
		   });
		addAnnotation
		  (fileDataInputEClass,
		   source,
		   new String[] {
			   "documentation", "DataInput backed by EMF files as a source."
		   });
		addAnnotation
		  (getFileDataInput_Uri(),
		   source,
		   new String[] {
			   "documentation", "URI of the EMF resource (or a directory of EMF resources) this input loads its EObjects from."
		   });
		addAnnotation
		  (mongoDataInputEClass,
		   source,
		   new String[] {
			   "documentation", "DataInput backed by a MongoDB database: the fennec Mongo persistence backend reads the collections through the BSON codec, so documents have to follow its layout (EMF id as _id, type discriminator, references as URIs). No mapping is needed - a registered EPackage is all the backend requires."
		   });
		addAnnotation
		  (getMongoDataInput_DataSource(),
		   source,
		   new String[] {
			   "documentation", "The MongoDB data source definition providing the database for this input."
		   });
		addAnnotation
		  (mqttDataInputEClass,
		   source,
		   new String[] {
			   "documentation", "DataInput receiving the messages of MQTT topics from a broker. The topic a message arrives on is its source, e.g. for the root type rules of the codec configuration."
		   });
		addAnnotation
		  (getMqttDataInput_DataSource(),
		   source,
		   new String[] {
			   "documentation", "The MQTT broker this input subscribes at."
		   });
		addAnnotation
		  (getMqttDataInput_Topics(),
		   source,
		   new String[] {
			   "documentation", "The topic filters this input subscribes to, in MQTT syntax (+ for one level, # for the rest), e.g. 5g/ilsa/+/config."
		   });
		addAnnotation
		  (dataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "A reusable data source definition, kept in a registry of the consuming atlas configuration so it can be shared across its users (and tenants).\n\nA data source is realized in exactly one of two modes:\n- BIND: filter is set. The deployment configured the backend service itself (e.g. a daanse DataSource factory configuration); the filter selects it. Nothing else may be set.\n- MATERIALIZE: the connection definition of the concrete subtype is set (at least host, for databases also database). The consuming atlas runtime creates the backend service from it.\nSetting both, or neither, is a configuration error - the source is reported and skipped.\n\nCredential rule: the configuration model never carries a credential value. user and password are placeholders resolved in the consuming runtime only: $[env:NAME] for an environment variable or $[secret:NAME] for a file in the runtime\'s secrets directory. A literal value is rejected."
		   });
		addAnnotation
		  (getDataSource_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier of this data source definition. The consuming runtime registers a materialized source under this id, so its users can select it."
		   });
		addAnnotation
		  (getDataSource_Name(),
		   source,
		   new String[] {
			   "documentation", "Human-readable name of the data source."
		   });
		addAnnotation
		  (getDataSource_Description(),
		   source,
		   new String[] {
			   "documentation", "Optional description: what the database holds, who owns it."
		   });
		addAnnotation
		  (getDataSource_Filter(),
		   source,
		   new String[] {
			   "documentation", "BIND mode: OSGi target filter (LDAP-style) selecting the backend service the deployment configured - a javax.sql.DataSource for JDBC (e.g. (dataSourceName=personsDs)), a MongoDatabase for MongoDB (e.g. (mongo.database.alias=assets)), the client service for MQTT. Mutually exclusive with the connection definition."
		   });
		addAnnotation
		  (serverDataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "A data source addressed by network coordinates: the connection definition shared by all server kinds - databases, message brokers (MATERIALIZE mode). host is the minimum; subtypes add what else they require."
		   });
		addAnnotation
		  (getServerDataSource_Host(),
		   source,
		   new String[] {
			   "documentation", "Server host name or address. May be a $[env:NAME] placeholder."
		   });
		addAnnotation
		  (getServerDataSource_Port(),
		   source,
		   new String[] {
			   "documentation", "Server port; unset = the protocol\'s default (5432 for PostgreSQL, 27017 for MongoDB, 1883 for MQTT)."
		   });
		addAnnotation
		  (getServerDataSource_User(),
		   source,
		   new String[] {
			   "documentation", "Login user - a $[env:NAME] or $[secret:NAME] placeholder ONLY, never a literal (see DataSource). Unset for databases without authentication."
		   });
		addAnnotation
		  (getServerDataSource_Password(),
		   source,
		   new String[] {
			   "documentation", "Login password - a $[env:NAME] or $[secret:NAME] placeholder ONLY, never a literal (see DataSource)."
		   });
		addAnnotation
		  (getServerDataSource_Properties(),
		   source,
		   new String[] {
			   "documentation", "Additional driver-specific settings, passed through verbatim to the backend\'s factory configuration (e.g. sslMode=require for PostgreSQL, dbCloseDelay=-1 for H2, flavor=ferretdb for MongoDB). They cannot override the keys derived from the coordinate attributes."
		   });
		addAnnotation
		  (databaseDataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "The connection definition shared by all database kinds (MATERIALIZE mode). host and database are the minimum; the rest is optional."
		   });
		addAnnotation
		  (getDatabaseDataSource_Database(),
		   source,
		   new String[] {
			   "documentation", "Name of the database (for H2: the database identifier - a name or path)."
		   });
		addAnnotation
		  (connectionPropertyEClass,
		   source,
		   new String[] {
			   "documentation", "One driver-specific key/value setting of a ServerDataSource. The value is a string; the backend\'s metatype decides the target type."
		   });
		addAnnotation
		  (jdbcDataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "A relational data source realized as a javax.sql.DataSource service.\nBIND: filter selects the DataSource service the deployment configured.\nMATERIALIZE: the consuming runtime creates a daanse.jdbc.datasource.<driver>.DataSource factory configuration from host/port/database/schema/user/password/properties."
		   });
		addAnnotation
		  (getJdbcDataSource_Driver(),
		   source,
		   new String[] {
			   "documentation", "The database kind the materialized DataSource connects to; selects the daanse provider (MATERIALIZE only, default PostgreSQL). The runtime has to carry the provider and driver bundles of that kind."
		   });
		addAnnotation
		  (getJdbcDataSource_Schema(),
		   source,
		   new String[] {
			   "documentation", "Optional default schema of the connection (PostgreSQL currentSchema)."
		   });
		addAnnotation
		  (jdbcDriverEEnum,
		   source,
		   new String[] {
			   "documentation", "The relational database kinds a JdbcDataSource can be materialized for. The literal is the daanse provider infix: daanse.jdbc.datasource.<literal>.DataSource."
		   });
		addAnnotation
		  (mongoDataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "A MongoDB data source realized as a com.mongodb.client.MongoDatabase service of the fennec Mongo persistence backend.\nBIND: filter selects the MongoDatabase service the deployment configured (e.g. (mongo.database.alias=assets)).\nMATERIALIZE: the consuming runtime creates a persistence.mongo.client (connection string assembled from host/port/user/password/authSource) and a persistence.mongo.database configuration from the definition."
		   });
		addAnnotation
		  (getMongoDataSource_AuthSource(),
		   source,
		   new String[] {
			   "documentation", "Optional authentication database (the connection string\'s authSource option); unset = the driver\'s default."
		   });
		addAnnotation
		  (getMongoDataSource_Flavor(),
		   source,
		   new String[] {
			   "documentation", "Optional server flavor behind the wire protocol as understood by the fennec Mongo backend (mongo, ferretdb, documentdb-pg); unset = mongo."
		   });
		addAnnotation
		  (mqttDataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "An MQTT broker.\nBIND: filter selects the MQTT client service the deployment configured.\nMATERIALIZE: the consuming runtime creates the client connection from protocol/host/port/user/password/properties."
		   });
		addAnnotation
		  (getMqttDataSource_Protocol(),
		   source,
		   new String[] {
			   "documentation", "The transport of the broker URL: tcp, ssl, ws or wss; unset = tcp."
		   });
	}

} //AtlasConfigPackageImpl
