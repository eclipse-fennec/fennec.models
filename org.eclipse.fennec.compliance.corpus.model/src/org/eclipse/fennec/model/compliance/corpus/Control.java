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
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One control (requirement) of a catalog, e.g. a Grundschutz++ requirement. The citationId is the OSCAL control id. Its statement is the part named statement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Control#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Control#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Control#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Control#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Control#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Control#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl()
 * @model
 * @generated
 */
@ProviderType
public interface Control extends Citable {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Title of the control.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Control#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OSCAL class flag of the control.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Class</em>' attribute.
	 * @see #setControlClass(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl_ControlClass()
	 * @model
	 * @generated
	 */
	String getControlClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Control#getControlClass <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Class</em>' attribute.
	 * @see #getControlClass()
	 * @generated
	 */
	void setControlClass(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties of the control, including the catalog-specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.ControlParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters referenced from the prose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.ControlPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement, guidance and other parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlPart> getParts();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control enhancements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControl_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControls();

} // Control
