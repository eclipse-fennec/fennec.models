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
 * A representation of the model object '<em><b>Legal Corpus Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Which revision of which legal act the evidence was quoted from, plus the attribution the licence requires. Fill this from the corpus itself, not from memory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getCelex <em>Celex</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getConsolidatedDate <em>Consolidated Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getFormexSchema <em>Formex Schema</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getLegalCorpusRef()
 * @model
 * @generated
 */
@ProviderType
public interface LegalCorpusRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Celex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CELEX identifier of the act quoted, e.g. 32016R0679 for the GDPR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Celex</em>' attribute.
	 * @see #setCelex(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getLegalCorpusRef_Celex()
	 * @model
	 * @generated
	 */
	String getCelex();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getCelex <em>Celex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celex</em>' attribute.
	 * @see #getCelex()
	 * @generated
	 */
	void setCelex(String value);

	/**
	 * Returns the value of the '<em><b>Consolidated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consolidation date of the text used, as yyyyMMdd, e.g. 20180523. Quotes are only reproducible against a stated consolidation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consolidated Date</em>' attribute.
	 * @see #setConsolidatedDate(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getLegalCorpusRef_ConsolidatedDate()
	 * @model
	 * @generated
	 */
	String getConsolidatedDate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getConsolidatedDate <em>Consolidated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consolidated Date</em>' attribute.
	 * @see #getConsolidatedDate()
	 * @generated
	 */
	void setConsolidatedDate(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language of the quoted text, e.g. EN. Citation identifiers are language independent, quotes are not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getLegalCorpusRef_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Formex Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schema the source document declared, e.g. formex-05.56-20160701.xd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formex Schema</em>' attribute.
	 * @see #setFormexSchema(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getLegalCorpusRef_FormexSchema()
	 * @model
	 * @generated
	 */
	String getFormexSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef#getFormexSchema <em>Formex Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formex Schema</em>' attribute.
	 * @see #getFormexSchema()
	 * @generated
	 */
	void setFormexSchema(String value);

} // LegalCorpusRef
