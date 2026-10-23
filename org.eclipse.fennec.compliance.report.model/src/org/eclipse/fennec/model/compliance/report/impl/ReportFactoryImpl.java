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
package org.eclipse.fennec.model.compliance.report.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.model.compliance.report.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportFactoryImpl extends EFactoryImpl implements ReportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportFactory init() {
		try {
			ReportFactory theReportFactory = (ReportFactory)EPackage.Registry.INSTANCE.getEFactory(ReportPackage.eNS_URI);
			if (theReportFactory != null) {
				return theReportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFactoryImpl() {
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
			case ReportPackage.COMPLIANCE_REPORT: return createComplianceReport();
			case ReportPackage.CLASSIFIER_EVALUATION: return createClassifierEvaluation();
			case ReportPackage.FEATURE_EVALUATION: return createFeatureEvaluation();
			case ReportPackage.FINDING: return createFinding();
			case ReportPackage.COMBINATION_FINDING: return createCombinationFinding();
			case ReportPackage.EVIDENCE: return createEvidence();
			case ReportPackage.COMPLIANCE_REQUEST_STATUS: return createComplianceRequestStatus();
			case ReportPackage.PACKAGE_SUBJECT: return createPackageSubject();
			case ReportPackage.TRANSFORMATION_SUBJECT: return createTransformationSubject();
			case ReportPackage.FLOW_EVALUATION: return createFlowEvaluation();
			case ReportPackage.FINDING_RESOLUTION: return createFindingResolution();
			case ReportPackage.ASSET_SUBJECT: return createAssetSubject();
			case ReportPackage.CONTROL_EVALUATION: return createControlEvaluation();
			case ReportPackage.RISK_ASSESSMENT: return createRiskAssessment();
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
			case ReportPackage.RELEVANCE_LEVEL:
				return createRelevanceLevelFromString(eDataType, initialValue);
			case ReportPackage.CONFIDENCE:
				return createConfidenceFromString(eDataType, initialValue);
			case ReportPackage.DETECTION_SIGNAL:
				return createDetectionSignalFromString(eDataType, initialValue);
			case ReportPackage.REQUEST_STATUS_TYPE:
				return createRequestStatusTypeFromString(eDataType, initialValue);
			case ReportPackage.REPORT_ORIGIN:
				return createReportOriginFromString(eDataType, initialValue);
			case ReportPackage.FLOW_KIND:
				return createFlowKindFromString(eDataType, initialValue);
			case ReportPackage.CONTROL_RESULT:
				return createControlResultFromString(eDataType, initialValue);
			case ReportPackage.REVIEW_STATUS:
				return createReviewStatusFromString(eDataType, initialValue);
			case ReportPackage.RISK_TREATMENT:
				return createRiskTreatmentFromString(eDataType, initialValue);
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
			case ReportPackage.RELEVANCE_LEVEL:
				return convertRelevanceLevelToString(eDataType, instanceValue);
			case ReportPackage.CONFIDENCE:
				return convertConfidenceToString(eDataType, instanceValue);
			case ReportPackage.DETECTION_SIGNAL:
				return convertDetectionSignalToString(eDataType, instanceValue);
			case ReportPackage.REQUEST_STATUS_TYPE:
				return convertRequestStatusTypeToString(eDataType, instanceValue);
			case ReportPackage.REPORT_ORIGIN:
				return convertReportOriginToString(eDataType, instanceValue);
			case ReportPackage.FLOW_KIND:
				return convertFlowKindToString(eDataType, instanceValue);
			case ReportPackage.CONTROL_RESULT:
				return convertControlResultToString(eDataType, instanceValue);
			case ReportPackage.REVIEW_STATUS:
				return convertReviewStatusToString(eDataType, instanceValue);
			case ReportPackage.RISK_TREATMENT:
				return convertRiskTreatmentToString(eDataType, instanceValue);
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
	public ComplianceReport createComplianceReport() {
		ComplianceReportImpl complianceReport = new ComplianceReportImpl();
		return complianceReport;
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
	public ComplianceRequestStatus createComplianceRequestStatus() {
		ComplianceRequestStatusImpl complianceRequestStatus = new ComplianceRequestStatusImpl();
		return complianceRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageSubject createPackageSubject() {
		PackageSubjectImpl packageSubject = new PackageSubjectImpl();
		return packageSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationSubject createTransformationSubject() {
		TransformationSubjectImpl transformationSubject = new TransformationSubjectImpl();
		return transformationSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowEvaluation createFlowEvaluation() {
		FlowEvaluationImpl flowEvaluation = new FlowEvaluationImpl();
		return flowEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingResolution createFindingResolution() {
		FindingResolutionImpl findingResolution = new FindingResolutionImpl();
		return findingResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetSubject createAssetSubject() {
		AssetSubjectImpl assetSubject = new AssetSubjectImpl();
		return assetSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlEvaluation createControlEvaluation() {
		ControlEvaluationImpl controlEvaluation = new ControlEvaluationImpl();
		return controlEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelevanceLevel createRelevanceLevelFromString(EDataType eDataType, String initialValue) {
		RelevanceLevel result = RelevanceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelevanceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidence createConfidenceFromString(EDataType eDataType, String initialValue) {
		Confidence result = Confidence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidenceToString(EDataType eDataType, Object instanceValue) {
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
	public ReportOrigin createReportOriginFromString(EDataType eDataType, String initialValue) {
		ReportOrigin result = ReportOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowKind createFlowKindFromString(EDataType eDataType, String initialValue) {
		FlowKind result = FlowKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlResult createControlResultFromString(EDataType eDataType, String initialValue) {
		ControlResult result = ControlResult.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewStatus createReviewStatusFromString(EDataType eDataType, String initialValue) {
		ReviewStatus result = ReviewStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReviewStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskTreatment createRiskTreatmentFromString(EDataType eDataType, String initialValue) {
		RiskTreatment result = RiskTreatment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskTreatmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPackage getReportPackage() {
		return (ReportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReportPackage getPackage() {
		return ReportPackage.eINSTANCE;
	}

} //ReportFactoryImpl
