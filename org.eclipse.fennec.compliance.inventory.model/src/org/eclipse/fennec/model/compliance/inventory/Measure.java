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
package org.eclipse.fennec.model.compliance.inventory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.model.compliance.context.CategoryRef;
import org.eclipse.fennec.model.compliance.context.RequirementRef;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A technical or organisational measure (TOM). One measure can satisfy requirements of several contexts at once; applicability is not a property of the measure but of the requirement (RequirementApplicability).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getReviewedAt <em>Reviewed At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.Measure#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure()
 * @model
 * @generated
 */
@ProviderType
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures and processing activities, so references are written by id and survive reordering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getId <em>Id</em>}' attribute.
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
	 * Title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What is done.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.MeasureKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical or organisational.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.MeasureKind
	 * @see #setKind(MeasureKind)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Kind()
	 * @model
	 * @generated
	 */
	MeasureKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.MeasureKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MeasureKind value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification, e.g. the GDPR Art. 32 aspects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getCategories();

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.RequirementRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements the measure satisfies directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfies</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Satisfies()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementRef> getSatisfies();

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assets the measure protects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_AppliesTo()
	 * @model
	 * @generated
	 */
	EList<Asset> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.ImplementationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Implementation status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
	 * @see #setStatus(ImplementationStatus)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Status()
	 * @model
	 * @generated
	 */
	ImplementationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImplementationStatus value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsible role or person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' attribute.
	 * @see #setResponsible(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Responsible()
	 * @model
	 * @generated
	 */
	String getResponsible();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getResponsible <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' attribute.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(String value);

	/**
	 * Returns the value of the '<em><b>Reviewed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last review, as ISO-8601 date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reviewed At</em>' attribute.
	 * @see #setReviewedAt(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_ReviewedAt()
	 * @model
	 * @generated
	 */
	String getReviewedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getReviewedAt <em>Reviewed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewed At</em>' attribute.
	 * @see #getReviewedAt()
	 * @generated
	 */
	void setReviewedAt(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planned completion, as ISO-8601 date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_DueDate()
	 * @model
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence of implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceRef> getEvidence();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Aspect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context-specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasure_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aspect> getAspects();

} // Measure
