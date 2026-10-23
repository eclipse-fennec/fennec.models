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
package org.eclipse.fennec.model.compliance.corpus;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of controls, e.g. a Grundschutz++ practice. The citationId is the OSCAL group id.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroupClass <em>Group Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup()
 * @model
 * @generated
 */
@ProviderType
public interface ControlGroup extends Citable {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Title of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OSCAL class flag of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Class</em>' attribute.
	 * @see #setGroupClass(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup_GroupClass()
	 * @model
	 * @generated
	 */
	String getGroupClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroupClass <em>Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Class</em>' attribute.
	 * @see #getGroupClass()
	 * @generated
	 */
	void setGroupClass(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.ControlPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanatory parts of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlPart> getParts();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.ControlGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlGroup_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControls();

} // ControlGroup
