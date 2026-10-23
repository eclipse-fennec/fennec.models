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
package org.eclipse.fennec.model.compliance.context;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Points at a context by id and version, without an EMF reference, so that the referring model survives a new version of the context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ContextRef#getContextId <em>Context Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ContextRef#getContextVersion <em>Context Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getContextRef()
 * @model
 * @generated
 */
@ProviderType
public interface ContextRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Id</em>' attribute.
	 * @see #setContextId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getContextRef_ContextId()
	 * @model required="true"
	 * @generated
	 */
	String getContextId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ContextRef#getContextId <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Id</em>' attribute.
	 * @see #getContextId()
	 * @generated
	 */
	void setContextId(String value);

	/**
	 * Returns the value of the '<em><b>Context Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of the context. Unset means the current version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Version</em>' attribute.
	 * @see #setContextVersion(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getContextRef_ContextVersion()
	 * @model
	 * @generated
	 */
	String getContextVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ContextRef#getContextVersion <em>Context Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Version</em>' attribute.
	 * @see #getContextVersion()
	 * @generated
	 */
	void setContextVersion(String value);

} // ContextRef
