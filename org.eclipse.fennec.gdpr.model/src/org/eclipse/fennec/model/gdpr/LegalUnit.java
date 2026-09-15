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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract supertype for anything that can be cited on its own: a recital, an article, a numbered paragraph or a lettered point. There are no LegalUnit instances, only instances of its subtypes. It exists so that anything citing the law can reference one type regardless of granularity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalUnit#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalUnit#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalUnit#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalUnit#getFootnotes <em>Footnotes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalUnit()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface LegalUnit extends Citable {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit's own text. Normalised relative to the Official Journal: non-breaking spaces folded to plain spaces, footnote bodies moved to footnotes and their reference markers removed, the consolidation markers delimiting an amended span removed (the amending act is recorded in modifiedBy instead), and whitespace collapsed. The quotation marks the act puts around a defined term are preserved, so Article 4 reads 'personal data' means ... and Definition.term can be recovered from the text itself. Safe to quote verbatim, but it is not byte-identical to the printed text, so state that changes were made when reproducing it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalUnit_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this unit sits in the source document, for tracing a suspect extraction back to the original. An enacting-terms unit carries the identifier of its node in the CELLAR XHTML rendition, e.g. 005.001 for Article 5(1) or 005.001/item[1] for its first point; a recital carries rct_26, its position in the Formex preamble. The two halves of the act come from two renditions of the same consolidated CELEX, because the XHTML one contains no preamble.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Ref</em>' attribute.
	 * @see #setSourceRef(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalUnit_SourceRef()
	 * @model
	 * @generated
	 */
	String getSourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getSourceRef <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' attribute.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(String value);

	/**
	 * Returns the value of the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which act the consolidation says last replaced this unit, e.g. '32016R0679R(02): REPLACED' for a unit rewritten by the 2018 corrigendum. Empty for a unit still carrying its original wording. This is provenance, not legal force: it says where the current text came from, which is what to check when a quote differs from the Official Journal as first published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified By</em>' attribute.
	 * @see #setModifiedBy(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalUnit_ModifiedBy()
	 * @model
	 * @generated
	 */
	String getModifiedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getModifiedBy <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By</em>' attribute.
	 * @see #getModifiedBy()
	 * @generated
	 */
	void setModifiedBy(String value);

	/**
	 * Returns the value of the '<em><b>Footnotes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Footnote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footnotes attached to this unit. Their bodies are deliberately kept out of text: in the source they sit inside the sentence flow, and inlining them splices a citation into the middle of a sentence and makes the text unquotable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footnotes</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalUnit_Footnotes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Footnote> getFootnotes();

} // LegalUnit
