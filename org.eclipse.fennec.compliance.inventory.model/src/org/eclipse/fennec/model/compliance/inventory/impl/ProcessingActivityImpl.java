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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.CategoryRef;

import org.eclipse.fennec.model.compliance.inventory.Aspect;
import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.Measure;
import org.eclipse.fennec.model.compliance.inventory.ProcessingActivity;
import org.eclipse.fennec.model.compliance.inventory.RetentionRule;
import org.eclipse.fennec.model.compliance.inventory.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getController <em>Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getLawfulBases <em>Lawful Bases</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getDataCategories <em>Data Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getDataSubjects <em>Data Subjects</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getThirdCountryTransfers <em>Third Country Transfers</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getRetention <em>Retention</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getRetentionRules <em>Retention Rules</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingActivityImpl extends MinimalEObjectImpl.Container implements ProcessingActivity {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected String controller = CONTROLLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLawfulBases() <em>Lawful Bases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLawfulBases()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRef> lawfulBases;

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
	 * The cached value of the '{@link #getDataSubjects() <em>Data Subjects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataSubjects;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recipients;

	/**
	 * The cached value of the '{@link #getThirdCountryTransfers() <em>Third Country Transfers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdCountryTransfers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> thirdCountryTransfers;

	/**
	 * The default value of the '{@link #getRetention() <em>Retention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention()
	 * @generated
	 * @ordered
	 */
	protected static final String RETENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetention() <em>Retention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention()
	 * @generated
	 * @ordered
	 */
	protected String retention = RETENTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRetentionRules() <em>Retention Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionRules()
	 * @generated
	 * @ordered
	 */
	protected EList<RetentionRule> retentionRules;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> models;

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
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> aspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.PROCESSING_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROCESSING_ACTIVITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROCESSING_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROCESSING_ACTIVITY__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(String newController) {
		String oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROCESSING_ACTIVITY__CONTROLLER, oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getLawfulBases() {
		if (lawfulBases == null) {
			lawfulBases = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, InventoryPackage.PROCESSING_ACTIVITY__LAWFUL_BASES);
		}
		return lawfulBases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getDataCategories() {
		if (dataCategories == null) {
			dataCategories = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, InventoryPackage.PROCESSING_ACTIVITY__DATA_CATEGORIES);
		}
		return dataCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDataSubjects() {
		if (dataSubjects == null) {
			dataSubjects = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.PROCESSING_ACTIVITY__DATA_SUBJECTS);
		}
		return dataSubjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRecipients() {
		if (recipients == null) {
			recipients = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.PROCESSING_ACTIVITY__RECIPIENTS);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getThirdCountryTransfers() {
		if (thirdCountryTransfers == null) {
			thirdCountryTransfers = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS);
		}
		return thirdCountryTransfers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetention() {
		return retention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetention(String newRetention) {
		String oldRetention = retention;
		retention = newRetention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROCESSING_ACTIVITY__RETENTION, oldRetention, retention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RetentionRule> getRetentionRules() {
		if (retentionRules == null) {
			retentionRules = new EObjectContainmentEList<RetentionRule>(RetentionRule.class, this, InventoryPackage.PROCESSING_ACTIVITY__RETENTION_RULES);
		}
		return retentionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceRef> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, InventoryPackage.PROCESSING_ACTIVITY__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<Asset>(Asset.class, this, InventoryPackage.PROCESSING_ACTIVITY__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectResolvingEList<Measure>(Measure.class, this, InventoryPackage.PROCESSING_ACTIVITY__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, InventoryPackage.PROCESSING_ACTIVITY__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.PROCESSING_ACTIVITY__LAWFUL_BASES:
				return ((InternalEList<?>)getLawfulBases()).basicRemove(otherEnd, msgs);
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_CATEGORIES:
				return ((InternalEList<?>)getDataCategories()).basicRemove(otherEnd, msgs);
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION_RULES:
				return ((InternalEList<?>)getRetentionRules()).basicRemove(otherEnd, msgs);
			case InventoryPackage.PROCESSING_ACTIVITY__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case InventoryPackage.PROCESSING_ACTIVITY__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.PROCESSING_ACTIVITY__ID:
				return getId();
			case InventoryPackage.PROCESSING_ACTIVITY__NAME:
				return getName();
			case InventoryPackage.PROCESSING_ACTIVITY__PURPOSE:
				return getPurpose();
			case InventoryPackage.PROCESSING_ACTIVITY__CONTROLLER:
				return getController();
			case InventoryPackage.PROCESSING_ACTIVITY__LAWFUL_BASES:
				return getLawfulBases();
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_CATEGORIES:
				return getDataCategories();
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_SUBJECTS:
				return getDataSubjects();
			case InventoryPackage.PROCESSING_ACTIVITY__RECIPIENTS:
				return getRecipients();
			case InventoryPackage.PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS:
				return getThirdCountryTransfers();
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION:
				return getRetention();
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION_RULES:
				return getRetentionRules();
			case InventoryPackage.PROCESSING_ACTIVITY__MODELS:
				return getModels();
			case InventoryPackage.PROCESSING_ACTIVITY__ASSETS:
				return getAssets();
			case InventoryPackage.PROCESSING_ACTIVITY__MEASURES:
				return getMeasures();
			case InventoryPackage.PROCESSING_ACTIVITY__ASPECTS:
				return getAspects();
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
			case InventoryPackage.PROCESSING_ACTIVITY__ID:
				setId((String)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__PURPOSE:
				setPurpose((String)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__CONTROLLER:
				setController((String)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__LAWFUL_BASES:
				getLawfulBases().clear();
				getLawfulBases().addAll((Collection<? extends CategoryRef>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_CATEGORIES:
				getDataCategories().clear();
				getDataCategories().addAll((Collection<? extends CategoryRef>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_SUBJECTS:
				getDataSubjects().clear();
				getDataSubjects().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__RECIPIENTS:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS:
				getThirdCountryTransfers().clear();
				getThirdCountryTransfers().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION:
				setRetention((String)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION_RULES:
				getRetentionRules().clear();
				getRetentionRules().addAll((Collection<? extends RetentionRule>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends Aspect>)newValue);
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
			case InventoryPackage.PROCESSING_ACTIVITY__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__CONTROLLER:
				setController(CONTROLLER_EDEFAULT);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__LAWFUL_BASES:
				getLawfulBases().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_CATEGORIES:
				getDataCategories().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_SUBJECTS:
				getDataSubjects().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__RECIPIENTS:
				getRecipients().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS:
				getThirdCountryTransfers().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION:
				setRetention(RETENTION_EDEFAULT);
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION_RULES:
				getRetentionRules().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__MODELS:
				getModels().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__ASSETS:
				getAssets().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__MEASURES:
				getMeasures().clear();
				return;
			case InventoryPackage.PROCESSING_ACTIVITY__ASPECTS:
				getAspects().clear();
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
			case InventoryPackage.PROCESSING_ACTIVITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InventoryPackage.PROCESSING_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InventoryPackage.PROCESSING_ACTIVITY__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case InventoryPackage.PROCESSING_ACTIVITY__CONTROLLER:
				return CONTROLLER_EDEFAULT == null ? controller != null : !CONTROLLER_EDEFAULT.equals(controller);
			case InventoryPackage.PROCESSING_ACTIVITY__LAWFUL_BASES:
				return lawfulBases != null && !lawfulBases.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_CATEGORIES:
				return dataCategories != null && !dataCategories.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__DATA_SUBJECTS:
				return dataSubjects != null && !dataSubjects.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__RECIPIENTS:
				return recipients != null && !recipients.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS:
				return thirdCountryTransfers != null && !thirdCountryTransfers.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION:
				return RETENTION_EDEFAULT == null ? retention != null : !RETENTION_EDEFAULT.equals(retention);
			case InventoryPackage.PROCESSING_ACTIVITY__RETENTION_RULES:
				return retentionRules != null && !retentionRules.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__MODELS:
				return models != null && !models.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__ASSETS:
				return assets != null && !assets.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__MEASURES:
				return measures != null && !measures.isEmpty();
			case InventoryPackage.PROCESSING_ACTIVITY__ASPECTS:
				return aspects != null && !aspects.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", controller: ");
		result.append(controller);
		result.append(", dataSubjects: ");
		result.append(dataSubjects);
		result.append(", recipients: ");
		result.append(recipients);
		result.append(", thirdCountryTransfers: ");
		result.append(thirdCountryTransfers);
		result.append(", retention: ");
		result.append(retention);
		result.append(')');
		return result.toString();
	}

} //ProcessingActivityImpl
