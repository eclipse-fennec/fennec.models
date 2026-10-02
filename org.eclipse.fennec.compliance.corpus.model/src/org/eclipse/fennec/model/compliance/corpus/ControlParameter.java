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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter of a control, referenced from the prose of its parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getParameterId <em>Parameter Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlParameter()
 * @model
 * @generated
 */
@ProviderType
public interface ControlParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the parameter as referenced from the prose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Id</em>' attribute.
	 * @see #setParameterId(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlParameter_ParameterId()
	 * @model required="true"
	 * @generated
	 */
	String getParameterId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getParameterId <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Id</em>' attribute.
	 * @see #getParameterId()
	 * @generated
	 */
	void setParameterId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short human-readable label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlParameter_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Values set by the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlParameter_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Guideline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidance on how to set the parameter, as Markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guideline</em>' attribute.
	 * @see #setGuideline(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlParameter_Guideline()
	 * @model
	 * @generated
	 */
	String getGuideline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getGuideline <em>Guideline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guideline</em>' attribute.
	 * @see #getGuideline()
	 * @generated
	 */
	void setGuideline(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getControlParameter_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // ControlParameter
