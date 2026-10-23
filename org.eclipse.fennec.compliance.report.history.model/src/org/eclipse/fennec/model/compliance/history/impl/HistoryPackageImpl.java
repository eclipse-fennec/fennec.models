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
package org.eclipse.fennec.model.compliance.history.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.compliance.history.ChangeKind;
import org.eclipse.fennec.model.compliance.history.ChangeRow;
import org.eclipse.fennec.model.compliance.history.ComplianceReportHistory;
import org.eclipse.fennec.model.compliance.history.EvaluationRow;
import org.eclipse.fennec.model.compliance.history.HistoryFactory;
import org.eclipse.fennec.model.compliance.history.HistoryPackage;
import org.eclipse.fennec.model.compliance.history.ReportRevision;
import org.eclipse.fennec.model.compliance.history.RevisionOrigin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistoryPackageImpl extends EPackageImpl implements HistoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceReportHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum revisionOriginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeKindEEnum = null;

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
	 * @see org.eclipse.fennec.model.compliance.history.HistoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HistoryPackageImpl() {
		super(eNS_URI, HistoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HistoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HistoryPackage init() {
		if (isInited) return (HistoryPackage)EPackage.Registry.INSTANCE.getEPackage(HistoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHistoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HistoryPackageImpl theHistoryPackage = registeredHistoryPackage instanceof HistoryPackageImpl ? (HistoryPackageImpl)registeredHistoryPackage : new HistoryPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHistoryPackage.createPackageContents();

		// Initialize created meta-data
		theHistoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHistoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HistoryPackage.eNS_URI, theHistoryPackage);
		return theHistoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceReportHistory() {
		return complianceReportHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_Name() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_SubjectIdentifier() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_SubjectName() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_RebuiltAt() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_RevisionCount() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReportHistory_Revisions() {
		return (EReference)complianceReportHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReportHistory_Evaluations() {
		return (EReference)complianceReportHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceReportHistory_Changes() {
		return (EReference)complianceReportHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_ReportLanguage() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_SubjectLanguage() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceReportHistory_ContextIds() {
		return (EAttribute)complianceReportHistoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReportRevision() {
		return reportRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_RevisionNumber() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_ReportId() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_SubjectFingerprint() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_GeneratedAt() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_GeneratedBy() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_Origin() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_FindingCount() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_ChangeCount() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_ContextVersions() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluationRow() {
		return evaluationRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_RevisionNumber() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ElementId() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ElementName() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ElementPath() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ChildId() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ChildName() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ChildPath() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_TypeName() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Categories() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_RelevanceLevel() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Confidence() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Rationale() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Recommendation() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Citations() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ChangeKind() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Purpose() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ReviewStatus() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ResolutionJustification() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_DecidedBy() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_DecidedAt() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_CorrectionNote() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ContextId() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_RequirementIds() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_AssetId() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_FindingOrigin() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_Treatment() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_RiskLevel() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_MeasureIds() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_TreatmentNote() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_DelegatedTo() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_DueDate() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_LawfulBases() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeRow() {
		return changeRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_RevisionNumber() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_ChangedAt() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_ChangedBy() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_ElementId() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_ChildId() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_Field() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_ChangeKind() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_OldValue() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_NewValue() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRevisionOrigin() {
		return revisionOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChangeKind() {
		return changeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryFactory getHistoryFactory() {
		return (HistoryFactory)getEFactoryInstance();
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
		complianceReportHistoryEClass = createEClass(COMPLIANCE_REPORT_HISTORY);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__NAME);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__SUBJECT_IDENTIFIER);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__SUBJECT_NAME);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__REBUILT_AT);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__REVISION_COUNT);
		createEReference(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__REVISIONS);
		createEReference(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__EVALUATIONS);
		createEReference(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__CHANGES);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__REPORT_LANGUAGE);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__SUBJECT_LANGUAGE);
		createEAttribute(complianceReportHistoryEClass, COMPLIANCE_REPORT_HISTORY__CONTEXT_IDS);

		reportRevisionEClass = createEClass(REPORT_REVISION);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__REVISION_NUMBER);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__REPORT_ID);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__SUBJECT_FINGERPRINT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__GENERATED_AT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__GENERATED_BY);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__ORIGIN);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__FINDING_COUNT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__CHANGE_COUNT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__CONTEXT_VERSIONS);

		evaluationRowEClass = createEClass(EVALUATION_ROW);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__REVISION_NUMBER);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__ELEMENT_ID);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__ELEMENT_NAME);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__ELEMENT_PATH);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CHILD_ID);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CHILD_NAME);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CHILD_PATH);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__TYPE_NAME);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CATEGORIES);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RELEVANCE_LEVEL);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CONFIDENCE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RATIONALE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RECOMMENDATION);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CITATIONS);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CHANGE_KIND);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__PURPOSE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__REVIEW_STATUS);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RESOLUTION_JUSTIFICATION);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__DECIDED_BY);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__DECIDED_AT);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CORRECTION_NOTE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CONTEXT_ID);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__REQUIREMENT_IDS);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__ASSET_ID);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__FINDING_ORIGIN);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__TREATMENT);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RISK_LEVEL);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__MEASURE_IDS);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__TREATMENT_NOTE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__DELEGATED_TO);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__DUE_DATE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__LAWFUL_BASES);

		changeRowEClass = createEClass(CHANGE_ROW);
		createEAttribute(changeRowEClass, CHANGE_ROW__REVISION_NUMBER);
		createEAttribute(changeRowEClass, CHANGE_ROW__CHANGED_AT);
		createEAttribute(changeRowEClass, CHANGE_ROW__CHANGED_BY);
		createEAttribute(changeRowEClass, CHANGE_ROW__ELEMENT_ID);
		createEAttribute(changeRowEClass, CHANGE_ROW__CHILD_ID);
		createEAttribute(changeRowEClass, CHANGE_ROW__FIELD);
		createEAttribute(changeRowEClass, CHANGE_ROW__CHANGE_KIND);
		createEAttribute(changeRowEClass, CHANGE_ROW__OLD_VALUE);
		createEAttribute(changeRowEClass, CHANGE_ROW__NEW_VALUE);

		// Create enums
		revisionOriginEEnum = createEEnum(REVISION_ORIGIN);
		changeKindEEnum = createEEnum(CHANGE_KIND);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(complianceReportHistoryEClass, ComplianceReportHistory.class, "ComplianceReportHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceReportHistory_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_SubjectIdentifier(), ecorePackage.getEString(), "subjectIdentifier", null, 0, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_SubjectName(), ecorePackage.getEString(), "subjectName", null, 0, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_RebuiltAt(), ecorePackage.getEString(), "rebuiltAt", null, 1, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_RevisionCount(), ecorePackage.getEInt(), "revisionCount", null, 0, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReportHistory_Revisions(), this.getReportRevision(), null, "revisions", null, 0, -1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReportHistory_Evaluations(), this.getEvaluationRow(), null, "evaluations", null, 0, -1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceReportHistory_Changes(), this.getChangeRow(), null, "changes", null, 0, -1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_ReportLanguage(), ecorePackage.getEString(), "reportLanguage", null, 0, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_SubjectLanguage(), ecorePackage.getEString(), "subjectLanguage", null, 0, 1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceReportHistory_ContextIds(), ecorePackage.getEString(), "contextIds", null, 0, -1, ComplianceReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportRevisionEClass, ReportRevision.class, "ReportRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportRevision_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 1, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_ReportId(), ecorePackage.getEString(), "reportId", null, 1, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_SubjectFingerprint(), ecorePackage.getEString(), "subjectFingerprint", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_GeneratedAt(), ecorePackage.getEString(), "generatedAt", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_GeneratedBy(), ecorePackage.getEString(), "generatedBy", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_Origin(), this.getRevisionOrigin(), "origin", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_FindingCount(), ecorePackage.getEInt(), "findingCount", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_ChangeCount(), ecorePackage.getEInt(), "changeCount", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_ContextVersions(), ecorePackage.getEString(), "contextVersions", null, 0, -1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationRowEClass, EvaluationRow.class, "EvaluationRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationRow_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 1, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ElementId(), ecorePackage.getEString(), "elementId", null, 1, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ElementPath(), ecorePackage.getEString(), "elementPath", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ChildId(), ecorePackage.getEString(), "childId", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ChildName(), ecorePackage.getEString(), "childName", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ChildPath(), ecorePackage.getEString(), "childPath", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Categories(), ecorePackage.getEString(), "categories", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_RelevanceLevel(), ecorePackage.getEString(), "relevanceLevel", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Confidence(), ecorePackage.getEString(), "confidence", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Recommendation(), ecorePackage.getEString(), "recommendation", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Citations(), ecorePackage.getEString(), "citations", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ChangeKind(), this.getChangeKind(), "changeKind", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ReviewStatus(), ecorePackage.getEString(), "reviewStatus", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ResolutionJustification(), ecorePackage.getEString(), "resolutionJustification", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_DecidedBy(), ecorePackage.getEString(), "decidedBy", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_DecidedAt(), ecorePackage.getEString(), "decidedAt", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_CorrectionNote(), ecorePackage.getEString(), "correctionNote", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ContextId(), ecorePackage.getEString(), "contextId", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_RequirementIds(), ecorePackage.getEString(), "requirementIds", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_AssetId(), ecorePackage.getEString(), "assetId", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_FindingOrigin(), ecorePackage.getEString(), "findingOrigin", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Treatment(), ecorePackage.getEString(), "treatment", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_RiskLevel(), ecorePackage.getEString(), "riskLevel", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_MeasureIds(), ecorePackage.getEString(), "measureIds", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_TreatmentNote(), ecorePackage.getEString(), "treatmentNote", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_DelegatedTo(), ecorePackage.getEString(), "delegatedTo", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_DueDate(), ecorePackage.getEString(), "dueDate", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_LawfulBases(), ecorePackage.getEString(), "lawfulBases", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRowEClass, ChangeRow.class, "ChangeRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeRow_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 1, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ChangedAt(), ecorePackage.getEString(), "changedAt", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ChangedBy(), ecorePackage.getEString(), "changedBy", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ElementId(), ecorePackage.getEString(), "elementId", null, 1, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ChildId(), ecorePackage.getEString(), "childId", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_Field(), ecorePackage.getEString(), "field", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ChangeKind(), this.getChangeKind(), "changeKind", null, 1, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_OldValue(), ecorePackage.getEString(), "oldValue", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(revisionOriginEEnum, RevisionOrigin.class, "RevisionOrigin");
		addEEnumLiteral(revisionOriginEEnum, RevisionOrigin.UNKNOWN);
		addEEnumLiteral(revisionOriginEEnum, RevisionOrigin.AI_AGENT);
		addEEnumLiteral(revisionOriginEEnum, RevisionOrigin.HUMAN);
		addEEnumLiteral(revisionOriginEEnum, RevisionOrigin.STATIC_ANALYSIS);

		initEEnum(changeKindEEnum, ChangeKind.class, "ChangeKind");
		addEEnumLiteral(changeKindEEnum, ChangeKind.UNCHANGED);
		addEEnumLiteral(changeKindEEnum, ChangeKind.ADDED);
		addEEnumLiteral(changeKindEEnum, ChangeKind.MODIFIED);
		addEEnumLiteral(changeKindEEnum, ChangeKind.REMOVED);

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
			   "documentation", "The revisions of the compliance reports of one subject, lined up as flat rows for display and diffing. Rebuilt from the reports; not a source of truth."
		   });
		addAnnotation
		  (complianceReportHistoryEClass,
		   source,
		   new String[] {
			   "documentation", "Root of the derived review history of one subject. Exactly one instance per subject, rebuilt in full on every change rather than appended to, so that a replayed or missed event cannot corrupt it."
		   });
		addAnnotation
		  (getComplianceReportHistory_Name(),
		   source,
		   new String[] {
			   "documentation", "Human readable title of the document, e.g. \'GDPR review history of clinic 1.0.0\'."
		   });
		addAnnotation
		  (getComplianceReportHistory_SubjectIdentifier(),
		   source,
		   new String[] {
			   "documentation", "The subject identifier this history is about. This can be a nsURI for EPackages, a unique name for qvt compiled units and so on."
		   });
		addAnnotation
		  (getComplianceReportHistory_SubjectName(),
		   source,
		   new String[] {
			   "documentation", "Name of the reviewed subject"
		   });
		addAnnotation
		  (getComplianceReportHistory_RebuiltAt(),
		   source,
		   new String[] {
			   "documentation", "When this derived object was last rebuilt, as an ISO-8601 instant. Not the time of the last review - that is on the revision."
		   });
		addAnnotation
		  (getComplianceReportHistory_RevisionCount(),
		   source,
		   new String[] {
			   "documentation", "Number of revisions in this document. Redundant with the revisions list and kept because a summary sheet should not require counting rows."
		   });
		addAnnotation
		  (getComplianceReportHistory_Revisions(),
		   source,
		   new String[] {
			   "documentation", "One entry per review run, oldest first. Renders as the first sheet."
		   });
		addAnnotation
		  (getComplianceReportHistory_Evaluations(),
		   source,
		   new String[] {
			   "documentation", "The assessment itself, one row per evaluated classifier or feature per revision. Renders as the second sheet."
		   });
		addAnnotation
		  (getComplianceReportHistory_Changes(),
		   source,
		   new String[] {
			   "documentation", "The diff, one row per field that actually differs from the preceding revision. Renders as the third sheet and is the reason this document exists: the change kind on an evaluation row says THAT something changed, these rows say WHAT."
		   });
		addAnnotation
		  (getComplianceReportHistory_ReportLanguage(),
		   source,
		   new String[] {
			   "documentation", "The language of the gdpr report"
		   });
		addAnnotation
		  (getComplianceReportHistory_SubjectLanguage(),
		   source,
		   new String[] {
			   "documentation", "The language of the report subject (e.g. when a qvt transformation qvto, etc)"
		   });
		addAnnotation
		  (getComplianceReportHistory_ContextIds(),
		   source,
		   new String[] {
			   "documentation", "Ids of the contexts the reports were checked against."
		   });
		addAnnotation
		  (reportRevisionEClass,
		   source,
		   new String[] {
			   "documentation", "One review run of the subject - an agent review or a human correction - as a single spreadsheet row."
		   });
		addAnnotation
		  (getReportRevision_RevisionNumber(),
		   source,
		   new String[] {
			   "documentation", "1-based position in chronological order. The join key the other two sheets point at."
		   });
		addAnnotation
		  (getReportRevision_ReportId(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the stored ComplianceReport this revision was read from, so a row in the document can be traced back to the sealed report it summarises."
		   });
		addAnnotation
		  (getReportRevision_SubjectFingerprint(),
		   source,
		   new String[] {
			   "documentation", "Fingerprint of the subject as this revision reviewed it. Equal to the root\'s fingerprint while a document covers one revision of the model; the column is what lets a document later span several."
		   });
		addAnnotation
		  (getReportRevision_GeneratedAt(),
		   source,
		   new String[] {
			   "documentation", "When the review was produced, copied from ComplianceReport.generatedAt. Orders the revisions; a missing or unparsable value falls back to the timestamp in the report id."
		   });
		addAnnotation
		  (getReportRevision_GeneratedBy(),
		   source,
		   new String[] {
			   "documentation", "Who or what produced the review, copied from ComplianceReport.generatedBy - a model identifier for an agent run, a user for a correction."
		   });
		addAnnotation
		  (getReportRevision_Origin(),
		   source,
		   new String[] {
			   "documentation", "Whether this revision came from an agent review or from a human editing an earlier one. The column a compliance reader looks at first, because it says who is accountable for the verdict."
		   });
		addAnnotation
		  (getReportRevision_FindingCount(),
		   source,
		   new String[] {
			   "documentation", "Number of findings recorded in this revision."
		   });
		addAnnotation
		  (getReportRevision_ChangeCount(),
		   source,
		   new String[] {
			   "documentation", "Number of change rows attributed to this revision. Zero on the first revision, which has nothing to differ from."
		   });
		addAnnotation
		  (getReportRevision_ContextVersions(),
		   source,
		   new String[] {
			   "documentation", "The contexts of the report as id@version."
		   });
		addAnnotation
		  (evaluationRowEClass,
		   source,
		   new String[] {
			   "documentation", "The assessment of one classifier or one feature as one revision recorded it, flattened into a single row.\n\nValues copied from the report (category, relevance, confidence) are plain strings rather than the report\'s enumerations: this package stays self-contained, and the change rows have to hold values of differently typed fields as text anyway. Only vocabularies this model owns are enumerations."
		   });
		addAnnotation
		  (getEvaluationRow_RevisionNumber(),
		   source,
		   new String[] {
			   "documentation", "Which revision this row states. Points at ReportRevision.revisionNumber."
		   });
		addAnnotation
		  (getEvaluationRow_ElementId(),
		   source,
		   new String[] {
			   "documentation", "Id of the evaluated element: the classifier of an EMF subject, the requirement of a control evaluation."
		   });
		addAnnotation
		  (getEvaluationRow_ElementName(),
		   source,
		   new String[] {
			   "documentation", "Classifier name as it appears in the reviewed model."
		   });
		addAnnotation
		  (getEvaluationRow_ElementPath(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment addressing the classifier, e.g. //Patient. The address into the model, and the fallback match key when an id is missing, because it is derived from the model rather than from an agent following an instruction."
		   });
		addAnnotation
		  (getEvaluationRow_ChildId(),
		   source,
		   new String[] {
			   "documentation", "Id of the child element, e.g. the feature of a classifier. Unset for a row about the element itself."
		   });
		addAnnotation
		  (getEvaluationRow_ChildName(),
		   source,
		   new String[] {
			   "documentation", "Feature name as it appears in the reviewed model. Empty on a classifier-level row."
		   });
		addAnnotation
		  (getEvaluationRow_ChildPath(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment addressing the feature, e.g. //Patient/street. Empty on a classifier-level row."
		   });
		addAnnotation
		  (getEvaluationRow_TypeName(),
		   source,
		   new String[] {
			   "documentation", "Declared type of the feature, copied from the report. Part of why a category was assigned, so it belongs next to it."
		   });
		addAnnotation
		  (getEvaluationRow_Categories(),
		   source,
		   new String[] {
			   "documentation", "The data category assigned, as the literal name of the report\'s DataCategory, e.g. SPECIAL_CATEGORY."
		   });
		addAnnotation
		  (getEvaluationRow_RelevanceLevel(),
		   source,
		   new String[] {
			   "documentation", "The relevance assigned, as the literal name of the report\'s RelevanceLevelType, e.g. HIGH."
		   });
		addAnnotation
		  (getEvaluationRow_Confidence(),
		   source,
		   new String[] {
			   "documentation", "Confidence in the assessment, as the literal name of the report\'s ConfidenceType. REQUIRES_PURPOSE_CONFIRMATION is the value a human is expected to act on."
		   });
		addAnnotation
		  (getEvaluationRow_Rationale(),
		   source,
		   new String[] {
			   "documentation", "Why the category was assigned, copied verbatim from the finding. Carried in full rather than truncated: a lost justification is exactly what an auditor asks about."
		   });
		addAnnotation
		  (getEvaluationRow_Recommendation(),
		   source,
		   new String[] {
			   "documentation", "What the review recommends doing about it, copied verbatim from the finding."
		   });
		addAnnotation
		  (getEvaluationRow_Citations(),
		   source,
		   new String[] {
			   "documentation", "The citation identifiers backing the assessment, joined into one cell, e.g. \'Art.9(1), Rec.51\'. A single string rather than a list so that the row stays one spreadsheet row; the individual citations are diffed separately and appear in the change rows."
		   });
		addAnnotation
		  (getEvaluationRow_ChangeKind(),
		   source,
		   new String[] {
			   "documentation", "How this row differs from the same classifier or feature in the preceding revision. UNCHANGED on the first revision. Says that something changed; the change rows say what."
		   });
		addAnnotation
		  (getEvaluationRow_Purpose(),
		   source,
		   new String[] {
			   "documentation", "The reason a human gave for storing this feature, copied from FeatureEvaluation.purpose.\nEmpty until someone states it. Diffed like any other cell, so the revision in which a person\nanswered the agent\'s open question, and what they answered, appears in the change sheet."
		   });
		addAnnotation
		  (getEvaluationRow_ReviewStatus(),
		   source,
		   new String[] {
			   "documentation", "What a person decided about the finding, as the literal name of the report\'s ResolutionStatus, e.g. ACCEPTED. Empty when the finding carries no resolution, which means it is still open. Diffed, so the revision in which a decision was taken or withdrawn appears in the change sheet."
		   });
		addAnnotation
		  (getEvaluationRow_ResolutionJustification(),
		   source,
		   new String[] {
			   "documentation", "Why it was decided so, copied verbatim from FindingResolution.justification. Carried in full for the same reason as rationale. Diffed."
		   });
		addAnnotation
		  (getEvaluationRow_DecidedBy(),
		   source,
		   new String[] {
			   "documentation", "Who took the decision, copied from FindingResolution.decidedBy. Not diffed on its own: it changes only together with the status or the justification, and the change row already names the author in changedBy."
		   });
		addAnnotation
		  (getEvaluationRow_DecidedAt(),
		   source,
		   new String[] {
			   "documentation", "When the decision was taken, copied from FindingResolution.decidedAt as an ISO-8601 UTC instant. May be earlier than the revision\'s generatedAt when a decision was carried over unchanged. Not diffed, like decidedBy."
		   });
		addAnnotation
		  (getEvaluationRow_CorrectionNote(),
		   source,
		   new String[] {
			   "documentation", "Why a person corrected category, relevanceLevel or confidence, copied verbatim from Finding.correctionNote. Diffed, so it appears in the change sheet next to the corrected values."
		   });
		addAnnotation
		  (getEvaluationRow_ContextId(),
		   source,
		   new String[] {
			   "documentation", "Context of the evaluation."
		   });
		addAnnotation
		  (getEvaluationRow_RequirementIds(),
		   source,
		   new String[] {
			   "documentation", "Requirements concerned, comma separated."
		   });
		addAnnotation
		  (getEvaluationRow_AssetId(),
		   source,
		   new String[] {
			   "documentation", "Asset of a control evaluation."
		   });
		addAnnotation
		  (getEvaluationRow_FindingOrigin(),
		   source,
		   new String[] {
			   "documentation", "Who raised the finding."
		   });
		addAnnotation
		  (getEvaluationRow_Treatment(),
		   source,
		   new String[] {
			   "documentation", "Risk treatment."
		   });
		addAnnotation
		  (getEvaluationRow_RiskLevel(),
		   source,
		   new String[] {
			   "documentation", "Assessed risk level."
		   });
		addAnnotation
		  (getEvaluationRow_MeasureIds(),
		   source,
		   new String[] {
			   "documentation", "Measures treating the finding, comma separated."
		   });
		addAnnotation
		  (getEvaluationRow_TreatmentNote(),
		   source,
		   new String[] {
			   "documentation", "Treatment note."
		   });
		addAnnotation
		  (getEvaluationRow_DelegatedTo(),
		   source,
		   new String[] {
			   "documentation", "To whom the risk is transferred."
		   });
		addAnnotation
		  (getEvaluationRow_DueDate(),
		   source,
		   new String[] {
			   "documentation", "Due date of the treatment."
		   });
		addAnnotation
		  (getEvaluationRow_LawfulBases(),
		   source,
		   new String[] {
			   "documentation", "Lawful bases of a classifier row, comma separated."
		   });
		addAnnotation
		  (changeRowEClass,
		   source,
		   new String[] {
			   "documentation", "One field that differs between a revision and the one before it. Emitted only for fields that actually differ, so an empty sheet means nothing changed rather than nothing was compared."
		   });
		addAnnotation
		  (getChangeRow_RevisionNumber(),
		   source,
		   new String[] {
			   "documentation", "The revision that introduced the change, never the one it is measured against."
		   });
		addAnnotation
		  (getChangeRow_ChangedAt(),
		   source,
		   new String[] {
			   "documentation", "When the introducing revision was generated. Denormalised onto the row so the sheet reads without joining."
		   });
		addAnnotation
		  (getChangeRow_ChangedBy(),
		   source,
		   new String[] {
			   "documentation", "Who made the change - the agent identity for a review, the user for a correction. The accountability column."
		   });
		addAnnotation
		  (getChangeRow_ElementId(),
		   source,
		   new String[] {
			   "documentation", "Id of the evaluated element: the classifier of an EMF subject, the requirement of a control evaluation."
		   });
		addAnnotation
		  (getChangeRow_ChildId(),
		   source,
		   new String[] {
			   "documentation", "Id of the child element, e.g. the feature of a classifier. Unset for a row about the element itself."
		   });
		addAnnotation
		  (getChangeRow_Field(),
		   source,
		   new String[] {
			   "documentation", "Which field differs: category, relevanceLevel, confidence, rationale, recommendation, evidence, purpose, correctionNote, resolutionStatus or resolutionJustification. Empty when the whole evaluation was added or removed."
		   });
		addAnnotation
		  (getChangeRow_ChangeKind(),
		   source,
		   new String[] {
			   "documentation", "Whether the evaluation appeared, disappeared or was modified. UNCHANGED never occurs on a change row."
		   });
		addAnnotation
		  (getChangeRow_OldValue(),
		   source,
		   new String[] {
			   "documentation", "The value in the preceding revision, empty on ADDED."
		   });
		addAnnotation
		  (getChangeRow_NewValue(),
		   source,
		   new String[] {
			   "documentation", "The value in this revision, empty on REMOVED."
		   });
		addAnnotation
		  (revisionOriginEEnum,
		   source,
		   new String[] {
			   "documentation", "Where a revision came from. A vocabulary this model owns, unlike the categories copied from the report."
		   });
		addAnnotation
		  (revisionOriginEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The stored report did not say. Recorded rather than guessed: attributing a verdict to the wrong author is worse than admitting the record is incomplete."
		   });
		addAnnotation
		  (revisionOriginEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Produced by a GDPR review run."
		   });
		addAnnotation
		  (revisionOriginEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A person corrected an earlier revision."
		   });
		addAnnotation
		  (changeKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How something differs from the preceding revision."
		   });
		addAnnotation
		  (changeKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Identical to the preceding revision, or there is no preceding revision."
		   });
		addAnnotation
		  (changeKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Not present in the preceding revision."
		   });
		addAnnotation
		  (changeKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Present before with at least one differing field."
		   });
		addAnnotation
		  (changeKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Present in the preceding revision and gone in this one."
		   });
	}

} //HistoryPackageImpl
