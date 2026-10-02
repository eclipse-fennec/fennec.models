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
import org.eclipse.fennec.model.compliance.context.RequirementRef;

import org.eclipse.fennec.model.compliance.inventory.Aspect;
import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.ImplementationStatus;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.Measure;
import org.eclipse.fennec.model.compliance.inventory.MeasureKind;
import org.eclipse.fennec.model.compliance.inventory.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getReviewedAt <em>Reviewed At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends MinimalEObjectImpl.Container implements Measure {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MeasureKind KIND_EDEFAULT = MeasureKind.TECHNICAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected MeasureKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRef> categories;

	/**
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementRef> satisfies;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> appliesTo;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationStatus STATUS_EDEFAULT = ImplementationStatus.PLANNED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ImplementationStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected String responsible = RESPONSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewedAt() <em>Reviewed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEWED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewedAt() <em>Reviewed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewedAt()
	 * @generated
	 * @ordered
	 */
	protected String reviewedAt = REVIEWED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> evidence;

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
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.MEASURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(MeasureKind newKind) {
		MeasureKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, InventoryPackage.MEASURE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementRef> getSatisfies() {
		if (satisfies == null) {
			satisfies = new EObjectContainmentEList<RequirementRef>(RequirementRef.class, this, InventoryPackage.MEASURE__SATISFIES);
		}
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectResolvingEList<Asset>(Asset.class, this, InventoryPackage.MEASURE__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ImplementationStatus newStatus) {
		ImplementationStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsible(String newResponsible) {
		String oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReviewedAt() {
		return reviewedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewedAt(String newReviewedAt) {
		String oldReviewedAt = reviewedAt;
		reviewedAt = newReviewedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__REVIEWED_AT, oldReviewedAt, reviewedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.MEASURE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceRef> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, InventoryPackage.MEASURE__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, InventoryPackage.MEASURE__ASPECTS);
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
			case InventoryPackage.MEASURE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case InventoryPackage.MEASURE__SATISFIES:
				return ((InternalEList<?>)getSatisfies()).basicRemove(otherEnd, msgs);
			case InventoryPackage.MEASURE__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case InventoryPackage.MEASURE__ASPECTS:
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
			case InventoryPackage.MEASURE__ID:
				return getId();
			case InventoryPackage.MEASURE__TITLE:
				return getTitle();
			case InventoryPackage.MEASURE__DESCRIPTION:
				return getDescription();
			case InventoryPackage.MEASURE__KIND:
				return getKind();
			case InventoryPackage.MEASURE__CATEGORIES:
				return getCategories();
			case InventoryPackage.MEASURE__SATISFIES:
				return getSatisfies();
			case InventoryPackage.MEASURE__APPLIES_TO:
				return getAppliesTo();
			case InventoryPackage.MEASURE__STATUS:
				return getStatus();
			case InventoryPackage.MEASURE__RESPONSIBLE:
				return getResponsible();
			case InventoryPackage.MEASURE__REVIEWED_AT:
				return getReviewedAt();
			case InventoryPackage.MEASURE__DUE_DATE:
				return getDueDate();
			case InventoryPackage.MEASURE__EVIDENCE:
				return getEvidence();
			case InventoryPackage.MEASURE__ASPECTS:
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
			case InventoryPackage.MEASURE__ID:
				setId((String)newValue);
				return;
			case InventoryPackage.MEASURE__TITLE:
				setTitle((String)newValue);
				return;
			case InventoryPackage.MEASURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.MEASURE__KIND:
				setKind((MeasureKind)newValue);
				return;
			case InventoryPackage.MEASURE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CategoryRef>)newValue);
				return;
			case InventoryPackage.MEASURE__SATISFIES:
				getSatisfies().clear();
				getSatisfies().addAll((Collection<? extends RequirementRef>)newValue);
				return;
			case InventoryPackage.MEASURE__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends Asset>)newValue);
				return;
			case InventoryPackage.MEASURE__STATUS:
				setStatus((ImplementationStatus)newValue);
				return;
			case InventoryPackage.MEASURE__RESPONSIBLE:
				setResponsible((String)newValue);
				return;
			case InventoryPackage.MEASURE__REVIEWED_AT:
				setReviewedAt((String)newValue);
				return;
			case InventoryPackage.MEASURE__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case InventoryPackage.MEASURE__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case InventoryPackage.MEASURE__ASPECTS:
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
			case InventoryPackage.MEASURE__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__CATEGORIES:
				getCategories().clear();
				return;
			case InventoryPackage.MEASURE__SATISFIES:
				getSatisfies().clear();
				return;
			case InventoryPackage.MEASURE__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case InventoryPackage.MEASURE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__RESPONSIBLE:
				setResponsible(RESPONSIBLE_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__REVIEWED_AT:
				setReviewedAt(REVIEWED_AT_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case InventoryPackage.MEASURE__EVIDENCE:
				getEvidence().clear();
				return;
			case InventoryPackage.MEASURE__ASPECTS:
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
			case InventoryPackage.MEASURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InventoryPackage.MEASURE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case InventoryPackage.MEASURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.MEASURE__KIND:
				return kind != KIND_EDEFAULT;
			case InventoryPackage.MEASURE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case InventoryPackage.MEASURE__SATISFIES:
				return satisfies != null && !satisfies.isEmpty();
			case InventoryPackage.MEASURE__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case InventoryPackage.MEASURE__STATUS:
				return status != STATUS_EDEFAULT;
			case InventoryPackage.MEASURE__RESPONSIBLE:
				return RESPONSIBLE_EDEFAULT == null ? responsible != null : !RESPONSIBLE_EDEFAULT.equals(responsible);
			case InventoryPackage.MEASURE__REVIEWED_AT:
				return REVIEWED_AT_EDEFAULT == null ? reviewedAt != null : !REVIEWED_AT_EDEFAULT.equals(reviewedAt);
			case InventoryPackage.MEASURE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case InventoryPackage.MEASURE__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case InventoryPackage.MEASURE__ASPECTS:
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
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", kind: ");
		result.append(kind);
		result.append(", status: ");
		result.append(status);
		result.append(", responsible: ");
		result.append(responsible);
		result.append(", reviewedAt: ");
		result.append(reviewedAt);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
