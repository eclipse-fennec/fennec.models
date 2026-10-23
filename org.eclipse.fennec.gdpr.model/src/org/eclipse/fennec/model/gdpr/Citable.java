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
 * A representation of the model object '<em><b>Citable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract supertype for anything the act can cite by identifier. Two kinds of thing qualify and they are deliberately different: a LegalUnit has text and can be a legal basis, while a Division is only a place in the structure. Both need an identifier because the act cites both -- provisions constantly, chapters occasionally ("the safeguards referred to in Chapter IX"). Keeping them apart under one citable supertype is what lets CrossReference.target point at either without pretending a chapter is a provision.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Citable#getCitationId <em>Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Citable#getCites <em>Cites</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.Citable#getCitedBy <em>Cited By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCitable()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Citable extends EObject {
	/**
	 * Returns the value of the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stable identifier of this unit and the key everything else cites it by. Grammar: Art.9, Art.9(2), Art.9(2)(a), Rec.26, and Art.53(1)[1] for positionally cited items in an unlabelled dash list. Marked as an EMF ID, so a unit can be fetched directly with Resource.getEObject(citationId). Never construct one by guessing: many plausible identifiers do not exist, for example Article 16 and Article 10 have no numbered paragraphs at all, so Art.16(1) is not a valid unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation Id</em>' attribute.
	 * @see #setCitationId(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCitable_CitationId()
	 * @model id="true"
	 * @generated
	 */
	String getCitationId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.Citable#getCitationId <em>Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation Id</em>' attribute.
	 * @see #getCitationId()
	 * @generated
	 */
	void setCitationId(String value);

	/**
	 * Returns the value of the '<em><b>Cites</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.CrossReference}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdpr.CrossReference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every citation made in this citable's own text, one entry per occurrence. The reverse of CrossReference.source. Not serialized: the act holds the occurrences and this side is rebuilt from them when the model is loaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cites</em>' reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCitable_Cites()
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getSource
	 * @model opposite="source" transient="true"
	 * @generated
	 */
	EList<CrossReference> getCites();

	/**
	 * Returns the value of the '<em><b>Cited By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdpr.CrossReference}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdpr.CrossReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every citation of this citable made elsewhere in the act, one entry per occurrence. The reverse of CrossReference.target, and the direction most questions about a provision take -- what else turns on Article 9 -- which the act's flat list of occurrences cannot answer without scanning all of it. Only citations internal to this act appear here: a citation of another instrument is never resolved against it and so has no target. Not serialized; rebuilt from the occurrences on load.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cited By</em>' reference list.
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCitable_CitedBy()
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getTarget
	 * @model opposite="target" transient="true"
	 * @generated
	 */
	EList<CrossReference> getCitedBy();

} // Citable
