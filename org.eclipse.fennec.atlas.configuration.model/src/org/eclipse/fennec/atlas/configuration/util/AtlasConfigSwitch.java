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
package org.eclipse.fennec.atlas.configuration.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fennec.atlas.configuration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage
 * @generated
 */
public class AtlasConfigSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtlasConfigPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlasConfigSwitch() {
		if (modelPackage == null) {
			modelPackage = AtlasConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AtlasConfigPackage.DATA_PROVIDER: {
				DataProvider dataProvider = (DataProvider)theEObject;
				T result = caseDataProvider(dataProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.DATA_SERVICE: {
				DataService dataService = (DataService)theEObject;
				T result = caseDataService(dataService);
				if (result == null) result = caseDataProvider(dataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.DATA_INPUT: {
				DataInput dataInput = (DataInput)theEObject;
				T result = caseDataInput(dataInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.PAYLOAD_DATA_INPUT: {
				PayloadDataInput payloadDataInput = (PayloadDataInput)theEObject;
				T result = casePayloadDataInput(payloadDataInput);
				if (result == null) result = caseDataInput(payloadDataInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.CODEC_CONFIGURATION: {
				CodecConfiguration codecConfiguration = (CodecConfiguration)theEObject;
				T result = caseCodecConfiguration(codecConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.ROOT_TYPE_RULE: {
				RootTypeRule rootTypeRule = (RootTypeRule)theEObject;
				T result = caseRootTypeRule(rootTypeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.FILE_DATA_INPUT: {
				FileDataInput fileDataInput = (FileDataInput)theEObject;
				T result = caseFileDataInput(fileDataInput);
				if (result == null) result = casePayloadDataInput(fileDataInput);
				if (result == null) result = caseDataInput(fileDataInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.MONGO_DATA_INPUT: {
				MongoDataInput mongoDataInput = (MongoDataInput)theEObject;
				T result = caseMongoDataInput(mongoDataInput);
				if (result == null) result = caseDataInput(mongoDataInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.MQTT_DATA_INPUT: {
				MqttDataInput mqttDataInput = (MqttDataInput)theEObject;
				T result = caseMqttDataInput(mqttDataInput);
				if (result == null) result = casePayloadDataInput(mqttDataInput);
				if (result == null) result = caseDataInput(mqttDataInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.EXTENT_TRANSFORMATION_INPUT: {
				ExtentTransformationInput extentTransformationInput = (ExtentTransformationInput)theEObject;
				T result = caseExtentTransformationInput(extentTransformationInput);
				if (result == null) result = caseDataInput(extentTransformationInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.DATA_TRANSFORMATION: {
				DataTransformation dataTransformation = (DataTransformation)theEObject;
				T result = caseDataTransformation(dataTransformation);
				if (result == null) result = caseTransformation(dataTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.SERVER_DATA_SOURCE: {
				ServerDataSource serverDataSource = (ServerDataSource)theEObject;
				T result = caseServerDataSource(serverDataSource);
				if (result == null) result = caseDataSource(serverDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.DATABASE_DATA_SOURCE: {
				DatabaseDataSource databaseDataSource = (DatabaseDataSource)theEObject;
				T result = caseDatabaseDataSource(databaseDataSource);
				if (result == null) result = caseServerDataSource(databaseDataSource);
				if (result == null) result = caseDataSource(databaseDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.CONNECTION_PROPERTY: {
				ConnectionProperty connectionProperty = (ConnectionProperty)theEObject;
				T result = caseConnectionProperty(connectionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.JDBC_DATA_SOURCE: {
				JdbcDataSource jdbcDataSource = (JdbcDataSource)theEObject;
				T result = caseJdbcDataSource(jdbcDataSource);
				if (result == null) result = caseDatabaseDataSource(jdbcDataSource);
				if (result == null) result = caseServerDataSource(jdbcDataSource);
				if (result == null) result = caseDataSource(jdbcDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.MONGO_DATA_SOURCE: {
				MongoDataSource mongoDataSource = (MongoDataSource)theEObject;
				T result = caseMongoDataSource(mongoDataSource);
				if (result == null) result = caseDatabaseDataSource(mongoDataSource);
				if (result == null) result = caseServerDataSource(mongoDataSource);
				if (result == null) result = caseDataSource(mongoDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlasConfigPackage.MQTT_DATA_SOURCE: {
				MqttDataSource mqttDataSource = (MqttDataSource)theEObject;
				T result = caseMqttDataSource(mqttDataSource);
				if (result == null) result = caseServerDataSource(mqttDataSource);
				if (result == null) result = caseDataSource(mqttDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProvider(DataProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataService(DataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInput(DataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayloadDataInput(PayloadDataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codec Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codec Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodecConfiguration(CodecConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Type Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootTypeRule(RootTypeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDataInput(FileDataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mongo Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mongo Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMongoDataInput(MongoDataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mqtt Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mqtt Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMqttDataInput(MqttDataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent Transformation Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent Transformation Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtentTransformationInput(ExtentTransformationInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransformation(DataTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerDataSource(ServerDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseDataSource(DatabaseDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionProperty(ConnectionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jdbc Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jdbc Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJdbcDataSource(JdbcDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mongo Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mongo Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMongoDataSource(MongoDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mqtt Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mqtt Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMqttDataSource(MqttDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AtlasConfigSwitch
