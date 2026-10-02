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
 * A representation of the model object '<em><b>Technical Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A technical document that is not available in a machine-readable format, e.g. a BSI Technical Guideline published as PDF. Once a document is published as OSCAL it moves to ControlCatalog.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPart <em>Part</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getTechnicalDocument()
 * @model
 * @generated
 */
@ProviderType
public interface TechnicalDocument extends Corpus {
	/**
	 * Returns the value of the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document number without part, e.g. TR-03183.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Number</em>' attribute.
	 * @see #setDocumentNumber(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getTechnicalDocument_DocumentNumber()
	 * @model
	 * @generated
	 */
	String getDocumentNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getDocumentNumber <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Number</em>' attribute.
	 * @see #getDocumentNumber()
	 * @generated
	 */
	void setDocumentNumber(String value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part of a multi-part document, e.g. 2 for TR-03183-2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getTechnicalDocument_Part()
	 * @model
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issuing body, e.g. BSI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getTechnicalDocument_Publisher()
	 * @model
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.DocumentSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level sections, in order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getTechnicalDocument_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentSection> getSections();

} // TechnicalDocument
