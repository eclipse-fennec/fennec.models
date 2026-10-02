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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A numbered requirement or statement of a technical document, the unit a finding cites. The citationId is its label as printed, e.g. O.Source_1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getObligation <em>Obligation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getDocumentClause()
 * @model
 * @generated
 */
@ProviderType
public interface DocumentClause extends Citable {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label as printed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getDocumentClause_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text of the clause. Kept empty while the licence of the document does not allow redistribution; the context then carries a paraphrase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getDocumentClause_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Obligation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Obligation keyword as printed, e.g. MUSS, SOLL, KANN (RFC 2119 style).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation</em>' attribute.
	 * @see #setObligation(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getDocumentClause_Obligation()
	 * @model
	 * @generated
	 */
	String getObligation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getObligation <em>Obligation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligation</em>' attribute.
	 * @see #getObligation()
	 * @generated
	 */
	void setObligation(String value);

} // DocumentClause
