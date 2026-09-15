/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.gdprReport.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.model.gdprReport.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GDPRReportFactoryImpl extends EFactoryImpl implements GDPRReportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GDPRReportFactory init() {
		try {
			GDPRReportFactory theGDPRReportFactory = (GDPRReportFactory)EPackage.Registry.INSTANCE.getEFactory(GDPRReportPackage.eNS_URI);
			if (theGDPRReportFactory != null) {
				return theGDPRReportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GDPRReportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDPRReportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GDPRReportPackage.GDPR_REPORT: return createGdprReport();
			case GDPRReportPackage.SUBJECT_MODEL: return createSubjectModel();
			case GDPRReportPackage.LEGAL_CORPUS_REF: return createLegalCorpusRef();
			case GDPRReportPackage.CLASSIFIER_EVALUATION: return createClassifierEvaluation();
			case GDPRReportPackage.FEATURE_EVALUATION: return createFeatureEvaluation();
			case GDPRReportPackage.FINDING: return createFinding();
			case GDPRReportPackage.COMBINATION_FINDING: return createCombinationFinding();
			case GDPRReportPackage.EVIDENCE: return createEvidence();
			case GDPRReportPackage.GDPR_REQUEST_STATUS: return createGdprRequestStatus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GDPRReportPackage.DATA_CATEGORY:
				return createDataCategoryFromString(eDataType, initialValue);
			case GDPRReportPackage.RELEVANCE_LEVEL_TYPE:
				return createRelevanceLevelTypeFromString(eDataType, initialValue);
			case GDPRReportPackage.CONFIDENCE_TYPE:
				return createConfidenceTypeFromString(eDataType, initialValue);
			case GDPRReportPackage.DETECTION_SIGNAL:
				return createDetectionSignalFromString(eDataType, initialValue);
			case GDPRReportPackage.COMBINATION_KIND:
				return createCombinationKindFromString(eDataType, initialValue);
			case GDPRReportPackage.REQUEST_STATUS_TYPE:
				return createRequestStatusTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GDPRReportPackage.DATA_CATEGORY:
				return convertDataCategoryToString(eDataType, instanceValue);
			case GDPRReportPackage.RELEVANCE_LEVEL_TYPE:
				return convertRelevanceLevelTypeToString(eDataType, instanceValue);
			case GDPRReportPackage.CONFIDENCE_TYPE:
				return convertConfidenceTypeToString(eDataType, instanceValue);
			case GDPRReportPackage.DETECTION_SIGNAL:
				return convertDetectionSignalToString(eDataType, instanceValue);
			case GDPRReportPackage.COMBINATION_KIND:
				return convertCombinationKindToString(eDataType, instanceValue);
			case GDPRReportPackage.REQUEST_STATUS_TYPE:
				return convertRequestStatusTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GdprReport createGdprReport() {
		GdprReportImpl gdprReport = new GdprReportImpl();
		return gdprReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectModel createSubjectModel() {
		SubjectModelImpl subjectModel = new SubjectModelImpl();
		return subjectModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalCorpusRef createLegalCorpusRef() {
		LegalCorpusRefImpl legalCorpusRef = new LegalCorpusRefImpl();
		return legalCorpusRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifierEvaluation createClassifierEvaluation() {
		ClassifierEvaluationImpl classifierEvaluation = new ClassifierEvaluationImpl();
		return classifierEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureEvaluation createFeatureEvaluation() {
		FeatureEvaluationImpl featureEvaluation = new FeatureEvaluationImpl();
		return featureEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finding createFinding() {
		FindingImpl finding = new FindingImpl();
		return finding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinationFinding createCombinationFinding() {
		CombinationFindingImpl combinationFinding = new CombinationFindingImpl();
		return combinationFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GdprRequestStatus createGdprRequestStatus() {
		GdprRequestStatusImpl gdprRequestStatus = new GdprRequestStatusImpl();
		return gdprRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCategory createDataCategoryFromString(EDataType eDataType, String initialValue) {
		DataCategory result = DataCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelevanceLevelType createRelevanceLevelTypeFromString(EDataType eDataType, String initialValue) {
		RelevanceLevelType result = RelevanceLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelevanceLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidenceType createConfidenceTypeFromString(EDataType eDataType, String initialValue) {
		ConfidenceType result = ConfidenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectionSignal createDetectionSignalFromString(EDataType eDataType, String initialValue) {
		DetectionSignal result = DetectionSignal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectionSignalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationKind createCombinationKindFromString(EDataType eDataType, String initialValue) {
		CombinationKind result = CombinationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCombinationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusType createRequestStatusTypeFromString(EDataType eDataType, String initialValue) {
		RequestStatusType result = RequestStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GDPRReportPackage getGDPRReportPackage() {
		return (GDPRReportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GDPRReportPackage getPackage() {
		return GDPRReportPackage.eINSTANCE;
	}

} //GDPRReportFactoryImpl
