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
 * A representation of the model object '<em><b>Legal Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete legislative act from Formex / EUR-Lex, not a single article. Exactly one instance holds the whole act: its recitals, its chapters and, through them, all of its articles, and its annexes. The CELEX number is the workId.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getConsolidatedDate <em>Consolidated Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getFormexSchema <em>Formex Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getClosingFormula <em>Closing Formula</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getRecitals <em>Recitals</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getDivisions <em>Divisions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getAnnexes <em>Annexes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct()
 * @model
 * @generated
 */
@ProviderType
public interface LegalAct extends Corpus {
	/**
	 * Returns the value of the '<em><b>Consolidated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of the consolidation this was built from, as yyyyMMdd. A consolidated text is documentation and is not authentic; only the Official Journal produces legal effects. Always report it alongside a quote.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consolidated Date</em>' attribute.
	 * @see #setConsolidatedDate(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_ConsolidatedDate()
	 * @model
	 * @generated
	 */
	String getConsolidatedDate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getConsolidatedDate <em>Consolidated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consolidated Date</em>' attribute.
	 * @see #getConsolidatedDate()
	 * @generated
	 */
	void setConsolidatedDate(String value);

	/**
	 * Returns the value of the '<em><b>Formex Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formex schema the source document declared, e.g. formex-05.56-20160701.xd. Kept because the source schema version and the shipped schema version can differ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formex Schema</em>' attribute.
	 * @see #setFormexSchema(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_FormexSchema()
	 * @model
	 * @generated
	 */
	String getFormexSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getFormexSchema <em>Formex Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formex Schema</em>' attribute.
	 * @see #getFormexSchema()
	 * @generated
	 */
	void setFormexSchema(String value);

	/**
	 * Returns the value of the '<em><b>Closing Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The final formula of the act: 'This Regulation shall be binding in its entirety and directly applicable in all Member States.' Kept because it is the sentence that makes the act directly applicable without national transposition, which is the usual reason to quote it. The place and date of signature and the signatories are not included: the consolidated rendition does not carry them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Closing Formula</em>' attribute.
	 * @see #setClosingFormula(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_ClosingFormula()
	 * @model
	 * @generated
	 */
	String getClosingFormula();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getClosingFormula <em>Closing Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Formula</em>' attribute.
	 * @see #getClosingFormula()
	 * @generated
	 */
	void setClosingFormula(String value);

	/**
	 * Returns the value of the '<em><b>Citations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The citations of the preamble, the 'Having regard to ...' clauses stating the legal basis of the act, in document order. Six for the GDPR. They are not binding and are never cited individually, so they are plain strings rather than LegalUnits, but they record which Treaty articles and procedures the act rests on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citations</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_Citations()
	 * @model
	 * @generated
	 */
	EList<String> getCitations();

	/**
	 * Returns the value of the '<em><b>Recitals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Recital}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preamble, in order. Recitals are not binding on their own but are the authoritative guide to reading the articles, and much of the practically useful detail lives only here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recitals</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_Recitals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recital> getRecitals();

	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level chapters. Articles are reached through these, not directly from the act.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Division> getDivisions();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index over the definitions in Article 4. Convenience for term lookup; the defining text itself lives in the Point that definedIn refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Annexes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Annex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The annexes, in order. In Formex each annex is a separate document; they are merged into the act so that requirements can cite them like articles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annexes</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getLegalAct_Annexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annex> getAnnexes();

} // LegalAct
