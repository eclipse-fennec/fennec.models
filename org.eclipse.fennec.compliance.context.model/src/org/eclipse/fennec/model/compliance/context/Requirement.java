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
package org.eclipse.fennec.model.compliance.context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.model.compliance.corpus.Citable;
import org.eclipse.fennec.model.compliance.corpus.Property;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One requirement of a context: what an inventory has to satisfy. For an OSCAL catalog it maps 1:1 to a control; for legal texts and technical documents it is derived and confirmed by a person. Measures, applicability and findings refer to it by context id and requirement id.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getCites <em>Cites</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedBy <em>Confirmed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedAt <em>Confirmed At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement()
 * @model
 * @generated
 */
@ProviderType
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier, unique within the context, e.g. KONF.1.1, A.5.1, GDPR-32-1-a. EMF ID, so references to it inside the context XMI are written by id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short title. For copyrighted sources (ISO 27001) our own title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What is required. For copyrighted sources a paraphrase or empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the requirement is usually met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guidance</em>' attribute.
	 * @see #setGuidance(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Guidance()
	 * @model
	 * @generated
	 */
	String getGuidance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getGuidance <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance</em>' attribute.
	 * @see #getGuidance()
	 * @generated
	 */
	void setGuidance(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level or obligation, e.g. normal-SdT / erhoeht (Grundschutz++), MUSS / SOLL (TR).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Cites</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Citable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The corpus units this requirement is based on. Empty for a context without corpus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cites</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Cites()
	 * @model
	 * @generated
	 */
	EList<Citable> getCites();

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The categories (e.g. BSI target object types) the requirement applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_AppliesTo()
	 * @model
	 * @generated
	 */
	EList<Category> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further properties, e.g. effort level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start of validity as ISO-8601 date, if the requirement is time bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_ValidFrom()
	 * @model
	 * @generated
	 */
	String getValidFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(String value);

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End of validity as ISO-8601 date or year, e.g. 2031 for a mechanism of TR-02102. A measure relying on it becomes a finding after that date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Until</em>' attribute.
	 * @see #setValidUntil(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_ValidUntil()
	 * @model
	 * @generated
	 */
	String getValidUntil();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getValidUntil <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' attribute.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.context.Origin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the requirement comes from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.Origin
	 * @see #setOrigin(Origin)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_Origin()
	 * @model
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.Origin
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

	/**
	 * Returns the value of the '<em><b>Confirmed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who confirmed a derived requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confirmed By</em>' attribute.
	 * @see #setConfirmedBy(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_ConfirmedBy()
	 * @model
	 * @generated
	 */
	String getConfirmedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedBy <em>Confirmed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmed By</em>' attribute.
	 * @see #getConfirmedBy()
	 * @generated
	 */
	void setConfirmedBy(String value);

	/**
	 * Returns the value of the '<em><b>Confirmed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When it was confirmed, as ISO-8601 date-time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confirmed At</em>' attribute.
	 * @see #setConfirmedAt(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirement_ConfirmedAt()
	 * @model
	 * @generated
	 */
	String getConfirmedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedAt <em>Confirmed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmed At</em>' attribute.
	 * @see #getConfirmedAt()
	 * @generated
	 */
	void setConfirmedAt(String value);

} // Requirement
