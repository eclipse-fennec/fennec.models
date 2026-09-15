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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.gdprReport.ClassifierEvaluation;
import org.eclipse.fennec.model.gdprReport.CombinationFinding;
import org.eclipse.fennec.model.gdprReport.CombinationKind;
import org.eclipse.fennec.model.gdprReport.ConfidenceType;
import org.eclipse.fennec.model.gdprReport.DataCategory;
import org.eclipse.fennec.model.gdprReport.DetectionSignal;
import org.eclipse.fennec.model.gdprReport.Evidence;
import org.eclipse.fennec.model.gdprReport.FeatureEvaluation;
import org.eclipse.fennec.model.gdprReport.Finding;
import org.eclipse.fennec.model.gdprReport.GDPRReportFactory;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.GdprReport;
import org.eclipse.fennec.model.gdprReport.GdprRequestStatus;
import org.eclipse.fennec.model.gdprReport.LegalCorpusRef;
import org.eclipse.fennec.model.gdprReport.RelevanceLevelType;
import org.eclipse.fennec.model.gdprReport.RequestStatusType;
import org.eclipse.fennec.model.gdprReport.SubjectModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GDPRReportPackageImpl extends EPackageImpl implements GDPRReportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gdprReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalCorpusRefEClass = null;

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
	private EClass gdprRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relevanceLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidenceTypeEEnum = null;

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
	private EEnum combinationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusTypeEEnum = null;

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
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GDPRReportPackageImpl() {
		super(eNS_URI, GDPRReportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GDPRReportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GDPRReportPackage init() {
		if (isInited) return (GDPRReportPackage)EPackage.Registry.INSTANCE.getEPackage(GDPRReportPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGDPRReportPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GDPRReportPackageImpl theGDPRReportPackage = registeredGDPRReportPackage instanceof GDPRReportPackageImpl ? (GDPRReportPackageImpl)registeredGDPRReportPackage : new GDPRReportPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGDPRReportPackage.createPackageContents();

		// Initialize created meta-data
		theGDPRReportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGDPRReportPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GDPRReportPackage.eNS_URI, theGDPRReportPackage);
		return theGDPRReportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGdprReport() {
		return gdprReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReport_Name() {
		return (EAttribute)gdprReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReport_GeneratedAt() {
		return (EAttribute)gdprReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReport_GeneratedBy() {
		return (EAttribute)gdprReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReport_Subject() {
		return (EReference)gdprReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReport_Corpus() {
		return (EReference)gdprReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReport_ClassifierEvaluation() {
		return (EReference)gdprReportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReport_Combinations() {
		return (EReference)gdprReportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReport_Disclaimer() {
		return (EAttribute)gdprReportEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectModel() {
		return subjectModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectModel_Name() {
		return (EAttribute)subjectModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectModel_NsURI() {
		return (EAttribute)subjectModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectModel_NsPrefix() {
		return (EAttribute)subjectModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectModel_ModelFingerprint() {
		return (EAttribute)subjectModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegalCorpusRef() {
		return legalCorpusRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalCorpusRef_Celex() {
		return (EAttribute)legalCorpusRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalCorpusRef_ConsolidatedDate() {
		return (EAttribute)legalCorpusRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalCorpusRef_Language() {
		return (EAttribute)legalCorpusRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalCorpusRef_FormexSchema() {
		return (EAttribute)legalCorpusRefEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getClassifierEvaluation_Id() {
		return (EAttribute)classifierEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifierEvaluation_Name() {
		return (EAttribute)classifierEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifierEvaluation_UriFragment() {
		return (EAttribute)classifierEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierEvaluation_FeatureEvaluation() {
		return (EReference)classifierEvaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierEvaluation_Findings() {
		return (EReference)classifierEvaluationEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getFeatureEvaluation_Id() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_Name() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_UriFragment() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_TypeName() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_Many() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureEvaluation_RelevanceLevel() {
		return (EAttribute)featureEvaluationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureEvaluation_Findings() {
		return (EReference)featureEvaluationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureEvaluation_PartOfCombinations() {
		return (EReference)featureEvaluationEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getFinding_Category() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_RelevanceLevel() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Confidence() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_DetectedBy() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_SignalValues() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Rationale() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Recommendation() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Evidence() {
		return (EReference)findingEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getCombinationFinding_CombinationKind() {
		return (EAttribute)combinationFindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCombinationFinding_Features() {
		return (EReference)combinationFindingEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getEvidence_CitationId() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Quote() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Verbatim() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Relevance() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_SourceRef() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGdprRequestStatus() {
		return gdprRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_ModelFingerprint() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_NsURI() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_BatchId() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_CustomId() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_ReportId() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_Status() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_SubmittedAt() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_EndedAt() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_Message() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_ContinuationCount() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprRequestStatus_OutputTokens() {
		return (EAttribute)gdprRequestStatusEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataCategory() {
		return dataCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelevanceLevelType() {
		return relevanceLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConfidenceType() {
		return confidenceTypeEEnum;
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
	public EEnum getCombinationKind() {
		return combinationKindEEnum;
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
	public GDPRReportFactory getGDPRReportFactory() {
		return (GDPRReportFactory)getEFactoryInstance();
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
		gdprReportEClass = createEClass(GDPR_REPORT);
		createEAttribute(gdprReportEClass, GDPR_REPORT__NAME);
		createEAttribute(gdprReportEClass, GDPR_REPORT__GENERATED_AT);
		createEAttribute(gdprReportEClass, GDPR_REPORT__GENERATED_BY);
		createEReference(gdprReportEClass, GDPR_REPORT__SUBJECT);
		createEReference(gdprReportEClass, GDPR_REPORT__CORPUS);
		createEReference(gdprReportEClass, GDPR_REPORT__CLASSIFIER_EVALUATION);
		createEReference(gdprReportEClass, GDPR_REPORT__COMBINATIONS);
		createEAttribute(gdprReportEClass, GDPR_REPORT__DISCLAIMER);

		subjectModelEClass = createEClass(SUBJECT_MODEL);
		createEAttribute(subjectModelEClass, SUBJECT_MODEL__NAME);
		createEAttribute(subjectModelEClass, SUBJECT_MODEL__NS_URI);
		createEAttribute(subjectModelEClass, SUBJECT_MODEL__NS_PREFIX);
		createEAttribute(subjectModelEClass, SUBJECT_MODEL__MODEL_FINGERPRINT);

		legalCorpusRefEClass = createEClass(LEGAL_CORPUS_REF);
		createEAttribute(legalCorpusRefEClass, LEGAL_CORPUS_REF__CELEX);
		createEAttribute(legalCorpusRefEClass, LEGAL_CORPUS_REF__CONSOLIDATED_DATE);
		createEAttribute(legalCorpusRefEClass, LEGAL_CORPUS_REF__LANGUAGE);
		createEAttribute(legalCorpusRefEClass, LEGAL_CORPUS_REF__FORMEX_SCHEMA);

		classifierEvaluationEClass = createEClass(CLASSIFIER_EVALUATION);
		createEAttribute(classifierEvaluationEClass, CLASSIFIER_EVALUATION__ID);
		createEAttribute(classifierEvaluationEClass, CLASSIFIER_EVALUATION__NAME);
		createEAttribute(classifierEvaluationEClass, CLASSIFIER_EVALUATION__URI_FRAGMENT);
		createEReference(classifierEvaluationEClass, CLASSIFIER_EVALUATION__FEATURE_EVALUATION);
		createEReference(classifierEvaluationEClass, CLASSIFIER_EVALUATION__FINDINGS);

		featureEvaluationEClass = createEClass(FEATURE_EVALUATION);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__ID);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__NAME);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__URI_FRAGMENT);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__TYPE_NAME);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__MANY);
		createEAttribute(featureEvaluationEClass, FEATURE_EVALUATION__RELEVANCE_LEVEL);
		createEReference(featureEvaluationEClass, FEATURE_EVALUATION__FINDINGS);
		createEReference(featureEvaluationEClass, FEATURE_EVALUATION__PART_OF_COMBINATIONS);

		findingEClass = createEClass(FINDING);
		createEAttribute(findingEClass, FINDING__ID);
		createEAttribute(findingEClass, FINDING__CATEGORY);
		createEAttribute(findingEClass, FINDING__RELEVANCE_LEVEL);
		createEAttribute(findingEClass, FINDING__CONFIDENCE);
		createEAttribute(findingEClass, FINDING__DETECTED_BY);
		createEAttribute(findingEClass, FINDING__SIGNAL_VALUES);
		createEAttribute(findingEClass, FINDING__RATIONALE);
		createEAttribute(findingEClass, FINDING__RECOMMENDATION);
		createEReference(findingEClass, FINDING__EVIDENCE);

		combinationFindingEClass = createEClass(COMBINATION_FINDING);
		createEAttribute(combinationFindingEClass, COMBINATION_FINDING__COMBINATION_KIND);
		createEReference(combinationFindingEClass, COMBINATION_FINDING__FEATURES);

		evidenceEClass = createEClass(EVIDENCE);
		createEAttribute(evidenceEClass, EVIDENCE__CITATION_ID);
		createEAttribute(evidenceEClass, EVIDENCE__QUOTE);
		createEAttribute(evidenceEClass, EVIDENCE__VERBATIM);
		createEAttribute(evidenceEClass, EVIDENCE__RELEVANCE);
		createEAttribute(evidenceEClass, EVIDENCE__SOURCE_REF);

		gdprRequestStatusEClass = createEClass(GDPR_REQUEST_STATUS);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__MODEL_FINGERPRINT);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__NS_URI);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__BATCH_ID);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__CUSTOM_ID);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__REPORT_ID);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__STATUS);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__SUBMITTED_AT);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__ENDED_AT);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__MESSAGE);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__CONTINUATION_COUNT);
		createEAttribute(gdprRequestStatusEClass, GDPR_REQUEST_STATUS__OUTPUT_TOKENS);

		// Create enums
		dataCategoryEEnum = createEEnum(DATA_CATEGORY);
		relevanceLevelTypeEEnum = createEEnum(RELEVANCE_LEVEL_TYPE);
		confidenceTypeEEnum = createEEnum(CONFIDENCE_TYPE);
		detectionSignalEEnum = createEEnum(DETECTION_SIGNAL);
		combinationKindEEnum = createEEnum(COMBINATION_KIND);
		requestStatusTypeEEnum = createEEnum(REQUEST_STATUS_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		combinationFindingEClass.getESuperTypes().add(this.getFinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(gdprReportEClass, GdprReport.class, "GdprReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGdprReport_Name(), ecorePackage.getEString(), "name", null, 0, 1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReport_GeneratedAt(), ecorePackage.getEString(), "generatedAt", null, 0, 1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReport_GeneratedBy(), ecorePackage.getEString(), "generatedBy", null, 0, 1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReport_Subject(), this.getSubjectModel(), null, "subject", null, 1, 1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReport_Corpus(), this.getLegalCorpusRef(), null, "corpus", null, 1, 1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReport_ClassifierEvaluation(), this.getClassifierEvaluation(), null, "classifierEvaluation", null, 0, -1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReport_Combinations(), this.getCombinationFinding(), null, "combinations", null, 0, -1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReport_Disclaimer(), ecorePackage.getEString(), "disclaimer", null, 0, 1, GdprReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectModelEClass, SubjectModel.class, "SubjectModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubjectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectModel_NsURI(), ecorePackage.getEString(), "nsURI", null, 1, 1, SubjectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectModel_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, SubjectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectModel_ModelFingerprint(), ecorePackage.getEString(), "modelFingerprint", null, 1, 1, SubjectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legalCorpusRefEClass, LegalCorpusRef.class, "LegalCorpusRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalCorpusRef_Celex(), ecorePackage.getEString(), "celex", null, 0, 1, LegalCorpusRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalCorpusRef_ConsolidatedDate(), ecorePackage.getEString(), "consolidatedDate", null, 0, 1, LegalCorpusRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalCorpusRef_Language(), ecorePackage.getEString(), "language", null, 0, 1, LegalCorpusRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalCorpusRef_FormexSchema(), ecorePackage.getEString(), "formexSchema", null, 0, 1, LegalCorpusRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEvaluationEClass, ClassifierEvaluation.class, "ClassifierEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierEvaluation_Id(), ecorePackage.getEString(), "id", null, 0, 1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierEvaluation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierEvaluation_UriFragment(), ecorePackage.getEString(), "uriFragment", null, 0, 1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierEvaluation_FeatureEvaluation(), this.getFeatureEvaluation(), null, "featureEvaluation", null, 0, -1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierEvaluation_Findings(), this.getFinding(), null, "findings", null, 0, -1, ClassifierEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEvaluationEClass, FeatureEvaluation.class, "FeatureEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureEvaluation_Id(), ecorePackage.getEString(), "id", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_UriFragment(), ecorePackage.getEString(), "uriFragment", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureEvaluation_RelevanceLevel(), this.getRelevanceLevelType(), "relevanceLevel", null, 0, 1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureEvaluation_Findings(), this.getFinding(), null, "findings", null, 0, -1, FeatureEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureEvaluation_PartOfCombinations(), this.getCombinationFinding(), this.getCombinationFinding_Features(), "partOfCombinations", null, 0, -1, FeatureEvaluation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(findingEClass, Finding.class, "Finding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinding_Id(), ecorePackage.getEString(), "id", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Category(), this.getDataCategory(), "category", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_RelevanceLevel(), this.getRelevanceLevelType(), "relevanceLevel", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Confidence(), this.getConfidenceType(), "confidence", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_DetectedBy(), this.getDetectionSignal(), "detectedBy", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_SignalValues(), ecorePackage.getEString(), "signalValues", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Recommendation(), ecorePackage.getEString(), "recommendation", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinding_Evidence(), this.getEvidence(), null, "evidence", null, 1, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationFindingEClass, CombinationFinding.class, "CombinationFinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinationFinding_CombinationKind(), this.getCombinationKind(), "combinationKind", null, 0, 1, CombinationFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationFinding_Features(), this.getFeatureEvaluation(), this.getFeatureEvaluation_PartOfCombinations(), "features", null, 2, -1, CombinationFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvidence_CitationId(), ecorePackage.getEString(), "citationId", null, 1, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Quote(), ecorePackage.getEString(), "quote", null, 1, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Verbatim(), ecorePackage.getEBoolean(), "verbatim", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Relevance(), ecorePackage.getEString(), "relevance", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_SourceRef(), ecorePackage.getEString(), "sourceRef", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gdprRequestStatusEClass, GdprRequestStatus.class, "GdprRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGdprRequestStatus_ModelFingerprint(), ecorePackage.getEString(), "modelFingerprint", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_BatchId(), ecorePackage.getEString(), "batchId", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_CustomId(), ecorePackage.getEString(), "customId", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_ReportId(), ecorePackage.getEString(), "reportId", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_Status(), this.getRequestStatusType(), "status", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_SubmittedAt(), ecorePackage.getEString(), "submittedAt", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_EndedAt(), ecorePackage.getEString(), "endedAt", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_Message(), ecorePackage.getEString(), "message", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_ContinuationCount(), ecorePackage.getEInt(), "continuationCount", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprRequestStatus_OutputTokens(), ecorePackage.getEInt(), "outputTokens", null, 0, 1, GdprRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataCategoryEEnum, DataCategory.class, "DataCategory");
		addEEnumLiteral(dataCategoryEEnum, DataCategory.NOT_PERSONAL_DATA);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.PERSONAL_DATA);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.DIRECT_IDENTIFIER);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.QUASI_IDENTIFIER);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.ONLINE_IDENTIFIER);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.LOCATION_DATA);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.SPECIAL_CATEGORY);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.CRIMINAL_CONVICTION_DATA);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.CHILD_DATA);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.PSEUDONYMISED);
		addEEnumLiteral(dataCategoryEEnum, DataCategory.ANONYMOUS);

		initEEnum(relevanceLevelTypeEEnum, RelevanceLevelType.class, "RelevanceLevelType");
		addEEnumLiteral(relevanceLevelTypeEEnum, RelevanceLevelType.NONE);
		addEEnumLiteral(relevanceLevelTypeEEnum, RelevanceLevelType.LOW);
		addEEnumLiteral(relevanceLevelTypeEEnum, RelevanceLevelType.MEDIUM);
		addEEnumLiteral(relevanceLevelTypeEEnum, RelevanceLevelType.HIGH);

		initEEnum(confidenceTypeEEnum, ConfidenceType.class, "ConfidenceType");
		addEEnumLiteral(confidenceTypeEEnum, ConfidenceType.LOW);
		addEEnumLiteral(confidenceTypeEEnum, ConfidenceType.MEDIUM);
		addEEnumLiteral(confidenceTypeEEnum, ConfidenceType.HIGH);
		addEEnumLiteral(confidenceTypeEEnum, ConfidenceType.REQUIRES_PURPOSE_CONFIRMATION);

		initEEnum(detectionSignalEEnum, DetectionSignal.class, "DetectionSignal");
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.FEATURE_NAME);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.FEATURE_TYPE);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.MULTIPLICITY);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.ENUM_LITERALS);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.OWNING_CLASSIFIER_NAME);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.DOCUMENTATION_ANNOTATION);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.CONTAINMENT_CONTEXT);
		addEEnumLiteral(detectionSignalEEnum, DetectionSignal.FEATURE_COMBINATION);

		initEEnum(combinationKindEEnum, CombinationKind.class, "CombinationKind");
		addEEnumLiteral(combinationKindEEnum, CombinationKind.QUASI_IDENTIFIER_SET);
		addEEnumLiteral(combinationKindEEnum, CombinationKind.LINKAGE);
		addEEnumLiteral(combinationKindEEnum, CombinationKind.PROFILING);
		addEEnumLiteral(combinationKindEEnum, CombinationKind.SPECIAL_CATEGORY_INFERENCE);

		initEEnum(requestStatusTypeEEnum, RequestStatusType.class, "RequestStatusType");
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.SUBMITTED);
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.COMPLETED);
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.FAILED);
		addEEnumLiteral(requestStatusTypeEEnum, RequestStatusType.EXHAUSTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
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
			   "complianceLevel", "21.0",
			   "oSGiCompatible", "true",
			   "basePackage", "org.eclipse.fennec.model",
			   "resource", "XMI",
			   "copyrightText", "Copyright (c) 2026 Contributors to the Eclipse Foundation.\n\nThis program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n  Data In Motion Consulting - initial implementation"
		   });
		addAnnotation
		  (gdprReportEClass,
		   source,
		   new String[] {
			   "documentation", "Root of a GDPR review of one Ecore metamodel. Exactly one instance per review run. It records what was reviewed (subject), which revision of the legal text the evidence was quoted from (corpus), one ClassifierEvaluation per examined classifier, and any cross-classifier combination findings."
		   });
		addAnnotation
		  (getGdprReport_Name(),
		   source,
		   new String[] {
			   "documentation", "Human readable title of the review, e.g. \'GDPR review of clinic 1.0.0\'."
		   });
		addAnnotation
		  (getGdprReport_GeneratedAt(),
		   source,
		   new String[] {
			   "documentation", "When the review ran, as an ISO-8601 UTC instant, e.g. 2026-09-09T14:20:00Z."
		   });
		addAnnotation
		  (getGdprReport_GeneratedBy(),
		   source,
		   new String[] {
			   "documentation", "The language model that produced this review, as the provider names it, e.g. claude-sonnet-4-6. Two models reviewing the same metamodel do not agree in every particular - measured on one 3.4KB model, two models agreed exactly on the classifiers carrying obvious personal data and differed on the ones turning on a processing purpose - so a finding cannot be weighed without knowing what produced it."
		   });
		addAnnotation
		  (getGdprReport_Subject(),
		   source,
		   new String[] {
			   "documentation", "Required. The metamodel that was reviewed, including the fingerprint that pins the exact revision."
		   });
		addAnnotation
		  (getGdprReport_Corpus(),
		   source,
		   new String[] {
			   "documentation", "Required. Which revision of the legal text the quotes came from. Without it a quote cannot be verified later."
		   });
		addAnnotation
		  (getGdprReport_ClassifierEvaluation(),
		   source,
		   new String[] {
			   "documentation", "One entry per classifier that was examined. Add an entry even when nothing was found, so a reader can distinguish \'examined and clean\' from \'never examined\'."
		   });
		addAnnotation
		  (getGdprReport_Combinations(),
		   source,
		   new String[] {
			   "documentation", "Findings that arise from two or more features together. They are held here, not under a ClassifierEvaluation, because a combination may span several classifiers and would otherwise need an arbitrary owner."
		   });
		addAnnotation
		  (getGdprReport_Disclaimer(),
		   source,
		   new String[] {
			   "documentation", "Statement of what the report is and is not. It is decision support for a data protection officer: it flags features needing human review and must not assert compliance or non-compliance."
		   });
		addAnnotation
		  (subjectModelEClass,
		   source,
		   new String[] {
			   "documentation", "Identity of the reviewed metamodel, precise enough to tell whether a later version is still the same model."
		   });
		addAnnotation
		  (getSubjectModel_Name(),
		   source,
		   new String[] {
			   "documentation", "The reviewed EPackage\'s name attribute."
		   });
		addAnnotation
		  (getSubjectModel_NsURI(),
		   source,
		   new String[] {
			   "documentation", "Required. The reviewed EPackage\'s nsURI, copied verbatim. This is the primary identity of what was reviewed."
		   });
		addAnnotation
		  (getSubjectModel_NsPrefix(),
		   source,
		   new String[] {
			   "documentation", "The reviewed EPackage\'s nsPrefix."
		   });
		addAnnotation
		  (getSubjectModel_ModelFingerprint(),
		   source,
		   new String[] {
			   "documentation", "Required. Hex digest identifying this exact revision of the model, so a later run can tell whether the model really changed. Compute it; never invent or copy one."
		   });
		addAnnotation
		  (legalCorpusRefEClass,
		   source,
		   new String[] {
			   "documentation", "Which revision of which legal act the evidence was quoted from, plus the attribution the licence requires. Fill this from the corpus itself, not from memory."
		   });
		addAnnotation
		  (getLegalCorpusRef_Celex(),
		   source,
		   new String[] {
			   "documentation", "CELEX identifier of the act quoted, e.g. 32016R0679 for the GDPR."
		   });
		addAnnotation
		  (getLegalCorpusRef_ConsolidatedDate(),
		   source,
		   new String[] {
			   "documentation", "Consolidation date of the text used, as yyyyMMdd, e.g. 20180523. Quotes are only reproducible against a stated consolidation."
		   });
		addAnnotation
		  (getLegalCorpusRef_Language(),
		   source,
		   new String[] {
			   "documentation", "Language of the quoted text, e.g. EN. Citation identifiers are language independent, quotes are not."
		   });
		addAnnotation
		  (getLegalCorpusRef_FormexSchema(),
		   source,
		   new String[] {
			   "documentation", "Schema the source document declared, e.g. formex-05.56-20160701.xd."
		   });
		addAnnotation
		  (classifierEvaluationEClass,
		   source,
		   new String[] {
			   "documentation", "The result of examining one classifier (EClass or EEnum) of the reviewed model."
		   });
		addAnnotation
		  (getClassifierEvaluation_Id(),
		   source,
		   new String[] {
			   "documentation", "Required and unique within the report. Stable key, so references survive reordering. Use the classifier name, e.g. \'Patient\'."
		   });
		addAnnotation
		  (getClassifierEvaluation_Name(),
		   source,
		   new String[] {
			   "documentation", "Classifier name exactly as it appears in the reviewed model."
		   });
		addAnnotation
		  (getClassifierEvaluation_UriFragment(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment addressing the classifier in its own resource, e.g. //Patient."
		   });
		addAnnotation
		  (getClassifierEvaluation_FeatureEvaluation(),
		   source,
		   new String[] {
			   "documentation", "One entry per structural feature examined, including features where nothing was found."
		   });
		addAnnotation
		  (getClassifierEvaluation_Findings(),
		   source,
		   new String[] {
			   "documentation", "Findings about the classifier itself rather than one of its features, e.g. a class named Patient making everything it contains health-adjacent."
		   });
		addAnnotation
		  (featureEvaluationEClass,
		   source,
		   new String[] {
			   "documentation", "The result of examining one structural feature."
		   });
		addAnnotation
		  (getFeatureEvaluation_Id(),
		   source,
		   new String[] {
			   "documentation", "Required and unique within the report. CombinationFinding points here, so it must be stable across reruns. Use classifier.feature, e.g. \'Patient.street\'."
		   });
		addAnnotation
		  (getFeatureEvaluation_Name(),
		   source,
		   new String[] {
			   "documentation", "Feature name exactly as it appears in the reviewed model."
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
		  (getFeatureEvaluation_Findings(),
		   source,
		   new String[] {
			   "documentation", "Findings about this feature on its own. Findings that need other features belong in a CombinationFinding."
		   });
		addAnnotation
		  (getFeatureEvaluation_PartOfCombinations(),
		   source,
		   new String[] {
			   "documentation", "Derived: EMF maintains this from CombinationFinding.features. Do not set it directly; add the feature to the combination instead."
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
		  (getFinding_Category(),
		   source,
		   new String[] {
			   "documentation", "What kind of data this is, in GDPR terms. Pick the most specific category that the evidence supports."
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
		  (combinationFindingEClass,
		   source,
		   new String[] {
			   "documentation", "A finding that only arises when two or more features are present together, typically because they allow an individual to be singled out even though no single feature identifies anyone."
		   });
		addAnnotation
		  (getCombinationFinding_CombinationKind(),
		   source,
		   new String[] {
			   "documentation", "How the features interact to create the risk."
		   });
		addAnnotation
		  (getCombinationFinding_Features(),
		   source,
		   new String[] {
			   "documentation", "The features that together create the risk. At least two, and they may belong to different classifiers. Reference existing FeatureEvaluation entries rather than creating new ones. resolveProxies is false because a combination only ever points at FeatureEvaluations inside its own report: EMF requires the opposite of a transient reference to be transient too unless it is not proxy resolving, and partOfCombinations has to stay transient because it is derived."
		   });
		addAnnotation
		  (evidenceEClass,
		   source,
		   new String[] {
			   "documentation", "A quotation from the legal corpus supporting a finding. The quote is fact; the relevance is interpretation. Keeping them apart lets a reviewer check the citation without accepting the reasoning."
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
		  (dataCategoryEEnum,
		   source,
		   new String[] {
			   "documentation", "What kind of data a feature holds, in GDPR terms. Choose the most specific value the evidence supports."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Examined and does not relate to an identified or identifiable natural person, e.g. a currency code or a machine setting."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Relates to an identifiable person but does not fit a more specific category."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Identifies a person on its own, e.g. full name, e-mail address, national identification number."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Does not identify anyone alone but contributes to singling a person out when combined with others, e.g. postal code, date of birth, job title."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "An identifier supplied by a device, application or protocol, e.g. an IP address, a cookie identifier or an RFID tag."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Data about where a person is or has been. Repeated location values form a movement profile."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Data of the kinds enumerated in Article 9(1): racial or ethnic origin, political opinions, religious or philosophical beliefs, trade union membership, genetic data, biometric data processed for unique identification, health, sex life or sexual orientation."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Data on criminal convictions and offences. Governed by Article 10, not Article 9; do not label it SPECIAL_CATEGORY."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Data relating to children, which attracts the additional conditions of Article 8."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Data whose direct identifiers were replaced but which can still be attributed to a person with additional information. Still personal data, and still in scope."
		   });
		addAnnotation
		  (dataCategoryEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Data that no longer relates to an identifiable person, and therefore outside the Regulation. Use only when re-identification is not reasonably likely; a hashed or tokenised value is normally PSEUDONYMISED, not this."
		   });
		addAnnotation
		  (relevanceLevelTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "How serious a finding is if it holds. Says nothing about how certain it is."
		   });
		addAnnotation
		  (relevanceLevelTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Examined and nothing of concern found. Meaningfully different from leaving the level unset."
		   });
		addAnnotation
		  (relevanceLevelTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "In scope but limited consequence for the data subject."
		   });
		addAnnotation
		  (relevanceLevelTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Warrants review, e.g. a quasi-identifier or an unnecessarily precise value."
		   });
		addAnnotation
		  (relevanceLevelTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Special-category, criminal-conviction or directly identifying data, or a combination likely to single an individual out."
		   });
		addAnnotation
		  (confidenceTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "How certain the assessment is. Independent of relevanceLevel."
		   });
		addAnnotation
		  (confidenceTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Weak signal, e.g. an ambiguous feature name with no corroboration."
		   });
		addAnnotation
		  (confidenceTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Reasonable inference from more than one signal, but the model could still be read differently."
		   });
		addAnnotation
		  (confidenceTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The model itself settles it, e.g. EEnum literals naming religious denominations."
		   });
		addAnnotation
		  (confidenceTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The classification depends on the processing purpose, which a metamodel cannot show, so it cannot be settled here. The standard case is a photograph: it is biometric data under Article 9 only when processed by specific technical means for unique identification. Use this rather than guessing, and say in recommendation what needs confirming."
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
		  (combinationKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How the features in a CombinationFinding interact to create risk."
		   });
		addAnnotation
		  (combinationKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Together the features are likely to single out an individual, even though none identifies anyone alone, e.g. street plus house number plus date of birth."
		   });
		addAnnotation
		  (combinationKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The features allow records to be joined to another dataset, re-identifying people indirectly."
		   });
		addAnnotation
		  (combinationKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The features together allow personal aspects to be evaluated or predicted, e.g. behaviour, reliability, movements or performance at work."
		   });
		addAnnotation
		  (combinationKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The features are innocuous individually but together permit a special category to be inferred, e.g. a diet code plus a clinic name implying religion or health."
		   });
		addAnnotation
		  (gdprRequestStatusEClass,
		   source,
		   new String[] {
			   "documentation", "The record of one review request for one model revision: that it was asked for, what is carrying it out, and how it ended. It exists from the moment the request is accepted, which a GdprReport does not - a report is only written when a review succeeds, so a run that is still going or that failed leaves no report at all. Anything deciding whether to ask for a review has to consult this rather than the report, or a run already in flight is paid for twice and a run that failed is re-tried on every trigger forever. One instance per reviewed model revision, keyed by modelFingerprint."
		   });
		addAnnotation
		  (getGdprRequestStatus_ModelFingerprint(),
		   source,
		   new String[] {
			   "documentation", "The revision of the model under review, in the same form SubjectModel records it. This is the identity of the record: the review is of content, not of a location, so the same bytes reached by any route are the same review and must not be paid for again."
		   });
		addAnnotation
		  (getGdprRequestStatus_NsURI(),
		   source,
		   new String[] {
			   "documentation", "Namespace URI of the reviewed model, so a record is legible without resolving the fingerprint first. Not the identity - a namespace can hold more than one revision."
		   });
		addAnnotation
		  (getGdprRequestStatus_BatchId(),
		   source,
		   new String[] {
			   "documentation", "The provider-side identifier of the work. It is the only handle on a run that outlives the process that started it: without it a restart cannot tell a finished review from one still running, and cannot collect either."
		   });
		addAnnotation
		  (getGdprRequestStatus_CustomId(),
		   source,
		   new String[] {
			   "documentation", "The identifier of this request within the batch. Required to read the outcome back - a result is selected by it, and so is the check for whether the turn was left paused."
		   });
		addAnnotation
		  (getGdprRequestStatus_ReportId(),
		   source,
		   new String[] {
			   "documentation", "The id the GdprReport is stored under once the review succeeds. Empty until then, and stays empty for a run that never produced one."
		   });
		addAnnotation
		  (getGdprRequestStatus_Status(),
		   source,
		   new String[] {
			   "documentation", "How the request stands. Written as SUBMITTED when the work is accepted and updated once when it ends."
		   });
		addAnnotation
		  (getGdprRequestStatus_SubmittedAt(),
		   source,
		   new String[] {
			   "documentation", "When the request was accepted, as an ISO-8601 UTC instant, e.g. 2026-09-09T14:20:00Z."
		   });
		addAnnotation
		  (getGdprRequestStatus_EndedAt(),
		   source,
		   new String[] {
			   "documentation", "When it reached a terminal status, in the same form. Empty while it is still running, which together with submittedAt is how a record abandoned by a dead process is recognised."
		   });
		addAnnotation
		  (getGdprRequestStatus_Message(),
		   source,
		   new String[] {
			   "documentation", "What to tell whoever reads the outcome: the reason for a failure, or what was recorded before a run was given up on. Meant to be read by a person deciding what to do next."
		   });
		addAnnotation
		  (getGdprRequestStatus_ContinuationCount(),
		   source,
		   new String[] {
			   "documentation", "How many times the run had to be resumed after the provider stopped it at its iteration budget. Zero is the ordinary case. A number close to the configured ceiling says the model is at the edge of what one run can review, which is worth knowing before the ceiling is reached and work is lost."
		   });
		addAnnotation
		  (getGdprRequestStatus_OutputTokens(),
		   source,
		   new String[] {
			   "documentation", "Tokens generated across the run, where the provider reports them. The only record of what an individual review cost."
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
	}

} //GDPRReportPackageImpl
