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
package org.eclipse.fennec.model.gdprReportHistory;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The review history of one subject, derived from the GdprReport objects stored for it and rebuilt whenever one of them lands or changes.
 * 
 * The model is deliberately FLAT: three containment lists of attribute-only classes under the root, so the tabular codec renders one spreadsheet sheet per list. Nesting it like gdpr-report would produce a sheet-per-EClass sprawl that no human reads. Nothing here is a source of truth - the object can be deleted and regenerated from the reports at any time.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='21.0' oSGiCompatible='true' basePackage='org.eclipse.fennec.model' resource='XMI' copyrightText='Copyright (c) 2026 Contributors to the Eclipse Foundation.\n\nThis program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n  Data In Motion Consulting - initial implementation'"
 * @generated
 */
@ProviderType
@EPackage(uri = GDPRReportHistoryPackage.eNS_URI, fingerprint = "fp1:f783e1eee0985c74b22ac304a1918408473d41068643f5a2195ad8e73f2485f1", genModel = "/model/gdpr-report-history.genmodel", genModelSourceLocations = {"model/gdpr-report-history.genmodel","org.eclipse.fennec.gdpr.report.history.model/model/gdpr-report-history.genmodel"}, ecore = "/model/gdpr-report-history.ecore", ecoreSourceLocations = "/model/gdpr-report-history.ecore")
public interface GDPRReportHistoryPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gdprReportHistory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/gdpr-report-history/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gdpr-report-history";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GDPRReportHistoryPackage eINSTANCE = org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl <em>Gdpr Report History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getGdprReportHistory()
	 * @generated
	 */
	int GDPR_REPORT_HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subject Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__SUBJECT_NS_URI = 1;

	/**
	 * The feature id for the '<em><b>Subject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__SUBJECT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Model Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__MODEL_FINGERPRINT = 3;

	/**
	 * The feature id for the '<em><b>Rebuilt At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__REBUILT_AT = 4;

	/**
	 * The feature id for the '<em><b>Revision Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__REVISION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__REVISIONS = 6;

	/**
	 * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__EVALUATIONS = 7;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY__CHANGES = 8;

	/**
	 * The number of structural features of the '<em>Gdpr Report History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Gdpr Report History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDPR_REPORT_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.ReportRevisionImpl <em>Report Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.ReportRevisionImpl
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getReportRevision()
	 * @generated
	 */
	int REPORT_REVISION = 1;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__REVISION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Report Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__REPORT_ID = 1;

	/**
	 * The feature id for the '<em><b>Model Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__MODEL_FINGERPRINT = 2;

	/**
	 * The feature id for the '<em><b>Generated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__GENERATED_AT = 3;

	/**
	 * The feature id for the '<em><b>Generated By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__GENERATED_BY = 4;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__ORIGIN = 5;

	/**
	 * The feature id for the '<em><b>Corpus Celex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__CORPUS_CELEX = 6;

	/**
	 * The feature id for the '<em><b>Corpus Consolidated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__CORPUS_CONSOLIDATED_DATE = 7;

	/**
	 * The feature id for the '<em><b>Finding Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__FINDING_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Change Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__CHANGE_COUNT = 9;

	/**
	 * The number of structural features of the '<em>Report Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Report Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl <em>Evaluation Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getEvaluationRow()
	 * @generated
	 */
	int EVALUATION_ROW = 2;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__REVISION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Classifier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CLASSIFIER_ID = 1;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CLASSIFIER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Classifier Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__FEATURE_ID = 4;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__FEATURE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Feature Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__FEATURE_URI_FRAGMENT = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__TYPE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Relevance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__RELEVANCE_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CONFIDENCE = 10;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__RATIONALE = 11;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__RECOMMENDATION = 12;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CITATIONS = 13;

	/**
	 * The feature id for the '<em><b>Change Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CHANGE_KIND = 14;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__PURPOSE = 15;

	/**
	 * The number of structural features of the '<em>Evaluation Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Evaluation Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl <em>Change Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getChangeRow()
	 * @generated
	 */
	int CHANGE_ROW = 3;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__REVISION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Changed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__CHANGED_AT = 1;

	/**
	 * The feature id for the '<em><b>Changed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__CHANGED_BY = 2;

	/**
	 * The feature id for the '<em><b>Classifier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__CLASSIFIER_ID = 3;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__FEATURE_ID = 4;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__FIELD = 5;

	/**
	 * The feature id for the '<em><b>Change Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__CHANGE_KIND = 6;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__OLD_VALUE = 7;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__NEW_VALUE = 8;

	/**
	 * The number of structural features of the '<em>Change Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Change Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin <em>Revision Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getRevisionOrigin()
	 * @generated
	 */
	int REVISION_ORIGIN = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeKind <em>Change Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
	 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getChangeKind()
	 * @generated
	 */
	int CHANGE_KIND = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory <em>Gdpr Report History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gdpr Report History</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory
	 * @generated
	 */
	EClass getGdprReportHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getName()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EAttribute getGdprReportHistory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectNsURI <em>Subject Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Ns URI</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectNsURI()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EAttribute getGdprReportHistory_SubjectNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectName <em>Subject Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Name</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectName()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EAttribute getGdprReportHistory_SubjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getModelFingerprint <em>Model Fingerprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Fingerprint</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getModelFingerprint()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EAttribute getGdprReportHistory_ModelFingerprint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRebuiltAt <em>Rebuilt At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rebuilt At</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRebuiltAt()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EAttribute getGdprReportHistory_RebuiltAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisionCount <em>Revision Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Count</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisionCount()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EAttribute getGdprReportHistory_RevisionCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisions()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EReference getGdprReportHistory_Revisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getEvaluations <em>Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluations</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getEvaluations()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EReference getGdprReportHistory_Evaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changes</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getChanges()
	 * @see #getGdprReportHistory()
	 * @generated
	 */
	EReference getGdprReportHistory_Changes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision <em>Report Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Revision</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision
	 * @generated
	 */
	EClass getReportRevision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getRevisionNumber()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getReportId <em>Report Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Id</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getReportId()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_ReportId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getModelFingerprint <em>Model Fingerprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Fingerprint</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getModelFingerprint()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_ModelFingerprint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getGeneratedAt <em>Generated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated At</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getGeneratedAt()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_GeneratedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getGeneratedBy <em>Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated By</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getGeneratedBy()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_GeneratedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getOrigin()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getCorpusCelex <em>Corpus Celex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corpus Celex</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getCorpusCelex()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_CorpusCelex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getCorpusConsolidatedDate <em>Corpus Consolidated Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corpus Consolidated Date</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getCorpusConsolidatedDate()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_CorpusConsolidatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getFindingCount <em>Finding Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finding Count</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getFindingCount()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_FindingCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getChangeCount <em>Change Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Count</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ReportRevision#getChangeCount()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_ChangeCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow <em>Evaluation Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Row</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow
	 * @generated
	 */
	EClass getEvaluationRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRevisionNumber()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierId <em>Classifier Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Id</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierId()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ClassifierId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierName()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ClassifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierUriFragment <em>Classifier Uri Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Uri Fragment</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getClassifierUriFragment()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ClassifierUriFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Id</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureId()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_FeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureName()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureUriFragment <em>Feature Uri Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Uri Fragment</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getFeatureUriFragment()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_FeatureUriFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getTypeName()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCategory()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRelevanceLevel <em>Relevance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevance Level</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRelevanceLevel()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_RelevanceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getConfidence()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRationale()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getRecommendation()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Recommendation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Citations</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getCitations()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Citations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getChangeKind <em>Change Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Kind</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getChangeKind()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ChangeKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.EvaluationRow#getPurpose()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Purpose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow <em>Change Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Row</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow
	 * @generated
	 */
	EClass getChangeRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getRevisionNumber()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedAt <em>Changed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed At</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedAt()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChangedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedBy <em>Changed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed By</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedBy()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChangedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getClassifierId <em>Classifier Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Id</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getClassifierId()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ClassifierId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Id</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getFeatureId()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_FeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getField()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangeKind <em>Change Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Kind</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangeKind()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChangeKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getOldValue()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getNewValue()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_NewValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin <em>Revision Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Revision Origin</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin
	 * @generated
	 */
	EEnum getRevisionOrigin();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeKind <em>Change Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Kind</em>'.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
	 * @generated
	 */
	EEnum getChangeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GDPRReportHistoryFactory getGDPRReportHistoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl <em>Gdpr Report History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getGdprReportHistory()
		 * @generated
		 */
		EClass GDPR_REPORT_HISTORY = eINSTANCE.getGdprReportHistory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDPR_REPORT_HISTORY__NAME = eINSTANCE.getGdprReportHistory_Name();

		/**
		 * The meta object literal for the '<em><b>Subject Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDPR_REPORT_HISTORY__SUBJECT_NS_URI = eINSTANCE.getGdprReportHistory_SubjectNsURI();

		/**
		 * The meta object literal for the '<em><b>Subject Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDPR_REPORT_HISTORY__SUBJECT_NAME = eINSTANCE.getGdprReportHistory_SubjectName();

		/**
		 * The meta object literal for the '<em><b>Model Fingerprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDPR_REPORT_HISTORY__MODEL_FINGERPRINT = eINSTANCE.getGdprReportHistory_ModelFingerprint();

		/**
		 * The meta object literal for the '<em><b>Rebuilt At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDPR_REPORT_HISTORY__REBUILT_AT = eINSTANCE.getGdprReportHistory_RebuiltAt();

		/**
		 * The meta object literal for the '<em><b>Revision Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDPR_REPORT_HISTORY__REVISION_COUNT = eINSTANCE.getGdprReportHistory_RevisionCount();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GDPR_REPORT_HISTORY__REVISIONS = eINSTANCE.getGdprReportHistory_Revisions();

		/**
		 * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GDPR_REPORT_HISTORY__EVALUATIONS = eINSTANCE.getGdprReportHistory_Evaluations();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GDPR_REPORT_HISTORY__CHANGES = eINSTANCE.getGdprReportHistory_Changes();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.ReportRevisionImpl <em>Report Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.ReportRevisionImpl
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getReportRevision()
		 * @generated
		 */
		EClass REPORT_REVISION = eINSTANCE.getReportRevision();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__REVISION_NUMBER = eINSTANCE.getReportRevision_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Report Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__REPORT_ID = eINSTANCE.getReportRevision_ReportId();

		/**
		 * The meta object literal for the '<em><b>Model Fingerprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__MODEL_FINGERPRINT = eINSTANCE.getReportRevision_ModelFingerprint();

		/**
		 * The meta object literal for the '<em><b>Generated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__GENERATED_AT = eINSTANCE.getReportRevision_GeneratedAt();

		/**
		 * The meta object literal for the '<em><b>Generated By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__GENERATED_BY = eINSTANCE.getReportRevision_GeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__ORIGIN = eINSTANCE.getReportRevision_Origin();

		/**
		 * The meta object literal for the '<em><b>Corpus Celex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__CORPUS_CELEX = eINSTANCE.getReportRevision_CorpusCelex();

		/**
		 * The meta object literal for the '<em><b>Corpus Consolidated Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__CORPUS_CONSOLIDATED_DATE = eINSTANCE.getReportRevision_CorpusConsolidatedDate();

		/**
		 * The meta object literal for the '<em><b>Finding Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__FINDING_COUNT = eINSTANCE.getReportRevision_FindingCount();

		/**
		 * The meta object literal for the '<em><b>Change Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__CHANGE_COUNT = eINSTANCE.getReportRevision_ChangeCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl <em>Evaluation Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.EvaluationRowImpl
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getEvaluationRow()
		 * @generated
		 */
		EClass EVALUATION_ROW = eINSTANCE.getEvaluationRow();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__REVISION_NUMBER = eINSTANCE.getEvaluationRow_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Classifier Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CLASSIFIER_ID = eINSTANCE.getEvaluationRow_ClassifierId();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CLASSIFIER_NAME = eINSTANCE.getEvaluationRow_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Classifier Uri Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CLASSIFIER_URI_FRAGMENT = eINSTANCE.getEvaluationRow_ClassifierUriFragment();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__FEATURE_ID = eINSTANCE.getEvaluationRow_FeatureId();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__FEATURE_NAME = eINSTANCE.getEvaluationRow_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Feature Uri Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__FEATURE_URI_FRAGMENT = eINSTANCE.getEvaluationRow_FeatureUriFragment();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__TYPE_NAME = eINSTANCE.getEvaluationRow_TypeName();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CATEGORY = eINSTANCE.getEvaluationRow_Category();

		/**
		 * The meta object literal for the '<em><b>Relevance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__RELEVANCE_LEVEL = eINSTANCE.getEvaluationRow_RelevanceLevel();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CONFIDENCE = eINSTANCE.getEvaluationRow_Confidence();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__RATIONALE = eINSTANCE.getEvaluationRow_Rationale();

		/**
		 * The meta object literal for the '<em><b>Recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__RECOMMENDATION = eINSTANCE.getEvaluationRow_Recommendation();

		/**
		 * The meta object literal for the '<em><b>Citations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CITATIONS = eINSTANCE.getEvaluationRow_Citations();

		/**
		 * The meta object literal for the '<em><b>Change Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CHANGE_KIND = eINSTANCE.getEvaluationRow_ChangeKind();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__PURPOSE = eINSTANCE.getEvaluationRow_Purpose();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl <em>Change Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getChangeRow()
		 * @generated
		 */
		EClass CHANGE_ROW = eINSTANCE.getChangeRow();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__REVISION_NUMBER = eINSTANCE.getChangeRow_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Changed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__CHANGED_AT = eINSTANCE.getChangeRow_ChangedAt();

		/**
		 * The meta object literal for the '<em><b>Changed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__CHANGED_BY = eINSTANCE.getChangeRow_ChangedBy();

		/**
		 * The meta object literal for the '<em><b>Classifier Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__CLASSIFIER_ID = eINSTANCE.getChangeRow_ClassifierId();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__FEATURE_ID = eINSTANCE.getChangeRow_FeatureId();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__FIELD = eINSTANCE.getChangeRow_Field();

		/**
		 * The meta object literal for the '<em><b>Change Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__CHANGE_KIND = eINSTANCE.getChangeRow_ChangeKind();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__OLD_VALUE = eINSTANCE.getChangeRow_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__NEW_VALUE = eINSTANCE.getChangeRow_NewValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin <em>Revision Origin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdprReportHistory.RevisionOrigin
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getRevisionOrigin()
		 * @generated
		 */
		EEnum REVISION_ORIGIN = eINSTANCE.getRevisionOrigin();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeKind <em>Change Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
		 * @see org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl#getChangeKind()
		 * @generated
		 */
		EEnum CHANGE_KIND = eINSTANCE.getChangeKind();

	}

} //GDPRReportHistoryPackage
