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
package org.eclipse.fennec.model.gdprReport.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.model.gdprReport.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage
 * @generated
 */
public class GDPRReportAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GDPRReportPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDPRReportAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GDPRReportPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GDPRReportSwitch<Adapter> modelSwitch =
		new GDPRReportSwitch<Adapter>() {
			@Override
			public Adapter caseGdprReport(GdprReport object) {
				return createGdprReportAdapter();
			}
			@Override
			public Adapter caseSubject(Subject object) {
				return createSubjectAdapter();
			}
			@Override
			public Adapter caseLegalCorpusRef(LegalCorpusRef object) {
				return createLegalCorpusRefAdapter();
			}
			@Override
			public Adapter caseClassifierEvaluation(ClassifierEvaluation object) {
				return createClassifierEvaluationAdapter();
			}
			@Override
			public Adapter caseFeatureEvaluation(FeatureEvaluation object) {
				return createFeatureEvaluationAdapter();
			}
			@Override
			public Adapter caseFinding(Finding object) {
				return createFindingAdapter();
			}
			@Override
			public Adapter caseCombinationFinding(CombinationFinding object) {
				return createCombinationFindingAdapter();
			}
			@Override
			public Adapter caseEvidence(Evidence object) {
				return createEvidenceAdapter();
			}
			@Override
			public Adapter caseGdprRequestStatus(GdprRequestStatus object) {
				return createGdprRequestStatusAdapter();
			}
			@Override
			public Adapter casePackageSubject(PackageSubject object) {
				return createPackageSubjectAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseTransformationSubject(TransformationSubject object) {
				return createTransformationSubjectAdapter();
			}
			@Override
			public Adapter caseFlowEvaluation(FlowEvaluation object) {
				return createFlowEvaluationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.GdprReport <em>Gdpr Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.GdprReport
	 * @generated
	 */
	public Adapter createGdprReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.Subject
	 * @generated
	 */
	public Adapter createSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.LegalCorpusRef <em>Legal Corpus Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.LegalCorpusRef
	 * @generated
	 */
	public Adapter createLegalCorpusRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.ClassifierEvaluation <em>Classifier Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.ClassifierEvaluation
	 * @generated
	 */
	public Adapter createClassifierEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation <em>Feature Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.FeatureEvaluation
	 * @generated
	 */
	public Adapter createFeatureEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.Finding
	 * @generated
	 */
	public Adapter createFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.CombinationFinding <em>Combination Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.CombinationFinding
	 * @generated
	 */
	public Adapter createCombinationFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus <em>Gdpr Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.GdprRequestStatus
	 * @generated
	 */
	public Adapter createGdprRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.PackageSubject <em>Package Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.PackageSubject
	 * @generated
	 */
	public Adapter createPackageSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.TransformationSubject <em>Transformation Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.TransformationSubject
	 * @generated
	 */
	public Adapter createTransformationSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation <em>Flow Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.model.gdprReport.FlowEvaluation
	 * @generated
	 */
	public Adapter createFlowEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GDPRReportAdapterFactory
