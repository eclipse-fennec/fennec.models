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
package org.eclipse.fennec.atlas.configuration.jpa;


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
 * JPA extension of the shared atlas configuration model: data inputs backed by a relational database through JPA (EclipseLink), with their entity mapping (Fennec eorm).
 * 
 * Kept apart from the atlas configuration model, so that only atlases using JPA depend on the eorm model.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.atlas.configuration.jpa.AtlasConfigJpaFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AtlasConfigJpaPackage.eNS_URI, fingerprint = "fp1:45a6892a6954da35c452b4f6ad8a07e87b6ac8c0b8c455e07c67dfdb189b7cb2", genModel = "/model/jpa.genmodel", genModelSourceLocations = {"model/jpa.genmodel","org.eclipse.fennec.atlas.configuration.jpa.model/model/jpa.genmodel"}, ecore = "/model/jpa.ecore", ecoreSourceLocations = "/model/jpa.ecore")
public interface AtlasConfigJpaPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jpa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/atlas/configuration/jpa/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atlasconfigjpa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlasConfigJpaPackage eINSTANCE = org.eclipse.fennec.atlas.configuration.jpa.impl.AtlasConfigJpaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.atlas.configuration.jpa.impl.JPADataInputImpl <em>JPA Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.atlas.configuration.jpa.impl.JPADataInputImpl
	 * @see org.eclipse.fennec.atlas.configuration.jpa.impl.AtlasConfigJpaPackageImpl#getJPADataInput()
	 * @generated
	 */
	int JPA_DATA_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_DATA_INPUT__ID = AtlasConfigPackage.DATA_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Supported EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_DATA_INPUT__SUPPORTED_ECLASSES = AtlasConfigPackage.DATA_INPUT__SUPPORTED_ECLASSES;

	/**
	 * The feature id for the '<em><b>Persistence Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_DATA_INPUT__PERSISTENCE_CONFIG = AtlasConfigPackage.DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_DATA_INPUT__DATA_SOURCE = AtlasConfigPackage.DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JPA Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_DATA_INPUT_FEATURE_COUNT = AtlasConfigPackage.DATA_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JPA Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_DATA_INPUT_OPERATION_COUNT = AtlasConfigPackage.DATA_INPUT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.atlas.configuration.jpa.JPADataInput <em>JPA Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPA Data Input</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.jpa.JPADataInput
	 * @generated
	 */
	EClass getJPADataInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.atlas.configuration.jpa.JPADataInput#getPersistenceConfig <em>Persistence Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Config</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.jpa.JPADataInput#getPersistenceConfig()
	 * @see #getJPADataInput()
	 * @generated
	 */
	EReference getJPADataInput_PersistenceConfig();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.atlas.configuration.jpa.JPADataInput#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.eclipse.fennec.atlas.configuration.jpa.JPADataInput#getDataSource()
	 * @see #getJPADataInput()
	 * @generated
	 */
	EReference getJPADataInput_DataSource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlasConfigJpaFactory getAtlasConfigJpaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.atlas.configuration.jpa.impl.JPADataInputImpl <em>JPA Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.atlas.configuration.jpa.impl.JPADataInputImpl
		 * @see org.eclipse.fennec.atlas.configuration.jpa.impl.AtlasConfigJpaPackageImpl#getJPADataInput()
		 * @generated
		 */
		EClass JPA_DATA_INPUT = eINSTANCE.getJPADataInput();

		/**
		 * The meta object literal for the '<em><b>Persistence Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_DATA_INPUT__PERSISTENCE_CONFIG = eINSTANCE.getJPADataInput_PersistenceConfig();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_DATA_INPUT__DATA_SOURCE = eINSTANCE.getJPADataInput_DataSource();

	}

} //AtlasConfigJpaPackage
