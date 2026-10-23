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
package org.eclipse.fennec.model.compliance.corpus.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.compliance.corpus.Annex;
import org.eclipse.fennec.model.compliance.corpus.AnnexSection;
import org.eclipse.fennec.model.compliance.corpus.Article;
import org.eclipse.fennec.model.compliance.corpus.Citable;
import org.eclipse.fennec.model.compliance.corpus.Control;
import org.eclipse.fennec.model.compliance.corpus.ControlCatalog;
import org.eclipse.fennec.model.compliance.corpus.ControlGroup;
import org.eclipse.fennec.model.compliance.corpus.ControlParameter;
import org.eclipse.fennec.model.compliance.corpus.ControlPart;
import org.eclipse.fennec.model.compliance.corpus.Corpus;
import org.eclipse.fennec.model.compliance.corpus.CorpusFactory;
import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.CrossReference;
import org.eclipse.fennec.model.compliance.corpus.Definition;
import org.eclipse.fennec.model.compliance.corpus.Division;
import org.eclipse.fennec.model.compliance.corpus.DivisionLevel;
import org.eclipse.fennec.model.compliance.corpus.DocumentClause;
import org.eclipse.fennec.model.compliance.corpus.DocumentSection;
import org.eclipse.fennec.model.compliance.corpus.Footnote;
import org.eclipse.fennec.model.compliance.corpus.LegalAct;
import org.eclipse.fennec.model.compliance.corpus.LegalUnit;
import org.eclipse.fennec.model.compliance.corpus.Paragraph;
import org.eclipse.fennec.model.compliance.corpus.Point;
import org.eclipse.fennec.model.compliance.corpus.Property;
import org.eclipse.fennec.model.compliance.corpus.Recital;
import org.eclipse.fennec.model.compliance.corpus.TechnicalDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorpusPackageImpl extends EPackageImpl implements CorpusPackage {
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
	private EClass corpusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annexSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentClauseEClass = null;

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
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorpusPackageImpl() {
		super(eNS_URI, CorpusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorpusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorpusPackage init() {
		if (isInited) return (CorpusPackage)EPackage.Registry.INSTANCE.getEPackage(CorpusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorpusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorpusPackageImpl theCorpusPackage = registeredCorpusPackage instanceof CorpusPackageImpl ? (CorpusPackageImpl)registeredCorpusPackage : new CorpusPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCorpusPackage.createPackageContents();

		// Initialize created meta-data
		theCorpusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorpusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorpusPackage.eNS_URI, theCorpusPackage);
		return theCorpusPackage;
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
	public EAttribute getLegalAct_ConsolidatedDate() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_FormexSchema() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_ClosingFormula() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalAct_Citations() {
		return (EAttribute)legalActEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Recitals() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Divisions() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Definitions() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalAct_Annexes() {
		return (EReference)legalActEClass.getEStructuralFeatures().get(7);
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
	public EClass getCorpus() {
		return corpusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Id() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_WorkId() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Title() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Language() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Version() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Source() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Licence() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_Attribution() {
		return (EAttribute)corpusEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCorpus_CrossReferences() {
		return (EReference)corpusEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnex() {
		return annexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnex_Number() {
		return (EAttribute)annexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnex_Heading() {
		return (EAttribute)annexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnex_Sections() {
		return (EReference)annexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnex_Points() {
		return (EReference)annexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnexSection() {
		return annexSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexSection_Number() {
		return (EAttribute)annexSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexSection_Heading() {
		return (EAttribute)annexSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnexSection_Sections() {
		return (EReference)annexSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnexSection_Points() {
		return (EReference)annexSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Ns() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_PropertyClass() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Remarks() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlCatalog() {
		return controlCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlCatalog_OscalVersion() {
		return (EAttribute)controlCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlCatalog_Properties() {
		return (EReference)controlCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlCatalog_Groups() {
		return (EReference)controlCatalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlCatalog_Controls() {
		return (EReference)controlCatalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlGroup() {
		return controlGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlGroup_Title() {
		return (EAttribute)controlGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlGroup_GroupClass() {
		return (EAttribute)controlGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlGroup_Properties() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlGroup_Parts() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlGroup_Groups() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlGroup_Controls() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Title() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_ControlClass() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Properties() {
		return (EReference)controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Parameters() {
		return (EReference)controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Parts() {
		return (EReference)controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Controls() {
		return (EReference)controlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlPart() {
		return controlPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlPart_Name() {
		return (EAttribute)controlPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlPart_Title() {
		return (EAttribute)controlPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlPart_Prose() {
		return (EAttribute)controlPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlPart_Properties() {
		return (EReference)controlPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlPart_Parts() {
		return (EReference)controlPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlParameter() {
		return controlParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlParameter_ParameterId() {
		return (EAttribute)controlParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlParameter_Label() {
		return (EAttribute)controlParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlParameter_Values() {
		return (EAttribute)controlParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlParameter_Guideline() {
		return (EAttribute)controlParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlParameter_Properties() {
		return (EReference)controlParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnicalDocument() {
		return technicalDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnicalDocument_DocumentNumber() {
		return (EAttribute)technicalDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnicalDocument_Part() {
		return (EAttribute)technicalDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnicalDocument_Publisher() {
		return (EAttribute)technicalDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnicalDocument_Sections() {
		return (EReference)technicalDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentSection() {
		return documentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentSection_Number() {
		return (EAttribute)documentSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentSection_Heading() {
		return (EAttribute)documentSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentSection_Text() {
		return (EAttribute)documentSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentSection_Sections() {
		return (EReference)documentSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentSection_Clauses() {
		return (EReference)documentSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentClause() {
		return documentClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentClause_Label() {
		return (EAttribute)documentClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentClause_Text() {
		return (EAttribute)documentClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentClause_Obligation() {
		return (EAttribute)documentClauseEClass.getEStructuralFeatures().get(2);
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
	public CorpusFactory getCorpusFactory() {
		return (CorpusFactory)getEFactoryInstance();
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
		createEAttribute(legalActEClass, LEGAL_ACT__CONSOLIDATED_DATE);
		createEAttribute(legalActEClass, LEGAL_ACT__FORMEX_SCHEMA);
		createEAttribute(legalActEClass, LEGAL_ACT__CLOSING_FORMULA);
		createEAttribute(legalActEClass, LEGAL_ACT__CITATIONS);
		createEReference(legalActEClass, LEGAL_ACT__RECITALS);
		createEReference(legalActEClass, LEGAL_ACT__DIVISIONS);
		createEReference(legalActEClass, LEGAL_ACT__DEFINITIONS);
		createEReference(legalActEClass, LEGAL_ACT__ANNEXES);

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

		corpusEClass = createEClass(CORPUS);
		createEAttribute(corpusEClass, CORPUS__ID);
		createEAttribute(corpusEClass, CORPUS__WORK_ID);
		createEAttribute(corpusEClass, CORPUS__TITLE);
		createEAttribute(corpusEClass, CORPUS__LANGUAGE);
		createEAttribute(corpusEClass, CORPUS__VERSION);
		createEAttribute(corpusEClass, CORPUS__SOURCE);
		createEAttribute(corpusEClass, CORPUS__LICENCE);
		createEAttribute(corpusEClass, CORPUS__ATTRIBUTION);
		createEReference(corpusEClass, CORPUS__CROSS_REFERENCES);

		annexEClass = createEClass(ANNEX);
		createEAttribute(annexEClass, ANNEX__NUMBER);
		createEAttribute(annexEClass, ANNEX__HEADING);
		createEReference(annexEClass, ANNEX__SECTIONS);
		createEReference(annexEClass, ANNEX__POINTS);

		annexSectionEClass = createEClass(ANNEX_SECTION);
		createEAttribute(annexSectionEClass, ANNEX_SECTION__NUMBER);
		createEAttribute(annexSectionEClass, ANNEX_SECTION__HEADING);
		createEReference(annexSectionEClass, ANNEX_SECTION__SECTIONS);
		createEReference(annexSectionEClass, ANNEX_SECTION__POINTS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__NS);
		createEAttribute(propertyEClass, PROPERTY__PROPERTY_CLASS);
		createEAttribute(propertyEClass, PROPERTY__REMARKS);

		controlCatalogEClass = createEClass(CONTROL_CATALOG);
		createEAttribute(controlCatalogEClass, CONTROL_CATALOG__OSCAL_VERSION);
		createEReference(controlCatalogEClass, CONTROL_CATALOG__PROPERTIES);
		createEReference(controlCatalogEClass, CONTROL_CATALOG__GROUPS);
		createEReference(controlCatalogEClass, CONTROL_CATALOG__CONTROLS);

		controlGroupEClass = createEClass(CONTROL_GROUP);
		createEAttribute(controlGroupEClass, CONTROL_GROUP__TITLE);
		createEAttribute(controlGroupEClass, CONTROL_GROUP__GROUP_CLASS);
		createEReference(controlGroupEClass, CONTROL_GROUP__PROPERTIES);
		createEReference(controlGroupEClass, CONTROL_GROUP__PARTS);
		createEReference(controlGroupEClass, CONTROL_GROUP__GROUPS);
		createEReference(controlGroupEClass, CONTROL_GROUP__CONTROLS);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__TITLE);
		createEAttribute(controlEClass, CONTROL__CONTROL_CLASS);
		createEReference(controlEClass, CONTROL__PROPERTIES);
		createEReference(controlEClass, CONTROL__PARAMETERS);
		createEReference(controlEClass, CONTROL__PARTS);
		createEReference(controlEClass, CONTROL__CONTROLS);

		controlPartEClass = createEClass(CONTROL_PART);
		createEAttribute(controlPartEClass, CONTROL_PART__NAME);
		createEAttribute(controlPartEClass, CONTROL_PART__TITLE);
		createEAttribute(controlPartEClass, CONTROL_PART__PROSE);
		createEReference(controlPartEClass, CONTROL_PART__PROPERTIES);
		createEReference(controlPartEClass, CONTROL_PART__PARTS);

		controlParameterEClass = createEClass(CONTROL_PARAMETER);
		createEAttribute(controlParameterEClass, CONTROL_PARAMETER__PARAMETER_ID);
		createEAttribute(controlParameterEClass, CONTROL_PARAMETER__LABEL);
		createEAttribute(controlParameterEClass, CONTROL_PARAMETER__VALUES);
		createEAttribute(controlParameterEClass, CONTROL_PARAMETER__GUIDELINE);
		createEReference(controlParameterEClass, CONTROL_PARAMETER__PROPERTIES);

		technicalDocumentEClass = createEClass(TECHNICAL_DOCUMENT);
		createEAttribute(technicalDocumentEClass, TECHNICAL_DOCUMENT__DOCUMENT_NUMBER);
		createEAttribute(technicalDocumentEClass, TECHNICAL_DOCUMENT__PART);
		createEAttribute(technicalDocumentEClass, TECHNICAL_DOCUMENT__PUBLISHER);
		createEReference(technicalDocumentEClass, TECHNICAL_DOCUMENT__SECTIONS);

		documentSectionEClass = createEClass(DOCUMENT_SECTION);
		createEAttribute(documentSectionEClass, DOCUMENT_SECTION__NUMBER);
		createEAttribute(documentSectionEClass, DOCUMENT_SECTION__HEADING);
		createEAttribute(documentSectionEClass, DOCUMENT_SECTION__TEXT);
		createEReference(documentSectionEClass, DOCUMENT_SECTION__SECTIONS);
		createEReference(documentSectionEClass, DOCUMENT_SECTION__CLAUSES);

		documentClauseEClass = createEClass(DOCUMENT_CLAUSE);
		createEAttribute(documentClauseEClass, DOCUMENT_CLAUSE__LABEL);
		createEAttribute(documentClauseEClass, DOCUMENT_CLAUSE__TEXT);
		createEAttribute(documentClauseEClass, DOCUMENT_CLAUSE__OBLIGATION);

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
		legalActEClass.getESuperTypes().add(this.getCorpus());
		legalUnitEClass.getESuperTypes().add(this.getCitable());
		recitalEClass.getESuperTypes().add(this.getLegalUnit());
		articleEClass.getESuperTypes().add(this.getLegalUnit());
		paragraphEClass.getESuperTypes().add(this.getLegalUnit());
		pointEClass.getESuperTypes().add(this.getLegalUnit());
		divisionEClass.getESuperTypes().add(this.getCitable());
		annexEClass.getESuperTypes().add(this.getLegalUnit());
		annexSectionEClass.getESuperTypes().add(this.getCitable());
		controlCatalogEClass.getESuperTypes().add(this.getCorpus());
		controlGroupEClass.getESuperTypes().add(this.getCitable());
		controlEClass.getESuperTypes().add(this.getCitable());
		controlPartEClass.getESuperTypes().add(this.getCitable());
		technicalDocumentEClass.getESuperTypes().add(this.getCorpus());
		documentSectionEClass.getESuperTypes().add(this.getCitable());
		documentClauseEClass.getESuperTypes().add(this.getCitable());

		// Initialize classes, features, and operations; add parameters
		initEClass(legalActEClass, LegalAct.class, "LegalAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalAct_ConsolidatedDate(), ecorePackage.getEString(), "consolidatedDate", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_FormexSchema(), ecorePackage.getEString(), "formexSchema", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_ClosingFormula(), ecorePackage.getEString(), "closingFormula", null, 0, 1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegalAct_Citations(), ecorePackage.getEString(), "citations", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Recitals(), this.getRecital(), null, "recitals", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Divisions(), this.getDivision(), null, "divisions", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalAct_Annexes(), this.getAnnex(), null, "annexes", null, 0, -1, LegalAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citableEClass, Citable.class, "Citable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCitable_CitationId(), ecorePackage.getEString(), "citationId", null, 0, 1, Citable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(corpusEClass, Corpus.class, "Corpus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorpus_Id(), ecorePackage.getEString(), "id", null, 1, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_WorkId(), ecorePackage.getEString(), "workId", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_Title(), ecorePackage.getEString(), "title", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_Language(), ecorePackage.getEString(), "language", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_Version(), ecorePackage.getEString(), "version", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_Source(), ecorePackage.getEString(), "source", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_Licence(), ecorePackage.getEString(), "licence", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorpus_Attribution(), ecorePackage.getEString(), "attribution", null, 0, 1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorpus_CrossReferences(), this.getCrossReference(), null, "crossReferences", null, 0, -1, Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annexEClass, Annex.class, "Annex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnex_Number(), ecorePackage.getEString(), "number", null, 0, 1, Annex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnex_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, Annex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnex_Sections(), this.getAnnexSection(), null, "sections", null, 0, -1, Annex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnex_Points(), this.getPoint(), null, "points", null, 0, -1, Annex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annexSectionEClass, AnnexSection.class, "AnnexSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnexSection_Number(), ecorePackage.getEString(), "number", null, 0, 1, AnnexSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnexSection_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, AnnexSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnexSection_Sections(), this.getAnnexSection(), null, "sections", null, 0, -1, AnnexSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnexSection_Points(), this.getPoint(), null, "points", null, 0, -1, AnnexSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_PropertyClass(), ecorePackage.getEString(), "propertyClass", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Remarks(), ecorePackage.getEString(), "remarks", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlCatalogEClass, ControlCatalog.class, "ControlCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlCatalog_OscalVersion(), ecorePackage.getEString(), "oscalVersion", null, 0, 1, ControlCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCatalog_Properties(), this.getProperty(), null, "properties", null, 0, -1, ControlCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCatalog_Groups(), this.getControlGroup(), null, "groups", null, 0, -1, ControlCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCatalog_Controls(), this.getControl(), null, "controls", null, 0, -1, ControlCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlGroupEClass, ControlGroup.class, "ControlGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlGroup_Title(), ecorePackage.getEString(), "title", null, 0, 1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlGroup_GroupClass(), ecorePackage.getEString(), "groupClass", null, 0, 1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlGroup_Properties(), this.getProperty(), null, "properties", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlGroup_Parts(), this.getControlPart(), null, "parts", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlGroup_Groups(), this.getControlGroup(), null, "groups", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlGroup_Controls(), this.getControl(), null, "controls", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Title(), ecorePackage.getEString(), "title", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_ControlClass(), ecorePackage.getEString(), "controlClass", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Properties(), this.getProperty(), null, "properties", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Parameters(), this.getControlParameter(), null, "parameters", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Parts(), this.getControlPart(), null, "parts", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Controls(), this.getControl(), null, "controls", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlPartEClass, ControlPart.class, "ControlPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlPart_Name(), ecorePackage.getEString(), "name", null, 1, 1, ControlPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlPart_Title(), ecorePackage.getEString(), "title", null, 0, 1, ControlPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlPart_Prose(), ecorePackage.getEString(), "prose", null, 0, 1, ControlPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlPart_Properties(), this.getProperty(), null, "properties", null, 0, -1, ControlPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlPart_Parts(), this.getControlPart(), null, "parts", null, 0, -1, ControlPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlParameterEClass, ControlParameter.class, "ControlParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlParameter_ParameterId(), ecorePackage.getEString(), "parameterId", null, 1, 1, ControlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlParameter_Label(), ecorePackage.getEString(), "label", null, 0, 1, ControlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlParameter_Values(), ecorePackage.getEString(), "values", null, 0, -1, ControlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlParameter_Guideline(), ecorePackage.getEString(), "guideline", null, 0, 1, ControlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlParameter_Properties(), this.getProperty(), null, "properties", null, 0, -1, ControlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technicalDocumentEClass, TechnicalDocument.class, "TechnicalDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnicalDocument_DocumentNumber(), ecorePackage.getEString(), "documentNumber", null, 0, 1, TechnicalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnicalDocument_Part(), ecorePackage.getEString(), "part", null, 0, 1, TechnicalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnicalDocument_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, TechnicalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnicalDocument_Sections(), this.getDocumentSection(), null, "sections", null, 0, -1, TechnicalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentSectionEClass, DocumentSection.class, "DocumentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentSection_Number(), ecorePackage.getEString(), "number", null, 0, 1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSection_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSection_Text(), ecorePackage.getEString(), "text", null, 0, 1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentSection_Sections(), this.getDocumentSection(), null, "sections", null, 0, -1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentSection_Clauses(), this.getDocumentClause(), null, "clauses", null, 0, -1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentClauseEClass, DocumentClause.class, "DocumentClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentClause_Label(), ecorePackage.getEString(), "label", null, 0, 1, DocumentClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentClause_Text(), ecorePackage.getEString(), "text", null, 0, 1, DocumentClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentClause_Obligation(), ecorePackage.getEString(), "obligation", null, 0, 1, DocumentClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(divisionLevelEEnum, DivisionLevel.class, "DivisionLevel");
		addEEnumLiteral(divisionLevelEEnum, DivisionLevel.CHAPTER);
		addEEnumLiteral(divisionLevelEEnum, DivisionLevel.SECTION);

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
			   "documentation", "The normative texts a compliance context cites: legal acts (Formex / EUR-Lex), control catalogs (OSCAL) and technical documents (e.g. BSI Technical Guidelines). A corpus is the text itself, unchanged and versioned; its interpretation as requirements lives in the context model."
		   });
		addAnnotation
		  (legalActEClass,
		   source,
		   new String[] {
			   "documentation", "A complete legislative act from Formex / EUR-Lex, not a single article. Exactly one instance holds the whole act: its recitals, its chapters and, through them, all of its articles, and its annexes. The CELEX number is the workId."
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
		  (getLegalAct_Annexes(),
		   source,
		   new String[] {
			   "documentation", "The annexes, in order. In Formex each annex is a separate document; they are merged into the act so that requirements can cite them like articles."
		   });
		addAnnotation
		  (citableEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract supertype for anything a corpus can cite by identifier: units of a legal act, controls and parts of a catalog, sections and clauses of a technical document. The citationId is only unique within its corpus, because one context may hold several corpora (Art.9 exists in many acts); it is therefore not an EMF ID."
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
		addAnnotation
		  (corpusEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract supertype of every normative text. One instance holds one version of one text."
		   });
		addAnnotation
		  (getCorpus_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier of this rendering: workId plus language, e.g. 02016R0679-20160504-DE. Unique within a context, so one context can carry several language versions of the same text."
		   });
		addAnnotation
		  (getCorpus_WorkId(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the text independent of language: the CELEX number for an EU act (02016R0679-20160504 for a consolidation), the catalog UUID for an OSCAL catalog, the document number for a technical document (TR-03183-2). All language versions share it, and their units share the citationIds, so the same citation resolves in the version of the reader\'s language."
		   });
		addAnnotation
		  (getCorpus_Title(),
		   source,
		   new String[] {
			   "documentation", "Official title of the text."
		   });
		addAnnotation
		  (getCorpus_Language(),
		   source,
		   new String[] {
			   "documentation", "Language of this rendering, e.g. EN or DE. Citation identifiers are language independent."
		   });
		addAnnotation
		  (getCorpus_Version(),
		   source,
		   new String[] {
			   "documentation", "Version of the text: consolidation date (yyyyMMdd) for a legal act, metadata version for an OSCAL catalog, document version or date for a technical document."
		   });
		addAnnotation
		  (getCorpus_Source(),
		   source,
		   new String[] {
			   "documentation", "Where the text was obtained, as a URI."
		   });
		addAnnotation
		  (getCorpus_Licence(),
		   source,
		   new String[] {
			   "documentation", "Licence of the text, as SPDX identifier where one exists, e.g. CC-BY-SA-4.0. States why the text is missing when it may not be redistributed."
		   });
		addAnnotation
		  (getCorpus_Attribution(),
		   source,
		   new String[] {
			   "documentation", "The attribution the licence requires, to be shown wherever the text is shown."
		   });
		addAnnotation
		  (getCorpus_CrossReferences(),
		   source,
		   new String[] {
			   "documentation", "Every citation found in the text, one entry per occurrence."
		   });
		addAnnotation
		  (annexEClass,
		   source,
		   new String[] {
			   "documentation", "One annex of the act, e.g. CRA Annex I (essential cybersecurity requirements) or AI Act Annex III (high-risk use cases). The citationId is Annex plus the number, e.g. AnnexI. Text that does not fit sections or points (e.g. AI Act Annex IV) is held in text."
		   });
		addAnnotation
		  (getAnnex_Number(),
		   source,
		   new String[] {
			   "documentation", "The annex number as printed, e.g. I or IV."
		   });
		addAnnotation
		  (getAnnex_Heading(),
		   source,
		   new String[] {
			   "documentation", "The annex heading, e.g. Essential cybersecurity requirements."
		   });
		addAnnotation
		  (getAnnex_Sections(),
		   source,
		   new String[] {
			   "documentation", "Parts of the annex, e.g. Part I and Part II of CRA Annex I."
		   });
		addAnnotation
		  (getAnnex_Points(),
		   source,
		   new String[] {
			   "documentation", "Numbered points held directly by the annex, for annexes without parts, e.g. the areas 1 to 8 of AI Act Annex III. Citation ids follow the pattern of articles: AnnexIII(1)(a)."
		   });
		addAnnotation
		  (annexSectionEClass,
		   source,
		   new String[] {
			   "documentation", "A part of an annex (Formex GR.SEQ), e.g. CRA Annex I Part I. Like a division it has no text of its own; its points carry the text. The citationId extends the annex, e.g. AnnexI.PartI, and its points continue it: AnnexI.PartI(2)(e)."
		   });
		addAnnotation
		  (getAnnexSection_Number(),
		   source,
		   new String[] {
			   "documentation", "The designation as printed, e.g. Part I."
		   });
		addAnnotation
		  (getAnnexSection_Heading(),
		   source,
		   new String[] {
			   "documentation", "The heading of the part."
		   });
		addAnnotation
		  (getAnnexSection_Sections(),
		   source,
		   new String[] {
			   "documentation", "Nested parts."
		   });
		addAnnotation
		  (getAnnexSection_Points(),
		   source,
		   new String[] {
			   "documentation", "The numbered points of the part, e.g. (1), (2) with (a) to (m)."
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "documentation", "A name / value pair with an optional namespace, as OSCAL props. Used for the extensions of catalogs (e.g. the BSI sec_level, effort_level, target_object_categories) and for structured reference data."
		   });
		addAnnotation
		  (getProperty_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the property."
		   });
		addAnnotation
		  (getProperty_Value(),
		   source,
		   new String[] {
			   "documentation", "Value of the property."
		   });
		addAnnotation
		  (getProperty_Ns(),
		   source,
		   new String[] {
			   "documentation", "Namespace that qualifies the name, as a URI. Unset for the default namespace of the source format."
		   });
		addAnnotation
		  (getProperty_PropertyClass(),
		   source,
		   new String[] {
			   "documentation", "Optional classification of the property, the OSCAL class flag."
		   });
		addAnnotation
		  (getProperty_Remarks(),
		   source,
		   new String[] {
			   "documentation", "Free-text remarks."
		   });
		addAnnotation
		  (controlCatalogEClass,
		   source,
		   new String[] {
			   "documentation", "A control catalog such as BSI Grundschutz++ or NIST SP 800-53, shaped after OSCAL catalog. Read from OSCAL through the OSCAL model and codec; only what compliance needs is kept."
		   });
		addAnnotation
		  (getControlCatalog_OscalVersion(),
		   source,
		   new String[] {
			   "documentation", "OSCAL version of the source document, e.g. 1.1.3."
		   });
		addAnnotation
		  (getControlCatalog_Properties(),
		   source,
		   new String[] {
			   "documentation", "Properties of the catalog itself."
		   });
		addAnnotation
		  (getControlCatalog_Groups(),
		   source,
		   new String[] {
			   "documentation", "Top-level groups, e.g. the practices of Grundschutz++."
		   });
		addAnnotation
		  (getControlCatalog_Controls(),
		   source,
		   new String[] {
			   "documentation", "Controls not held by any group."
		   });
		addAnnotation
		  (controlGroupEClass,
		   source,
		   new String[] {
			   "documentation", "A group of controls, e.g. a Grundschutz++ practice. The citationId is the OSCAL group id."
		   });
		addAnnotation
		  (getControlGroup_Title(),
		   source,
		   new String[] {
			   "documentation", "Title of the group."
		   });
		addAnnotation
		  (getControlGroup_GroupClass(),
		   source,
		   new String[] {
			   "documentation", "The OSCAL class flag of the group."
		   });
		addAnnotation
		  (getControlGroup_Properties(),
		   source,
		   new String[] {
			   "documentation", "Properties of the group."
		   });
		addAnnotation
		  (getControlGroup_Parts(),
		   source,
		   new String[] {
			   "documentation", "Explanatory parts of the group."
		   });
		addAnnotation
		  (getControlGroup_Groups(),
		   source,
		   new String[] {
			   "documentation", "Nested groups."
		   });
		addAnnotation
		  (getControlGroup_Controls(),
		   source,
		   new String[] {
			   "documentation", "Controls of the group."
		   });
		addAnnotation
		  (controlEClass,
		   source,
		   new String[] {
			   "documentation", "One control (requirement) of a catalog, e.g. a Grundschutz++ requirement. The citationId is the OSCAL control id. Its statement is the part named statement."
		   });
		addAnnotation
		  (getControl_Title(),
		   source,
		   new String[] {
			   "documentation", "Title of the control."
		   });
		addAnnotation
		  (getControl_ControlClass(),
		   source,
		   new String[] {
			   "documentation", "The OSCAL class flag of the control."
		   });
		addAnnotation
		  (getControl_Properties(),
		   source,
		   new String[] {
			   "documentation", "Properties of the control, including the catalog-specific extensions."
		   });
		addAnnotation
		  (getControl_Parameters(),
		   source,
		   new String[] {
			   "documentation", "Parameters referenced from the prose."
		   });
		addAnnotation
		  (getControl_Parts(),
		   source,
		   new String[] {
			   "documentation", "Statement, guidance and other parts."
		   });
		addAnnotation
		  (getControl_Controls(),
		   source,
		   new String[] {
			   "documentation", "Control enhancements."
		   });
		addAnnotation
		  (controlPartEClass,
		   source,
		   new String[] {
			   "documentation", "A part of a control or group, e.g. statement, guidance, item. Parts with an id are citable on their own."
		   });
		addAnnotation
		  (getControlPart_Name(),
		   source,
		   new String[] {
			   "documentation", "The part name, e.g. statement, guidance, item, assessment-objective."
		   });
		addAnnotation
		  (getControlPart_Title(),
		   source,
		   new String[] {
			   "documentation", "Title of the part."
		   });
		addAnnotation
		  (getControlPart_Prose(),
		   source,
		   new String[] {
			   "documentation", "The text of the part, as Markdown. Parameter placeholders are kept as written."
		   });
		addAnnotation
		  (getControlPart_Properties(),
		   source,
		   new String[] {
			   "documentation", "Properties of the part."
		   });
		addAnnotation
		  (getControlPart_Parts(),
		   source,
		   new String[] {
			   "documentation", "Nested parts."
		   });
		addAnnotation
		  (controlParameterEClass,
		   source,
		   new String[] {
			   "documentation", "A parameter of a control, referenced from the prose of its parts."
		   });
		addAnnotation
		  (getControlParameter_ParameterId(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the parameter as referenced from the prose."
		   });
		addAnnotation
		  (getControlParameter_Label(),
		   source,
		   new String[] {
			   "documentation", "Short human-readable label."
		   });
		addAnnotation
		  (getControlParameter_Values(),
		   source,
		   new String[] {
			   "documentation", "Values set by the catalog."
		   });
		addAnnotation
		  (getControlParameter_Guideline(),
		   source,
		   new String[] {
			   "documentation", "Guidance on how to set the parameter, as Markdown."
		   });
		addAnnotation
		  (getControlParameter_Properties(),
		   source,
		   new String[] {
			   "documentation", "Properties of the parameter."
		   });
		addAnnotation
		  (technicalDocumentEClass,
		   source,
		   new String[] {
			   "documentation", "A technical document that is not available in a machine-readable format, e.g. a BSI Technical Guideline published as PDF. Once a document is published as OSCAL it moves to ControlCatalog."
		   });
		addAnnotation
		  (getTechnicalDocument_DocumentNumber(),
		   source,
		   new String[] {
			   "documentation", "Document number without part, e.g. TR-03183."
		   });
		addAnnotation
		  (getTechnicalDocument_Part(),
		   source,
		   new String[] {
			   "documentation", "Part of a multi-part document, e.g. 2 for TR-03183-2."
		   });
		addAnnotation
		  (getTechnicalDocument_Publisher(),
		   source,
		   new String[] {
			   "documentation", "Issuing body, e.g. BSI."
		   });
		addAnnotation
		  (getTechnicalDocument_Sections(),
		   source,
		   new String[] {
			   "documentation", "Top-level sections, in order."
		   });
		addAnnotation
		  (documentSectionEClass,
		   source,
		   new String[] {
			   "documentation", "A numbered section of a technical document. The citationId is the section number, e.g. 5.2.1."
		   });
		addAnnotation
		  (getDocumentSection_Number(),
		   source,
		   new String[] {
			   "documentation", "Section number as printed."
		   });
		addAnnotation
		  (getDocumentSection_Heading(),
		   source,
		   new String[] {
			   "documentation", "Section heading."
		   });
		addAnnotation
		  (getDocumentSection_Text(),
		   source,
		   new String[] {
			   "documentation", "Text of the section that is not part of a clause."
		   });
		addAnnotation
		  (getDocumentSection_Sections(),
		   source,
		   new String[] {
			   "documentation", "Subsections."
		   });
		addAnnotation
		  (getDocumentSection_Clauses(),
		   source,
		   new String[] {
			   "documentation", "Numbered requirements or statements of the section."
		   });
		addAnnotation
		  (documentClauseEClass,
		   source,
		   new String[] {
			   "documentation", "A numbered requirement or statement of a technical document, the unit a finding cites. The citationId is its label as printed, e.g. O.Source_1."
		   });
		addAnnotation
		  (getDocumentClause_Label(),
		   source,
		   new String[] {
			   "documentation", "Label as printed."
		   });
		addAnnotation
		  (getDocumentClause_Text(),
		   source,
		   new String[] {
			   "documentation", "Text of the clause. Kept empty while the licence of the document does not allow redistribution; the context then carries a paraphrase."
		   });
		addAnnotation
		  (getDocumentClause_Obligation(),
		   source,
		   new String[] {
			   "documentation", "Obligation keyword as printed, e.g. MUSS, SOLL, KANN (RFC 2119 style)."
		   });
	}

} //CorpusPackageImpl
