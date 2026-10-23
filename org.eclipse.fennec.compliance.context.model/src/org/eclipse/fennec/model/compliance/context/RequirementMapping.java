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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One mapping between a requirement of the source context and one of the target context. Coverage derived through it counts automatically only for EQUIVALENT and SUPERSET.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getSourceRequirementId <em>Source Requirement Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getTargetRequirementId <em>Target Requirement Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedBy <em>Confirmed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedAt <em>Confirmed At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping()
 * @model
 * @generated
 */
@ProviderType
public interface RequirementMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirement id in the source context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Requirement Id</em>' attribute.
	 * @see #setSourceRequirementId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_SourceRequirementId()
	 * @model required="true"
	 * @generated
	 */
	String getSourceRequirementId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getSourceRequirementId <em>Source Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Requirement Id</em>' attribute.
	 * @see #getSourceRequirementId()
	 * @generated
	 */
	void setSourceRequirementId(String value);

	/**
	 * Returns the value of the '<em><b>Target Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirement id in the target context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Requirement Id</em>' attribute.
	 * @see #setTargetRequirementId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_TargetRequirementId()
	 * @model required="true"
	 * @generated
	 */
	String getTargetRequirementId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getTargetRequirementId <em>Target Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Requirement Id</em>' attribute.
	 * @see #getTargetRequirementId()
	 * @generated
	 */
	void setTargetRequirementId(String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.context.MappingRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How source relates to target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.MappingRelationship
	 * @see #setRelationship(MappingRelationship)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_Relationship()
	 * @model required="true"
	 * @generated
	 */
	MappingRelationship getRelationship();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.MappingRelationship
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(MappingRelationship value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanation, e.g. which aspect of the target is not covered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.context.Origin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the mapping comes from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.Origin
	 * @see #setOrigin(Origin)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_Origin()
	 * @model
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getOrigin <em>Origin</em>}' attribute.
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
	 * Who confirmed a derived mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confirmed By</em>' attribute.
	 * @see #setConfirmedBy(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_ConfirmedBy()
	 * @model
	 * @generated
	 */
	String getConfirmedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedBy <em>Confirmed By</em>}' attribute.
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
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getRequirementMapping_ConfirmedAt()
	 * @model
	 * @generated
	 */
	String getConfirmedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedAt <em>Confirmed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmed At</em>' attribute.
	 * @see #getConfirmedAt()
	 * @generated
	 */
	void setConfirmedAt(String value);

} // RequirementMapping
