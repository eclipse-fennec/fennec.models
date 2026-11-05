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
 * A representation of the model object '<em><b>Jdbc Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relational data source realized as a javax.sql.DataSource service.
 * BIND: filter selects the DataSource service the deployment configured.
 * MATERIALIZE: the consuming runtime creates a daanse.jdbc.datasource.<driver>.DataSource factory configuration from host/port/database/schema/user/password/properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getJdbcDataSource()
 * @model
 * @generated
 */
@ProviderType
public interface JdbcDataSource extends DatabaseDataSource {
	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.atlas.configuration.JdbcDriver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The database kind the materialized DataSource connects to; selects the daanse provider (MATERIALIZE only, default PostgreSQL). The runtime has to carry the provider and driver bundles of that kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
	 * @see #setDriver(JdbcDriver)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getJdbcDataSource_Driver()
	 * @model
	 * @generated
	 */
	JdbcDriver getDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see org.eclipse.fennec.atlas.configuration.JdbcDriver
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(JdbcDriver value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional default schema of the connection (PostgreSQL currentSchema). Not applicable to MariaDB/MySQL, where the database is the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getJdbcDataSource_Schema()
	 * @model
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.JdbcDataSource#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

} // JdbcDataSource
