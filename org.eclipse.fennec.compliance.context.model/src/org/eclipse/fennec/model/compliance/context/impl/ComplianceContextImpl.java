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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.ComplianceContext;
import org.eclipse.fennec.model.compliance.context.ContextKind;
import org.eclipse.fennec.model.compliance.context.ContextPackage;
import org.eclipse.fennec.model.compliance.context.Requirement;
import org.eclipse.fennec.model.compliance.context.RequirementGroup;
import org.eclipse.fennec.model.compliance.context.Role;
import org.eclipse.fennec.model.compliance.context.Taxonomy;

import org.eclipse.fennec.model.compliance.corpus.Corpus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getReferenceLanguage <em>Reference Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getCorpora <em>Corpora</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getRequirementGroups <em>Requirement Groups</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getTaxonomies <em>Taxonomies</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceContextImpl extends MinimalEObjectImpl.Container implements ComplianceContext {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	protected static final ContextKind KIND_EDEFAULT = ContextKind.REGULATION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ContextKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected static final String JURISDICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected String jurisdiction = JURISDICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceLanguage() <em>Reference Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceLanguage() <em>Reference Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceLanguage()
	 * @generated
	 * @ordered
	 */
	protected String referenceLanguage = REFERENCE_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicence() <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicence()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicence() <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicence()
	 * @generated
	 * @ordered
	 */
	protected String licence = LICENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribution() <em>Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribution()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribution() <em>Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribution()
	 * @generated
	 * @ordered
	 */
	protected String attribution = ATTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorpora() <em>Corpora</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpora()
	 * @generated
	 * @ordered
	 */
	protected EList<Corpus> corpora;

	/**
	 * The cached value of the '{@link #getRequirementGroups() <em>Requirement Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementGroup> requirementGroups;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getTaxonomies() <em>Taxonomies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomies()
	 * @generated
	 * @ordered
	 */
	protected EList<Taxonomy> taxonomies;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.COMPLIANCE_CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ContextKind newKind) {
		ContextKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJurisdiction(String newJurisdiction) {
		String oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__JURISDICTION, oldJurisdiction, jurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceLanguage() {
		return referenceLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceLanguage(String newReferenceLanguage) {
		String oldReferenceLanguage = referenceLanguage;
		referenceLanguage = newReferenceLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE, oldReferenceLanguage, referenceLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicence() {
		return licence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicence(String newLicence) {
		String oldLicence = licence;
		licence = newLicence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__LICENCE, oldLicence, licence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttribution() {
		return attribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribution(String newAttribution) {
		String oldAttribution = attribution;
		attribution = newAttribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.COMPLIANCE_CONTEXT__ATTRIBUTION, oldAttribution, attribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Corpus> getCorpora() {
		if (corpora == null) {
			corpora = new EObjectContainmentEList<Corpus>(Corpus.class, this, ContextPackage.COMPLIANCE_CONTEXT__CORPORA);
		}
		return corpora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementGroup> getRequirementGroups() {
		if (requirementGroups == null) {
			requirementGroups = new EObjectContainmentEList<RequirementGroup>(RequirementGroup.class, this, ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS);
		}
		return requirementGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Taxonomy> getTaxonomies() {
		if (taxonomies == null) {
			taxonomies = new EObjectContainmentEList<Taxonomy>(Taxonomy.class, this, ContextPackage.COMPLIANCE_CONTEXT__TAXONOMIES);
		}
		return taxonomies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ContextPackage.COMPLIANCE_CONTEXT__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.COMPLIANCE_CONTEXT__CORPORA:
				return ((InternalEList<?>)getCorpora()).basicRemove(otherEnd, msgs);
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS:
				return ((InternalEList<?>)getRequirementGroups()).basicRemove(otherEnd, msgs);
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case ContextPackage.COMPLIANCE_CONTEXT__TAXONOMIES:
				return ((InternalEList<?>)getTaxonomies()).basicRemove(otherEnd, msgs);
			case ContextPackage.COMPLIANCE_CONTEXT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.COMPLIANCE_CONTEXT__ID:
				return getId();
			case ContextPackage.COMPLIANCE_CONTEXT__NAME:
				return getName();
			case ContextPackage.COMPLIANCE_CONTEXT__VERSION:
				return getVersion();
			case ContextPackage.COMPLIANCE_CONTEXT__DESCRIPTION:
				return getDescription();
			case ContextPackage.COMPLIANCE_CONTEXT__KIND:
				return getKind();
			case ContextPackage.COMPLIANCE_CONTEXT__JURISDICTION:
				return getJurisdiction();
			case ContextPackage.COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE:
				return getReferenceLanguage();
			case ContextPackage.COMPLIANCE_CONTEXT__LICENCE:
				return getLicence();
			case ContextPackage.COMPLIANCE_CONTEXT__ATTRIBUTION:
				return getAttribution();
			case ContextPackage.COMPLIANCE_CONTEXT__CORPORA:
				return getCorpora();
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS:
				return getRequirementGroups();
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENTS:
				return getRequirements();
			case ContextPackage.COMPLIANCE_CONTEXT__TAXONOMIES:
				return getTaxonomies();
			case ContextPackage.COMPLIANCE_CONTEXT__ROLES:
				return getRoles();
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
			case ContextPackage.COMPLIANCE_CONTEXT__ID:
				setId((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__VERSION:
				setVersion((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__KIND:
				setKind((ContextKind)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__JURISDICTION:
				setJurisdiction((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE:
				setReferenceLanguage((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__LICENCE:
				setLicence((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__ATTRIBUTION:
				setAttribution((String)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__CORPORA:
				getCorpora().clear();
				getCorpora().addAll((Collection<? extends Corpus>)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS:
				getRequirementGroups().clear();
				getRequirementGroups().addAll((Collection<? extends RequirementGroup>)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__TAXONOMIES:
				getTaxonomies().clear();
				getTaxonomies().addAll((Collection<? extends Taxonomy>)newValue);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case ContextPackage.COMPLIANCE_CONTEXT__ID:
				setId(ID_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__JURISDICTION:
				setJurisdiction(JURISDICTION_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE:
				setReferenceLanguage(REFERENCE_LANGUAGE_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__LICENCE:
				setLicence(LICENCE_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__ATTRIBUTION:
				setAttribution(ATTRIBUTION_EDEFAULT);
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__CORPORA:
				getCorpora().clear();
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS:
				getRequirementGroups().clear();
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__TAXONOMIES:
				getTaxonomies().clear();
				return;
			case ContextPackage.COMPLIANCE_CONTEXT__ROLES:
				getRoles().clear();
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
			case ContextPackage.COMPLIANCE_CONTEXT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContextPackage.COMPLIANCE_CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.COMPLIANCE_CONTEXT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ContextPackage.COMPLIANCE_CONTEXT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContextPackage.COMPLIANCE_CONTEXT__KIND:
				return kind != KIND_EDEFAULT;
			case ContextPackage.COMPLIANCE_CONTEXT__JURISDICTION:
				return JURISDICTION_EDEFAULT == null ? jurisdiction != null : !JURISDICTION_EDEFAULT.equals(jurisdiction);
			case ContextPackage.COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE:
				return REFERENCE_LANGUAGE_EDEFAULT == null ? referenceLanguage != null : !REFERENCE_LANGUAGE_EDEFAULT.equals(referenceLanguage);
			case ContextPackage.COMPLIANCE_CONTEXT__LICENCE:
				return LICENCE_EDEFAULT == null ? licence != null : !LICENCE_EDEFAULT.equals(licence);
			case ContextPackage.COMPLIANCE_CONTEXT__ATTRIBUTION:
				return ATTRIBUTION_EDEFAULT == null ? attribution != null : !ATTRIBUTION_EDEFAULT.equals(attribution);
			case ContextPackage.COMPLIANCE_CONTEXT__CORPORA:
				return corpora != null && !corpora.isEmpty();
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS:
				return requirementGroups != null && !requirementGroups.isEmpty();
			case ContextPackage.COMPLIANCE_CONTEXT__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ContextPackage.COMPLIANCE_CONTEXT__TAXONOMIES:
				return taxonomies != null && !taxonomies.isEmpty();
			case ContextPackage.COMPLIANCE_CONTEXT__ROLES:
				return roles != null && !roles.isEmpty();
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
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", kind: ");
		result.append(kind);
		result.append(", jurisdiction: ");
		result.append(jurisdiction);
		result.append(", referenceLanguage: ");
		result.append(referenceLanguage);
		result.append(", licence: ");
		result.append(licence);
		result.append(", attribution: ");
		result.append(attribution);
		result.append(')');
		return result.toString();
	}

} //ComplianceContextImpl
