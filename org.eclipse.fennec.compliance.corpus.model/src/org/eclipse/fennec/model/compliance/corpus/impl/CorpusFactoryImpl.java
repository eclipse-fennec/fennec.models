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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.model.compliance.corpus.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorpusFactoryImpl extends EFactoryImpl implements CorpusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CorpusFactory init() {
		try {
			CorpusFactory theCorpusFactory = (CorpusFactory)EPackage.Registry.INSTANCE.getEFactory(CorpusPackage.eNS_URI);
			if (theCorpusFactory != null) {
				return theCorpusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CorpusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorpusFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorpusPackage.LEGAL_ACT: return createLegalAct();
			case CorpusPackage.RECITAL: return createRecital();
			case CorpusPackage.ARTICLE: return createArticle();
			case CorpusPackage.PARAGRAPH: return createParagraph();
			case CorpusPackage.POINT: return createPoint();
			case CorpusPackage.DIVISION: return createDivision();
			case CorpusPackage.DEFINITION: return createDefinition();
			case CorpusPackage.CROSS_REFERENCE: return createCrossReference();
			case CorpusPackage.FOOTNOTE: return createFootnote();
			case CorpusPackage.ANNEX: return createAnnex();
			case CorpusPackage.ANNEX_SECTION: return createAnnexSection();
			case CorpusPackage.PROPERTY: return createProperty();
			case CorpusPackage.CONTROL_CATALOG: return createControlCatalog();
			case CorpusPackage.CONTROL_GROUP: return createControlGroup();
			case CorpusPackage.CONTROL: return createControl();
			case CorpusPackage.CONTROL_PART: return createControlPart();
			case CorpusPackage.CONTROL_PARAMETER: return createControlParameter();
			case CorpusPackage.TECHNICAL_DOCUMENT: return createTechnicalDocument();
			case CorpusPackage.DOCUMENT_SECTION: return createDocumentSection();
			case CorpusPackage.DOCUMENT_CLAUSE: return createDocumentClause();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorpusPackage.DIVISION_LEVEL:
				return createDivisionLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorpusPackage.DIVISION_LEVEL:
				return convertDivisionLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalAct createLegalAct() {
		LegalActImpl legalAct = new LegalActImpl();
		return legalAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Recital createRecital() {
		RecitalImpl recital = new RecitalImpl();
		return recital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossReference createCrossReference() {
		CrossReferenceImpl crossReference = new CrossReferenceImpl();
		return crossReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Footnote createFootnote() {
		FootnoteImpl footnote = new FootnoteImpl();
		return footnote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annex createAnnex() {
		AnnexImpl annex = new AnnexImpl();
		return annex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnexSection createAnnexSection() {
		AnnexSectionImpl annexSection = new AnnexSectionImpl();
		return annexSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlCatalog createControlCatalog() {
		ControlCatalogImpl controlCatalog = new ControlCatalogImpl();
		return controlCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlGroup createControlGroup() {
		ControlGroupImpl controlGroup = new ControlGroupImpl();
		return controlGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlPart createControlPart() {
		ControlPartImpl controlPart = new ControlPartImpl();
		return controlPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlParameter createControlParameter() {
		ControlParameterImpl controlParameter = new ControlParameterImpl();
		return controlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnicalDocument createTechnicalDocument() {
		TechnicalDocumentImpl technicalDocument = new TechnicalDocumentImpl();
		return technicalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentSection createDocumentSection() {
		DocumentSectionImpl documentSection = new DocumentSectionImpl();
		return documentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentClause createDocumentClause() {
		DocumentClauseImpl documentClause = new DocumentClauseImpl();
		return documentClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionLevel createDivisionLevelFromString(EDataType eDataType, String initialValue) {
		DivisionLevel result = DivisionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDivisionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorpusPackage getCorpusPackage() {
		return (CorpusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorpusPackage getPackage() {
		return CorpusPackage.eINSTANCE;
	}

} //CorpusFactoryImpl
