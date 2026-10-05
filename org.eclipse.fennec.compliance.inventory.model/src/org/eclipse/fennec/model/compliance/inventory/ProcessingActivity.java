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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One record of processing activities (GDPR Art. 30).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getController <em>Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getLawfulBases <em>Lawful Bases</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getDataCategories <em>Data Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getDataSubjects <em>Data Subjects</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getThirdCountryTransfers <em>Third Country Transfers</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRetention <em>Retention</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRetentionRules <em>Retention Rules</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity()
 * @model
 * @generated
 */
@ProviderType
public interface ProcessingActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures and processing activities, so references are written by id and survive reordering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Purpose of the processing (Art. 5(1)(b)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controller, joint controllers or processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Controller()
	 * @model
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Lawful Bases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawful bases, from the lawful-basis taxonomy of the GDPR context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lawful Bases</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_LawfulBases()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getLawfulBases();

	/**
	 * Returns the value of the '<em><b>Data Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categories of personal data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Categories</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_DataCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getDataCategories();

	/**
	 * Returns the value of the '<em><b>Data Subjects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categories of data subjects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Subjects</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_DataSubjects()
	 * @model
	 * @generated
	 */
	EList<String> getDataSubjects();

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categories of recipients.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipients</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Recipients()
	 * @model
	 * @generated
	 */
	EList<String> getRecipients();

	/**
	 * Returns the value of the '<em><b>Third Country Transfers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transfers to third countries and the safeguards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Third Country Transfers</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_ThirdCountryTransfers()
	 * @model
	 * @generated
	 */
	EList<String> getThirdCountryTransfers();

	/**
	 * Returns the value of the '<em><b>Retention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retention periods as a human-readable summary. The checkable form is retentionRules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retention</em>' attribute.
	 * @see #setRetention(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Retention()
	 * @model
	 * @generated
	 */
	String getRetention();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRetention <em>Retention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention</em>' attribute.
	 * @see #getRetention()
	 * @generated
	 */
	void setRetention(String value);

	/**
	 * Returns the value of the '<em><b>Retention Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.RetentionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structured retention rules, one per group of data categories with the same period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retention Rules</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_RetentionRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<RetentionRule> getRetentionRules();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EPackages and transformations whose reviews belong to the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceRef> getModels();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assets involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measures protecting the processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measures</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Measures()
	 * @model
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Aspect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context-specific extensions, e.g. a DPIA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProcessingActivity_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aspect> getAspects();

} // ProcessingActivity
