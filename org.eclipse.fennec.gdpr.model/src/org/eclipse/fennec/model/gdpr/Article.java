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
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One article of the enacting terms. This is binding law, unlike a recital. An article either has numbered paragraphs or is a single block of text; it never has both.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Article#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Article#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Article#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Article#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getArticle()
 * @model
 * @generated
 */
@ProviderType
public interface Article extends LegalUnit {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article number as printed, 1 to 99 for the GDPR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getArticle_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Article#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article's own heading, e.g. 'Processing of special categories of personal data'. The most useful field for finding the right article.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getArticle_Heading()
	 * @model
	 * @generated
	 */
	String getHeading();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Article#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(String value);

	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The article's numbered paragraphs, in order. Empty for the 17 single-block articles, whose text sits on the article itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getArticle_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lettered or numbered points held directly by the article, used only by single-block articles that carry a list without an intervening numbered paragraph. Article 4 is the main case: its 26 definitions are points of the article.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getArticle_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Article
