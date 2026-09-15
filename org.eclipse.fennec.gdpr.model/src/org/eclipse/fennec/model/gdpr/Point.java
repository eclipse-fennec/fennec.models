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
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One item of a list, e.g. Article 9(2)(a). A point is a citable unit with its own text, which is why a finding can cite exactly one condition rather than a whole paragraph.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Point#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Point#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Point#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getPoint()
 * @model
 * @generated
 */
@ProviderType
public interface Point extends LegalUnit {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point's label as printed, including its brackets, e.g. (a) or (14). Null for items of an unlabelled dash list, which are cited positionally instead; see citationId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getPoint_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Point#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-points, where a point contains a further list. At most one level deeper in the GDPR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getPoint_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdpr.Definition#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition this point carries, for the 26 points of Article 4, and null for every other point. The reverse of Definition.definedIn, so a point that turns up in a search can say which term it defines without looking through the definitions for it. Not serialized; rebuilt from Definition.definedIn on load.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Definition)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getPoint_Definition()
	 * @see org.eclipse.fennec.model.gdpr.Definition#getDefinedIn
	 * @model opposite="definedIn" transient="true"
	 * @generated
	 */
	Definition getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Point#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Definition value);

} // Point
