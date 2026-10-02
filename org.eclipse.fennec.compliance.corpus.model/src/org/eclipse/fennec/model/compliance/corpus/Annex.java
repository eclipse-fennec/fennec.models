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
 * A representation of the model object '<em><b>Annex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One annex of the act, e.g. CRA Annex I (essential cybersecurity requirements) or AI Act Annex III (high-risk use cases). The citationId is Annex plus the number, e.g. AnnexI. Text that does not fit sections or points (e.g. AI Act Annex IV) is held in text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Annex#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Annex#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Annex#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Annex#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getAnnex()
 * @model
 * @generated
 */
@ProviderType
public interface Annex extends LegalUnit {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The annex number as printed, e.g. I or IV.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getAnnex_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Annex#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The annex heading, e.g. Essential cybersecurity requirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getAnnex_Heading()
	 * @model
	 * @generated
	 */
	String getHeading();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Annex#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.AnnexSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parts of the annex, e.g. Part I and Part II of CRA Annex I.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getAnnex_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnexSection> getSections();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numbered points held directly by the annex, for annexes without parts, e.g. the areas 1 to 8 of AI Act Annex III. Citation ids follow the pattern of articles: AnnexIII(1)(a).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getAnnex_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Annex
