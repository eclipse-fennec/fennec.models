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
package org.eclipse.fennec.atlas.configuration.qvto.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;

import org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoFactory;
import org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoPackage;
import org.eclipse.fennec.atlas.configuration.qvto.QvtoDataTransformation;

import org.eclipse.fennec.m2x.model.qvtoperational.QvtOperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlasConfigQvtoPackageImpl extends EPackageImpl implements AtlasConfigQvtoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvtoDataTransformationEClass = null;

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
	 * @see org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtlasConfigQvtoPackageImpl() {
		super(eNS_URI, AtlasConfigQvtoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtlasConfigQvtoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtlasConfigQvtoPackage init() {
		if (isInited) return (AtlasConfigQvtoPackage)EPackage.Registry.INSTANCE.getEPackage(AtlasConfigQvtoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtlasConfigQvtoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtlasConfigQvtoPackageImpl theAtlasConfigQvtoPackage = registeredAtlasConfigQvtoPackage instanceof AtlasConfigQvtoPackageImpl ? (AtlasConfigQvtoPackageImpl)registeredAtlasConfigQvtoPackage : new AtlasConfigQvtoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AtlasConfigPackage.eINSTANCE.eClass();
		QvtOperationalPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtlasConfigQvtoPackage.createPackageContents();

		// Initialize created meta-data
		theAtlasConfigQvtoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtlasConfigQvtoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtlasConfigQvtoPackage.eNS_URI, theAtlasConfigQvtoPackage);
		return theAtlasConfigQvtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQvtoDataTransformation() {
		return qvtoDataTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQvtoDataTransformation_Transformation() {
		return (EReference)qvtoDataTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQvtoDataTransformation_Source() {
		return (EAttribute)qvtoDataTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtlasConfigQvtoFactory getAtlasConfigQvtoFactory() {
		return (AtlasConfigQvtoFactory)getEFactoryInstance();
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
		qvtoDataTransformationEClass = createEClass(QVTO_DATA_TRANSFORMATION);
		createEReference(qvtoDataTransformationEClass, QVTO_DATA_TRANSFORMATION__TRANSFORMATION);
		createEAttribute(qvtoDataTransformationEClass, QVTO_DATA_TRANSFORMATION__SOURCE);
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
		QvtOperationalPackage theQvtOperationalPackage = (QvtOperationalPackage)EPackage.Registry.INSTANCE.getEPackage(QvtOperationalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qvtoDataTransformationEClass.getESuperTypes().add(theAtlasConfigPackage.getDataTransformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(qvtoDataTransformationEClass, QvtoDataTransformation.class, "QvtoDataTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQvtoDataTransformation_Transformation(), theQvtOperationalPackage.getOperationalTransformation(), null, "transformation", null, 0, 1, QvtoDataTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQvtoDataTransformation_Source(), ecorePackage.getEString(), "source", null, 0, 1, QvtoDataTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "documentation", "QVT-O extension of the shared atlas configuration model: data transformations run by the fennec m2x QVT-O engine.\n\nKept apart from the atlas configuration model, so that only atlases using QVT-O depend on the m2x QVT-O model."
		   });
		addAnnotation
		  (qvtoDataTransformationEClass,
		   source,
		   new String[] {
			   "documentation", "A DataTransformation written in QVT-O, given either as the compiled AST (transformation) or as the URI of its .qvto source (source), which the consuming runtime compiles when the configuration is applied.\nExactly one of the two must be set; setting both, or neither, is a configuration error."
		   });
		addAnnotation
		  (getQvtoDataTransformation_Transformation(),
		   source,
		   new String[] {
			   "documentation", "The executable QVT-O transformation: the compiled AST, referenced as an EObject (e.g. from an XMI next to the configuration, or from an EObject registry of the Model Atlas). Mutually exclusive with source."
		   });
		addAnnotation
		  (getQvtoDataTransformation_Source(),
		   source,
		   new String[] {
			   "documentation", "URI of the .qvto source of the transformation, compiled by the consuming runtime when the configuration is applied. Mutually exclusive with transformation."
		   });
	}

} //AtlasConfigQvtoPackageImpl
