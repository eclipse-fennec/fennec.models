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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.compliance.context.ContextPackage;

import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;

import org.eclipse.fennec.model.compliance.report.AssetSubject;
import org.eclipse.fennec.model.compliance.report.ClassifierEvaluation;
import org.eclipse.fennec.model.compliance.report.CombinationFinding;
import org.eclipse.fennec.model.compliance.report.ComplianceReport;
import org.eclipse.fennec.model.compliance.report.ComplianceRequestStatus;
import org.eclipse.fennec.model.compliance.report.Confidence;
import org.eclipse.fennec.model.compliance.report.ControlEvaluation;
import org.eclipse.fennec.model.compliance.report.ControlResult;
import org.eclipse.fennec.model.compliance.report.DetectionSignal;
import org.eclipse.fennec.model.compliance.report.Evaluation;
import org.eclipse.fennec.model.compliance.report.Evidence;
import org.eclipse.fennec.model.compliance.report.FeatureEvaluation;
import org.eclipse.fennec.model.compliance.report.Finding;
import org.eclipse.fennec.model.compliance.report.FindingResolution;
import org.eclipse.fennec.model.compliance.report.FlowEvaluation;
import org.eclipse.fennec.model.compliance.report.FlowKind;
import org.eclipse.fennec.model.compliance.report.PackageSubject;
import org.eclipse.fennec.model.compliance.report.RelevanceLevel;
import org.eclipse.fennec.model.compliance.report.ReportFactory;
import org.eclipse.fennec.model.compliance.report.ReportOrigin;
import org.eclipse.fennec.model.compliance.report.ReportPackage;
import org.eclipse.fennec.model.compliance.report.RequestStatusType;
import org.eclipse.fennec.model.compliance.report.ReviewStatus;
import org.eclipse.fennec.model.compliance.report.RiskAssessment;
import org.eclipse.fennec.model.compliance.report.RiskTreatment;
import org.eclipse.fennec.model.compliance.report.Subject;
import org.eclipse.fennec.model.compliance.report.TransformationSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportPackageImpl extends EPackageImpl implements ReportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationFindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relevanceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectionSignalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reportOriginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlResultEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reviewStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskTreatmentEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportPackageImpl() {
		super(eNS_URI, ReportFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ReportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReportPackage init() {
		if (isInited) return (ReportPackage)EPackage.Registry.INSTANCE.getEPackage(ReportPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReportPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReportPackageImpl theReportPackage = registeredReportPackage instanceof ReportPackageImpl ? (ReportPackageImpl)registeredReportPackage : new ReportPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();
		CorpusPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReportPackage.createPackageContents();

		// Initialize created meta-data
		theReportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReportPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReportPackage.eNS_URI, theReportPackage);
		return theReportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceReport() {
		return complianceReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_ReportId() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_Name() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_GeneratedAt() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_GeneratedBy() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReport_Subject() {
		return (EReference)complianceReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReport_Evaluations() {
		return (EReference)complianceReportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReport_Combinations() {
		return (EReference)complianceReportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_Disclaimer() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_Origin() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReport_Contexts() {
		return (EReference)complianceReportEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReport_Language() {
		return (EAttribute)complianceReportEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubject_SubjectFingerprint() {
		return (EAttribute)subjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubject_ReportId() {
		return (EAttribute)subjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifierEvaluation() {
		return classifierEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifierEvaluation_UriFragment() {
		return (EAttribute)classifierEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierEvaluation_FeatureEvaluations() {
		return (EReference)classifierEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifierEvaluation_Purpose() {
		return (EAttribute)classifierEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierEvaluation_LawfulBases() {
		return (EReference)classifierEvaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureEvaluation() {
		return featureEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_UriFragment() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_TypeName() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_Many() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_RelevanceLevel() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_Purpose() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinding() {
		return findingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Id() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Origin() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Categories() {
		return (EReference)findingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Requirements() {
		return (EReference)findingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_RelevanceLevel() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Confidence() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_DetectedBy() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_SignalValues() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Rationale() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Recommendation() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Evidence() {
		return (EReference)findingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_DiagnosticId() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Resolution() {
		return (EReference)findingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_CorrectionNote() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCombinationFinding() {
		return combinationFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCombinationFinding_Features() {
		return (EReference)combinationFindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_ContextId() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_CorpusId() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_CitationId() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Quote() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Verbatim() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Relevance() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_SourceRef() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceRequestStatus() {
		return complianceRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_SubjectFingerprint() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_BatchId() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_CustomId() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_ReportId() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_Status() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_SubmittedAt() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_EndedAt() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_Message() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_ContinuationCount() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_OutputTokens() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_Language() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceRequestStatus_ContextIds() {
		return (EAttribute)complianceRequestStatusEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageSubject() {
		return packageSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageSubject_Name() {
		return (EAttribute)packageSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageSubject_NsURI() {
		return (EAttribute)packageSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageSubject_NsPrefix() {
		return (EAttribute)packageSubjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluation_Id() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluation_Name() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_Findings() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_PartOfCombinations() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformationSubject() {
		return transformationSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransformationSubject_QualifiedName() {
		return (EAttribute)transformationSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransformationSubject_Language() {
		return (EAttribute)transformationSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransformationSubject_SourceFingerprint() {
		return (EAttribute)transformationSubjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationSubject_SourcePackages() {
		return (EReference)transformationSubjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationSubject_TargetPackages() {
		return (EReference)transformationSubjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowEvaluation() {
		return flowEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_Mapping() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_SourceNsURI() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_SourceFeature() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_TargetNsURI() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_TargetFeature() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_FlowKind() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_RelevanceLevel() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowEvaluation_Purpose() {
		return (EAttribute)flowEvaluationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFindingResolution() {
		return findingResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_Status() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_Treatment() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFindingResolution_RiskAssessment() {
		return (EReference)findingResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_MeasureIds() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_TreatmentNote() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_DelegatedTo() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_DueDate() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_Justification() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_DecidedBy() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingResolution_DecidedAt() {
		return (EAttribute)findingResolutionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetSubject() {
		return assetSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetSubject_InventoryId() {
		return (EAttribute)assetSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetSubject_AssetId() {
		return (EAttribute)assetSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetSubject_AssetName() {
		return (EAttribute)assetSubjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlEvaluation() {
		return controlEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlEvaluation_Requirement() {
		return (EReference)controlEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlEvaluation_Result() {
		return (EAttribute)controlEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlEvaluation_MeasureIds() {
		return (EAttribute)controlEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskAssessment() {
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_MethodologyId() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_Likelihood() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_Severity() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_RiskLevel() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelevanceLevel() {
		return relevanceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConfidence() {
		return confidenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDetectionSignal() {
		return detectionSignalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRequestStatusType() {
		return requestStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReportOrigin() {
		return reportOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlowKind() {
		return flowKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlResult() {
		return controlResultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReviewStatus() {
		return reviewStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskTreatment() {
		return riskTreatmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportFactory getReportFactory() {
		return (ReportFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		complianceReportEClass = createEClass(COMPLIANCE_REPORT);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__REPORT_ID);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__NAME);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__GENERATED_AT);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__GENERATED_BY);
		createEReference(complianceReportEClass, COMPLIANCE_REPORT__SUBJECT);
		createEReference(complianceReportEClass, COMPLIANCE_REPORT__EVALUATIONS);
		createEReference(complianceReportEClass, COMPLIANCE_REPORT__COMBINATIONS);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__DISCLAIMER);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__ORIGIN);
		createEReference(complianceReportEClass, COMPLIANCE_REPORT__CONTEXTS);
		createEAttribute(complianceReportEClass, COMPLIANCE_REPORT__LANGUAGE);

		subjectEClass = createEClass(SUBJECT);
		createEAttribute(subjectEClass, SUBJECT__SUBJECT_FINGERPRINT);
		createEAttribute(subjectEClass, SUBJECT__REPORT_ID);

		classifierEvaluationEClass = createEClass(CLASSIFIER_EVALUATION);
		createEAttribute(classifierEvaluationEClass, CLASSIFIER_EVALUATION__URI_FRAGMENT);
		createEReference(classifierEvaluationEClass, CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS);
		createEAttribute(classifierEvaluationEClass, CLASSIFIER_EVALUATION__PURPOSE);
		createEReference(classifierEvaluationEClass, CLASSIFIER_EVALUATION__LAWFUL_BASES);

		featureEvaluationEClass = createEClass(FEATURE_EVALUATION);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__URI_FRAGMENT);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__TYPE_NAME);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__MANY);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__RELEVANCE_LEVEL);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__PURPOSE);

		findingEClass = createEClass(FINDING);
		createEAttribute(findingEClass, FINDING__ID);
		createEAttribute(findingEClass, FINDING__ORIGIN);
		createEReference(findingEClass, FINDING__CATEGORIES);
		createEReference(findingEClass, FINDING__REQUIREMENTS);
		createEAttribute(findingEClass, FINDING__RELEVANCE_LEVEL);
		createEAttribute(findingEClass, FINDING__CONFIDENCE);
		createEAttribute(findingEClass, FINDING__DETECTED_BY);
		createEAttribute(findingEClass, FINDING__SIGNAL_VALUES);
		createEAttribute(findingEClass, FINDING__RATIONALE);
		createEAttribute(findingEClass, FINDING__RECOMMENDATION);
		createEReference(findingEClass, FINDING__EVIDENCE);
		createEAttribute(findingEClass, FINDING__DIAGNOSTIC_ID);
		createEReference(findingEClass, FINDING__RESOLUTION);
		createEAttribute(findingEClass, FINDING__CORRECTION_NOTE);

		combinationFindingEClass = createEClass(COMBINATION_FINDING);
		createEReference(combinationFindingEClass, COMBINATION_FINDING__FEATURES);

		evidenceEClass = createEClass(EVIDENCE);
		createEAttribute(evidenceEClass, EVIDENCE__CONTEXT_ID);
		createEAttribute(evidenceEClass, EVIDENCE__CORPUS_ID);
		createEAttribute(evidenceEClass, EVIDENCE__CITATION_ID);
		createEAttribute(evidenceEClass, EVIDENCE__QUOTE);
		createEAttribute(evidenceEClass, EVIDENCE__VERBATIM);
		createEAttribute(evidenceEClass, EVIDENCE__RELEVANCE);
		createEAttribute(evidenceEClass, EVIDENCE__SOURCE_REF);

		complianceRequestStatusEClass = createEClass(COMPLIANCE_REQUEST_STATUS);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__SUBJECT_FINGERPRINT);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__BATCH_ID);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__CUSTOM_ID);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__REPORT_ID);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__STATUS);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__SUBMITTED_AT);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__ENDED_AT);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__MESSAGE);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__CONTINUATION_COUNT);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__OUTPUT_TOKENS);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__LANGUAGE);
		createEAttribute(complianceRequestStatusEClass, COMPLIANCE_REQUEST_STATUS__CONTEXT_IDS);

		packageSubjectEClass = createEClass(PACKAGE_SUBJECT);
		createEAttribute(packageSubjectEClass, PACKAGE_SUBJECT__NAME);
		createEAttribute(packageSubjectEClass, PACKAGE_SUBJECT__NS_URI);
		createEAttribute(packageSubjectEClass, PACKAGE_SUBJECT__NS_PREFIX);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__ID);
		createEAttribute(evaluationEClass, EVALUATION__NAME);
		createEReference(evaluationEClass, EVALUATION__FINDINGS);
		createEReference(evaluationEClass, EVALUATION__PART_OF_COMBINATIONS);

		transformationSubjectEClass = createEClass(TRANSFORMATION_SUBJECT);
		createEAttribute(transformationSubjectEClass, TRANSFORMATION_SUBJECT__QUALIFIED_NAME);
		createEAttribute(transformationSubjectEClass, TRANSFORMATION_SUBJECT__LANGUAGE);
		createEAttribute(transformationSubjectEClass, TRANSFORMATION_SUBJECT__SOURCE_FINGERPRINT);
		createEReference(transformationSubjectEClass, TRANSFORMATION_SUBJECT__SOURCE_PACKAGES);
		createEReference(transformationSubjectEClass, TRANSFORMATION_SUBJECT__TARGET_PACKAGES);

		flowEvaluationEClass = createEClass(FLOW_EVALUATION);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__MAPPING);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__SOURCE_NS_URI);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__SOURCE_FEATURE);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__TARGET_NS_URI);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__TARGET_FEATURE);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__FLOW_KIND);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__RELEVANCE_LEVEL);
		createEAttribute(flowEvaluationEClass, FLOW_EVALUATION__PURPOSE);

		findingResolutionEClass = createEClass(FINDING_RESOLUTION);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__STATUS);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__TREATMENT);
		createEReference(findingResolutionEClass, FINDING_RESOLUTION__RISK_ASSESSMENT);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__MEASURE_IDS);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__TREATMENT_NOTE);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__DELEGATED_TO);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__DUE_DATE);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__JUSTIFICATION);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__DECIDED_BY);
		createEAttribute(findingResolutionEClass, FINDING_RESOLUTION__DECIDED_AT);

		assetSubjectEClass = createEClass(ASSET_SUBJECT);
		createEAttribute(assetSubjectEClass, ASSET_SUBJECT__INVENTORY_ID);
		createEAttribute(assetSubjectEClass, ASSET_SUBJECT__ASSET_ID);
		createEAttribute(assetSubjectEClass, ASSET_SUBJECT__ASSET_NAME);

		controlEvaluationEClass = createEClass(CONTROL_EVALUATION);
		createEReference(controlEvaluationEClass, CONTROL_EVALUATION__REQUIREMENT);
		createEAttribute(controlEvaluationEClass, CONTROL_EVALUATION__RESULT);
		createEAttribute(controlEvaluationEClass, CONTROL_EVALUATION__MEASURE_IDS);

		riskAssessmentEClass = createEClass(RISK_ASSESSMENT);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__METHODOLOGY_ID);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__LIKELIHOOD);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__SEVERITY);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__RISK_LEVEL);

		// Create enums
		relevanceLevelEEnum = createEEnum(RELEVANCE_LEVEL);
		confidenceEEnum = createEEnum(CONFIDENCE);
		detectionSignalEEnum = createEEnum(DETECTION_SIGNAL);
		requestStatusTypeEEnum = createEEnum(REQUEST_STATUS_TYPE);
		reportOriginEEnum = createEEnum(REPORT_ORIGIN);
		flowKindEEnum = createEEnum(FLOW_KIND);
		controlResultEEnum = createEEnum(CONTROL_RESULT);
		reviewStatusEEnum = createEEnum(REVIEW_STATUS);
		riskTreatmentEEnum = createEEnum(RISK_TREATMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierEvaluationEClass.getESuperTypes().add(this.getEvaluation());
		featureEvaluationEClass.getESuperTypes().add(this.getEvaluation());
		combinationFindingEClass.getESuperTypes().add(this.getFinding());
		packageSubjectEClass.getESuperTypes().add(this.getSubject());
		transformationSubjectEClass.getESuperTypes().add(this.getSubject());
		flowEvaluationEClass.getESuperTypes().add(this.getEvaluation());
		assetSubjectEClass.getESuperTypes().add(this.getSubject());
		controlEvaluationEClass.getESuperTypes().add(this.getEvaluation());

		// Initialize classes, features, and operations; add parameters
		initEClass(complianceReportEClass, ComplianceReport.class, "ComplianceReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceReport_ReportId(), ecorePackage.getEString(), "reportId", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReport_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReport_GeneratedAt(), ecorePackage.getEString(), "generatedAt", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReport_GeneratedBy(), ecorePackage.getEString(), "generatedBy", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReport_Subject(), this.getSubject(), null, "subject", null, 1, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReport_Evaluations(), this.getEvaluation(), null, "evaluations", null, 0, -1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReport_Combinations(), this.getCombinationFinding(), null, "combinations", null, 0, -1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReport_Disclaimer(), ecorePackage.getEString(), "disclaimer", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReport_Origin(), this.getReportOrigin(), "origin", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReport_Contexts(), theContextPackage.getContextRef(), null, "contexts", null, 1, -1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReport_Language(), ecorePackage.getEString(), "language", null, 0, 1, ComplianceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubject_SubjectFingerprint(), ecorePackage.getEString(), "subjectFingerprint", null, 1, 1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubject_ReportId(), ecorePackage.getEString(), "reportId", null, 0, 1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEvaluationEClass, ClassifierEvaluation.class, "ClassifierEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierEvaluation_UriFragment(), ecorePackage.getEString(), "uriFragment", null, 0, 1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierEvaluation_FeatureEvaluations(), this.getFeatureEvaluation(), null, "featureEvaluations", null, 0, -1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierEvaluation_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierEvaluation_LawfulBases(), theContextPackage.getCategoryRef(), null, "lawfulBases", null, 0, -1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEvaluationEClass, FeatureEvaluation.class, "FeatureEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureEvaluation_UriFragment(), ecorePackage.getEString(), "uriFragment", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_RelevanceLevel(), this.getRelevanceLevel(), "relevanceLevel", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findingEClass, Finding.class, "Finding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinding_Id(), ecorePackage.getEString(), "id", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Origin(), this.getReportOrigin(), "origin", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinding_Categories(), theContextPackage.getCategoryRef(), null, "categories", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinding_Requirements(), theContextPackage.getRequirementRef(), null, "requirements", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_RelevanceLevel(), this.getRelevanceLevel(), "relevanceLevel", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Confidence(), this.getConfidence(), "confidence", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_DetectedBy(), this.getDetectionSignal(), "detectedBy", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_SignalValues(), ecorePackage.getEString(), "signalValues", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Recommendation(), ecorePackage.getEString(), "recommendation", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinding_Evidence(), this.getEvidence(), null, "evidence", null, 1, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_DiagnosticId(), ecorePackage.getEString(), "diagnosticId", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinding_Resolution(), this.getFindingResolution(), null, "resolution", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_CorrectionNote(), ecorePackage.getEString(), "correctionNote", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationFindingEClass, CombinationFinding.class, "CombinationFinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinationFinding_Features(), this.getEvaluation(), this.getEvaluation_PartOfCombinations(), "features", null, 2, -1, CombinationFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvidence_ContextId(), ecorePackage.getEString(), "contextId", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_CorpusId(), ecorePackage.getEString(), "corpusId", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_CitationId(), ecorePackage.getEString(), "citationId", null, 1, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Quote(), ecorePackage.getEString(), "quote", null, 1, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Verbatim(), ecorePackage.getEBoolean(), "verbatim", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Relevance(), ecorePackage.getEString(), "relevance", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_SourceRef(), ecorePackage.getEString(), "sourceRef", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceRequestStatusEClass, ComplianceRequestStatus.class, "ComplianceRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceRequestStatus_SubjectFingerprint(), ecorePackage.getEString(), "subjectFingerprint", null, 1, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_BatchId(), ecorePackage.getEString(), "batchId", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_CustomId(), ecorePackage.getEString(), "customId", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_ReportId(), ecorePackage.getEString(), "reportId", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_Status(), this.getRequestStatusType(), "status", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_SubmittedAt(), ecorePackage.getEString(), "submittedAt", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_EndedAt(), ecorePackage.getEString(), "endedAt", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_Message(), ecorePackage.getEString(), "message", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_ContinuationCount(), ecorePackage.getEInt(), "continuationCount", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_OutputTokens(), ecorePackage.getEIntegerObject(), "outputTokens", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_Language(), ecorePackage.getEString(), "language", null, 0, 1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceRequestStatus_ContextIds(), ecorePackage.getEString(), "contextIds", null, 0, -1, ComplianceRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageSubjectEClass, PackageSubject.class, "PackageSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageSubject_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageSubject_NsURI(), ecorePackage.getEString(), "nsURI", null, 1, 1, PackageSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageSubject_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, PackageSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_Findings(), this.getFinding(), null, "findings", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_PartOfCombinations(), this.getCombinationFinding(), this.getCombinationFinding_Features(), "partOfCombinations", null, 0, -1, Evaluation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(transformationSubjectEClass, TransformationSubject.class, "TransformationSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationSubject_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, TransformationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationSubject_Language(), ecorePackage.getEString(), "language", null, 0, 1, TransformationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationSubject_SourceFingerprint(), ecorePackage.getEString(), "sourceFingerprint", null, 0, 1, TransformationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationSubject_SourcePackages(), this.getPackageSubject(), null, "sourcePackages", null, 0, -1, TransformationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationSubject_TargetPackages(), this.getPackageSubject(), null, "targetPackages", null, 0, -1, TransformationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEvaluationEClass, FlowEvaluation.class, "FlowEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowEvaluation_Mapping(), ecorePackage.getEString(), "mapping", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_SourceNsURI(), ecorePackage.getEString(), "sourceNsURI", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_SourceFeature(), ecorePackage.getEString(), "sourceFeature", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_TargetNsURI(), ecorePackage.getEString(), "targetNsURI", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_TargetFeature(), ecorePackage.getEString(), "targetFeature", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_FlowKind(), this.getFlowKind(), "flowKind", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_RelevanceLevel(), this.getRelevanceLevel(), "relevanceLevel", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEvaluation_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, FlowEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findingResolutionEClass, FindingResolution.class, "FindingResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFindingResolution_Status(), this.getReviewStatus(), "status", null, 1, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_Treatment(), this.getRiskTreatment(), "treatment", null, 0, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFindingResolution_RiskAssessment(), this.getRiskAssessment(), null, "riskAssessment", null, 0, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_MeasureIds(), ecorePackage.getEString(), "measureIds", null, 0, -1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_TreatmentNote(), ecorePackage.getEString(), "treatmentNote", null, 0, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_DelegatedTo(), ecorePackage.getEString(), "delegatedTo", null, 0, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_DueDate(), ecorePackage.getEString(), "dueDate", null, 0, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_Justification(), ecorePackage.getEString(), "justification", null, 1, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_DecidedBy(), ecorePackage.getEString(), "decidedBy", null, 1, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindingResolution_DecidedAt(), ecorePackage.getEString(), "decidedAt", null, 1, 1, FindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetSubjectEClass, AssetSubject.class, "AssetSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetSubject_InventoryId(), ecorePackage.getEString(), "inventoryId", null, 1, 1, AssetSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetSubject_AssetId(), ecorePackage.getEString(), "assetId", null, 1, 1, AssetSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetSubject_AssetName(), ecorePackage.getEString(), "assetName", null, 0, 1, AssetSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEvaluationEClass, ControlEvaluation.class, "ControlEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlEvaluation_Requirement(), theContextPackage.getRequirementRef(), null, "requirement", null, 1, 1, ControlEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlEvaluation_Result(), this.getControlResult(), "result", null, 0, 1, ControlEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlEvaluation_MeasureIds(), ecorePackage.getEString(), "measureIds", null, 0, -1, ControlEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskAssessmentEClass, RiskAssessment.class, "RiskAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskAssessment_MethodologyId(), ecorePackage.getEString(), "methodologyId", null, 1, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_Likelihood(), ecorePackage.getEString(), "likelihood", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_Severity(), ecorePackage.getEString(), "severity", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_RiskLevel(), ecorePackage.getEString(), "riskLevel", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relevanceLevelEEnum, RelevanceLevel.class, "RelevanceLevel");
		addEEnumLiteral(relevanceLevelEEnum, RelevanceLevel.NONE);
		addEEnumLiteral(relevanceLevelEEnum, RelevanceLevel.LOW);
		addEEnumLiteral(relevanceLevelEEnum, RelevanceLevel.MEDIUM);
		addEEnumLiteral(relevanceLevelEEnum, RelevanceLevel.HIGH);

		initEEnum(confidenceEEnum, Confidence.class, "Confidence");
		addEEnumLiteral(confidenceEEnum, Confidence.LOW);
		addEEnumLiteral(confidenceEEnum, Confidence.MEDIUM);
		addEEnumLiteral(confidenceEEnum, Confidence.HIGH);
		addEEnumLiteral(confidenceEEnum, Confidence.REQUIRES_CONFIRMATION);

		initEEnum(detectionSignalEEnum, DetectionSignal.class, "DetectionSignal");
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.FEATURE_NAME);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.FEATURE_TYPE);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.MULTIPLICITY);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.ENUM_LITERALS);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.OWNING_CLASSIFIER_NAME);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.DOCUMENTATION_ANNOTATION);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.CONTAINMENT_CONTEXT);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.FEATURE_COMBINATION);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.TRANSFORMATION_FLOW);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.HUMAN_REVIEW);

		initEEnum(requestStatusTypeEEnum, RequestStatusType.class, "RequestStatusType");
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.SUBMITTED);
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.COMPLETED);
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.FAILED);
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.EXHAUSTED);

		initEEnum(reportOriginEEnum, ReportOrigin.class, "ReportOrigin");
		addEEnumLiteral(reportOriginEEnum, ReportOrigin.UNKNOWN);
		addEEnumLiteral(reportOriginEEnum, ReportOrigin.AI_AGENT);
		addEEnumLiteral(reportOriginEEnum, ReportOrigin.HUMAN);
		addEEnumLiteral(reportOriginEEnum, ReportOrigin.STATIC_ANALYSIS);

		initEEnum(flowKindEEnum, FlowKind.class, "FlowKind");
		addEEnumLiteral(flowKindEEnum, FlowKind.DIRECT);
		addEEnumLiteral(flowKindEEnum, FlowKind.EXPRESSION);
		addEEnumLiteral(flowKindEEnum, FlowKind.CONCATENATION);
		addEEnumLiteral(flowKindEEnum, FlowKind.AGGREGATION);
		addEEnumLiteral(flowKindEEnum, FlowKind.OPAQUE);

		initEEnum(controlResultEEnum, ControlResult.class, "ControlResult");
		addEEnumLiteral(controlResultEEnum, ControlResult.NOT_ASSESSED);
		addEEnumLiteral(controlResultEEnum, ControlResult.SATISFIED);
		addEEnumLiteral(controlResultEEnum, ControlResult.PARTIALLY_SATISFIED);
		addEEnumLiteral(controlResultEEnum, ControlResult.NOT_SATISFIED);
		addEEnumLiteral(controlResultEEnum, ControlResult.NOT_APPLICABLE);

		initEEnum(reviewStatusEEnum, ReviewStatus.class, "ReviewStatus");
		addEEnumLiteral(reviewStatusEEnum, ReviewStatus.OPEN);
		addEEnumLiteral(reviewStatusEEnum, ReviewStatus.REVIEWED);

		initEEnum(riskTreatmentEEnum, RiskTreatment.class, "RiskTreatment");
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.ACCEPT);
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.MITIGATE);
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.AVOID);
		addEEnumLiteral(riskTreatmentEEnum, RiskTreatment.TRANSFER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "A compliance report: the findings of one review of one subject (an EPackage, a transformation, an asset) against one or more contexts, and the decisions people took on them."
		   });
		addAnnotation
		  (complianceReportEClass,
		   source,
		   new String[] {
			   "documentation", "The result of one review of one subject against one or more compliance contexts. Each revision of a review is its own report; the history model lines them up."
		   });
		addAnnotation
		  (getComplianceReport_ReportId(),
		   source,
		   new String[] {
			   "documentation", "The unique identifier for this report"
		   });
		addAnnotation
		  (getComplianceReport_Name(),
		   source,
		   new String[] {
			   "documentation", "Human readable title of the review, e.g. \'GDPR review of clinic 1.0.0\'."
		   });
		addAnnotation
		  (getComplianceReport_GeneratedAt(),
		   source,
		   new String[] {
			   "documentation", "When the review ran, as an ISO-8601 UTC instant, e.g. 2026-09-09T14:20:00Z."
		   });
		addAnnotation
		  (getComplianceReport_GeneratedBy(),
		   source,
		   new String[] {
			   "documentation", "The language model that produced this review, as the provider names it, e.g. claude-sonnet-4-6. Two models reviewing the same metamodel do not agree in every particular - measured on one 3.4KB model, two models agreed exactly on the classifiers carrying obvious personal data and differed on the ones turning on a processing purpose - so a finding cannot be weighed without knowing what produced it."
		   });
		addAnnotation
		  (getComplianceReport_Subject(),
		   source,
		   new String[] {
			   "documentation", "Required. What was reviewed, including the fingerprint that pins the exact revision: a PackageSubject for a metamodel, a TransformationSubject for a compiled transformation. Everything else the review rests on is recorded inside it."
		   });
		addAnnotation
		  (getComplianceReport_Evaluations(),
		   source,
		   new String[] {
			   "documentation", "One entry per thing that was examined: a ClassifierEvaluation per classifier in a metamodel review, a FlowEvaluation per source-to-target path in a transformation review. Add an entry even when nothing was found, so a reader can distinguish \'examined and clean\' from \'never examined\'."
		   });
		addAnnotation
		  (getComplianceReport_Combinations(),
		   source,
		   new String[] {
			   "documentation", "Findings that arise from two or more evaluations together: several features that identify a person only in combination, or several flows meeting in one target field. They are held here, not under the evaluations themselves, because a combination may span several classifiers and would otherwise need an arbitrary owner."
		   });
		addAnnotation
		  (getComplianceReport_Disclaimer(),
		   source,
		   new String[] {
			   "documentation", "Statement of what the report is and is not. It is decision support for a data protection officer: it flags features needing human review and must not assert compliance or non-compliance."
		   });
		addAnnotation
		  (getComplianceReport_Origin(),
		   source,
		   new String[] {
			   "documentation", "The origin of the report, namely whether it was redacted by an AI agent or by a human"
		   });
		addAnnotation
		  (getComplianceReport_Contexts(),
		   source,
		   new String[] {
			   "documentation", "The contexts, pinned to the version the subject was checked against."
		   });
		addAnnotation
		  (getComplianceReport_Language(),
		   source,
		   new String[] {
			   "documentation", "The language the report is written in. That may differ from the language of the corpus (e.g. a report can be written with the prose text in English but have the evidences for the findings from a German corpus, and so those evidences in German)"
		   });
		addAnnotation
		  (subjectEClass,
		   source,
		   new String[] {
			   "documentation", "Identity of what was reviewed, precise enough to tell whether a later revision is still the same artefact. Subclassed per kind of artefact: PackageSubject for an Ecore metamodel, TransformationSubject for a compiled model transformation. A report has exactly one subject; everything else the review rests on is recorded inside that subject."
		   });
		addAnnotation
		  (getSubject_SubjectFingerprint(),
		   source,
		   new String[] {
			   "documentation", "Required. Fingerprint of the exact revision that was reviewed. It is the identity of the review: a review is of content, not of a location, so the same bytes reached by any route are the same subject. The scheme depends on what is under review - fp1 for an EPackage, m2x1 for a compiled transformation unit - so two fingerprints are only comparable between subjects of the same kind. Compute it; never invent or copy one."
		   });
		addAnnotation
		  (getSubject_ReportId(),
		   source,
		   new String[] {
			   "documentation", "The report that reviewed this subject, as the object id that report is stored under. Set it on a subject that is named inside another report as something that review rests on: it is the provenance of every carried-over finding, and without it a reader cannot check a quote against the review that produced it. Leave it unset on a report\'s own subject - the owning report already identifies itself - and leave it unset when no review of this revision exists, saying so in a finding, because an unreviewed source makes the analysis incomplete rather than clean."
		   });
		addAnnotation
		  (classifierEvaluationEClass,
		   source,
		   new String[] {
			   "documentation", "The result of examining one classifier (EClass or EEnum) of the reviewed model."
		   });
		addAnnotation
		  (getClassifierEvaluation_UriFragment(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment addressing the classifier in its own resource, e.g. //Patient."
		   });
		addAnnotation
		  (getClassifierEvaluation_FeatureEvaluations(),
		   source,
		   new String[] {
			   "documentation", "One entry per structural feature examined, including features where nothing was found."
		   });
		addAnnotation
		  (getClassifierEvaluation_Purpose(),
		   source,
		   new String[] {
			   "documentation", "Purpose of processing of the classifier as a whole. Its features inherit it."
		   });
		addAnnotation
		  (getClassifierEvaluation_LawfulBases(),
		   source,
		   new String[] {
			   "documentation", "Lawful bases of the processing, from the lawful-basis taxonomy. Its features inherit them."
		   });
		addAnnotation
		  (featureEvaluationEClass,
		   source,
		   new String[] {
			   "documentation", "The result of examining one structural feature."
		   });
		addAnnotation
		  (getFeatureEvaluation_UriFragment(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment addressing the feature, e.g. //Patient/street."
		   });
		addAnnotation
		  (getFeatureEvaluation_TypeName(),
		   source,
		   new String[] {
			   "documentation", "Name of the feature\'s EType as written in the model, e.g. EString, EDate, Denomination. The type is itself a signal: a date on a birth field, or a byte array under a face field."
		   });
		addAnnotation
		  (getFeatureEvaluation_Many(),
		   source,
		   new String[] {
			   "documentation", "True when the feature\'s upperBound is not 1. A repeated feature can form a history or profile even when a single value would be harmless."
		   });
		addAnnotation
		  (getFeatureEvaluation_RelevanceLevel(),
		   source,
		   new String[] {
			   "documentation", "Highest relevance among this feature\'s findings. Set NONE when the feature was examined and nothing was found; that is different from leaving it unset."
		   });
		addAnnotation
		  (getFeatureEvaluation_Purpose(),
		   source,
		   new String[] {
			   "documentation", "The reason for storing this particular feature. This field should be always entered by a human."
		   });
		addAnnotation
		  (findingEClass,
		   source,
		   new String[] {
			   "documentation", "One assessment about a classifier or feature, always supported by at least one piece of legal evidence."
		   });
		addAnnotation
		  (getFinding_Id(),
		   source,
		   new String[] {
			   "documentation", "Required and unique within the report, e.g. F-001. Used to refer to the finding from outside."
		   });
		addAnnotation
		  (getFinding_Origin(),
		   source,
		   new String[] {
			   "documentation", "Who raised this finding. Distinguishes a finding a person added from the findings of the agent within the same revision."
		   });
		addAnnotation
		  (getFinding_Categories(),
		   source,
		   new String[] {
			   "documentation", "Classification, e.g. the data category of the GDPR context."
		   });
		addAnnotation
		  (getFinding_Requirements(),
		   source,
		   new String[] {
			   "documentation", "The requirements the finding concerns."
		   });
		addAnnotation
		  (getFinding_RelevanceLevel(),
		   source,
		   new String[] {
			   "documentation", "How serious the finding is if it holds. Independent of confidence: a finding can be severe but uncertain."
		   });
		addAnnotation
		  (getFinding_Confidence(),
		   source,
		   new String[] {
			   "documentation", "How sure the assessment is. Independent of relevanceLevel. Use REQUIRES_PURPOSE_CONFIRMATION whenever the classification cannot be settled from the metamodel alone."
		   });
		addAnnotation
		  (getFinding_DetectedBy(),
		   source,
		   new String[] {
			   "documentation", "Which signals led to this finding. Set every one that applies. A reviewer uses this to judge the finding without re-deriving it, so a name match and an enum-literal match must not look alike."
		   });
		addAnnotation
		  (getFinding_SignalValues(),
		   source,
		   new String[] {
			   "documentation", "The concrete values behind the signal, quoted exactly, e.g. the EEnum literals observed or the documentation phrase that triggered the flag. This is what makes detectedBy checkable."
		   });
		addAnnotation
		  (getFinding_Rationale(),
		   source,
		   new String[] {
			   "documentation", "Why the cited law applies to this feature, in prose. This is your reasoning and is read as interpretation, not fact."
		   });
		addAnnotation
		  (getFinding_Recommendation(),
		   source,
		   new String[] {
			   "documentation", "What could be done about it, e.g. generalise the value, record a lawful basis, remove the attribute. Optional, and never phrased as a compliance verdict."
		   });
		addAnnotation
		  (getFinding_Evidence(),
		   source,
		   new String[] {
			   "documentation", "Required, at least one. A finding without legal evidence is an opinion and must not be produced."
		   });
		addAnnotation
		  (getFinding_DiagnosticId(),
		   source,
		   new String[] {
			   "documentation", "The id of the model.atlas Diagnostic this finding was raised as, so that a later review of the same artefact updates that diagnostic instead of raising a second one for the same problem. Diagnostic ids are deterministic - derived from the producer, the code and the target, the producer here being the GDPR review - so the same finding about the same element keeps its id across re-validations and this reference survives without a matching step. It holds the id alone: a diagnostic is addressed from outside by scope, registry, stage, objectId and id, and the first four are those of the object this report is about. Leave it unset on a finding that no diagnostic was raised for."
		   });
		addAnnotation
		  (getFinding_Resolution(),
		   source,
		   new String[] {
			   "documentation", "The decision a person took on this finding: resolved, knowingly accepted, or explicitly re-opened, together with its justification and who took it when. Unset means no decision has been taken yet, which reads the same as OPEN - so a report written before this feature existed stays valid. A review never sets it; only a person does."
		   });
		addAnnotation
		  (getFinding_CorrectionNote(),
		   source,
		   new String[] {
			   "documentation", "Why a person changed the assessment itself - category, relevanceLevel or confidence - in the revision that carries this finding. Kept apart from resolution.justification because correcting the assessment and deciding what to do about it are separate acts: a person may correct a category and leave the finding open. Who made the correction and when is not repeated here; it is the generatedBy and generatedAt of the report revision, whose origin is HUMAN. Empty on a finding nobody corrected."
		   });
		addAnnotation
		  (combinationFindingEClass,
		   source,
		   new String[] {
			   "documentation", "A finding raised by the combination of several features, e.g. a quasi-identifier set. The kind of combination is a category of the context (combination-kind taxonomy)."
		   });
		addAnnotation
		  (getCombinationFinding_Features(),
		   source,
		   new String[] {
			   "documentation", "The evaluations that together create the risk. At least two, and they may belong to different classifiers. In a review of a metamodel these are FeatureEvaluations; in a review of a transformation they are FlowEvaluations, which is how several fields merged into one target field are recorded as one combination. Reference existing entries rather than creating new ones. resolveProxies is false because a combination only ever points at evaluations inside its own report: EMF requires the opposite of a transient reference to be transient too unless it is not proxy resolving, and partOfCombinations has to stay transient because it is derived."
		   });
		addAnnotation
		  (evidenceEClass,
		   source,
		   new String[] {
			   "documentation", "A quotation from the legal corpus supporting a finding. The quote is fact; the relevance is interpretation. Keeping them apart lets a reviewer check the citation without accepting the reasoning."
		   });
		addAnnotation
		  (getEvidence_ContextId(),
		   source,
		   new String[] {
			   "documentation", "Id of the context whose corpus is cited."
		   });
		addAnnotation
		  (getEvidence_CorpusId(),
		   source,
		   new String[] {
			   "documentation", "Id of the corpus the citation belongs to. Needed because one context may hold several corpora."
		   });
		addAnnotation
		  (getEvidence_CitationId(),
		   source,
		   new String[] {
			   "documentation", "Required. Identifier of the quoted unit in the corpus, e.g. Art.9(2)(a), Art.4(14) or Rec.26. It must already exist in the corpus: look it up, never construct it by guessing a plausible article or paragraph number."
		   });
		addAnnotation
		  (getEvidence_Quote(),
		   source,
		   new String[] {
			   "documentation", "Required. The corpus unit\'s text, copied unchanged. Never paraphrase, shorten or tidy it. The verbatim quote is what makes the finding auditable."
		   });
		addAnnotation
		  (getEvidence_Verbatim(),
		   source,
		   new String[] {
			   "documentation", "True when quote was copied from the corpus without alteration. Set false only if the text was deliberately excerpted, and say so in relevance."
		   });
		addAnnotation
		  (getEvidence_Relevance(),
		   source,
		   new String[] {
			   "documentation", "One sentence on why this unit supports the finding. Unlike quote, this is your interpretation."
		   });
		addAnnotation
		  (getEvidence_SourceRef(),
		   source,
		   new String[] {
			   "documentation", "The corpus unit\'s own sourceRef, pointing back to the node in the source document, for tracing a suspect extraction."
		   });
		addAnnotation
		  (relevanceLevelEEnum,
		   source,
		   new String[] {
			   "documentation", "How serious a finding is if it holds. Says nothing about how certain it is."
		   });
		addAnnotation
		  (relevanceLevelEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Examined and nothing of concern found. Meaningfully different from leaving the level unset."
		   });
		addAnnotation
		  (relevanceLevelEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "In scope but limited consequence for the data subject."
		   });
		addAnnotation
		  (relevanceLevelEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Warrants review, e.g. a quasi-identifier or an unnecessarily precise value."
		   });
		addAnnotation
		  (relevanceLevelEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Special-category, criminal-conviction or directly identifying data, or a combination likely to single an individual out."
		   });
		addAnnotation
		  (confidenceEEnum,
		   source,
		   new String[] {
			   "documentation", "How certain the assessment is. Independent of relevanceLevel."
		   });
		addAnnotation
		  (confidenceEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Weak signal, e.g. an ambiguous feature name with no corroboration."
		   });
		addAnnotation
		  (confidenceEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Reasonable inference from more than one signal, but the model could still be read differently."
		   });
		addAnnotation
		  (confidenceEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The model itself settles it, e.g. EEnum literals naming religious denominations."
		   });
		addAnnotation
		  (confidenceEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The verdict depends on facts the subject does not show, e.g. the purpose of processing. A person must confirm it."
		   });
		addAnnotation
		  (detectionSignalEEnum,
		   source,
		   new String[] {
			   "documentation", "What in the model led to a finding. Recording it lets a reviewer weigh the finding without repeating the analysis."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The feature\'s own name, e.g. email, religion, ipAddress."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The feature\'s type, e.g. a date on a birth field or a byte array under a face field."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The feature is repeated, so values accumulate into a history or profile."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The literals of an EEnum reveal the content regardless of the feature\'s name. Often decisive where the name is deliberately bland; put the literals in signalValues."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The owning classifier gives the feature its meaning: name on Company is not personal data, name on Patient is."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "A documentation or genmodel annotation states a purpose the names do not reveal. Quote the phrase in signalValues."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Where the feature sits in the containment hierarchy, e.g. contained by a class that is itself sensitive."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "The finding arises from several features together rather than any one of them. Expect this on a CombinationFinding."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "The finding arises from what a transformation does with the feature rather than from the feature itself: the compiled unit was read, and the value was followed to where it is written. Expect this on a FlowEvaluation."
		   });
		addAnnotation
		  (detectionSignalEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Raised by a person, not by a detection rule."
		   });
		addAnnotation
		  (complianceRequestStatusEClass,
		   source,
		   new String[] {
			   "documentation", "The record of one review request for one model revision: that it was asked for, what is carrying it out, and how it ended. It exists from the moment the request is accepted, which a ComplianceReport does not - a report is only written when a review succeeds, so a run that is still going or that failed leaves no report at all. Anything deciding whether to ask for a review has to consult this rather than the report, or a run already in flight is paid for twice and a run that failed is re-tried on every trigger forever. One instance per reviewed revision per language, keyed by subjectFingerprint and language together: a review runs in one language from start to seal, so the English and the German review of one revision are independent runs with their own batch, their own findings and their own record, and neither answers for the other."
		   });
		addAnnotation
		  (getComplianceRequestStatus_SubjectFingerprint(),
		   source,
		   new String[] {
			   "documentation", "The revision of the subject under review, in the same form Subject records it. This is the identity of the record: the review is of content, not of a location, so the same bytes reached by any route are the same review and must not be paid for again."
		   });
		addAnnotation
		  (getComplianceRequestStatus_BatchId(),
		   source,
		   new String[] {
			   "documentation", "The provider-side identifier of the work. It is the only handle on a run that outlives the process that started it: without it a restart cannot tell a finished review from one still running, and cannot collect either."
		   });
		addAnnotation
		  (getComplianceRequestStatus_CustomId(),
		   source,
		   new String[] {
			   "documentation", "The identifier of this request within the batch. Required to read the outcome back - a result is selected by it, and so is the check for whether the turn was left paused."
		   });
		addAnnotation
		  (getComplianceRequestStatus_ReportId(),
		   source,
		   new String[] {
			   "documentation", "The id the ComplianceReport is stored under once the review succeeds. Empty until then, and stays empty for a run that never produced one."
		   });
		addAnnotation
		  (getComplianceRequestStatus_Status(),
		   source,
		   new String[] {
			   "documentation", "How the request stands. Written as SUBMITTED when the work is accepted and updated once when it ends."
		   });
		addAnnotation
		  (getComplianceRequestStatus_SubmittedAt(),
		   source,
		   new String[] {
			   "documentation", "When the request was accepted, as an ISO-8601 UTC instant, e.g. 2026-09-09T14:20:00Z."
		   });
		addAnnotation
		  (getComplianceRequestStatus_EndedAt(),
		   source,
		   new String[] {
			   "documentation", "When it reached a terminal status, in the same form. Empty while it is still running, which together with submittedAt is how a record abandoned by a dead process is recognised."
		   });
		addAnnotation
		  (getComplianceRequestStatus_Message(),
		   source,
		   new String[] {
			   "documentation", "What to tell whoever reads the outcome: the reason for a failure, or what was recorded before a run was given up on. Meant to be read by a person deciding what to do next."
		   });
		addAnnotation
		  (getComplianceRequestStatus_ContinuationCount(),
		   source,
		   new String[] {
			   "documentation", "How many times the run had to be resumed after the provider stopped it at its iteration budget. Zero is the ordinary case. A number close to the configured ceiling says the model is at the edge of what one run can review, which is worth knowing before the ceiling is reached and work is lost."
		   });
		addAnnotation
		  (getComplianceRequestStatus_OutputTokens(),
		   source,
		   new String[] {
			   "documentation", "Tokens generated across the run, where the provider reports them. The only record of what an individual review cost."
		   });
		addAnnotation
		  (getComplianceRequestStatus_Language(),
		   source,
		   new String[] {
			   "documentation", "The language version of the regulation this review ran against, e.g. EN or DE - the language of its corpus, of the quotes it carries and of the report it produces. It is half the identity of the record, beside subjectFingerprint, and the model leaves it optional only because EMF has no way to say otherwise: a record that does not name its language is either filed where another language will look for it, or makes one language an unnamed default that nothing downstream can see. Both end as a review that is never submitted because something else claimed to have done it. Set it always."
		   });
		addAnnotation
		  (getComplianceRequestStatus_ContextIds(),
		   source,
		   new String[] {
			   "documentation", "Ids of the contexts the review was requested for."
		   });
		addAnnotation
		  (requestStatusTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "How a review request ended, or that it has not. Only SUBMITTED is not terminal."
		   });
		addAnnotation
		  (requestStatusTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Accepted and being carried out. A second request for the same model revision must not be made while a record is in this state."
		   });
		addAnnotation
		  (requestStatusTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The review finished and its report was stored. reportId names it."
		   });
		addAnnotation
		  (requestStatusTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The review did not finish. message says why. Nothing is retried automatically: a review costs money, and a model that fails for a structural reason would otherwise be re-tried on every trigger."
		   });
		addAnnotation
		  (requestStatusTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The run was still unfinished after the allowed number of continuations and was given up on. Whatever it had recorded was never sealed, so there is no report; raising the ceiling or reviewing a smaller model is the way forward."
		   });
		addAnnotation
		  (reportOriginEEnum,
		   source,
		   new String[] {
			   "documentation", "What formed the judgements a report carries. It is not provenance trivia: a finding weighs differently depending on whether a person, an agent or a program arrived at it, and a report that cannot say which cannot be weighed at all."
		   });
		addAnnotation
		  (reportOriginEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Derived by a program from artefacts that were already reviewed - no agent and no person formed the judgement. A static analysis quotes no law of its own: its evidence is carried over from the review it rests on, so a finding here is only ever as good as that review."
		   });
		addAnnotation
		  (packageSubjectEClass,
		   source,
		   new String[] {
			   "documentation", "Identity of one revision of one EPackage. It is the subject of a metamodel review, and it is also how a TransformationSubject names a metamodel the unit was compiled against - the same class in both places, because what identifies a package does not change with the reason it is being named. It records what the package is, never whether anyone reviewed it: that is what reportId on Subject is for."
		   });
		addAnnotation
		  (getPackageSubject_Name(),
		   source,
		   new String[] {
			   "documentation", "The reviewed EPackage\'s name attribute."
		   });
		addAnnotation
		  (getPackageSubject_NsURI(),
		   source,
		   new String[] {
			   "documentation", "Required. The reviewed EPackage\'s nsURI, copied verbatim. It says which model this is; subjectFingerprint says which revision, and a carried-over finding is matched on the two together. A namespace alone is not an identity - it can hold more than one revision."
		   });
		addAnnotation
		  (getPackageSubject_NsPrefix(),
		   source,
		   new String[] {
			   "documentation", "The reviewed EPackage\'s nsPrefix."
		   });
		addAnnotation
		  (evaluationEClass,
		   source,
		   new String[] {
			   "documentation", "One thing that was examined, together with what was found on it. What that thing is depends on the review: a metamodel review examines classifiers and their features, a transformation review examines the paths along which values travel. Record an entry even when nothing was found, so a reader can tell \'examined and clean\' from \'never examined\'."
		   });
		addAnnotation
		  (getEvaluation_Id(),
		   source,
		   new String[] {
			   "documentation", "Required and unique within the report. CombinationFinding points here, so it must be stable across reruns. For a classifier or a feature use classifier.feature, e.g. \'Patient.street\'. For a flow use mapping:source->target, e.g. \'toContact:Patient.diagnosis->Contact.comment\', which is derivable from the compiled unit and therefore the same on every rerun."
		   });
		addAnnotation
		  (getEvaluation_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of what was examined, exactly as it appears in the reviewed artefact: a classifier or feature name in a metamodel review, a readable label for the path in a transformation review."
		   });
		addAnnotation
		  (getEvaluation_Findings(),
		   source,
		   new String[] {
			   "documentation", "Findings about this one evaluation on its own - the classifier rather than any of its features, the feature itself, or this single flow. Findings that only arise from several evaluations together belong in a CombinationFinding."
		   });
		addAnnotation
		  (getEvaluation_PartOfCombinations(),
		   source,
		   new String[] {
			   "documentation", "Derived: EMF maintains this from CombinationFinding.features. Do not set it directly; add the evaluation to the combination instead."
		   });
		addAnnotation
		  (transformationSubjectEClass,
		   source,
		   new String[] {
			   "documentation", "Identity of a reviewed model transformation: which compiled unit was examined, and which revisions of which metamodels it was compiled against, split by whether the unit reads them or writes them. subjectFingerprint here is the m2x1 fingerprint of the compiled unit; it covers a compiled program rather than an EPackage, so it is never comparable with a package fingerprint. A transformation is reviewed for what it does to data that the metamodel reviews already classified, so the packages it names are not decoration - they are where the findings come from."
		   });
		addAnnotation
		  (getTransformationSubject_QualifiedName(),
		   source,
		   new String[] {
			   "documentation", "Required. The unit\'s qualified name as the transformation declares it, e.g. clinic2contacts."
		   });
		addAnnotation
		  (getTransformationSubject_Language(),
		   source,
		   new String[] {
			   "documentation", "The transformation language the unit was compiled from, e.g. qvto. A later analyser for another language writes its own value here rather than a second subject type."
		   });
		addAnnotation
		  (getTransformationSubject_SourceFingerprint(),
		   source,
		   new String[] {
			   "documentation", "Fingerprint of the source text the unit was compiled from (m2x1 scheme), for tracing a report back to the file a developer edited."
		   });
		addAnnotation
		  (getTransformationSubject_SourcePackages(),
		   source,
		   new String[] {
			   "documentation", "The metamodels this unit reads, each pinned to the exact revision: an entry\'s subjectFingerprint is the key of the review whose findings this report carries over, and its reportId points at that review. Take these from the compiled unit\'s own manifest, never from the source text: the manifest records what the compiler actually resolved. A model the unit declares inout belongs here and in targetPackages both, as two entries with the same nsURI and fingerprint. List a package even when no review of it exists, and say so in a finding - an unreviewed source makes the analysis incomplete rather than clean."
		   });
		addAnnotation
		  (getTransformationSubject_TargetPackages(),
		   source,
		   new String[] {
			   "documentation", "The metamodels this unit writes, recorded exactly as sourcePackages is, and taken from the same manifest. A target model\'s own review, where there is one, may disagree with what the flows put into it - that disagreement is a finding, not an error. A model the unit declares inout belongs here and in sourcePackages both."
		   });
		addAnnotation
		  (flowEvaluationEClass,
		   source,
		   new String[] {
			   "documentation", "The result of examining one path along which a transformation moves a value: one source feature reaching one target feature, in one mapping. A metamodel review asks what a field holds; a transformation review asks where what it holds ends up, so the unit of evaluation is the pair rather than the field. Several sources reaching the same target field are several FlowEvaluations, tied together by one CombinationFinding."
		   });
		addAnnotation
		  (getFlowEvaluation_Mapping(),
		   source,
		   new String[] {
			   "documentation", "Name of the mapping or helper the assignment sits in, e.g. toContact. A transformation has no line numbers to quote once compiled, so this is the coarsest address a developer can act on."
		   });
		addAnnotation
		  (getFlowEvaluation_SourceNsURI(),
		   source,
		   new String[] {
			   "documentation", "nsURI of the metamodel the source feature belongs to. Two source models can carry the same fragment, so the fragment alone does not identify a feature."
		   });
		addAnnotation
		  (getFlowEvaluation_SourceFeature(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment of the feature that is read, e.g. //Patient/diagnosis. It matches the uriFragment of a FeatureEvaluation in that metamodel\'s own review, which is how a finding here inherits its category and its evidence."
		   });
		addAnnotation
		  (getFlowEvaluation_TargetNsURI(),
		   source,
		   new String[] {
			   "documentation", "nsURI of the metamodel the target feature belongs to."
		   });
		addAnnotation
		  (getFlowEvaluation_TargetFeature(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment of the feature that is written, e.g. //Contact/comment."
		   });
		addAnnotation
		  (getFlowEvaluation_FlowKind(),
		   source,
		   new String[] {
			   "documentation", "How the value travels. It is part of the assessment, not decoration: a value copied into a typed field keeps its classification, while the same value concatenated into free text does not."
		   });
		addAnnotation
		  (getFlowEvaluation_RelevanceLevel(),
		   source,
		   new String[] {
			   "documentation", "Highest relevance among this flow\'s findings. Set NONE when the flow was examined and nothing was found; that is different from leaving it unset."
		   });
		addAnnotation
		  (getFlowEvaluation_Purpose(),
		   source,
		   new String[] {
			   "documentation", "Why this value is carried into the target model. A purpose stated for the source field does not answer it: the transformation is a new processing, and this field is where a human answers for it. Always entered by a human."
		   });
		addAnnotation
		  (flowKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How a transformation moves a value from a source feature to a target feature. Choose the most specific value the compiled unit supports."
		   });
		addAnnotation
		  (flowKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The source feature is assigned to the target feature unchanged. The target holds the same data and inherits the source\'s classification."
		   });
		addAnnotation
		  (flowKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The value is computed from the source feature, but from that feature alone, e.g. trimmed, cased or reformatted. Still the same data unless the expression is shown to remove the link to the person."
		   });
		addAnnotation
		  (flowKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The value is joined with others into one string. The target field can no longer be classified, minimised or erased per source field, which is usually the point of the finding rather than a detail of it."
		   });
		addAnnotation
		  (flowKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The value is folded over a collection, e.g. counted, summed or joined across many objects. The result may say less about one person - or more, if the fold is a profile."
		   });
		addAnnotation
		  (flowKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The value passes through something the analyser does not follow: a blackbox operation, an imported library, a late resolution or an intermediate property. Record the flow as opaque rather than dropping it - silence would be read as \'nothing happens here\'."
		   });
		addAnnotation
		  (findingResolutionEClass,
		   source,
		   new String[] {
			   "documentation", "What a person decided about a finding: whether it was reviewed and how its risk is treated (ISO 27005 / ISO 31000). Whether the cause was removed is not decided here; the next review of the changed subject shows it by no longer raising the finding."
		   });
		addAnnotation
		  (getFindingResolution_Status(),
		   source,
		   new String[] {
			   "documentation", "Whether a person has classified the finding."
		   });
		addAnnotation
		  (getFindingResolution_Treatment(),
		   source,
		   new String[] {
			   "documentation", "How the risk is treated. Required once REVIEWED."
		   });
		addAnnotation
		  (getFindingResolution_RiskAssessment(),
		   source,
		   new String[] {
			   "documentation", "The risk assessment the treatment is based on."
		   });
		addAnnotation
		  (getFindingResolution_MeasureIds(),
		   source,
		   new String[] {
			   "documentation", "Ids of the inventory measures that treat the finding (MITIGATE)."
		   });
		addAnnotation
		  (getFindingResolution_TreatmentNote(),
		   source,
		   new String[] {
			   "documentation", "What is done when it is not a measure, e.g. for AVOID: the field is generalised."
		   });
		addAnnotation
		  (getFindingResolution_DelegatedTo(),
		   source,
		   new String[] {
			   "documentation", "To whom the risk is transferred or delegated (TRANSFER)."
		   });
		addAnnotation
		  (getFindingResolution_DueDate(),
		   source,
		   new String[] {
			   "documentation", "Until when the treatment is done, as ISO-8601 date (MITIGATE, TRANSFER)."
		   });
		addAnnotation
		  (getFindingResolution_Justification(),
		   source,
		   new String[] {
			   "documentation", "Why the person decided so."
		   });
		addAnnotation
		  (getFindingResolution_DecidedBy(),
		   source,
		   new String[] {
			   "documentation", "Who decided."
		   });
		addAnnotation
		  (getFindingResolution_DecidedAt(),
		   source,
		   new String[] {
			   "documentation", "When, as ISO-8601 date-time."
		   });
		addAnnotation
		  (assetSubjectEClass,
		   source,
		   new String[] {
			   "documentation", "An asset of a compliance inventory as subject of a review, e.g. for a Grundschutz check."
		   });
		addAnnotation
		  (getAssetSubject_InventoryId(),
		   source,
		   new String[] {
			   "documentation", "Id of the inventory."
		   });
		addAnnotation
		  (getAssetSubject_AssetId(),
		   source,
		   new String[] {
			   "documentation", "Id of the asset within the inventory."
		   });
		addAnnotation
		  (getAssetSubject_AssetName(),
		   source,
		   new String[] {
			   "documentation", "Display name of the asset at review time."
		   });
		addAnnotation
		  (controlResultEEnum,
		   source,
		   new String[] {
			   "documentation", "Result of checking one requirement."
		   });
		addAnnotation
		  (controlResultEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Not checked yet."
		   });
		addAnnotation
		  (controlResultEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Satisfied."
		   });
		addAnnotation
		  (controlResultEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Partly satisfied."
		   });
		addAnnotation
		  (controlResultEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Not satisfied."
		   });
		addAnnotation
		  (controlResultEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Does not apply to the subject."
		   });
		addAnnotation
		  (controlEvaluationEClass,
		   source,
		   new String[] {
			   "documentation", "Evaluation of one requirement for the subject, for control-based contexts."
		   });
		addAnnotation
		  (getControlEvaluation_Requirement(),
		   source,
		   new String[] {
			   "documentation", "The requirement checked."
		   });
		addAnnotation
		  (getControlEvaluation_Result(),
		   source,
		   new String[] {
			   "documentation", "Result of the check."
		   });
		addAnnotation
		  (getControlEvaluation_MeasureIds(),
		   source,
		   new String[] {
			   "documentation", "Ids of the inventory measures the check relied on."
		   });
		addAnnotation
		  (reviewStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Whether a person has classified a finding."
		   });
		addAnnotation
		  (reviewStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Not classified. Recorded explicitly only when an earlier decision is withdrawn."
		   });
		addAnnotation
		  (reviewStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Classified by a person; treatment and risk assessment are set."
		   });
		addAnnotation
		  (riskTreatmentEEnum,
		   source,
		   new String[] {
			   "documentation", "Risk treatment options of ISO 27005 / ISO 31000."
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The risk is accepted."
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The risk is reduced by measures or a change of the subject."
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The cause is removed, e.g. the processing or the field is dropped."
		   });
		addAnnotation
		  (riskTreatmentEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Someone else bears or decides the risk."
		   });
		addAnnotation
		  (riskAssessmentEClass,
		   source,
		   new String[] {
			   "documentation", "Likelihood times severity gives the risk level, on the scales of a risk methodology of the inventory. The risk level is stated, not derived, so a person can deviate from the matrix."
		   });
		addAnnotation
		  (getRiskAssessment_MethodologyId(),
		   source,
		   new String[] {
			   "documentation", "Id of the risk methodology."
		   });
		addAnnotation
		  (getRiskAssessment_Likelihood(),
		   source,
		   new String[] {
			   "documentation", "Id of the likelihood level."
		   });
		addAnnotation
		  (getRiskAssessment_Severity(),
		   source,
		   new String[] {
			   "documentation", "Id of the severity level."
		   });
		addAnnotation
		  (getRiskAssessment_RiskLevel(),
		   source,
		   new String[] {
			   "documentation", "Id of the resulting risk level."
		   });
	}

} //ReportPackageImpl
