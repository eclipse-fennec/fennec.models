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
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One numbered paragraph of an article.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Paragraph#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Paragraph#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getParagraph()
 * @model
 * @generated
 */
@ProviderType
public interface Paragraph extends LegalUnit {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The paragraph number as printed, e.g. 2 for Article 9(2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getParagraph_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Paragraph#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The paragraph's lettered points, in order, each a citable unit in its own right.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getParagraph_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Paragraph
