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
package org.eclipse.fennec.model.gdprReport;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A quotation from the legal corpus supporting a finding. The quote is fact; the relevance is interpretation. Keeping them apart lets a reviewer check the citation without accepting the reasoning.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evidence#getCitationId <em>Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evidence#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evidence#isVerbatim <em>Verbatim</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evidence#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evidence#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvidence()
 * @model
 * @generated
 */
@ProviderType
public interface Evidence extends EObject {
	/**
	 * Returns the value of the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required. Identifier of the quoted unit in the corpus, e.g. Art.9(2)(a), Art.4(14) or Rec.26. It must already exist in the corpus: look it up, never construct it by guessing a plausible article or paragraph number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation Id</em>' attribute.
	 * @see #setCitationId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvidence_CitationId()
	 * @model required="true"
	 * @generated
	 */
	String getCitationId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evidence#getCitationId <em>Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation Id</em>' attribute.
	 * @see #getCitationId()
	 * @generated
	 */
	void setCitationId(String value);

	/**
	 * Returns the value of the '<em><b>Quote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required. The corpus unit's text, copied unchanged. Never paraphrase, shorten or tidy it. The verbatim quote is what makes the finding auditable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote</em>' attribute.
	 * @see #setQuote(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvidence_Quote()
	 * @model required="true"
	 * @generated
	 */
	String getQuote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evidence#getQuote <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' attribute.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(String value);

	/**
	 * Returns the value of the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when quote was copied from the corpus without alteration. Set false only if the text was deliberately excerpted, and say so in relevance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbatim</em>' attribute.
	 * @see #setVerbatim(boolean)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvidence_Verbatim()
	 * @model
	 * @generated
	 */
	boolean isVerbatim();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evidence#isVerbatim <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbatim</em>' attribute.
	 * @see #isVerbatim()
	 * @generated
	 */
	void setVerbatim(boolean value);

	/**
	 * Returns the value of the '<em><b>Relevance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One sentence on why this unit supports the finding. Unlike quote, this is your interpretation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance</em>' attribute.
	 * @see #setRelevance(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvidence_Relevance()
	 * @model
	 * @generated
	 */
	String getRelevance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evidence#getRelevance <em>Relevance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance</em>' attribute.
	 * @see #getRelevance()
	 * @generated
	 */
	void setRelevance(String value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The corpus unit's own sourceRef, pointing back to the node in the source document, for tracing a suspect extraction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Ref</em>' attribute.
	 * @see #setSourceRef(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvidence_SourceRef()
	 * @model
	 * @generated
	 */
	String getSourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evidence#getSourceRef <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' attribute.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(String value);

} // Evidence
