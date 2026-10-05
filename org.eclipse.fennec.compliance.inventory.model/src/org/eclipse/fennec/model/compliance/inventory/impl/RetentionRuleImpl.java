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
package org.eclipse.fennec.model.compliance.inventory.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.CategoryRef;

import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.Measure;
import org.eclipse.fennec.model.compliance.inventory.RetentionAction;
import org.eclipse.fennec.model.compliance.inventory.RetentionRule;
import org.eclipse.fennec.model.compliance.inventory.RetentionTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retention Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getDataCategories <em>Data Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getTriggerDescription <em>Trigger Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getLegalReference <em>Legal Reference</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RetentionRuleImpl#getEnforcedBy <em>Enforced By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetentionRuleImpl extends MinimalEObjectImpl.Container implements RetentionRule {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataCategories() <em>Data Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRef> dataCategories;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected String period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionTrigger TRIGGER_EDEFAULT = RetentionTrigger.COLLECTION;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected RetentionTrigger trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerDescription() <em>Trigger Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerDescription() <em>Trigger Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerDescription()
	 * @generated
	 * @ordered
	 */
	protected String triggerDescription = TRIGGER_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionAction ACTION_EDEFAULT = RetentionAction.DELETE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected RetentionAction action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegalReference() <em>Legal Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGAL_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegalReference() <em>Legal Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalReference()
	 * @generated
	 * @ordered
	 */
	protected String legalReference = LEGAL_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getEnforcedBy() <em>Enforced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnforcedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> enforcedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetentionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.RETENTION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getDataCategories() {
		if (dataCategories == null) {
			dataCategories = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, InventoryPackage.RETENTION_RULE__DATA_CATEGORIES);
		}
		return dataCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(String newPeriod) {
		String oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetentionTrigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(RetentionTrigger newTrigger) {
		RetentionTrigger oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTriggerDescription() {
		return triggerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerDescription(String newTriggerDescription) {
		String oldTriggerDescription = triggerDescription;
		triggerDescription = newTriggerDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__TRIGGER_DESCRIPTION, oldTriggerDescription, triggerDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetentionAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(RetentionAction newAction) {
		RetentionAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLegalReference() {
		return legalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegalReference(String newLegalReference) {
		String oldLegalReference = legalReference;
		legalReference = newLegalReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__LEGAL_REFERENCE, oldLegalReference, legalReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		String oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.RETENTION_RULE__JUSTIFICATION, oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<Asset>(Asset.class, this, InventoryPackage.RETENTION_RULE__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Measure> getEnforcedBy() {
		if (enforcedBy == null) {
			enforcedBy = new EObjectResolvingEList<Measure>(Measure.class, this, InventoryPackage.RETENTION_RULE__ENFORCED_BY);
		}
		return enforcedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.RETENTION_RULE__DATA_CATEGORIES:
				return ((InternalEList<?>)getDataCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.RETENTION_RULE__ID:
				return getId();
			case InventoryPackage.RETENTION_RULE__DATA_CATEGORIES:
				return getDataCategories();
			case InventoryPackage.RETENTION_RULE__PERIOD:
				return getPeriod();
			case InventoryPackage.RETENTION_RULE__TRIGGER:
				return getTrigger();
			case InventoryPackage.RETENTION_RULE__TRIGGER_DESCRIPTION:
				return getTriggerDescription();
			case InventoryPackage.RETENTION_RULE__ACTION:
				return getAction();
			case InventoryPackage.RETENTION_RULE__LEGAL_REFERENCE:
				return getLegalReference();
			case InventoryPackage.RETENTION_RULE__JUSTIFICATION:
				return getJustification();
			case InventoryPackage.RETENTION_RULE__ASSETS:
				return getAssets();
			case InventoryPackage.RETENTION_RULE__ENFORCED_BY:
				return getEnforcedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.RETENTION_RULE__ID:
				setId((String)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__DATA_CATEGORIES:
				getDataCategories().clear();
				getDataCategories().addAll((Collection<? extends CategoryRef>)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__PERIOD:
				setPeriod((String)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__TRIGGER:
				setTrigger((RetentionTrigger)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__TRIGGER_DESCRIPTION:
				setTriggerDescription((String)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__ACTION:
				setAction((RetentionAction)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__LEGAL_REFERENCE:
				setLegalReference((String)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__JUSTIFICATION:
				setJustification((String)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InventoryPackage.RETENTION_RULE__ENFORCED_BY:
				getEnforcedBy().clear();
				getEnforcedBy().addAll((Collection<? extends Measure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InventoryPackage.RETENTION_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__DATA_CATEGORIES:
				getDataCategories().clear();
				return;
			case InventoryPackage.RETENTION_RULE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__TRIGGER_DESCRIPTION:
				setTriggerDescription(TRIGGER_DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__LEGAL_REFERENCE:
				setLegalReference(LEGAL_REFERENCE_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
				return;
			case InventoryPackage.RETENTION_RULE__ASSETS:
				getAssets().clear();
				return;
			case InventoryPackage.RETENTION_RULE__ENFORCED_BY:
				getEnforcedBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InventoryPackage.RETENTION_RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InventoryPackage.RETENTION_RULE__DATA_CATEGORIES:
				return dataCategories != null && !dataCategories.isEmpty();
			case InventoryPackage.RETENTION_RULE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case InventoryPackage.RETENTION_RULE__TRIGGER:
				return trigger != TRIGGER_EDEFAULT;
			case InventoryPackage.RETENTION_RULE__TRIGGER_DESCRIPTION:
				return TRIGGER_DESCRIPTION_EDEFAULT == null ? triggerDescription != null : !TRIGGER_DESCRIPTION_EDEFAULT.equals(triggerDescription);
			case InventoryPackage.RETENTION_RULE__ACTION:
				return action != ACTION_EDEFAULT;
			case InventoryPackage.RETENTION_RULE__LEGAL_REFERENCE:
				return LEGAL_REFERENCE_EDEFAULT == null ? legalReference != null : !LEGAL_REFERENCE_EDEFAULT.equals(legalReference);
			case InventoryPackage.RETENTION_RULE__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
			case InventoryPackage.RETENTION_RULE__ASSETS:
				return assets != null && !assets.isEmpty();
			case InventoryPackage.RETENTION_RULE__ENFORCED_BY:
				return enforcedBy != null && !enforcedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", period: ");
		result.append(period);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", triggerDescription: ");
		result.append(triggerDescription);
		result.append(", action: ");
		result.append(action);
		result.append(", legalReference: ");
		result.append(legalReference);
		result.append(", justification: ");
		result.append(justification);
		result.append(')');
		return result.toString();
	}

} //RetentionRuleImpl
