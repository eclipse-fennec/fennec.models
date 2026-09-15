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
package org.eclipse.fennec.model.gdpr;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One legal definition from Article 4, indexed for lookup by term. The defining sentence itself is the text of the Point that definedIn refers to.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Definition#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Definition#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Definition#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDefinition()
 * @model
 * @generated
 */
@ProviderType
public interface Definition extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined term exactly as the act defines it, e.g. 'personal data', 'biometric data', 'pseudonymisation'. Extracted from the quotation marks the source uses to delimit the term, so it is the act's own wording and not an interpretation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDefinition_Term()
	 * @model
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Definition#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition's number within Article 4, 1 to 26. So term 'biometric data' is number 14 and is cited as Art.4(14).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDefinition_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Definition#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Defined In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdpr.Point#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point of Article 4 that carries the defining text. Cite that point, not the Definition, when a finding relies on a definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined In</em>' reference.
	 * @see #setDefinedIn(Point)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDefinition_DefinedIn()
	 * @see org.eclipse.fennec.model.gdpr.Point#getDefinition
	 * @model opposite="definition" resolveProxies="false"
	 * @generated
	 */
	Point getDefinedIn();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Definition#getDefinedIn <em>Defined In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined In</em>' reference.
	 * @see #getDefinedIn()
	 * @generated
	 */
	void setDefinedIn(Point value);

} // Definition
