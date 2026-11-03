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
package org.eclipse.fennec.atlas.configuration.jpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;

import org.eclipse.fennec.atlas.configuration.jpa.AtlasConfigJpaFactory;
import org.eclipse.fennec.atlas.configuration.jpa.AtlasConfigJpaPackage;
import org.eclipse.fennec.atlas.configuration.jpa.JPADataInput;

import org.eclipse.fennec.persistence.eorm.EORMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlasConfigJpaPackageImpl extends EPackageImpl implements AtlasConfigJpaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaDataInputEClass = null;

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
	 * @see org.eclipse.fennec.atlas.configuration.jpa.AtlasConfigJpaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtlasConfigJpaPackageImpl() {
		super(eNS_URI, AtlasConfigJpaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtlasConfigJpaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtlasConfigJpaPackage init() {
		if (isInited) return (AtlasConfigJpaPackage)EPackage.Registry.INSTANCE.getEPackage(AtlasConfigJpaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtlasConfigJpaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtlasConfigJpaPackageImpl theAtlasConfigJpaPackage = registeredAtlasConfigJpaPackage instanceof AtlasConfigJpaPackageImpl ? (AtlasConfigJpaPackageImpl)registeredAtlasConfigJpaPackage : new AtlasConfigJpaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AtlasConfigPackage.eINSTANCE.eClass();
		EORMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtlasConfigJpaPackage.createPackageContents();

		// Initialize created meta-data
		theAtlasConfigJpaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtlasConfigJpaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtlasConfigJpaPackage.eNS_URI, theAtlasConfigJpaPackage);
		return theAtlasConfigJpaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJPADataInput() {
		return jpaDataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJPADataInput_PersistenceConfig() {
		return (EReference)jpaDataInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJPADataInput_DataSource() {
		return (EReference)jpaDataInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtlasConfigJpaFactory getAtlasConfigJpaFactory() {
		return (AtlasConfigJpaFactory)getEFactoryInstance();
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
		jpaDataInputEClass = createEClass(JPA_DATA_INPUT);
		createEReference(jpaDataInputEClass, JPA_DATA_INPUT__PERSISTENCE_CONFIG);
		createEReference(jpaDataInputEClass, JPA_DATA_INPUT__DATA_SOURCE);
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
		AtlasConfigPackage theAtlasConfigPackage = (AtlasConfigPackage)EPackage.Registry.INSTANCE.getEPackage(AtlasConfigPackage.eNS_URI);
		EORMPackage theEORMPackage = (EORMPackage)EPackage.Registry.INSTANCE.getEPackage(EORMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jpaDataInputEClass.getESuperTypes().add(theAtlasConfigPackage.getDataInput());

		// Initialize classes, features, and operations; add parameters
		initEClass(jpaDataInputEClass, JPADataInput.class, "JPADataInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPADataInput_PersistenceConfig(), theEORMPackage.getEntityMappings(), null, "persistenceConfig", null, 0, 1, JPADataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPADataInput_DataSource(), theAtlasConfigPackage.getJdbcDataSource(), null, "dataSource", null, 1, 1, JPADataInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "documentation", "JPA extension of the shared atlas configuration model: data inputs backed by a relational database through JPA (EclipseLink), with their entity mapping (Fennec eorm).\n\nKept apart from the atlas configuration model, so that only atlases using JPA depend on the eorm model."
		   });
		addAnnotation
		  (jpaDataInputEClass,
		   source,
		   new String[] {
			   "documentation", "DataInput backed by any relational data source supported by e.g. EclipseLink (JPA)."
		   });
		addAnnotation
		  (getJPADataInput_PersistenceConfig(),
		   source,
		   new String[] {
			   "documentation", "JPA entity mapping (the EclipseLink orm.xml equivalent) describing how the model types map to the relational schema. Set it when the derived naming cannot address the schema - e.g. lower-case or schema-qualified tables, or a table without a primary key that needs a declared composite id.\nContainment, deliberately: the mapping has to travel WITH the configuration. A non-containment href into a deployment-local file cannot be resolved by a Model Atlas that serves the configuration, which fails the upload with an unresolved EClass proxy. If a mapping ever needs to be shared between inputs, that belongs in a registry of the configuration root, like the other reusables."
		   });
		addAnnotation
		  (getJPADataInput_DataSource(),
		   source,
		   new String[] {
			   "documentation", "The JDBC data source definition providing the database connection for this input - bound by filter or materialized from its connection definition, the input does not care which."
		   });
	}

} //AtlasConfigJpaPackageImpl
