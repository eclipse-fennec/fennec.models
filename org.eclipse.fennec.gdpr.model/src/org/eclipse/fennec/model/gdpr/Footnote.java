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
 * A representation of the model object '<em><b>Footnote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A footnote taken out of a unit's sentence flow so that the unit's text stays readable and quotable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Footnote#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Footnote#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getFootnote()
 * @model
 * @generated
 */
@ProviderType
public interface Footnote extends EObject {
	/**
	 * Returns the value of the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The footnote's identifier from the source document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Id</em>' attribute.
	 * @see #setNoteId(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getFootnote_NoteId()
	 * @model
	 * @generated
	 */
	String getNoteId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Footnote#getNoteId <em>Note Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Id</em>' attribute.
	 * @see #getNoteId()
	 * @generated
	 */
	void setNoteId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The footnote's text, typically a citation of another act. Deliberately not part of the owning unit's text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getFootnote_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Footnote#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Footnote
