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
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A chapter or a section of the enacting terms. Deliberately not a LegalUnit: a division has no text of its own and is never a legal basis, so nothing can be quoted from it. It is a Citable, because the act does cite chapters by name and a reference to "Chapter IX" has to resolve to something. Its citationId is Chp.IX for a chapter and Chp.III.Sec.1 for a section. Cite the articles inside it, not the division, when a finding needs a legal basis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Division#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Division#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Division#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Division#getDivisions <em>Divisions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Division#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDivision()
 * @model
 * @generated
 */
@ProviderType
public interface Division extends Citable {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdpr.DivisionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this division is a chapter or a section within a chapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdpr.DivisionLevel
	 * @see #setLevel(DivisionLevel)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDivision_Level()
	 * @model
	 * @generated
	 */
	DivisionLevel getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Division#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdpr.DivisionLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(DivisionLevel value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The division's designation as printed, e.g. 'CHAPTER II' or 'Section 1'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDivision_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Division#getNumber <em>Number</em>}' attribute.
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
	 * The division's title, e.g. 'Principles' or 'Rights of the data subject'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDivision_Heading()
	 * @model
	 * @generated
	 */
	String getHeading();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Division#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(String value);

	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sections contained in this chapter. A chapter that has sections holds its articles in them, so its own articles list is empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDivision_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Division> getDivisions();

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Articles held directly by this division.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getDivision_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticles();

} // Division
