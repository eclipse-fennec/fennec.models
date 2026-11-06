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
package org.eclipse.fennec.atlas.configuration.qvto;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;

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
 * QVT-O extension of the shared atlas configuration model: data transformations run by the fennec m2x QVT-O engine.
 * 
 * Kept apart from the atlas configuration model, so that only atlases using QVT-O depend on the m2x QVT-O model.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AtlasConfigQvtoPackage.eNS_URI, fingerprint = "fp1:268e282f1853f2abe407e4c4b89e7727c71caf6c87f887c6d7a699513830faee", genModel = "/model/qvto.genmodel", genModelSourceLocations = {"model/qvto.genmodel","org.eclipse.fennec.atlas.configuration.qvto.model/model/qvto.genmodel"}, ecore = "/model/qvto.ecore", ecoreSourceLocations = "/model/qvto.ecore")
public interface AtlasConfigQvtoPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/atlas/configuration/qvto/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atlasconfigqvto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlasConfigQvtoPackage eINSTANCE = org.eclipse.fennec.atlas.configuration.qvto.impl.AtlasConfigQvtoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.qvto.impl.QvtoDataTransformationImpl <em>Qvto Data Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.qvto.impl.QvtoDataTransformationImpl
	 * @see org.eclipse.fennec.atlas.configuration.qvto.impl.AtlasConfigQvtoPackageImpl#getQvtoDataTransformation()
	 * @generated
	 */
	int QVTO_DATA_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__ID = AtlasConfigPackage.DATA_TRANSFORMATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__NAME = AtlasConfigPackage.DATA_TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__DESCRIPTION = AtlasConfigPackage.DATA_TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__SUPPORTED_ECLASSES = AtlasConfigPackage.DATA_TRANSFORMATION__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Result EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__RESULT_ECLASSES = AtlasConfigPackage.DATA_TRANSFORMATION__RESULT_ECLASSES;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__TRANSFORMATION = AtlasConfigPackage.DATA_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION__SOURCE = AtlasConfigPackage.DATA_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qvto Data Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION_FEATURE_COUNT = AtlasConfigPackage.DATA_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qvto Data Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVTO_DATA_TRANSFORMATION_OPERATION_COUNT = AtlasConfigPackage.DATA_TRANSFORMATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation <em>Qvto Data Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qvto Data Transformation</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation
	 * @generated
	 */
	EClass getQvtoDataTransformation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getTransformation()
	 * @see #getQvtoDataTransformation()
	 * @generated
	 */
	EReference getQvtoDataTransformation_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation#getSource()
	 * @see #getQvtoDataTransformation()
	 * @generated
	 */
	EAttribute getQvtoDataTransformation_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlasConfigQvtoFactory getAtlasConfigQvtoFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.qvto.impl.QvtoDataTransformationImpl <em>Qvto Data Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.qvto.impl.QvtoDataTransformationImpl
		 * @see org.eclipse.fennec.atlas.configuration.qvto.impl.AtlasConfigQvtoPackageImpl#getQvtoDataTransformation()
		 * @generated
		 */
		EClass QVTO_DATA_TRANSFORMATION = eINSTANCE.getQvtoDataTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QVTO_DATA_TRANSFORMATION__TRANSFORMATION = eINSTANCE.getQvtoDataTransformation_Transformation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QVTO_DATA_TRANSFORMATION__SOURCE = eINSTANCE.getQvtoDataTransformation_Source();

	}

} //AtlasConfigQvtoPackage
