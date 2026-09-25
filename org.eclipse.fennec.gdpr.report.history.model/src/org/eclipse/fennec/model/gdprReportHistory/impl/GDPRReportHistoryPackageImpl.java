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
package org.eclipse.fennec.model.gdprReportHistory.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.gdprReportHistory.ChangeKind;
import org.eclipse.fennec.model.gdprReportHistory.ChangeRow;
import org.eclipse.fennec.model.gdprReportHistory.EvaluationRow;
import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryFactory;
import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage;
import org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory;
import org.eclipse.fennec.model.gdprReportHistory.ReportRevision;
import org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GDPRReportHistoryPackageImpl extends EPackageImpl implements GDPRReportHistoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gdprReportHistoryEClass = null;

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
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GDPRReportHistoryPackageImpl() {
		super(eNS_URI, GDPRReportHistoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GDPRReportHistoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GDPRReportHistoryPackage init() {
		if (isInited) return (GDPRReportHistoryPackage)EPackage.Registry.INSTANCE.getEPackage(GDPRReportHistoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGDPRReportHistoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GDPRReportHistoryPackageImpl theGDPRReportHistoryPackage = registeredGDPRReportHistoryPackage instanceof GDPRReportHistoryPackageImpl ? (GDPRReportHistoryPackageImpl)registeredGDPRReportHistoryPackage : new GDPRReportHistoryPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGDPRReportHistoryPackage.createPackageContents();

		// Initialize created meta-data
		theGDPRReportHistoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGDPRReportHistoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GDPRReportHistoryPackage.eNS_URI, theGDPRReportHistoryPackage);
		return theGDPRReportHistoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGdprReportHistory() {
		return gdprReportHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_Name() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_SubjectName() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_SubjectFingerprint() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_RebuiltAt() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_RevisionCount() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReportHistory_Revisions() {
		return (EReference)gdprReportHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReportHistory_Evaluations() {
		return (EReference)gdprReportHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGdprReportHistory_Changes() {
		return (EReference)gdprReportHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_ReportLanguage() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGdprReportHistory_SubjectLanguage() {
		return (EAttribute)gdprReportHistoryEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getReportRevision_ModelFingerprint() {
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
	public EAttribute getReportRevision_CorpusCelex() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_CorpusConsolidatedDate() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_FindingCount() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportRevision_ChangeCount() {
		return (EAttribute)reportRevisionEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getEvaluationRow_ClassifierId() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ClassifierName() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_ClassifierUriFragment() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_FeatureId() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_FeatureName() {
		return (EAttribute)evaluationRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationRow_FeatureUriFragment() {
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
	public EAttribute getEvaluationRow_Category() {
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
	public EAttribute getChangeRow_ClassifierId() {
		return (EAttribute)changeRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeRow_FeatureId() {
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
	public GDPRReportHistoryFactory getGDPRReportHistoryFactory() {
		return (GDPRReportHistoryFactory)getEFactoryInstance();
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
		gdprReportHistoryEClass = createEClass(GDPR_REPORT_HISTORY);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__NAME);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__SUBJECT_NAME);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__SUBJECT_FINGERPRINT);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__REBUILT_AT);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__REVISION_COUNT);
		createEReference(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__REVISIONS);
		createEReference(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__EVALUATIONS);
		createEReference(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__CHANGES);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__REPORT_LANGUAGE);
		createEAttribute(gdprReportHistoryEClass, GDPR_REPORT_HISTORY__SUBJECT_LANGUAGE);

		reportRevisionEClass = createEClass(REPORT_REVISION);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__REVISION_NUMBER);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__REPORT_ID);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__MODEL_FINGERPRINT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__GENERATED_AT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__GENERATED_BY);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__ORIGIN);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__CORPUS_CELEX);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__CORPUS_CONSOLIDATED_DATE);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__FINDING_COUNT);
		createEAttribute(reportRevisionEClass, REPORT_REVISION__CHANGE_COUNT);

		evaluationRowEClass = createEClass(EVALUATION_ROW);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__REVISION_NUMBER);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CLASSIFIER_ID);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CLASSIFIER_NAME);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__FEATURE_ID);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__FEATURE_NAME);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__FEATURE_URI_FRAGMENT);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__TYPE_NAME);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CATEGORY);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RELEVANCE_LEVEL);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CONFIDENCE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RATIONALE);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__RECOMMENDATION);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CITATIONS);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__CHANGE_KIND);
		createEAttribute(evaluationRowEClass, EVALUATION_ROW__PURPOSE);

		changeRowEClass = createEClass(CHANGE_ROW);
		createEAttribute(changeRowEClass, CHANGE_ROW__REVISION_NUMBER);
		createEAttribute(changeRowEClass, CHANGE_ROW__CHANGED_AT);
		createEAttribute(changeRowEClass, CHANGE_ROW__CHANGED_BY);
		createEAttribute(changeRowEClass, CHANGE_ROW__CLASSIFIER_ID);
		createEAttribute(changeRowEClass, CHANGE_ROW__FEATURE_ID);
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
		initEClass(gdprReportHistoryEClass, GdprReportHistory.class, "GdprReportHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGdprReportHistory_Name(), ecorePackage.getEString(), "name", null, 0, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReportHistory_SubjectName(), ecorePackage.getEString(), "subjectName", null, 0, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReportHistory_SubjectFingerprint(), ecorePackage.getEString(), "subjectFingerprint", null, 0, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReportHistory_RebuiltAt(), ecorePackage.getEString(), "rebuiltAt", null, 1, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReportHistory_RevisionCount(), ecorePackage.getEInt(), "revisionCount", null, 0, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReportHistory_Revisions(), this.getReportRevision(), null, "revisions", null, 0, -1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReportHistory_Evaluations(), this.getEvaluationRow(), null, "evaluations", null, 0, -1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGdprReportHistory_Changes(), this.getChangeRow(), null, "changes", null, 0, -1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReportHistory_ReportLanguage(), ecorePackage.getEString(), "reportLanguage", null, 0, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGdprReportHistory_SubjectLanguage(), ecorePackage.getEString(), "subjectLanguage", null, 0, 1, GdprReportHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportRevisionEClass, ReportRevision.class, "ReportRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportRevision_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 1, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_ReportId(), ecorePackage.getEString(), "reportId", null, 1, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_ModelFingerprint(), ecorePackage.getEString(), "modelFingerprint", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_GeneratedAt(), ecorePackage.getEString(), "generatedAt", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_GeneratedBy(), ecorePackage.getEString(), "generatedBy", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_Origin(), this.getRevisionOrigin(), "origin", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_CorpusCelex(), ecorePackage.getEString(), "corpusCelex", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_CorpusConsolidatedDate(), ecorePackage.getEString(), "corpusConsolidatedDate", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_FindingCount(), ecorePackage.getEInt(), "findingCount", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRevision_ChangeCount(), ecorePackage.getEInt(), "changeCount", null, 0, 1, ReportRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationRowEClass, EvaluationRow.class, "EvaluationRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationRow_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 1, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ClassifierId(), ecorePackage.getEString(), "classifierId", null, 1, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ClassifierName(), ecorePackage.getEString(), "classifierName", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ClassifierUriFragment(), ecorePackage.getEString(), "classifierUriFragment", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_FeatureId(), ecorePackage.getEString(), "featureId", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_FeatureUriFragment(), ecorePackage.getEString(), "featureUriFragment", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Category(), ecorePackage.getEString(), "category", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_RelevanceLevel(), ecorePackage.getEString(), "relevanceLevel", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Confidence(), ecorePackage.getEString(), "confidence", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Recommendation(), ecorePackage.getEString(), "recommendation", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Citations(), ecorePackage.getEString(), "citations", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_ChangeKind(), this.getChangeKind(), "changeKind", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationRow_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, EvaluationRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRowEClass, ChangeRow.class, "ChangeRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeRow_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 1, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ChangedAt(), ecorePackage.getEString(), "changedAt", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ChangedBy(), ecorePackage.getEString(), "changedBy", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_ClassifierId(), ecorePackage.getEString(), "classifierId", null, 1, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRow_FeatureId(), ecorePackage.getEString(), "featureId", null, 0, 1, ChangeRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
			   "copyrightText", "Copyright (c) 2026 Contributors to the Eclipse Foundation.\n\nThis program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n  Data In Motion Consulting - initial implementation",
			   "documentation", "The review history of one subject, derived from the GdprReport objects stored for it and rebuilt whenever one of them lands or changes.\n\nThe model is deliberately FLAT: three containment lists of attribute-only classes under the root, so the tabular codec renders one spreadsheet sheet per list. Nesting it like gdpr-report would produce a sheet-per-EClass sprawl that no human reads. Nothing here is a source of truth - the object can be deleted and regenerated from the reports at any time."
		   });
		addAnnotation
		  (gdprReportHistoryEClass,
		   source,
		   new String[] {
			   "documentation", "Root of the derived review history of one subject. Exactly one instance per subject, rebuilt in full on every change rather than appended to, so that a replayed or missed event cannot corrupt it."
		   });
		addAnnotation
		  (getGdprReportHistory_Name(),
		   source,
		   new String[] {
			   "documentation", "Human readable title of the document, e.g. \'GDPR review history of clinic 1.0.0\'."
		   });
		addAnnotation
		  (getGdprReportHistory_SubjectName(),
		   source,
		   new String[] {
			   "documentation", "Name of the reviewed EPackage, as it appears in the model."
		   });
		addAnnotation
		  (getGdprReportHistory_SubjectFingerprint(),
		   source,
		   new String[] {
			   "documentation", "The subject revision this history is about, when the history is keyed per fingerprint. "
		   });
		addAnnotation
		  (getGdprReportHistory_RebuiltAt(),
		   source,
		   new String[] {
			   "documentation", "When this derived object was last rebuilt, as an ISO-8601 instant. Not the time of the last review - that is on the revision."
		   });
		addAnnotation
		  (getGdprReportHistory_RevisionCount(),
		   source,
		   new String[] {
			   "documentation", "Number of revisions in this document. Redundant with the revisions list and kept because a summary sheet should not require counting rows."
		   });
		addAnnotation
		  (getGdprReportHistory_Revisions(),
		   source,
		   new String[] {
			   "documentation", "One entry per review run, oldest first. Renders as the first sheet."
		   });
		addAnnotation
		  (getGdprReportHistory_Evaluations(),
		   source,
		   new String[] {
			   "documentation", "The assessment itself, one row per evaluated classifier or feature per revision. Renders as the second sheet."
		   });
		addAnnotation
		  (getGdprReportHistory_Changes(),
		   source,
		   new String[] {
			   "documentation", "The diff, one row per field that actually differs from the preceding revision. Renders as the third sheet and is the reason this document exists: the change kind on an evaluation row says THAT something changed, these rows say WHAT."
		   });
		addAnnotation
		  (getGdprReportHistory_ReportLanguage(),
		   source,
		   new String[] {
			   "documentation", "The language of the gdpr report"
		   });
		addAnnotation
		  (getGdprReportHistory_SubjectLanguage(),
		   source,
		   new String[] {
			   "documentation", "The language of the report subject (e.g. when a qvt transformation qvto, etc)"
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
			   "documentation", "Identifier of the stored GdprReport this revision was read from, so a row in the document can be traced back to the sealed report it summarises."
		   });
		addAnnotation
		  (getReportRevision_ModelFingerprint(),
		   source,
		   new String[] {
			   "documentation", "Fingerprint of the subject as this revision reviewed it. Equal to the root\'s fingerprint while a document covers one revision of the model; the column is what lets a document later span several."
		   });
		addAnnotation
		  (getReportRevision_GeneratedAt(),
		   source,
		   new String[] {
			   "documentation", "When the review was produced, copied from GdprReport.generatedAt. Orders the revisions; a missing or unparsable value falls back to the timestamp in the report id."
		   });
		addAnnotation
		  (getReportRevision_GeneratedBy(),
		   source,
		   new String[] {
			   "documentation", "Who or what produced the review, copied from GdprReport.generatedBy - a model identifier for an agent run, a user for a correction."
		   });
		addAnnotation
		  (getReportRevision_Origin(),
		   source,
		   new String[] {
			   "documentation", "Whether this revision came from an agent review or from a human editing an earlier one. The column a compliance reader looks at first, because it says who is accountable for the verdict."
		   });
		addAnnotation
		  (getReportRevision_CorpusCelex(),
		   source,
		   new String[] {
			   "documentation", "CELEX number of the legal corpus the review cited, copied from LegalCorpusRef."
		   });
		addAnnotation
		  (getReportRevision_CorpusConsolidatedDate(),
		   source,
		   new String[] {
			   "documentation", "Consolidation date of that corpus. Carried per revision because a verdict is only meaningful against the text it was checked on: two revisions may differ because the law moved, not because the model did."
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
		  (getEvaluationRow_ClassifierId(),
		   source,
		   new String[] {
			   "documentation", "ClassifierEvaluation.id of the report, which is the classifier name and is documented there as stable across reruns. The key rows are matched on when diffing two revisions."
		   });
		addAnnotation
		  (getEvaluationRow_ClassifierName(),
		   source,
		   new String[] {
			   "documentation", "Classifier name as it appears in the reviewed model."
		   });
		addAnnotation
		  (getEvaluationRow_ClassifierUriFragment(),
		   source,
		   new String[] {
			   "documentation", "EMF fragment addressing the classifier, e.g. //Patient. The address into the model, and the fallback match key when an id is missing, because it is derived from the model rather than from an agent following an instruction."
		   });
		addAnnotation
		  (getEvaluationRow_FeatureId(),
		   source,
		   new String[] {
			   "documentation", "FeatureEvaluation.id of the report, of the form classifier.feature. Empty on a row that states a classifier-level finding."
		   });
		addAnnotation
		  (getEvaluationRow_FeatureName(),
		   source,
		   new String[] {
			   "documentation", "Feature name as it appears in the reviewed model. Empty on a classifier-level row."
		   });
		addAnnotation
		  (getEvaluationRow_FeatureUriFragment(),
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
		  (getEvaluationRow_Category(),
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
		  (getChangeRow_ClassifierId(),
		   source,
		   new String[] {
			   "documentation", "Classifier the change is about. Joins to EvaluationRow.classifierId."
		   });
		addAnnotation
		  (getChangeRow_FeatureId(),
		   source,
		   new String[] {
			   "documentation", "Feature the change is about, empty for a classifier-level change. Joins to EvaluationRow.featureId."
		   });
		addAnnotation
		  (getChangeRow_Field(),
		   source,
		   new String[] {
			   "documentation", "Which field differs: category, relevanceLevel, confidence, rationale, recommendation or evidence. Empty when the whole evaluation was added or removed."
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

} //GDPRReportHistoryPackageImpl
