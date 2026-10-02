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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A name / value pair with an optional namespace, as OSCAL props. Used for the extensions of catalogs (e.g. the BSI sec_level, effort_level, target_object_categories) and for structured reference data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Property#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Property#getNs <em>Ns</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Property#getPropertyClass <em>Property Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Property#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getProperty()
 * @model
 * @generated
 */
@ProviderType
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getProperty_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namespace that qualifies the name, as a URI. Unset for the default namespace of the source format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getProperty_Ns()
	 * @model
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Property#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

	/**
	 * Returns the value of the '<em><b>Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional classification of the property, the OSCAL class flag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Class</em>' attribute.
	 * @see #setPropertyClass(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getProperty_PropertyClass()
	 * @model
	 * @generated
	 */
	String getPropertyClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Property#getPropertyClass <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Class</em>' attribute.
	 * @see #getPropertyClass()
	 * @generated
	 */
	void setPropertyClass(String value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-text remarks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getProperty_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Property#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

} // Property
