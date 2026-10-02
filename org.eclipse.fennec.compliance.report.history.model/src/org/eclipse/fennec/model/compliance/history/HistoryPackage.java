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
package org.eclipse.fennec.model.compliance.history;


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
 * The revisions of the compliance reports of one subject, lined up as flat rows for display and diffing. Rebuilt from the reports; not a source of truth.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.history.HistoryFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = HistoryPackage.eNS_URI, fingerprint = "fp1:d5219a4e079f1bc4af63ee907f91a63b2ea7601080b82d2a8fcb3a28364c0702", genModel = "/model/history.genmodel", genModelSourceLocations = {"model/history.genmodel","org.eclipse.fennec.compliance.report.history.model/model/history.genmodel"}, ecore = "/model/history.ecore", ecoreSourceLocations = "/model/history.ecore")
public interface HistoryPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "history";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/compliance/report-history/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "history";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HistoryPackage eINSTANCE = org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.history.impl.ComplianceReportHistoryImpl <em>Compliance Report History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.history.impl.ComplianceReportHistoryImpl
	 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getComplianceReportHistory()
	 * @generated
	 */
	int COMPLIANCE_REPORT_HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subject Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__SUBJECT_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Subject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__SUBJECT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Rebuilt At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__REBUILT_AT = 3;

	/**
	 * The feature id for the '<em><b>Revision Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__REVISION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__REVISIONS = 5;

	/**
	 * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__EVALUATIONS = 6;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__CHANGES = 7;

	/**
	 * The feature id for the '<em><b>Report Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__REPORT_LANGUAGE = 8;

	/**
	 * The feature id for the '<em><b>Subject Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__SUBJECT_LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Context Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY__CONTEXT_IDS = 10;

	/**
	 * The number of structural features of the '<em>Compliance Report History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Compliance Report History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_REPORT_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.history.impl.ReportRevisionImpl <em>Report Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.history.impl.ReportRevisionImpl
	 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getReportRevision()
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
	 * The feature id for the '<em><b>Subject Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__SUBJECT_FINGERPRINT = 2;

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
	 * The feature id for the '<em><b>Finding Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__FINDING_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Change Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__CHANGE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Context Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION__CONTEXT_VERSIONS = 8;

	/**
	 * The number of structural features of the '<em>Report Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Report Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REVISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl <em>Evaluation Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl
	 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getEvaluationRow()
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
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__ELEMENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__ELEMENT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Element Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__ELEMENT_PATH = 3;

	/**
	 * The feature id for the '<em><b>Child Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CHILD_ID = 4;

	/**
	 * The feature id for the '<em><b>Child Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CHILD_NAME = 5;

	/**
	 * The feature id for the '<em><b>Child Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CHILD_PATH = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__TYPE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CATEGORIES = 8;

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
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__REVIEW_STATUS = 16;

	/**
	 * The feature id for the '<em><b>Resolution Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__RESOLUTION_JUSTIFICATION = 17;

	/**
	 * The feature id for the '<em><b>Decided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__DECIDED_BY = 18;

	/**
	 * The feature id for the '<em><b>Decided At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__DECIDED_AT = 19;

	/**
	 * The feature id for the '<em><b>Correction Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CORRECTION_NOTE = 20;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__CONTEXT_ID = 21;

	/**
	 * The feature id for the '<em><b>Requirement Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__REQUIREMENT_IDS = 22;

	/**
	 * The feature id for the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__ASSET_ID = 23;

	/**
	 * The feature id for the '<em><b>Finding Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__FINDING_ORIGIN = 24;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__TREATMENT = 25;

	/**
	 * The feature id for the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__RISK_LEVEL = 26;

	/**
	 * The feature id for the '<em><b>Measure Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__MEASURE_IDS = 27;

	/**
	 * The feature id for the '<em><b>Treatment Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__TREATMENT_NOTE = 28;

	/**
	 * The feature id for the '<em><b>Delegated To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__DELEGATED_TO = 29;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__DUE_DATE = 30;

	/**
	 * The feature id for the '<em><b>Lawful Bases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW__LAWFUL_BASES = 31;

	/**
	 * The number of structural features of the '<em>Evaluation Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW_FEATURE_COUNT = 32;

	/**
	 * The number of operations of the '<em>Evaluation Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.history.impl.ChangeRowImpl <em>Change Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.history.impl.ChangeRowImpl
	 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getChangeRow()
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
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__ELEMENT_ID = 3;

	/**
	 * The feature id for the '<em><b>Child Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROW__CHILD_ID = 4;

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
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.history.RevisionOrigin <em>Revision Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.history.RevisionOrigin
	 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getRevisionOrigin()
	 * @generated
	 */
	int REVISION_ORIGIN = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.history.ChangeKind <em>Change Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.history.ChangeKind
	 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getChangeKind()
	 * @generated
	 */
	int CHANGE_KIND = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory <em>Compliance Report History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Report History</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory
	 * @generated
	 */
	EClass getComplianceReportHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getName()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getSubjectIdentifier <em>Subject Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Identifier</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getSubjectIdentifier()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_SubjectIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getSubjectName <em>Subject Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getSubjectName()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_SubjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getRebuiltAt <em>Rebuilt At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rebuilt At</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getRebuiltAt()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_RebuiltAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getRevisionCount <em>Revision Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Count</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getRevisionCount()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_RevisionCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getRevisions()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EReference getComplianceReportHistory_Revisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getEvaluations <em>Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluations</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getEvaluations()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EReference getComplianceReportHistory_Evaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changes</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getChanges()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EReference getComplianceReportHistory_Changes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getReportLanguage <em>Report Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Language</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getReportLanguage()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_ReportLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getSubjectLanguage <em>Subject Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Language</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getSubjectLanguage()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_SubjectLanguage();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getContextIds <em>Context Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context Ids</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ComplianceReportHistory#getContextIds()
	 * @see #getComplianceReportHistory()
	 * @generated
	 */
	EAttribute getComplianceReportHistory_ContextIds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.history.ReportRevision <em>Report Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Revision</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision
	 * @generated
	 */
	EClass getReportRevision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getRevisionNumber()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getReportId <em>Report Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getReportId()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_ReportId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getSubjectFingerprint <em>Subject Fingerprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Fingerprint</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getSubjectFingerprint()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_SubjectFingerprint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getGeneratedAt <em>Generated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated At</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getGeneratedAt()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_GeneratedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getGeneratedBy <em>Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated By</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getGeneratedBy()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_GeneratedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getOrigin()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getFindingCount <em>Finding Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finding Count</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getFindingCount()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_FindingCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getChangeCount <em>Change Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Count</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getChangeCount()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_ChangeCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.history.ReportRevision#getContextVersions <em>Context Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context Versions</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ReportRevision#getContextVersions()
	 * @see #getReportRevision()
	 * @generated
	 */
	EAttribute getReportRevision_ContextVersions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow <em>Evaluation Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Row</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow
	 * @generated
	 */
	EClass getEvaluationRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getRevisionNumber()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementId()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementName()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementPath <em>Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Path</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getElementPath()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ElementPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildId <em>Child Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildId()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ChildId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildName <em>Child Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildName()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ChildName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildPath <em>Child Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Path</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getChildPath()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ChildPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getTypeName()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categories</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getCategories()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Categories();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRelevanceLevel <em>Relevance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevance Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getRelevanceLevel()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_RelevanceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getConfidence()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getRationale()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getRecommendation()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Recommendation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Citations</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getCitations()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Citations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getChangeKind <em>Change Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getChangeKind()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ChangeKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getPurpose()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getReviewStatus <em>Review Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Status</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getReviewStatus()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ReviewStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getResolutionJustification <em>Resolution Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Justification</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getResolutionJustification()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ResolutionJustification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedBy <em>Decided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decided By</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedBy()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_DecidedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedAt <em>Decided At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decided At</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getDecidedAt()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_DecidedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getCorrectionNote <em>Correction Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction Note</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getCorrectionNote()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_CorrectionNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getContextId <em>Context Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getContextId()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_ContextId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRequirementIds <em>Requirement Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Ids</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getRequirementIds()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_RequirementIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getAssetId <em>Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getAssetId()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_AssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getFindingOrigin <em>Finding Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finding Origin</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getFindingOrigin()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_FindingOrigin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatment</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatment()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_Treatment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getRiskLevel()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_RiskLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getMeasureIds <em>Measure Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Ids</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getMeasureIds()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_MeasureIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatmentNote <em>Treatment Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatment Note</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getTreatmentNote()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_TreatmentNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDelegatedTo <em>Delegated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegated To</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getDelegatedTo()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_DelegatedTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getDueDate()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.EvaluationRow#getLawfulBases <em>Lawful Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lawful Bases</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.EvaluationRow#getLawfulBases()
	 * @see #getEvaluationRow()
	 * @generated
	 */
	EAttribute getEvaluationRow_LawfulBases();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.history.ChangeRow <em>Change Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Row</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow
	 * @generated
	 */
	EClass getChangeRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getRevisionNumber()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getChangedAt <em>Changed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed At</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getChangedAt()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChangedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getChangedBy <em>Changed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed By</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getChangedBy()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChangedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getElementId()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getChildId <em>Child Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getChildId()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChildId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getField()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getChangeKind <em>Change Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getChangeKind()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_ChangeKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getOldValue()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.history.ChangeRow#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeRow#getNewValue()
	 * @see #getChangeRow()
	 * @generated
	 */
	EAttribute getChangeRow_NewValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.history.RevisionOrigin <em>Revision Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Revision Origin</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.RevisionOrigin
	 * @generated
	 */
	EEnum getRevisionOrigin();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.history.ChangeKind <em>Change Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.history.ChangeKind
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
	HistoryFactory getHistoryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.history.impl.ComplianceReportHistoryImpl <em>Compliance Report History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.history.impl.ComplianceReportHistoryImpl
		 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getComplianceReportHistory()
		 * @generated
		 */
		EClass COMPLIANCE_REPORT_HISTORY = eINSTANCE.getComplianceReportHistory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__NAME = eINSTANCE.getComplianceReportHistory_Name();

		/**
		 * The meta object literal for the '<em><b>Subject Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__SUBJECT_IDENTIFIER = eINSTANCE.getComplianceReportHistory_SubjectIdentifier();

		/**
		 * The meta object literal for the '<em><b>Subject Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__SUBJECT_NAME = eINSTANCE.getComplianceReportHistory_SubjectName();

		/**
		 * The meta object literal for the '<em><b>Rebuilt At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__REBUILT_AT = eINSTANCE.getComplianceReportHistory_RebuiltAt();

		/**
		 * The meta object literal for the '<em><b>Revision Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__REVISION_COUNT = eINSTANCE.getComplianceReportHistory_RevisionCount();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_REPORT_HISTORY__REVISIONS = eINSTANCE.getComplianceReportHistory_Revisions();

		/**
		 * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_REPORT_HISTORY__EVALUATIONS = eINSTANCE.getComplianceReportHistory_Evaluations();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_REPORT_HISTORY__CHANGES = eINSTANCE.getComplianceReportHistory_Changes();

		/**
		 * The meta object literal for the '<em><b>Report Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__REPORT_LANGUAGE = eINSTANCE.getComplianceReportHistory_ReportLanguage();

		/**
		 * The meta object literal for the '<em><b>Subject Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__SUBJECT_LANGUAGE = eINSTANCE.getComplianceReportHistory_SubjectLanguage();

		/**
		 * The meta object literal for the '<em><b>Context Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_REPORT_HISTORY__CONTEXT_IDS = eINSTANCE.getComplianceReportHistory_ContextIds();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.history.impl.ReportRevisionImpl <em>Report Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.history.impl.ReportRevisionImpl
		 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getReportRevision()
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
		 * The meta object literal for the '<em><b>Subject Fingerprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__SUBJECT_FINGERPRINT = eINSTANCE.getReportRevision_SubjectFingerprint();

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
		 * The meta object literal for the '<em><b>Context Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REVISION__CONTEXT_VERSIONS = eINSTANCE.getReportRevision_ContextVersions();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl <em>Evaluation Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.history.impl.EvaluationRowImpl
		 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getEvaluationRow()
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
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__ELEMENT_ID = eINSTANCE.getEvaluationRow_ElementId();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__ELEMENT_NAME = eINSTANCE.getEvaluationRow_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__ELEMENT_PATH = eINSTANCE.getEvaluationRow_ElementPath();

		/**
		 * The meta object literal for the '<em><b>Child Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CHILD_ID = eINSTANCE.getEvaluationRow_ChildId();

		/**
		 * The meta object literal for the '<em><b>Child Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CHILD_NAME = eINSTANCE.getEvaluationRow_ChildName();

		/**
		 * The meta object literal for the '<em><b>Child Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CHILD_PATH = eINSTANCE.getEvaluationRow_ChildPath();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__TYPE_NAME = eINSTANCE.getEvaluationRow_TypeName();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CATEGORIES = eINSTANCE.getEvaluationRow_Categories();

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
		 * The meta object literal for the '<em><b>Review Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__REVIEW_STATUS = eINSTANCE.getEvaluationRow_ReviewStatus();

		/**
		 * The meta object literal for the '<em><b>Resolution Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__RESOLUTION_JUSTIFICATION = eINSTANCE.getEvaluationRow_ResolutionJustification();

		/**
		 * The meta object literal for the '<em><b>Decided By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__DECIDED_BY = eINSTANCE.getEvaluationRow_DecidedBy();

		/**
		 * The meta object literal for the '<em><b>Decided At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__DECIDED_AT = eINSTANCE.getEvaluationRow_DecidedAt();

		/**
		 * The meta object literal for the '<em><b>Correction Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CORRECTION_NOTE = eINSTANCE.getEvaluationRow_CorrectionNote();

		/**
		 * The meta object literal for the '<em><b>Context Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__CONTEXT_ID = eINSTANCE.getEvaluationRow_ContextId();

		/**
		 * The meta object literal for the '<em><b>Requirement Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__REQUIREMENT_IDS = eINSTANCE.getEvaluationRow_RequirementIds();

		/**
		 * The meta object literal for the '<em><b>Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__ASSET_ID = eINSTANCE.getEvaluationRow_AssetId();

		/**
		 * The meta object literal for the '<em><b>Finding Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__FINDING_ORIGIN = eINSTANCE.getEvaluationRow_FindingOrigin();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__TREATMENT = eINSTANCE.getEvaluationRow_Treatment();

		/**
		 * The meta object literal for the '<em><b>Risk Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__RISK_LEVEL = eINSTANCE.getEvaluationRow_RiskLevel();

		/**
		 * The meta object literal for the '<em><b>Measure Ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__MEASURE_IDS = eINSTANCE.getEvaluationRow_MeasureIds();

		/**
		 * The meta object literal for the '<em><b>Treatment Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__TREATMENT_NOTE = eINSTANCE.getEvaluationRow_TreatmentNote();

		/**
		 * The meta object literal for the '<em><b>Delegated To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__DELEGATED_TO = eINSTANCE.getEvaluationRow_DelegatedTo();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__DUE_DATE = eINSTANCE.getEvaluationRow_DueDate();

		/**
		 * The meta object literal for the '<em><b>Lawful Bases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_ROW__LAWFUL_BASES = eINSTANCE.getEvaluationRow_LawfulBases();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.history.impl.ChangeRowImpl <em>Change Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.history.impl.ChangeRowImpl
		 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getChangeRow()
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
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__ELEMENT_ID = eINSTANCE.getChangeRow_ElementId();

		/**
		 * The meta object literal for the '<em><b>Child Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ROW__CHILD_ID = eINSTANCE.getChangeRow_ChildId();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.history.RevisionOrigin <em>Revision Origin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.history.RevisionOrigin
		 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getRevisionOrigin()
		 * @generated
		 */
		EEnum REVISION_ORIGIN = eINSTANCE.getRevisionOrigin();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.history.ChangeKind <em>Change Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.history.ChangeKind
		 * @see org.eclipse.fennec.model.compliance.history.impl.HistoryPackageImpl#getChangeKind()
		 * @generated
		 */
		EEnum CHANGE_KIND = eINSTANCE.getChangeKind();

	}

} //HistoryPackage
