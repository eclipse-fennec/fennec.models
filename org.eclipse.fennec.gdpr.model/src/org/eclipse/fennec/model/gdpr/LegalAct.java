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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete legislative act, not a single article. Exactly one instance holds the whole regulation: its recitals, its chapters and, through them, all of its articles. For the GDPR that is one LegalAct containing 173 recitals, 26 divisions and 99 articles. The text is derived from the official renditions of one consolidated CELEX: the enacting terms from the XHTML rendition and the preamble from the Formex one, because the XHTML rendition carries no preamble. See the accompanying README for provenance and licence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getCelex <em>Celex</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getConsolidatedDate <em>Consolidated Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getFormexSchema <em>Formex Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getClosingFormula <em>Closing Formula</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getRecitals <em>Recitals</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getDivisions <em>Divisions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.LegalAct#getCrossReferences <em>Cross References</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct()
 * @model
 * @generated
 */
@ProviderType
public interface LegalAct extends EObject {
	/**
	 * Returns the value of the '<em><b>Celex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CELEX identifier of the act, e.g. 32016R0679 for the GDPR. The stable way to name which act this is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Celex</em>' attribute.
	 * @see #setCelex(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Celex()
	 * @model
	 * @generated
	 */
	String getCelex();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalAct#getCelex <em>Celex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celex</em>' attribute.
	 * @see #getCelex()
	 * @generated
	 */
	void setCelex(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official title of the act as printed in the Official Journal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalAct#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language of this rendering, e.g. EN. Citation identifiers are language independent, so the same citationId addresses the same unit in every language, but the text does not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalAct#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Consolidated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of the consolidation this was built from, as yyyyMMdd. A consolidated text is documentation and is not authentic; only the Official Journal produces legal effects. Always report it alongside a quote.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consolidated Date</em>' attribute.
	 * @see #setConsolidatedDate(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_ConsolidatedDate()
	 * @model
	 * @generated
	 */
	String getConsolidatedDate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalAct#getConsolidatedDate <em>Consolidated Date</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_FormexSchema()
	 * @model
	 * @generated
	 */
	String getFormexSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalAct#getFormexSchema <em>Formex Schema</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_ClosingFormula()
	 * @model
	 * @generated
	 */
	String getClosingFormula();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.LegalAct#getClosingFormula <em>Closing Formula</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Citations()
	 * @model
	 * @generated
	 */
	EList<String> getCitations();

	/**
	 * Returns the value of the '<em><b>Recitals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Recital}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preamble, in order. Recitals are not binding on their own but are the authoritative guide to reading the articles, and much of the practically useful detail lives only here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recitals</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Recitals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recital> getRecitals();

	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level chapters. Articles are reached through these, not directly from the act.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Division> getDivisions();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index over the definitions in Article 4. Convenience for term lookup; the defining text itself lives in the Point that definedIn refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Cross References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.CrossReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every citation found in the text, one entry per occurrence. Held flat here rather than on each unit; filter by source or target to get an article-centric view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross References</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getLegalAct_CrossReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossReference> getCrossReferences();

} // LegalAct
