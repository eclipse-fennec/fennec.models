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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementGroup()
 * @model
 * @generated
 */
@ProviderType
public interface RequirementGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the group, unique within the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementGroup_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Title of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementGroup_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.RequirementGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementGroup_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementGroup_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // RequirementGroup
