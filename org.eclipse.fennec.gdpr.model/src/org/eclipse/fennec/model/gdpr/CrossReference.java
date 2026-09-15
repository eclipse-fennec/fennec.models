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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One citation occurrence found in the text of a unit. Occurrences are recorded separately rather than deduplicated, so the same target may appear many times with different sources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#getRawText <em>Raw Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#getTargetCitationId <em>Target Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#isExternal <em>External</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.CrossReference#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference()
 * @model
 * @generated
 */
@ProviderType
public interface CrossReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdpr.Citable#getCites <em>Cites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit whose text contains the citation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Citable)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_Source()
	 * @see org.eclipse.fennec.model.gdpr.Citable#getCites
	 * @model opposite="cites" resolveProxies="false"
	 * @generated
	 */
	Citable getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Citable value);

	/**
	 * Returns the value of the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The citation exactly as it appears in the text, e.g. 'Article 9(2)' or 'paragraph 1'. Kept so a resolution can be checked against the wording that produced it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raw Text</em>' attribute.
	 * @see #setRawText(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_RawText()
	 * @model
	 * @generated
	 */
	String getRawText();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#getRawText <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Text</em>' attribute.
	 * @see #getRawText()
	 * @generated
	 */
	void setRawText(String value);

	/**
	 * Returns the value of the '<em><b>Target Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The citationId this reference was resolved to. Populated even when the target could not be found, so an unresolved reference still says what was looked for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Citation Id</em>' attribute.
	 * @see #setTargetCitationId(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_TargetCitationId()
	 * @model
	 * @generated
	 */
	String getTargetCitationId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#getTargetCitationId <em>Target Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Citation Id</em>' attribute.
	 * @see #getTargetCitationId()
	 * @generated
	 */
	void setTargetCitationId(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdpr.Citable#getCitedBy <em>Cited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced unit, set only when resolution succeeded and the reference is internal to this act. Usually a LegalUnit; a Division when the act cites a chapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Citable)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_Target()
	 * @see org.eclipse.fennec.model.gdpr.Citable#getCitedBy
	 * @model opposite="citedBy" resolveProxies="false"
	 * @generated
	 */
	Citable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Citable value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when target was found. False means either the reference is external or the identifier does not exist in this act; check external before treating it as a defect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_Resolved()
	 * @model
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True for a reference written relative to its own article, e.g. 'paragraph 1' inside Article 9 meaning Article 9(1). The same wording in another article means something else, which is why resolution needs the containing article.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative</em>' attribute.
	 * @see #setRelative(boolean)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_Relative()
	 * @model
	 * @generated
	 */
	boolean isRelative();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#isRelative <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative</em>' attribute.
	 * @see #isRelative()
	 * @generated
	 */
	void setRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when the citation belongs to a different instrument and must not be resolved against this act. Important because such a reference often resolves to a real but wrong unit: 'Articles 12 to 15 of that Directive' would otherwise silently become Articles 12 to 15 of this Regulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which other instrument an external citation belongs to, e.g. TFEU, Directive, Charter or 'other Regulation'. Null for an internal reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instrument</em>' attribute.
	 * @see #setInstrument(String)
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#getCrossReference_Instrument()
	 * @model
	 * @generated
	 */
	String getInstrument();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdpr.CrossReference#getInstrument <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' attribute.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(String value);

} // CrossReference
