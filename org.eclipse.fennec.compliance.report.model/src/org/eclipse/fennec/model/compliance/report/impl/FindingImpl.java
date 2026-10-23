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
package org.eclipse.fennec.model.compliance.report.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.CategoryRef;
import org.eclipse.fennec.model.compliance.context.RequirementRef;

import org.eclipse.fennec.model.compliance.report.Confidence;
import org.eclipse.fennec.model.compliance.report.DetectionSignal;
import org.eclipse.fennec.model.compliance.report.Evidence;
import org.eclipse.fennec.model.compliance.report.Finding;
import org.eclipse.fennec.model.compliance.report.FindingResolution;
import org.eclipse.fennec.model.compliance.report.RelevanceLevel;
import org.eclipse.fennec.model.compliance.report.ReportOrigin;
import org.eclipse.fennec.model.compliance.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getDetectedBy <em>Detected By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getSignalValues <em>Signal Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getDiagnosticId <em>Diagnostic Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingImpl#getCorrectionNote <em>Correction Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends MinimalEObjectImpl.Container implements Finding {
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
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final ReportOrigin ORIGIN_EDEFAULT = ReportOrigin.UNKNOWN;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected ReportOrigin origin = ORIGIN_EDEFAULT;

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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementRef> requirements;

	/**
	 * The default value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RelevanceLevel RELEVANCE_LEVEL_EDEFAULT = RelevanceLevel.NONE;

	/**
	 * The cached value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected RelevanceLevel relevanceLevel = RELEVANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final Confidence CONFIDENCE_EDEFAULT = Confidence.LOW;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected Confidence confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetectedBy() <em>Detected By</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectionSignal> detectedBy;

	/**
	 * The cached value of the '{@link #getSignalValues() <em>Signal Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> signalValues;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendation() <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendation() <em>Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected String recommendation = RECOMMENDATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> evidence;

	/**
	 * The default value of the '{@link #getDiagnosticId() <em>Diagnostic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticId()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSTIC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosticId() <em>Diagnostic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticId()
	 * @generated
	 * @ordered
	 */
	protected String diagnosticId = DIAGNOSTIC_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected FindingResolution resolution;

	/**
	 * The default value of the '{@link #getCorrectionNote() <em>Correction Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectionNote()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRECTION_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrectionNote() <em>Correction Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectionNote()
	 * @generated
	 * @ordered
	 */
	protected String correctionNote = CORRECTION_NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.FINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportOrigin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(ReportOrigin newOrigin) {
		ReportOrigin oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, ReportPackage.FINDING__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementRef> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<RequirementRef>(RequirementRef.class, this, ReportPackage.FINDING__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelevanceLevel getRelevanceLevel() {
		return relevanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevanceLevel(RelevanceLevel newRelevanceLevel) {
		RelevanceLevel oldRelevanceLevel = relevanceLevel;
		relevanceLevel = newRelevanceLevel == null ? RELEVANCE_LEVEL_EDEFAULT : newRelevanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__RELEVANCE_LEVEL, oldRelevanceLevel, relevanceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Confidence getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(Confidence newConfidence) {
		Confidence oldConfidence = confidence;
		confidence = newConfidence == null ? CONFIDENCE_EDEFAULT : newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectionSignal> getDetectedBy() {
		if (detectedBy == null) {
			detectedBy = new EDataTypeUniqueEList<DetectionSignal>(DetectionSignal.class, this, ReportPackage.FINDING__DETECTED_BY);
		}
		return detectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSignalValues() {
		if (signalValues == null) {
			signalValues = new EDataTypeUniqueEList<String>(String.class, this, ReportPackage.FINDING__SIGNAL_VALUES);
		}
		return signalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecommendation() {
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommendation(String newRecommendation) {
		String oldRecommendation = recommendation;
		recommendation = newRecommendation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__RECOMMENDATION, oldRecommendation, recommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Evidence> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, ReportPackage.FINDING__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiagnosticId() {
		return diagnosticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticId(String newDiagnosticId) {
		String oldDiagnosticId = diagnosticId;
		diagnosticId = newDiagnosticId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__DIAGNOSTIC_ID, oldDiagnosticId, diagnosticId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingResolution getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolution(FindingResolution newResolution, NotificationChain msgs) {
		FindingResolution oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__RESOLUTION, oldResolution, newResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(FindingResolution newResolution) {
		if (newResolution != resolution) {
			NotificationChain msgs = null;
			if (resolution != null)
				msgs = ((InternalEObject)resolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportPackage.FINDING__RESOLUTION, null, msgs);
			if (newResolution != null)
				msgs = ((InternalEObject)newResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportPackage.FINDING__RESOLUTION, null, msgs);
			msgs = basicSetResolution(newResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__RESOLUTION, newResolution, newResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrectionNote() {
		return correctionNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectionNote(String newCorrectionNote) {
		String oldCorrectionNote = correctionNote;
		correctionNote = newCorrectionNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING__CORRECTION_NOTE, oldCorrectionNote, correctionNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.FINDING__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ReportPackage.FINDING__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case ReportPackage.FINDING__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case ReportPackage.FINDING__RESOLUTION:
				return basicSetResolution(null, msgs);
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
			case ReportPackage.FINDING__ID:
				return getId();
			case ReportPackage.FINDING__ORIGIN:
				return getOrigin();
			case ReportPackage.FINDING__CATEGORIES:
				return getCategories();
			case ReportPackage.FINDING__REQUIREMENTS:
				return getRequirements();
			case ReportPackage.FINDING__RELEVANCE_LEVEL:
				return getRelevanceLevel();
			case ReportPackage.FINDING__CONFIDENCE:
				return getConfidence();
			case ReportPackage.FINDING__DETECTED_BY:
				return getDetectedBy();
			case ReportPackage.FINDING__SIGNAL_VALUES:
				return getSignalValues();
			case ReportPackage.FINDING__RATIONALE:
				return getRationale();
			case ReportPackage.FINDING__RECOMMENDATION:
				return getRecommendation();
			case ReportPackage.FINDING__EVIDENCE:
				return getEvidence();
			case ReportPackage.FINDING__DIAGNOSTIC_ID:
				return getDiagnosticId();
			case ReportPackage.FINDING__RESOLUTION:
				return getResolution();
			case ReportPackage.FINDING__CORRECTION_NOTE:
				return getCorrectionNote();
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
			case ReportPackage.FINDING__ID:
				setId((String)newValue);
				return;
			case ReportPackage.FINDING__ORIGIN:
				setOrigin((ReportOrigin)newValue);
				return;
			case ReportPackage.FINDING__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CategoryRef>)newValue);
				return;
			case ReportPackage.FINDING__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends RequirementRef>)newValue);
				return;
			case ReportPackage.FINDING__RELEVANCE_LEVEL:
				setRelevanceLevel((RelevanceLevel)newValue);
				return;
			case ReportPackage.FINDING__CONFIDENCE:
				setConfidence((Confidence)newValue);
				return;
			case ReportPackage.FINDING__DETECTED_BY:
				getDetectedBy().clear();
				getDetectedBy().addAll((Collection<? extends DetectionSignal>)newValue);
				return;
			case ReportPackage.FINDING__SIGNAL_VALUES:
				getSignalValues().clear();
				getSignalValues().addAll((Collection<? extends String>)newValue);
				return;
			case ReportPackage.FINDING__RATIONALE:
				setRationale((String)newValue);
				return;
			case ReportPackage.FINDING__RECOMMENDATION:
				setRecommendation((String)newValue);
				return;
			case ReportPackage.FINDING__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case ReportPackage.FINDING__DIAGNOSTIC_ID:
				setDiagnosticId((String)newValue);
				return;
			case ReportPackage.FINDING__RESOLUTION:
				setResolution((FindingResolution)newValue);
				return;
			case ReportPackage.FINDING__CORRECTION_NOTE:
				setCorrectionNote((String)newValue);
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
			case ReportPackage.FINDING__ID:
				setId(ID_EDEFAULT);
				return;
			case ReportPackage.FINDING__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case ReportPackage.FINDING__CATEGORIES:
				getCategories().clear();
				return;
			case ReportPackage.FINDING__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ReportPackage.FINDING__RELEVANCE_LEVEL:
				setRelevanceLevel(RELEVANCE_LEVEL_EDEFAULT);
				return;
			case ReportPackage.FINDING__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case ReportPackage.FINDING__DETECTED_BY:
				getDetectedBy().clear();
				return;
			case ReportPackage.FINDING__SIGNAL_VALUES:
				getSignalValues().clear();
				return;
			case ReportPackage.FINDING__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case ReportPackage.FINDING__RECOMMENDATION:
				setRecommendation(RECOMMENDATION_EDEFAULT);
				return;
			case ReportPackage.FINDING__EVIDENCE:
				getEvidence().clear();
				return;
			case ReportPackage.FINDING__DIAGNOSTIC_ID:
				setDiagnosticId(DIAGNOSTIC_ID_EDEFAULT);
				return;
			case ReportPackage.FINDING__RESOLUTION:
				setResolution((FindingResolution)null);
				return;
			case ReportPackage.FINDING__CORRECTION_NOTE:
				setCorrectionNote(CORRECTION_NOTE_EDEFAULT);
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
			case ReportPackage.FINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ReportPackage.FINDING__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
			case ReportPackage.FINDING__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case ReportPackage.FINDING__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ReportPackage.FINDING__RELEVANCE_LEVEL:
				return relevanceLevel != RELEVANCE_LEVEL_EDEFAULT;
			case ReportPackage.FINDING__CONFIDENCE:
				return confidence != CONFIDENCE_EDEFAULT;
			case ReportPackage.FINDING__DETECTED_BY:
				return detectedBy != null && !detectedBy.isEmpty();
			case ReportPackage.FINDING__SIGNAL_VALUES:
				return signalValues != null && !signalValues.isEmpty();
			case ReportPackage.FINDING__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case ReportPackage.FINDING__RECOMMENDATION:
				return RECOMMENDATION_EDEFAULT == null ? recommendation != null : !RECOMMENDATION_EDEFAULT.equals(recommendation);
			case ReportPackage.FINDING__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case ReportPackage.FINDING__DIAGNOSTIC_ID:
				return DIAGNOSTIC_ID_EDEFAULT == null ? diagnosticId != null : !DIAGNOSTIC_ID_EDEFAULT.equals(diagnosticId);
			case ReportPackage.FINDING__RESOLUTION:
				return resolution != null;
			case ReportPackage.FINDING__CORRECTION_NOTE:
				return CORRECTION_NOTE_EDEFAULT == null ? correctionNote != null : !CORRECTION_NOTE_EDEFAULT.equals(correctionNote);
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
		result.append(", origin: ");
		result.append(origin);
		result.append(", relevanceLevel: ");
		result.append(relevanceLevel);
		result.append(", confidence: ");
		result.append(confidence);
		result.append(", detectedBy: ");
		result.append(detectedBy);
		result.append(", signalValues: ");
		result.append(signalValues);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", recommendation: ");
		result.append(recommendation);
		result.append(", diagnosticId: ");
		result.append(diagnosticId);
		result.append(", correctionNote: ");
		result.append(correctionNote);
		result.append(')');
		return result.toString();
	}

} //FindingImpl
