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
package org.eclipse.fennec.model.gdpr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.gdpr.Article;
import org.eclipse.fennec.model.gdpr.Citable;
import org.eclipse.fennec.model.gdpr.CrossReference;
import org.eclipse.fennec.model.gdpr.Definition;
import org.eclipse.fennec.model.gdpr.Division;
import org.eclipse.fennec.model.gdpr.DivisionLevel;
import org.eclipse.fennec.model.gdpr.Footnote;
import org.eclipse.fennec.model.gdpr.GDPRFactory;
import org.eclipse.fennec.model.gdpr.GDPRPackage;
import org.eclipse.fennec.model.gdpr.LegalAct;
import org.eclipse.fennec.model.gdpr.LegalUnit;
import org.eclipse.fennec.model.gdpr.Paragraph;
import org.eclipse.fennec.model.gdpr.Point;
import org.eclipse.fennec.model.gdpr.Recital;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GDPRPackageImpl extends EPackageImpl implements GDPRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footnoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum divisionLevelEEnum = null;

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
	 * @see org.eclipse.fennec.model.gdpr.GDPRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GDPRPackageImpl() {
		super(eNS_URI, GDPRFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GDPRPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GDPRPackage init() {
		if (isInited) return (GDPRPackage)EPackage.Registry.INSTANCE.getEPackage(GDPRPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGDPRPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GDPRPackageImpl theGDPRPackage = registeredGDPRPackage instanceof GDPRPackageImpl ? (GDPRPackageImpl)registeredGDPRPackage : new GDPRPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGDPRPackage.createPackageContents();

		// Initialize created meta-data
		theGDPRPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGDPRPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GDPRPackage.eNS_URI, theGDPRPackage);
		return theGDPRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegalAct() {
		return legalActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_Celex() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_Title() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_Language() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_ConsolidatedDate() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_FormexSchema() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_ClosingFormula() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_Citations() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Recitals() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Divisions() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Definitions() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_CrossReferences() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCitable() {
		return citableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitable_CitationId() {
		return (EAttribute)citableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitable_Cites() {
		return (EReference)citableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitable_CitedBy() {
		return (EReference)citableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegalUnit() {
		return legalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalUnit_Text() {
		return (EAttribute)legalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalUnit_SourceRef() {
		return (EAttribute)legalUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalUnit_ModifiedBy() {
		return (EAttribute)legalUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalUnit_Footnotes() {
		return (EReference)legalUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecital() {
		return recitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecital_Number() {
		return (EAttribute)recitalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArticle_Number() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArticle_Heading() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArticle_Paragraphs() {
		return (EReference)articleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArticle_Points() {
		return (EReference)articleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParagraph_Number() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParagraph_Points() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Label() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoint_Points() {
		return (EReference)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoint_Definition() {
		return (EReference)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivision_Level() {
		return (EAttribute)divisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivision_Number() {
		return (EAttribute)divisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivision_Heading() {
		return (EAttribute)divisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_Divisions() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_Articles() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinition_Term() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinition_Number() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_DefinedIn() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossReference() {
		return crossReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossReference_Source() {
		return (EReference)crossReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossReference_RawText() {
		return (EAttribute)crossReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossReference_TargetCitationId() {
		return (EAttribute)crossReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossReference_Target() {
		return (EReference)crossReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossReference_Resolved() {
		return (EAttribute)crossReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossReference_Relative() {
		return (EAttribute)crossReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossReference_External() {
		return (EAttribute)crossReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossReference_Instrument() {
		return (EAttribute)crossReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFootnote() {
		return footnoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFootnote_NoteId() {
		return (EAttribute)footnoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFootnote_Text() {
		return (EAttribute)footnoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDivisionLevel() {
		return divisionLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GDPRFactory getGDPRFactory() {
		return (GDPRFactory)getEFactoryInstance();
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
		legalActEClass = createEClass(LEGAL_ACT);
		createEAttribute(legalActEClass, LEGAL_ACT__CELEX);
		createEAttribute(legalActEClass, LEGAL_ACT__TITLE);
		createEAttribute(legalActEClass, LEGAL_ACT__LANGUAGE);
		createEAttribute(legalActEClass, LEGAL_ACT__CONSOLIDATED_DATE);
		createEAttribute(legalActEClass, LEGAL_ACT__FORMEX_SCHEMA);
		createEAttribute(legalActEClass, LEGAL_ACT__CLOSING_FORMULA);
		createEAttribute(legalActEClass, LEGAL_ACT__CITATIONS);
		createEReference(legalActEClass, LEGAL_ACT__RECITALS);
		createEReference(legalActEClass, LEGAL_ACT__DIVISIONS);
		createEReference(legalActEClass, LEGAL_ACT__DEFINITIONS);
		createEReference(legalActEClass, LEGAL_ACT__CROSS_REFERENCES);

		citableEClass = createEClass(CITABLE);
		createEAttribute(citableEClass, CITABLE__CITATION_ID);
		createEReference(citableEClass, CITABLE__CITES);
		createEReference(citableEClass, CITABLE__CITED_BY);

		legalUnitEClass = createEClass(LEGAL_UNIT);
		createEAttribute(legalUnitEClass, LEGAL_UNIT__TEXT);
		createEAttribute(legalUnitEClass, LEGAL_UNIT__SOURCE_REF);
		createEAttribute(legalUnitEClass, LEGAL_UNIT__MODIFIED_BY);
		createEReference(legalUnitEClass, LEGAL_UNIT__FOOTNOTES);

		recitalEClass = createEClass(RECITAL);
		createEAttribute(recitalEClass, RECITAL__NUMBER);

		articleEClass = createEClass(ARTICLE);
		createEAttribute(articleEClass, ARTICLE__NUMBER);
		createEAttribute(articleEClass, ARTICLE__HEADING);
		createEReference(articleEClass, ARTICLE__PARAGRAPHS);
		createEReference(articleEClass, ARTICLE__POINTS);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__NUMBER);
		createEReference(paragraphEClass, PARAGRAPH__POINTS);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__LABEL);
		createEReference(pointEClass, POINT__POINTS);
		createEReference(pointEClass, POINT__DEFINITION);

		divisionEClass = createEClass(DIVISION);
		createEAttribute(divisionEClass, DIVISION__LEVEL);
		createEAttribute(divisionEClass, DIVISION__NUMBER);
		createEAttribute(divisionEClass, DIVISION__HEADING);
		createEReference(divisionEClass, DIVISION__DIVISIONS);
		createEReference(divisionEClass, DIVISION__ARTICLES);

		definitionEClass = createEClass(DEFINITION);
		createEAttribute(definitionEClass, DEFINITION__TERM);
		createEAttribute(definitionEClass, DEFINITION__NUMBER);
		createEReference(definitionEClass, DEFINITION__DEFINED_IN);

		crossReferenceEClass = createEClass(CROSS_REFERENCE);
		createEReference(crossReferenceEClass, CROSS_REFERENCE__SOURCE);
		createEAttribute(crossReferenceEClass, CROSS_REFERENCE__RAW_TEXT);
		createEAttribute(crossReferenceEClass, CROSS_REFERENCE__TARGET_CITATION_ID);
		createEReference(crossReferenceEClass, CROSS_REFERENCE__TARGET);
		createEAttribute(crossReferenceEClass, CROSS_REFERENCE__RESOLVED);
		createEAttribute(crossReferenceEClass, CROSS_REFERENCE__RELATIVE);
		createEAttribute(crossReferenceEClass, CROSS_REFERENCE__EXTERNAL);
		createEAttribute(crossReferenceEClass, CROSS_REFERENCE__INSTRUMENT);

		footnoteEClass = createEClass(FOOTNOTE);
		createEAttribute(footnoteEClass, FOOTNOTE__NOTE_ID);
		createEAttribute(footnoteEClass, FOOTNOTE__TEXT);

		// Create enums
		divisionLevelEEnum = createEEnum(DIVISION_LEVEL);
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
		legalUnitEClass.getESuperTypes().add(this.getCitable());
		recitalEClass.getESuperTypes().add(this.getLegalUnit());
		articleEClass.getESuperTypes().add(this.getLegalUnit());
		paragraphEClass.getESuperTypes().add(this.getLegalUnit());
		pointEClass.getESuperTypes().add(this.getLegalUnit());
		divisionEClass.getESuperTypes().add(this.getCitable());

		// Initialize classes, features, and operations; add parameters
		initEClass(legalActEClass, LegalAct.class, "LegalAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalAct_Celex(), ecorePackage.getEString(), "celex", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_Title(), ecorePackage.getEString(), "title", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_Language(), ecorePackage.getEString(), "language", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_ConsolidatedDate(), ecorePackage.getEString(), "consolidatedDate", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_FormexSchema(), ecorePackage.getEString(), "formexSchema", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_ClosingFormula(), ecorePackage.getEString(), "closingFormula", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_Citations(), ecorePackage.getEString(), "citations", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Recitals(), this.getRecital(), null, "recitals", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Divisions(), this.getDivision(), null, "divisions", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_CrossReferences(), this.getCrossReference(), null, "crossReferences", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citableEClass, Citable.class, "Citable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCitable_CitationId(), ecorePackage.getEString(), "citationId", null, 0, 1, Citable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCitable_Cites(), this.getCrossReference(), this.getCrossReference_Source(), "cites", null, 0, -1, Citable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCitable_CitedBy(), this.getCrossReference(), this.getCrossReference_Target(), "citedBy", null, 0, -1, Citable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legalUnitEClass, LegalUnit.class, "LegalUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalUnit_Text(), ecorePackage.getEString(), "text", null, 0, 1, LegalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalUnit_SourceRef(), ecorePackage.getEString(), "sourceRef", null, 0, 1, LegalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalUnit_ModifiedBy(), ecorePackage.getEString(), "modifiedBy", null, 0, 1, LegalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalUnit_Footnotes(), this.getFootnote(), null, "footnotes", null, 0, -1, LegalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recitalEClass, Recital.class, "Recital", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecital_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Recital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArticle_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArticle_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArticle_Paragraphs(), this.getParagraph(), null, "paragraphs", null, 0, -1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArticle_Points(), this.getPoint(), null, "points", null, 0, -1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_Points(), this.getPoint(), null, "points", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Label(), ecorePackage.getEString(), "label", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoint_Points(), this.getPoint(), null, "points", null, 0, -1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoint_Definition(), this.getDefinition(), this.getDefinition_DefinedIn(), "definition", null, 0, 1, Point.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDivision_Level(), this.getDivisionLevel(), "level", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivision_Number(), ecorePackage.getEString(), "number", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivision_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Divisions(), this.getDivision(), null, "divisions", null, 0, -1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Articles(), this.getArticle(), null, "articles", null, 0, -1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinition_Term(), ecorePackage.getEString(), "term", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinition_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_DefinedIn(), this.getPoint(), this.getPoint_Definition(), "definedIn", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossReferenceEClass, CrossReference.class, "CrossReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossReference_Source(), this.getCitable(), this.getCitable_Cites(), "source", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossReference_RawText(), ecorePackage.getEString(), "rawText", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossReference_TargetCitationId(), ecorePackage.getEString(), "targetCitationId", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossReference_Target(), this.getCitable(), this.getCitable_CitedBy(), "target", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossReference_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossReference_Relative(), ecorePackage.getEBoolean(), "relative", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossReference_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossReference_Instrument(), ecorePackage.getEString(), "instrument", null, 0, 1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footnoteEClass, Footnote.class, "Footnote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFootnote_NoteId(), ecorePackage.getEString(), "noteId", null, 0, 1, Footnote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFootnote_Text(), ecorePackage.getEString(), "text", null, 0, 1, Footnote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(divisionLevelEEnum, DivisionLevel.class, "DivisionLevel");
		addEEnumLiteral(divisionLevelEEnum, DivisionLevel.CHAPTER);
		addEEnumLiteral(divisionLevelEEnum, DivisionLevel.SECTION);

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
		  (legalActEClass,
		   source,
		   new String[] {
			   "documentation", "A complete legislative act, not a single article. Exactly one instance holds the whole regulation: its recitals, its chapters and, through them, all of its articles. For the GDPR that is one LegalAct containing 173 recitals, 26 divisions and 99 articles. The text is derived from the official renditions of one consolidated CELEX: the enacting terms from the XHTML rendition and the preamble from the Formex one, because the XHTML rendition carries no preamble. See the accompanying README for provenance and licence."
		   });
		addAnnotation
		  (getLegalAct_Celex(),
		   source,
		   new String[] {
			   "documentation", "CELEX identifier of the act, e.g. 32016R0679 for the GDPR. The stable way to name which act this is."
		   });
		addAnnotation
		  (getLegalAct_Title(),
		   source,
		   new String[] {
			   "documentation", "Official title of the act as printed in the Official Journal."
		   });
		addAnnotation
		  (getLegalAct_Language(),
		   source,
		   new String[] {
			   "documentation", "Language of this rendering, e.g. EN. Citation identifiers are language independent, so the same citationId addresses the same unit in every language, but the text does not."
		   });
		addAnnotation
		  (getLegalAct_ConsolidatedDate(),
		   source,
		   new String[] {
			   "documentation", "Date of the consolidation this was built from, as yyyyMMdd. A consolidated text is documentation and is not authentic; only the Official Journal produces legal effects. Always report it alongside a quote."
		   });
		addAnnotation
		  (getLegalAct_FormexSchema(),
		   source,
		   new String[] {
			   "documentation", "Formex schema the source document declared, e.g. formex-05.56-20160701.xd. Kept because the source schema version and the shipped schema version can differ."
		   });
		addAnnotation
		  (getLegalAct_ClosingFormula(),
		   source,
		   new String[] {
			   "documentation", "The final formula of the act: \'This Regulation shall be binding in its entirety and directly applicable in all Member States.\' Kept because it is the sentence that makes the act directly applicable without national transposition, which is the usual reason to quote it. The place and date of signature and the signatories are not included: the consolidated rendition does not carry them."
		   });
		addAnnotation
		  (getLegalAct_Citations(),
		   source,
		   new String[] {
			   "documentation", "The citations of the preamble, the \'Having regard to ...\' clauses stating the legal basis of the act, in document order. Six for the GDPR. They are not binding and are never cited individually, so they are plain strings rather than LegalUnits, but they record which Treaty articles and procedures the act rests on."
		   });
		addAnnotation
		  (getLegalAct_Recitals(),
		   source,
		   new String[] {
			   "documentation", "The preamble, in order. Recitals are not binding on their own but are the authoritative guide to reading the articles, and much of the practically useful detail lives only here."
		   });
		addAnnotation
		  (getLegalAct_Divisions(),
		   source,
		   new String[] {
			   "documentation", "Top-level chapters. Articles are reached through these, not directly from the act."
		   });
		addAnnotation
		  (getLegalAct_Definitions(),
		   source,
		   new String[] {
			   "documentation", "Index over the definitions in Article 4. Convenience for term lookup; the defining text itself lives in the Point that definedIn refers to."
		   });
		addAnnotation
		  (getLegalAct_CrossReferences(),
		   source,
		   new String[] {
			   "documentation", "Every citation found in the text, one entry per occurrence. Held flat here rather than on each unit; filter by source or target to get an article-centric view."
		   });
		addAnnotation
		  (citableEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract supertype for anything the act can cite by identifier. Two kinds of thing qualify and they are deliberately different: a LegalUnit has text and can be a legal basis, while a Division is only a place in the structure. Both need an identifier because the act cites both -- provisions constantly, chapters occasionally (\"the safeguards referred to in Chapter IX\"). Keeping them apart under one citable supertype is what lets CrossReference.target point at either without pretending a chapter is a provision."
		   });
		addAnnotation
		  (getCitable_CitationId(),
		   source,
		   new String[] {
			   "documentation", "Stable identifier of this unit and the key everything else cites it by. Grammar: Art.9, Art.9(2), Art.9(2)(a), Rec.26, and Art.53(1)[1] for positionally cited items in an unlabelled dash list. Marked as an EMF ID, so a unit can be fetched directly with Resource.getEObject(citationId). Never construct one by guessing: many plausible identifiers do not exist, for example Article 16 and Article 10 have no numbered paragraphs at all, so Art.16(1) is not a valid unit."
		   });
		addAnnotation
		  (getCitable_Cites(),
		   source,
		   new String[] {
			   "documentation", "Every citation made in this citable\'s own text, one entry per occurrence. The reverse of CrossReference.source. Not serialized: the act holds the occurrences and this side is rebuilt from them when the model is loaded."
		   });
		addAnnotation
		  (getCitable_CitedBy(),
		   source,
		   new String[] {
			   "documentation", "Every citation of this citable made elsewhere in the act, one entry per occurrence. The reverse of CrossReference.target, and the direction most questions about a provision take -- what else turns on Article 9 -- which the act\'s flat list of occurrences cannot answer without scanning all of it. Only citations internal to this act appear here: a citation of another instrument is never resolved against it and so has no target. Not serialized; rebuilt from the occurrences on load."
		   });
		addAnnotation
		  (legalUnitEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract supertype for anything that can be cited on its own: a recital, an article, a numbered paragraph or a lettered point. There are no LegalUnit instances, only instances of its subtypes. It exists so that anything citing the law can reference one type regardless of granularity."
		   });
		addAnnotation
		  (getLegalUnit_Text(),
		   source,
		   new String[] {
			   "documentation", "The unit\'s own text. Normalised relative to the Official Journal: non-breaking spaces folded to plain spaces, footnote bodies moved to footnotes and their reference markers removed, the consolidation markers delimiting an amended span removed (the amending act is recorded in modifiedBy instead), and whitespace collapsed. The quotation marks the act puts around a defined term are preserved, so Article 4 reads \'personal data\' means ... and Definition.term can be recovered from the text itself. Safe to quote verbatim, but it is not byte-identical to the printed text, so state that changes were made when reproducing it."
		   });
		addAnnotation
		  (getLegalUnit_SourceRef(),
		   source,
		   new String[] {
			   "documentation", "Where this unit sits in the source document, for tracing a suspect extraction back to the original. An enacting-terms unit carries the identifier of its node in the CELLAR XHTML rendition, e.g. 005.001 for Article 5(1) or 005.001/item[1] for its first point; a recital carries rct_26, its position in the Formex preamble. The two halves of the act come from two renditions of the same consolidated CELEX, because the XHTML one contains no preamble."
		   });
		addAnnotation
		  (getLegalUnit_ModifiedBy(),
		   source,
		   new String[] {
			   "documentation", "Which act the consolidation says last replaced this unit, e.g. \'32016R0679R(02): REPLACED\' for a unit rewritten by the 2018 corrigendum. Empty for a unit still carrying its original wording. This is provenance, not legal force: it says where the current text came from, which is what to check when a quote differs from the Official Journal as first published."
		   });
		addAnnotation
		  (getLegalUnit_Footnotes(),
		   source,
		   new String[] {
			   "documentation", "Footnotes attached to this unit. Their bodies are deliberately kept out of text: in the source they sit inside the sentence flow, and inlining them splices a citation into the middle of a sentence and makes the text unquotable."
		   });
		addAnnotation
		  (recitalEClass,
		   source,
		   new String[] {
			   "documentation", "One numbered clause of the preamble. Recitals give the reasons for the articles and often the only concrete guidance on how an abstract provision applies. Recitals have no headings, so identify one by its number or its opening clause."
		   });
		addAnnotation
		  (getRecital_Number(),
		   source,
		   new String[] {
			   "documentation", "The recital\'s number as printed, 1 to 173 for the GDPR. Contiguous with no gaps, so the number and the position in the recitals list agree."
		   });
		addAnnotation
		  (articleEClass,
		   source,
		   new String[] {
			   "documentation", "One article of the enacting terms. This is binding law, unlike a recital. An article either has numbered paragraphs or is a single block of text; it never has both."
		   });
		addAnnotation
		  (getArticle_Number(),
		   source,
		   new String[] {
			   "documentation", "The article number as printed, 1 to 99 for the GDPR."
		   });
		addAnnotation
		  (getArticle_Heading(),
		   source,
		   new String[] {
			   "documentation", "The article\'s own heading, e.g. \'Processing of special categories of personal data\'. The most useful field for finding the right article."
		   });
		addAnnotation
		  (getArticle_Paragraphs(),
		   source,
		   new String[] {
			   "documentation", "The article\'s numbered paragraphs, in order. Empty for the 17 single-block articles, whose text sits on the article itself."
		   });
		addAnnotation
		  (getArticle_Points(),
		   source,
		   new String[] {
			   "documentation", "Lettered or numbered points held directly by the article, used only by single-block articles that carry a list without an intervening numbered paragraph. Article 4 is the main case: its 26 definitions are points of the article."
		   });
		addAnnotation
		  (paragraphEClass,
		   source,
		   new String[] {
			   "documentation", "One numbered paragraph of an article."
		   });
		addAnnotation
		  (getParagraph_Number(),
		   source,
		   new String[] {
			   "documentation", "The paragraph number as printed, e.g. 2 for Article 9(2)."
		   });
		addAnnotation
		  (getParagraph_Points(),
		   source,
		   new String[] {
			   "documentation", "The paragraph\'s lettered points, in order, each a citable unit in its own right."
		   });
		addAnnotation
		  (pointEClass,
		   source,
		   new String[] {
			   "documentation", "One item of a list, e.g. Article 9(2)(a). A point is a citable unit with its own text, which is why a finding can cite exactly one condition rather than a whole paragraph."
		   });
		addAnnotation
		  (getPoint_Label(),
		   source,
		   new String[] {
			   "documentation", "The point\'s label as printed, including its brackets, e.g. (a) or (14). Null for items of an unlabelled dash list, which are cited positionally instead; see citationId."
		   });
		addAnnotation
		  (getPoint_Points(),
		   source,
		   new String[] {
			   "documentation", "Sub-points, where a point contains a further list. At most one level deeper in the GDPR."
		   });
		addAnnotation
		  (getPoint_Definition(),
		   source,
		   new String[] {
			   "documentation", "The definition this point carries, for the 26 points of Article 4, and null for every other point. The reverse of Definition.definedIn, so a point that turns up in a search can say which term it defines without looking through the definitions for it. Not serialized; rebuilt from Definition.definedIn on load."
		   });
		addAnnotation
		  (divisionEClass,
		   source,
		   new String[] {
			   "documentation", "A chapter or a section of the enacting terms. Deliberately not a LegalUnit: a division has no text of its own and is never a legal basis, so nothing can be quoted from it. It is a Citable, because the act does cite chapters by name and a reference to \"Chapter IX\" has to resolve to something. Its citationId is Chp.IX for a chapter and Chp.III.Sec.1 for a section. Cite the articles inside it, not the division, when a finding needs a legal basis."
		   });
		addAnnotation
		  (getDivision_Level(),
		   source,
		   new String[] {
			   "documentation", "Whether this division is a chapter or a section within a chapter."
		   });
		addAnnotation
		  (getDivision_Number(),
		   source,
		   new String[] {
			   "documentation", "The division\'s designation as printed, e.g. \'CHAPTER II\' or \'Section 1\'."
		   });
		addAnnotation
		  (getDivision_Heading(),
		   source,
		   new String[] {
			   "documentation", "The division\'s title, e.g. \'Principles\' or \'Rights of the data subject\'."
		   });
		addAnnotation
		  (getDivision_Divisions(),
		   source,
		   new String[] {
			   "documentation", "Sections contained in this chapter. A chapter that has sections holds its articles in them, so its own articles list is empty."
		   });
		addAnnotation
		  (getDivision_Articles(),
		   source,
		   new String[] {
			   "documentation", "Articles held directly by this division."
		   });
		addAnnotation
		  (divisionLevelEEnum,
		   source,
		   new String[] {
			   "documentation", "Whether a division is a chapter or a section."
		   });
		addAnnotation
		  (divisionLevelEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A top-level chapter of the act."
		   });
		addAnnotation
		  (divisionLevelEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A section within a chapter."
		   });
		addAnnotation
		  (definitionEClass,
		   source,
		   new String[] {
			   "documentation", "One legal definition from Article 4, indexed for lookup by term. The defining sentence itself is the text of the Point that definedIn refers to."
		   });
		addAnnotation
		  (getDefinition_Term(),
		   source,
		   new String[] {
			   "documentation", "The defined term exactly as the act defines it, e.g. \'personal data\', \'biometric data\', \'pseudonymisation\'. Extracted from the quotation marks the source uses to delimit the term, so it is the act\'s own wording and not an interpretation."
		   });
		addAnnotation
		  (getDefinition_Number(),
		   source,
		   new String[] {
			   "documentation", "The definition\'s number within Article 4, 1 to 26. So term \'biometric data\' is number 14 and is cited as Art.4(14)."
		   });
		addAnnotation
		  (getDefinition_DefinedIn(),
		   source,
		   new String[] {
			   "documentation", "The point of Article 4 that carries the defining text. Cite that point, not the Definition, when a finding relies on a definition."
		   });
		addAnnotation
		  (crossReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "One citation occurrence found in the text of a unit. Occurrences are recorded separately rather than deduplicated, so the same target may appear many times with different sources."
		   });
		addAnnotation
		  (getCrossReference_Source(),
		   source,
		   new String[] {
			   "documentation", "The unit whose text contains the citation."
		   });
		addAnnotation
		  (getCrossReference_RawText(),
		   source,
		   new String[] {
			   "documentation", "The citation exactly as it appears in the text, e.g. \'Article 9(2)\' or \'paragraph 1\'. Kept so a resolution can be checked against the wording that produced it."
		   });
		addAnnotation
		  (getCrossReference_TargetCitationId(),
		   source,
		   new String[] {
			   "documentation", "The citationId this reference was resolved to. Populated even when the target could not be found, so an unresolved reference still says what was looked for."
		   });
		addAnnotation
		  (getCrossReference_Target(),
		   source,
		   new String[] {
			   "documentation", "The referenced unit, set only when resolution succeeded and the reference is internal to this act. Usually a LegalUnit; a Division when the act cites a chapter."
		   });
		addAnnotation
		  (getCrossReference_Resolved(),
		   source,
		   new String[] {
			   "documentation", "True when target was found. False means either the reference is external or the identifier does not exist in this act; check external before treating it as a defect."
		   });
		addAnnotation
		  (getCrossReference_Relative(),
		   source,
		   new String[] {
			   "documentation", "True for a reference written relative to its own article, e.g. \'paragraph 1\' inside Article 9 meaning Article 9(1). The same wording in another article means something else, which is why resolution needs the containing article."
		   });
		addAnnotation
		  (getCrossReference_External(),
		   source,
		   new String[] {
			   "documentation", "True when the citation belongs to a different instrument and must not be resolved against this act. Important because such a reference often resolves to a real but wrong unit: \'Articles 12 to 15 of that Directive\' would otherwise silently become Articles 12 to 15 of this Regulation."
		   });
		addAnnotation
		  (getCrossReference_Instrument(),
		   source,
		   new String[] {
			   "documentation", "Which other instrument an external citation belongs to, e.g. TFEU, Directive, Charter or \'other Regulation\'. Null for an internal reference."
		   });
		addAnnotation
		  (footnoteEClass,
		   source,
		   new String[] {
			   "documentation", "A footnote taken out of a unit\'s sentence flow so that the unit\'s text stays readable and quotable."
		   });
		addAnnotation
		  (getFootnote_NoteId(),
		   source,
		   new String[] {
			   "documentation", "The footnote\'s identifier from the source document."
		   });
		addAnnotation
		  (getFootnote_Text(),
		   source,
		   new String[] {
			   "documentation", "The footnote\'s text, typically a citation of another act. Deliberately not part of the owning unit\'s text."
		   });
	}

} //GDPRPackageImpl
