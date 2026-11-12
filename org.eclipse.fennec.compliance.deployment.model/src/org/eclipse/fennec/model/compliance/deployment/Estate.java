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
package org.eclipse.fennec.model.compliance.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of hosts that is inventoried together; one inventory per estate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.Estate#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.Estate#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.Estate#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.Estate#getContextIds <em>Context Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.Estate#getHosts <em>Hosts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstate()
 * @model
 * @generated
 */
@ProviderType
public interface Estate extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstate_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstate_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.Estate#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Context Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ids of the compliance contexts the estate is evaluated against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Ids</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstate_ContextIds()
	 * @model
	 * @generated
	 */
	EList<String> getContextIds();

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.deployment.EstateHost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getEstate_Hosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<EstateHost> getHosts();

} // Estate
