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
package org.eclipse.fennec.model.compliance.context.impl;

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

import org.eclipse.fennec.model.compliance.context.Category;
import org.eclipse.fennec.model.compliance.context.ContextPackage;
import org.eclipse.fennec.model.compliance.context.Origin;
import org.eclipse.fennec.model.compliance.context.Requirement;

import org.eclipse.fennec.model.compliance.corpus.Citable;
import org.eclipse.fennec.model.compliance.corpus.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getCites <em>Cites</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getConfirmedBy <em>Confirmed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl#getConfirmedAt <em>Confirmed At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
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
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuidance() <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected static final String GUIDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected String guidance = GUIDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCites() <em>Cites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCites()
	 * @generated
	 * @ordered
	 */
	protected EList<Citable> cites;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> appliesTo;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected String validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected String validUntil = VALID_UNTIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Origin ORIGIN_EDEFAULT = Origin.SOURCE;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Origin origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfirmedBy() <em>Confirmed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRMED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmedBy() <em>Confirmed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedBy()
	 * @generated
	 * @ordered
	 */
	protected String confirmedBy = CONFIRMED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfirmedAt() <em>Confirmed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRMED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmedAt() <em>Confirmed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedAt()
	 * @generated
	 * @ordered
	 */
	protected String confirmedAt = CONFIRMED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuidance() {
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuidance(String newGuidance) {
		String oldGuidance = guidance;
		guidance = newGuidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__GUIDANCE, oldGuidance, guidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Citable> getCites() {
		if (cites == null) {
			cites = new EObjectResolvingEList<Citable>(Citable.class, this, ContextPackage.REQUIREMENT__CITES);
		}
		return cites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectResolvingEList<Category>(Category.class, this, ContextPackage.REQUIREMENT__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ContextPackage.REQUIREMENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFrom(String newValidFrom) {
		String oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidUntil(String newValidUntil) {
		String oldValidUntil = validUntil;
		validUntil = newValidUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__VALID_UNTIL, oldValidUntil, validUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Origin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Origin newOrigin) {
		Origin oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmedBy() {
		return confirmedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmedBy(String newConfirmedBy) {
		String oldConfirmedBy = confirmedBy;
		confirmedBy = newConfirmedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__CONFIRMED_BY, oldConfirmedBy, confirmedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmedAt() {
		return confirmedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmedAt(String newConfirmedAt) {
		String oldConfirmedAt = confirmedAt;
		confirmedAt = newConfirmedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT__CONFIRMED_AT, oldConfirmedAt, confirmedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.REQUIREMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.REQUIREMENT__ID:
				return getId();
			case ContextPackage.REQUIREMENT__TITLE:
				return getTitle();
			case ContextPackage.REQUIREMENT__STATEMENT:
				return getStatement();
			case ContextPackage.REQUIREMENT__GUIDANCE:
				return getGuidance();
			case ContextPackage.REQUIREMENT__LEVEL:
				return getLevel();
			case ContextPackage.REQUIREMENT__CITES:
				return getCites();
			case ContextPackage.REQUIREMENT__APPLIES_TO:
				return getAppliesTo();
			case ContextPackage.REQUIREMENT__PROPERTIES:
				return getProperties();
			case ContextPackage.REQUIREMENT__VALID_FROM:
				return getValidFrom();
			case ContextPackage.REQUIREMENT__VALID_UNTIL:
				return getValidUntil();
			case ContextPackage.REQUIREMENT__ORIGIN:
				return getOrigin();
			case ContextPackage.REQUIREMENT__CONFIRMED_BY:
				return getConfirmedBy();
			case ContextPackage.REQUIREMENT__CONFIRMED_AT:
				return getConfirmedAt();
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
			case ContextPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__TITLE:
				setTitle((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__STATEMENT:
				setStatement((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__GUIDANCE:
				setGuidance((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__LEVEL:
				setLevel((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__CITES:
				getCites().clear();
				getCites().addAll((Collection<? extends Citable>)newValue);
				return;
			case ContextPackage.REQUIREMENT__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends Category>)newValue);
				return;
			case ContextPackage.REQUIREMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ContextPackage.REQUIREMENT__VALID_FROM:
				setValidFrom((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__VALID_UNTIL:
				setValidUntil((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__ORIGIN:
				setOrigin((Origin)newValue);
				return;
			case ContextPackage.REQUIREMENT__CONFIRMED_BY:
				setConfirmedBy((String)newValue);
				return;
			case ContextPackage.REQUIREMENT__CONFIRMED_AT:
				setConfirmedAt((String)newValue);
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
			case ContextPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__GUIDANCE:
				setGuidance(GUIDANCE_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__CITES:
				getCites().clear();
				return;
			case ContextPackage.REQUIREMENT__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case ContextPackage.REQUIREMENT__PROPERTIES:
				getProperties().clear();
				return;
			case ContextPackage.REQUIREMENT__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__VALID_UNTIL:
				setValidUntil(VALID_UNTIL_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__CONFIRMED_BY:
				setConfirmedBy(CONFIRMED_BY_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT__CONFIRMED_AT:
				setConfirmedAt(CONFIRMED_AT_EDEFAULT);
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
			case ContextPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContextPackage.REQUIREMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContextPackage.REQUIREMENT__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case ContextPackage.REQUIREMENT__GUIDANCE:
				return GUIDANCE_EDEFAULT == null ? guidance != null : !GUIDANCE_EDEFAULT.equals(guidance);
			case ContextPackage.REQUIREMENT__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case ContextPackage.REQUIREMENT__CITES:
				return cites != null && !cites.isEmpty();
			case ContextPackage.REQUIREMENT__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case ContextPackage.REQUIREMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ContextPackage.REQUIREMENT__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
			case ContextPackage.REQUIREMENT__VALID_UNTIL:
				return VALID_UNTIL_EDEFAULT == null ? validUntil != null : !VALID_UNTIL_EDEFAULT.equals(validUntil);
			case ContextPackage.REQUIREMENT__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
			case ContextPackage.REQUIREMENT__CONFIRMED_BY:
				return CONFIRMED_BY_EDEFAULT == null ? confirmedBy != null : !CONFIRMED_BY_EDEFAULT.equals(confirmedBy);
			case ContextPackage.REQUIREMENT__CONFIRMED_AT:
				return CONFIRMED_AT_EDEFAULT == null ? confirmedAt != null : !CONFIRMED_AT_EDEFAULT.equals(confirmedAt);
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
		result.append(", statement: ");
		result.append(statement);
		result.append(", guidance: ");
		result.append(guidance);
		result.append(", level: ");
		result.append(level);
		result.append(", validFrom: ");
		result.append(validFrom);
		result.append(", validUntil: ");
		result.append(validUntil);
		result.append(", origin: ");
		result.append(origin);
		result.append(", confirmedBy: ");
		result.append(confirmedBy);
		result.append(", confirmedAt: ");
		result.append(confirmedAt);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
