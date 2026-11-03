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
 * - DataSource (JdbcDataSource, MongoDataSource): where the data lives and how to connect to it.
 * - DataInput (FileDataInput, MongoDataInput): what streams EObjects into an atlas.
 * - DataProvider and DataService: the common base of anything an atlas provides data through, and of the endpoints it publishes; atlas-specific subtypes add their own features (transformations, exports, ...).
 * 
 * Inputs that need further models live in their own modules (e.g. JPADataInput in org.eclipse.fennec.atlas.configuration.jpa.model), so this model stays free of dependencies.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AtlasConfigPackage.eNS_URI, fingerprint = "fp1:b410cac32928864f3cbe0a21423099a7d7b1f6f3fdb01bb02462147fe3628bbb", genModel = "/model/configuration.genmodel", genModelSourceLocations = {"model/configuration.genmodel","org.eclipse.fennec.atlas.configuration.model/model/configuration.genmodel"}, ecore = "/model/configuration.ecore", ecoreSourceLocations = "/model/configuration.ecore")
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
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.FileDataInputImpl <em>File Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.FileDataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getFileDataInput()
	 * @generated
	 */
	int FILE_DATA_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__ID = DATA_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__SUPPORTED_ECLASSES = DATA_INPUT__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT__URI = DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT_FEATURE_COUNT = DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DATA_INPUT_OPERATION_COUNT = DATA_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.MongoDataInputImpl <em>Mongo Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.MongoDataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getMongoDataInput()
	 * @generated
	 */
	int MONGO_DATA_INPUT = 4;

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
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 5;

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
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl <em>Database Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDatabaseDataSource()
	 * @generated
	 */
	int DATABASE_DATA_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__ID = DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__DESCRIPTION = DATA_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__FILTER = DATA_SOURCE__FILTER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__HOST = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__PORT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__DATABASE = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__USER = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__PASSWORD = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE__PROPERTIES = DATA_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Database Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Database Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATA_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.impl.ConnectionPropertyImpl
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getConnectionProperty()
	 * @generated
	 */
	int CONNECTION_PROPERTY = 7;

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
	int JDBC_DATA_SOURCE = 8;

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
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE__DATABASE = DATABASE_DATA_SOURCE__DATABASE;

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
	int MONGO_DATA_SOURCE = 9;

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
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DATA_SOURCE__DATABASE = DATABASE_DATA_SOURCE__DATABASE;

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
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.JdbcDriver <em>Jdbc Driver</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
	 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getJdbcDriver()
	 * @generated
	 */
	int JDBC_DRIVER = 10;


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
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource <em>Database Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource
	 * @generated
	 */
	EClass getDatabaseDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getHost()
	 * @see #getDatabaseDataSource()
	 * @generated
	 */
	EAttribute getDatabaseDataSource_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getPort()
	 * @see #getDatabaseDataSource()
	 * @generated
	 */
	EAttribute getDatabaseDataSource_Port();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getUser()
	 * @see #getDatabaseDataSource()
	 * @generated
	 */
	EAttribute getDatabaseDataSource_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getPassword()
	 * @see #getDatabaseDataSource()
	 * @generated
	 */
	EAttribute getDatabaseDataSource_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.DatabaseDataSource#getProperties()
	 * @see #getDatabaseDataSource()
	 * @generated
	 */
	EReference getDatabaseDataSource_Properties();

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
	 * Returns the meta object for enum '{@link org.eclipse.fennec.atlas.configuration.JdbcDriver <em>Jdbc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jdbc Driver</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
	 * @generated
	 */
	EEnum getJdbcDriver();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl <em>Database Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.impl.DatabaseDataSourceImpl
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getDatabaseDataSource()
		 * @generated
		 */
		EClass DATABASE_DATA_SOURCE = eINSTANCE.getDatabaseDataSource();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_DATA_SOURCE__HOST = eINSTANCE.getDatabaseDataSource_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_DATA_SOURCE__PORT = eINSTANCE.getDatabaseDataSource_Port();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_DATA_SOURCE__DATABASE = eINSTANCE.getDatabaseDataSource_Database();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_DATA_SOURCE__USER = eINSTANCE.getDatabaseDataSource_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_DATA_SOURCE__PASSWORD = eINSTANCE.getDatabaseDataSource_Password();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_DATA_SOURCE__PROPERTIES = eINSTANCE.getDatabaseDataSource_Properties();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.JdbcDriver <em>Jdbc Driver</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
		 * @see org.eclipse.fennec.atlas.configuration.impl.AtlasConfigPackageImpl#getJdbcDriver()
		 * @generated
		 */
		EEnum JDBC_DRIVER = eINSTANCE.getJdbcDriver();

	}

} //AtlasConfigPackage
