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
 * A representation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract definition of an endpoint an atlas publishes data through. Atlas-specific subtypes define the protocol (REST, OData, OGC, ...) and what the service serves.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.DataService#getUrlContext <em>Url Context</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataService()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface DataService extends DataProvider {
	/**
	 * Returns the value of the '<em><b>Url Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base URL context (path prefix) under which this service is published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url Context</em>' attribute.
	 * @see #setUrlContext(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getDataService_UrlContext()
	 * @model required="true"
	 * @generated
	 */
	String getUrlContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.DataService#getUrlContext <em>Url Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Context</em>' attribute.
	 * @see #getUrlContext()
	 * @generated
	 */
	void setUrlContext(String value);

} // DataService
