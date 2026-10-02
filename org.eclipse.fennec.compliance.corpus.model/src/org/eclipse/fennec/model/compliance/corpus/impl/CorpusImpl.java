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
package org.eclipse.fennec.model.compliance.corpus.impl;

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

import org.eclipse.fennec.model.compliance.corpus.Corpus;
import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.CrossReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corpus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getWorkId <em>Work Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl#getCrossReferences <em>Cross References</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CorpusImpl extends MinimalEObjectImpl.Container implements Corpus {
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
	 * The default value of the '{@link #getWorkId() <em>Work Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkId() <em>Work Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkId()
	 * @generated
	 * @ordered
	 */
	protected String workId = WORK_ID_EDEFAULT;

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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

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
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

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
	 * The cached value of the '{@link #getCrossReferences() <em>Cross References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossReference> crossReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorpusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.CORPUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkId() {
		return workId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkId(String newWorkId) {
		String oldWorkId = workId;
		workId = newWorkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__WORK_ID, oldWorkId, workId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__LICENCE, oldLicence, licence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CORPUS__ATTRIBUTION, oldAttribution, attribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossReference> getCrossReferences() {
		if (crossReferences == null) {
			crossReferences = new EObjectContainmentEList<CrossReference>(CrossReference.class, this, CorpusPackage.CORPUS__CROSS_REFERENCES);
		}
		return crossReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusPackage.CORPUS__CROSS_REFERENCES:
				return ((InternalEList<?>)getCrossReferences()).basicRemove(otherEnd, msgs);
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
			case CorpusPackage.CORPUS__ID:
				return getId();
			case CorpusPackage.CORPUS__WORK_ID:
				return getWorkId();
			case CorpusPackage.CORPUS__TITLE:
				return getTitle();
			case CorpusPackage.CORPUS__LANGUAGE:
				return getLanguage();
			case CorpusPackage.CORPUS__VERSION:
				return getVersion();
			case CorpusPackage.CORPUS__SOURCE:
				return getSource();
			case CorpusPackage.CORPUS__LICENCE:
				return getLicence();
			case CorpusPackage.CORPUS__ATTRIBUTION:
				return getAttribution();
			case CorpusPackage.CORPUS__CROSS_REFERENCES:
				return getCrossReferences();
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
			case CorpusPackage.CORPUS__ID:
				setId((String)newValue);
				return;
			case CorpusPackage.CORPUS__WORK_ID:
				setWorkId((String)newValue);
				return;
			case CorpusPackage.CORPUS__TITLE:
				setTitle((String)newValue);
				return;
			case CorpusPackage.CORPUS__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case CorpusPackage.CORPUS__VERSION:
				setVersion((String)newValue);
				return;
			case CorpusPackage.CORPUS__SOURCE:
				setSource((String)newValue);
				return;
			case CorpusPackage.CORPUS__LICENCE:
				setLicence((String)newValue);
				return;
			case CorpusPackage.CORPUS__ATTRIBUTION:
				setAttribution((String)newValue);
				return;
			case CorpusPackage.CORPUS__CROSS_REFERENCES:
				getCrossReferences().clear();
				getCrossReferences().addAll((Collection<? extends CrossReference>)newValue);
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
			case CorpusPackage.CORPUS__ID:
				setId(ID_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__WORK_ID:
				setWorkId(WORK_ID_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__LICENCE:
				setLicence(LICENCE_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__ATTRIBUTION:
				setAttribution(ATTRIBUTION_EDEFAULT);
				return;
			case CorpusPackage.CORPUS__CROSS_REFERENCES:
				getCrossReferences().clear();
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
			case CorpusPackage.CORPUS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorpusPackage.CORPUS__WORK_ID:
				return WORK_ID_EDEFAULT == null ? workId != null : !WORK_ID_EDEFAULT.equals(workId);
			case CorpusPackage.CORPUS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorpusPackage.CORPUS__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case CorpusPackage.CORPUS__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CorpusPackage.CORPUS__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CorpusPackage.CORPUS__LICENCE:
				return LICENCE_EDEFAULT == null ? licence != null : !LICENCE_EDEFAULT.equals(licence);
			case CorpusPackage.CORPUS__ATTRIBUTION:
				return ATTRIBUTION_EDEFAULT == null ? attribution != null : !ATTRIBUTION_EDEFAULT.equals(attribution);
			case CorpusPackage.CORPUS__CROSS_REFERENCES:
				return crossReferences != null && !crossReferences.isEmpty();
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
		result.append(", workId: ");
		result.append(workId);
		result.append(", title: ");
		result.append(title);
		result.append(", language: ");
		result.append(language);
		result.append(", version: ");
		result.append(version);
		result.append(", source: ");
		result.append(source);
		result.append(", licence: ");
		result.append(licence);
		result.append(", attribution: ");
		result.append(attribution);
		result.append(')');
		return result.toString();
	}

} //CorpusImpl
