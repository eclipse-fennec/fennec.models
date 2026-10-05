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
 * A representation of the model object '<em><b>Retention Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One retention rule of a processing activity: how long which data is kept, when the period starts, what happens at its end, and which measure enforces it. Makes storage limitation (GDPR Art. 5(1)(e)) and erasure (Art. 17) checkable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getDataCategories <em>Data Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getTriggerDescription <em>Trigger Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getLegalReference <em>Legal Reference</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getEnforcedBy <em>Enforced By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule()
 * @model
 * @generated
 */
@ProviderType
public interface RetentionRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures, processing activities and other retention rules; a prefix such as ret: avoids collisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Data Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which data the rule covers, from the data-category taxonomy of the GDPR context. Empty means all data of the processing activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Categories</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_DataCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getDataCategories();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retention period as an ISO 8601 duration, e.g. P30D, P24M, P10Y; maps to java.time.Period or Duration. Empty only with trigger INDEFINITE. The format is checked by validation, not by the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_Period()
	 * @model
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.RetentionTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the period starts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.RetentionTrigger
	 * @see #setTrigger(RetentionTrigger)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_Trigger()
	 * @model required="true"
	 * @generated
	 */
	RetentionTrigger getTrigger();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.RetentionTrigger
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(RetentionTrigger value);

	/**
	 * Returns the value of the '<em><b>Trigger Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concrete event that starts the period, for trigger EVENT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Description</em>' attribute.
	 * @see #setTriggerDescription(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_TriggerDescription()
	 * @model
	 * @generated
	 */
	String getTriggerDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getTriggerDescription <em>Trigger Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Description</em>' attribute.
	 * @see #getTriggerDescription()
	 * @generated
	 */
	void setTriggerDescription(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.RetentionAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What happens to the data when the period ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.RetentionAction
	 * @see #setAction(RetentionAction)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_Action()
	 * @model required="true"
	 * @generated
	 */
	RetentionAction getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.RetentionAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(RetentionAction value);

	/**
	 * Returns the value of the '<em><b>Legal Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legal basis for the period, e.g. "§ 257 HGB", "§ 147 AO", "Art. 17(3)(b) GDPR". Free text, because these laws are not contexts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Reference</em>' attribute.
	 * @see #setLegalReference(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_LegalReference()
	 * @model
	 * @generated
	 */
	String getLegalReference();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getLegalReference <em>Legal Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Reference</em>' attribute.
	 * @see #getLegalReference()
	 * @generated
	 */
	void setLegalReference(String value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why the period is necessary. Required in practice for trigger INDEFINITE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RetentionRule#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the data covered by the rule is stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Enforced By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measures (TOMs) that implement the action, e.g. a deletion job. A rule without one is reported as a finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enforced By</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionRule_EnforcedBy()
	 * @model
	 * @generated
	 */
	EList<Measure> getEnforcedBy();

} // RetentionRule
