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
 * A representation of the model object '<em><b>Mongo Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MongoDB data source realized as a com.mongodb.client.MongoDatabase service of the fennec Mongo persistence backend.
 * BIND: filter selects the MongoDatabase service the deployment configured (e.g. (mongo.database.alias=assets)).
 * MATERIALIZE: the consuming runtime creates a persistence.mongo.client (connection string assembled from host/port/user/password/authSource) and a persistence.mongo.database configuration from the definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.MongoDataSource#getAuthSource <em>Auth Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.MongoDataSource#getFlavor <em>Flavor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getMongoDataSource()
 * @model
 * @generated
 */
@ProviderType
public interface MongoDataSource extends DatabaseDataSource {
	/**
	 * Returns the value of the '<em><b>Auth Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional authentication database (the connection string's authSource option); unset = the driver's default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Source</em>' attribute.
	 * @see #setAuthSource(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getMongoDataSource_AuthSource()
	 * @model
	 * @generated
	 */
	String getAuthSource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.MongoDataSource#getAuthSource <em>Auth Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Source</em>' attribute.
	 * @see #getAuthSource()
	 * @generated
	 */
	void setAuthSource(String value);

	/**
	 * Returns the value of the '<em><b>Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional server flavor behind the wire protocol as understood by the fennec Mongo backend (mongo, ferretdb, documentdb-pg); unset = mongo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flavor</em>' attribute.
	 * @see #setFlavor(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getMongoDataSource_Flavor()
	 * @model
	 * @generated
	 */
	String getFlavor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.MongoDataSource#getFlavor <em>Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor</em>' attribute.
	 * @see #getFlavor()
	 * @generated
	 */
	void setFlavor(String value);

} // MongoDataSource
