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
package org.eclipse.fennec.model.compliance.corpus;


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
 * The normative texts a compliance context cites: legal acts (Formex / EUR-Lex), control catalogs (OSCAL) and technical documents (e.g. BSI Technical Guidelines). A corpus is the text itself, unchanged and versioned; its interpretation as requirements lives in the context model.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = CorpusPackage.eNS_URI, fingerprint = "fp1:4125a548d17bf419e89ee1a217a355aff6332e3c9b37e0bb0a30c2737cdeb8c0", genModel = "/model/corpus.genmodel", genModelSourceLocations = {"model/corpus.genmodel","org.eclipse.fennec.compliance.corpus.model/model/corpus.genmodel"}, ecore = "/model/corpus.ecore", ecoreSourceLocations = "/model/corpus.ecore")
public interface CorpusPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "corpus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/compliance/corpus/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "corpus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorpusPackage eINSTANCE = org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl <em>Corpus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getCorpus()
	 * @generated
	 */
	int CORPUS = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__ID = 0;

	/**
	 * The feature id for the '<em><b>Work Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__WORK_ID = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__LICENCE = 6;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__ATTRIBUTION = 7;

	/**
	 * The feature id for the '<em><b>Cross References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__CROSS_REFERENCES = 8;

	/**
	 * The number of structural features of the '<em>Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl <em>Legal Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getLegalAct()
	 * @generated
	 */
	int LEGAL_ACT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__ID = CORPUS__ID;

	/**
	 * The feature id for the '<em><b>Work Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__WORK_ID = CORPUS__WORK_ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__TITLE = CORPUS__TITLE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__LANGUAGE = CORPUS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__VERSION = CORPUS__VERSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__SOURCE = CORPUS__SOURCE;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__LICENCE = CORPUS__LICENCE;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__ATTRIBUTION = CORPUS__ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Cross References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CROSS_REFERENCES = CORPUS__CROSS_REFERENCES;

	/**
	 * The feature id for the '<em><b>Consolidated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CONSOLIDATED_DATE = CORPUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formex Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__FORMEX_SCHEMA = CORPUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Closing Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CLOSING_FORMULA = CORPUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CITATIONS = CORPUS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recitals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__RECITALS = CORPUS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__DIVISIONS = CORPUS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__DEFINITIONS = CORPUS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Annexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__ANNEXES = CORPUS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Legal Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT_FEATURE_COUNT = CORPUS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Legal Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT_OPERATION_COUNT = CORPUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.CitableImpl <em>Citable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CitableImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getCitable()
	 * @generated
	 */
	int CITABLE = 1;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITABLE__CITATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITABLE__CITES = 1;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITABLE__CITED_BY = 2;

	/**
	 * The number of structural features of the '<em>Citable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Citable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalUnitImpl <em>Legal Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.LegalUnitImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getLegalUnit()
	 * @generated
	 */
	int LEGAL_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__TEXT = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__SOURCE_REF = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__MODIFIED_BY = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Footnotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT__FOOTNOTES = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Legal Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Legal Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNIT_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.RecitalImpl <em>Recital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.RecitalImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getRecital()
	 * @generated
	 */
	int RECITAL = 3;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__CITATION_ID = LEGAL_UNIT__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__CITES = LEGAL_UNIT__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__CITED_BY = LEGAL_UNIT__CITED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__TEXT = LEGAL_UNIT__TEXT;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__SOURCE_REF = LEGAL_UNIT__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__MODIFIED_BY = LEGAL_UNIT__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Footnotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__FOOTNOTES = LEGAL_UNIT__FOOTNOTES;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL__NUMBER = LEGAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL_FEATURE_COUNT = LEGAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Recital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITAL_OPERATION_COUNT = LEGAL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ArticleImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 4;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CITATION_ID = LEGAL_UNIT__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CITES = LEGAL_UNIT__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CITED_BY = LEGAL_UNIT__CITED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TEXT = LEGAL_UNIT__TEXT;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__SOURCE_REF = LEGAL_UNIT__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__MODIFIED_BY = LEGAL_UNIT__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Footnotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__FOOTNOTES = LEGAL_UNIT__FOOTNOTES;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__NUMBER = LEGAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__HEADING = LEGAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__PARAGRAPHS = LEGAL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__POINTS = LEGAL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = LEGAL_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = LEGAL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ParagraphImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CITATION_ID = LEGAL_UNIT__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CITES = LEGAL_UNIT__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CITED_BY = LEGAL_UNIT__CITED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = LEGAL_UNIT__TEXT;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__SOURCE_REF = LEGAL_UNIT__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__MODIFIED_BY = LEGAL_UNIT__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Footnotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__FOOTNOTES = LEGAL_UNIT__FOOTNOTES;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NUMBER = LEGAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__POINTS = LEGAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = LEGAL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = LEGAL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.PointImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 6;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__CITATION_ID = LEGAL_UNIT__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__CITES = LEGAL_UNIT__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__CITED_BY = LEGAL_UNIT__CITED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TEXT = LEGAL_UNIT__TEXT;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__SOURCE_REF = LEGAL_UNIT__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__MODIFIED_BY = LEGAL_UNIT__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Footnotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__FOOTNOTES = LEGAL_UNIT__FOOTNOTES;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LABEL = LEGAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__POINTS = LEGAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__DEFINITION = LEGAL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = LEGAL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = LEGAL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.DivisionImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 7;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEVEL = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NUMBER = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__HEADING = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__DIVISIONS = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ARTICLES = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.DefinitionImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TERM = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__DEFINED_IN = 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CrossReferenceImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getCrossReference()
	 * @generated
	 */
	int CROSS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__RAW_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Target Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__TARGET_CITATION_ID = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__RESOLVED = 4;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__RELATIVE = 5;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__EXTERNAL = 6;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__INSTRUMENT = 7;

	/**
	 * The number of structural features of the '<em>Cross Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Cross Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.FootnoteImpl <em>Footnote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.FootnoteImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getFootnote()
	 * @generated
	 */
	int FOOTNOTE = 10;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__NOTE_ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Footnote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Footnote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.AnnexImpl <em>Annex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.AnnexImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getAnnex()
	 * @generated
	 */
	int ANNEX = 12;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__CITATION_ID = LEGAL_UNIT__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__CITES = LEGAL_UNIT__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__CITED_BY = LEGAL_UNIT__CITED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__TEXT = LEGAL_UNIT__TEXT;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__SOURCE_REF = LEGAL_UNIT__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__MODIFIED_BY = LEGAL_UNIT__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Footnotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__FOOTNOTES = LEGAL_UNIT__FOOTNOTES;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__NUMBER = LEGAL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__HEADING = LEGAL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__SECTIONS = LEGAL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX__POINTS = LEGAL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Annex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_FEATURE_COUNT = LEGAL_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Annex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_OPERATION_COUNT = LEGAL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.AnnexSectionImpl <em>Annex Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.AnnexSectionImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getAnnexSection()
	 * @generated
	 */
	int ANNEX_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__NUMBER = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__HEADING = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__SECTIONS = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION__POINTS = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Annex Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Annex Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_SECTION_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.PropertyImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NS = 2;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REMARKS = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlCatalogImpl <em>Control Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlCatalogImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlCatalog()
	 * @generated
	 */
	int CONTROL_CATALOG = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__ID = CORPUS__ID;

	/**
	 * The feature id for the '<em><b>Work Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__WORK_ID = CORPUS__WORK_ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__TITLE = CORPUS__TITLE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__LANGUAGE = CORPUS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__VERSION = CORPUS__VERSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__SOURCE = CORPUS__SOURCE;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__LICENCE = CORPUS__LICENCE;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__ATTRIBUTION = CORPUS__ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Cross References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__CROSS_REFERENCES = CORPUS__CROSS_REFERENCES;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__OSCAL_VERSION = CORPUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__PROPERTIES = CORPUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__GROUPS = CORPUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG__CONTROLS = CORPUS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG_FEATURE_COUNT = CORPUS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Control Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATALOG_OPERATION_COUNT = CORPUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl <em>Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlGroup()
	 * @generated
	 */
	int CONTROL_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__TITLE = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__GROUP_CLASS = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__PROPERTIES = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__PARTS = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__GROUPS = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__CONTROLS = CITABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 17;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TITLE = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROL_CLASS = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PROPERTIES = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARAMETERS = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARTS = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROLS = CITABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlPartImpl <em>Control Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlPartImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlPart()
	 * @generated
	 */
	int CONTROL_PART = 18;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__NAME = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__TITLE = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__PROSE = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__PROPERTIES = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART__PARTS = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Control Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Control Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PART_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl <em>Control Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlParameter()
	 * @generated
	 */
	int CONTROL_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Parameter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER__PARAMETER_ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Guideline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER__GUIDELINE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Control Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl <em>Technical Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getTechnicalDocument()
	 * @generated
	 */
	int TECHNICAL_DOCUMENT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__ID = CORPUS__ID;

	/**
	 * The feature id for the '<em><b>Work Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__WORK_ID = CORPUS__WORK_ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__TITLE = CORPUS__TITLE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__LANGUAGE = CORPUS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__VERSION = CORPUS__VERSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__SOURCE = CORPUS__SOURCE;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__LICENCE = CORPUS__LICENCE;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__ATTRIBUTION = CORPUS__ATTRIBUTION;

	/**
	 * The feature id for the '<em><b>Cross References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__CROSS_REFERENCES = CORPUS__CROSS_REFERENCES;

	/**
	 * The feature id for the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__DOCUMENT_NUMBER = CORPUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__PART = CORPUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__PUBLISHER = CORPUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT__SECTIONS = CORPUS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Technical Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT_FEATURE_COUNT = CORPUS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Technical Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_DOCUMENT_OPERATION_COUNT = CORPUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl <em>Document Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDocumentSection()
	 * @generated
	 */
	int DOCUMENT_SECTION = 21;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__NUMBER = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__HEADING = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__TEXT = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__SECTIONS = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION__CLAUSES = CITABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Document Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Document Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SECTION_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl <em>Document Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDocumentClause()
	 * @generated
	 */
	int DOCUMENT_CLAUSE = 22;

	/**
	 * The feature id for the '<em><b>Citation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE__CITATION_ID = CITABLE__CITATION_ID;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE__CITES = CITABLE__CITES;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE__CITED_BY = CITABLE__CITED_BY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE__LABEL = CITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE__TEXT = CITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obligation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE__OBLIGATION = CITABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Document Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE_FEATURE_COUNT = CITABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Document Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CLAUSE_OPERATION_COUNT = CITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.corpus.DivisionLevel <em>Division Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.corpus.DivisionLevel
	 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDivisionLevel()
	 * @generated
	 */
	int DIVISION_LEVEL = 23;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct <em>Legal Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Act</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct
	 * @generated
	 */
	EClass getLegalAct();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getConsolidatedDate <em>Consolidated Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consolidated Date</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getConsolidatedDate()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_ConsolidatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getFormexSchema <em>Formex Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formex Schema</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getFormexSchema()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_FormexSchema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getClosingFormula <em>Closing Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Formula</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getClosingFormula()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_ClosingFormula();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Citations</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getCitations()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_Citations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getRecitals <em>Recitals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recitals</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getRecitals()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Recitals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getDivisions <em>Divisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divisions</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getDivisions()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Divisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getDefinitions()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.LegalAct#getAnnexes <em>Annexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annexes</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalAct#getAnnexes()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Annexes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Citable <em>Citable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citable</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Citable
	 * @generated
	 */
	EClass getCitable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Citable#getCitationId <em>Citation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Citation Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Citable#getCitationId()
	 * @see #getCitable()
	 * @generated
	 */
	EAttribute getCitable_CitationId();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.corpus.Citable#getCites <em>Cites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cites</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Citable#getCites()
	 * @see #getCitable()
	 * @generated
	 */
	EReference getCitable_Cites();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.corpus.Citable#getCitedBy <em>Cited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cited By</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Citable#getCitedBy()
	 * @see #getCitable()
	 * @generated
	 */
	EReference getCitable_CitedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.LegalUnit <em>Legal Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Unit</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalUnit
	 * @generated
	 */
	EClass getLegalUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.LegalUnit#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalUnit#getText()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EAttribute getLegalUnit_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.LegalUnit#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalUnit#getSourceRef()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EAttribute getLegalUnit_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.LegalUnit#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalUnit#getModifiedBy()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EAttribute getLegalUnit_ModifiedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.LegalUnit#getFootnotes <em>Footnotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footnotes</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.LegalUnit#getFootnotes()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EReference getLegalUnit_Footnotes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Recital <em>Recital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recital</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Recital
	 * @generated
	 */
	EClass getRecital();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Recital#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Recital#getNumber()
	 * @see #getRecital()
	 * @generated
	 */
	EAttribute getRecital_Number();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Article#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Article#getNumber()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Article#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Article#getHeading()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Article#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Article#getParagraphs()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Paragraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Article#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Article#getPoints()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Paragraph#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Paragraph#getNumber()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Paragraph#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Paragraph#getPoints()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Point#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Point#getLabel()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Point#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Point#getPoints()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Points();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.corpus.Point#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Point#getDefinition()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Division#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Division#getLevel()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Division#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Division#getNumber()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Division#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Division#getHeading()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Division#getDivisions <em>Divisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divisions</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Division#getDivisions()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Divisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Division#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Division#getArticles()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Articles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Definition#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Definition#getTerm()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Definition#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Definition#getNumber()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Number();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.corpus.Definition#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined In</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Definition#getDefinedIn()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_DefinedIn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference <em>Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Reference</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference
	 * @generated
	 */
	EClass getCrossReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#getSource()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#getRawText <em>Raw Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Text</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#getRawText()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_RawText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#getTargetCitationId <em>Target Citation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Citation Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#getTargetCitationId()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_TargetCitationId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#getTarget()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#isResolved()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#isRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#isRelative()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_Relative();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#isExternal()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_External();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.CrossReference#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.CrossReference#getInstrument()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_Instrument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Footnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Footnote
	 * @generated
	 */
	EClass getFootnote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Footnote#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Footnote#getNoteId()
	 * @see #getFootnote()
	 * @generated
	 */
	EAttribute getFootnote_NoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Footnote#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Footnote#getText()
	 * @see #getFootnote()
	 * @generated
	 */
	EAttribute getFootnote_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Corpus <em>Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corpus</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus
	 * @generated
	 */
	EClass getCorpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getId()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getWorkId <em>Work Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getWorkId()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_WorkId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getTitle()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getLanguage()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getVersion()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getSource()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getLicence <em>Licence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licence</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getLicence()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Licence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getAttribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribution</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getAttribution()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_Attribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getCrossReferences <em>Cross References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross References</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Corpus#getCrossReferences()
	 * @see #getCorpus()
	 * @generated
	 */
	EReference getCorpus_CrossReferences();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Annex <em>Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Annex
	 * @generated
	 */
	EClass getAnnex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Annex#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Annex#getNumber()
	 * @see #getAnnex()
	 * @generated
	 */
	EAttribute getAnnex_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Annex#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Annex#getHeading()
	 * @see #getAnnex()
	 * @generated
	 */
	EAttribute getAnnex_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Annex#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Annex#getSections()
	 * @see #getAnnex()
	 * @generated
	 */
	EReference getAnnex_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Annex#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Annex#getPoints()
	 * @see #getAnnex()
	 * @generated
	 */
	EReference getAnnex_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.AnnexSection <em>Annex Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Section</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.AnnexSection
	 * @generated
	 */
	EClass getAnnexSection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.AnnexSection#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.AnnexSection#getNumber()
	 * @see #getAnnexSection()
	 * @generated
	 */
	EAttribute getAnnexSection_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.AnnexSection#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.AnnexSection#getHeading()
	 * @see #getAnnexSection()
	 * @generated
	 */
	EAttribute getAnnexSection_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.AnnexSection#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.AnnexSection#getSections()
	 * @see #getAnnexSection()
	 * @generated
	 */
	EReference getAnnexSection_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.AnnexSection#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.AnnexSection#getPoints()
	 * @see #getAnnexSection()
	 * @generated
	 */
	EReference getAnnexSection_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Property#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Property#getNs()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Ns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Property#getPropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Class</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Property#getPropertyClass()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Property#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Property#getRemarks()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Remarks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.ControlCatalog <em>Control Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Catalog</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlCatalog
	 * @generated
	 */
	EClass getControlCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getOscalVersion()
	 * @see #getControlCatalog()
	 * @generated
	 */
	EAttribute getControlCatalog_OscalVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getProperties()
	 * @see #getControlCatalog()
	 * @generated
	 */
	EReference getControlCatalog_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getGroups()
	 * @see #getControlCatalog()
	 * @generated
	 */
	EReference getControlCatalog_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlCatalog#getControls()
	 * @see #getControlCatalog()
	 * @generated
	 */
	EReference getControlCatalog_Controls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Group</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup
	 * @generated
	 */
	EClass getControlGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup#getTitle()
	 * @see #getControlGroup()
	 * @generated
	 */
	EAttribute getControlGroup_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroupClass <em>Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Class</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroupClass()
	 * @see #getControlGroup()
	 * @generated
	 */
	EAttribute getControlGroup_GroupClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup#getProperties()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup#getParts()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup#getGroups()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlGroup#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlGroup#getControls()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Controls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Control#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control#getTitle()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.Control#getControlClass <em>Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Class</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control#getControlClass()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_ControlClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Control#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control#getProperties()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Control#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control#getParameters()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Control#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control#getParts()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.Control#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.Control#getControls()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Controls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.ControlPart <em>Control Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Part</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlPart
	 * @generated
	 */
	EClass getControlPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlPart#getName()
	 * @see #getControlPart()
	 * @generated
	 */
	EAttribute getControlPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlPart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlPart#getTitle()
	 * @see #getControlPart()
	 * @generated
	 */
	EAttribute getControlPart_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlPart#getProse <em>Prose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prose</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlPart#getProse()
	 * @see #getControlPart()
	 * @generated
	 */
	EAttribute getControlPart_Prose();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlPart#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlPart#getProperties()
	 * @see #getControlPart()
	 * @generated
	 */
	EReference getControlPart_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlPart#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlPart#getParts()
	 * @see #getControlPart()
	 * @generated
	 */
	EReference getControlPart_Parts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter <em>Control Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Parameter</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlParameter
	 * @generated
	 */
	EClass getControlParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getParameterId <em>Parameter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlParameter#getParameterId()
	 * @see #getControlParameter()
	 * @generated
	 */
	EAttribute getControlParameter_ParameterId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlParameter#getLabel()
	 * @see #getControlParameter()
	 * @generated
	 */
	EAttribute getControlParameter_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlParameter#getValues()
	 * @see #getControlParameter()
	 * @generated
	 */
	EAttribute getControlParameter_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getGuideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guideline</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlParameter#getGuideline()
	 * @see #getControlParameter()
	 * @generated
	 */
	EAttribute getControlParameter_Guideline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.ControlParameter#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.ControlParameter#getProperties()
	 * @see #getControlParameter()
	 * @generated
	 */
	EReference getControlParameter_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument <em>Technical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Document</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.TechnicalDocument
	 * @generated
	 */
	EClass getTechnicalDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getDocumentNumber <em>Document Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getDocumentNumber()
	 * @see #getTechnicalDocument()
	 * @generated
	 */
	EAttribute getTechnicalDocument_DocumentNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPart()
	 * @see #getTechnicalDocument()
	 * @generated
	 */
	EAttribute getTechnicalDocument_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getPublisher()
	 * @see #getTechnicalDocument()
	 * @generated
	 */
	EAttribute getTechnicalDocument_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.TechnicalDocument#getSections()
	 * @see #getTechnicalDocument()
	 * @generated
	 */
	EReference getTechnicalDocument_Sections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.DocumentSection <em>Document Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Section</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentSection
	 * @generated
	 */
	EClass getDocumentSection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.DocumentSection#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentSection#getNumber()
	 * @see #getDocumentSection()
	 * @generated
	 */
	EAttribute getDocumentSection_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.DocumentSection#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentSection#getHeading()
	 * @see #getDocumentSection()
	 * @generated
	 */
	EAttribute getDocumentSection_Heading();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.DocumentSection#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentSection#getText()
	 * @see #getDocumentSection()
	 * @generated
	 */
	EAttribute getDocumentSection_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.DocumentSection#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentSection#getSections()
	 * @see #getDocumentSection()
	 * @generated
	 */
	EReference getDocumentSection_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.corpus.DocumentSection#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentSection#getClauses()
	 * @see #getDocumentSection()
	 * @generated
	 */
	EReference getDocumentSection_Clauses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause <em>Document Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Clause</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentClause
	 * @generated
	 */
	EClass getDocumentClause();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentClause#getLabel()
	 * @see #getDocumentClause()
	 * @generated
	 */
	EAttribute getDocumentClause_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentClause#getText()
	 * @see #getDocumentClause()
	 * @generated
	 */
	EAttribute getDocumentClause_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.corpus.DocumentClause#getObligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obligation</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DocumentClause#getObligation()
	 * @see #getDocumentClause()
	 * @generated
	 */
	EAttribute getDocumentClause_Obligation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.corpus.DivisionLevel <em>Division Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Division Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.corpus.DivisionLevel
	 * @generated
	 */
	EEnum getDivisionLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CorpusFactory getCorpusFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl <em>Legal Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getLegalAct()
		 * @generated
		 */
		EClass LEGAL_ACT = eINSTANCE.getLegalAct();

		/**
		 * The meta object literal for the '<em><b>Consolidated Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__CONSOLIDATED_DATE = eINSTANCE.getLegalAct_ConsolidatedDate();

		/**
		 * The meta object literal for the '<em><b>Formex Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__FORMEX_SCHEMA = eINSTANCE.getLegalAct_FormexSchema();

		/**
		 * The meta object literal for the '<em><b>Closing Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__CLOSING_FORMULA = eINSTANCE.getLegalAct_ClosingFormula();

		/**
		 * The meta object literal for the '<em><b>Citations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__CITATIONS = eINSTANCE.getLegalAct_Citations();

		/**
		 * The meta object literal for the '<em><b>Recitals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ACT__RECITALS = eINSTANCE.getLegalAct_Recitals();

		/**
		 * The meta object literal for the '<em><b>Divisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ACT__DIVISIONS = eINSTANCE.getLegalAct_Divisions();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ACT__DEFINITIONS = eINSTANCE.getLegalAct_Definitions();

		/**
		 * The meta object literal for the '<em><b>Annexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ACT__ANNEXES = eINSTANCE.getLegalAct_Annexes();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.CitableImpl <em>Citable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CitableImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getCitable()
		 * @generated
		 */
		EClass CITABLE = eINSTANCE.getCitable();

		/**
		 * The meta object literal for the '<em><b>Citation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITABLE__CITATION_ID = eINSTANCE.getCitable_CitationId();

		/**
		 * The meta object literal for the '<em><b>Cites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITABLE__CITES = eINSTANCE.getCitable_Cites();

		/**
		 * The meta object literal for the '<em><b>Cited By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITABLE__CITED_BY = eINSTANCE.getCitable_CitedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalUnitImpl <em>Legal Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.LegalUnitImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getLegalUnit()
		 * @generated
		 */
		EClass LEGAL_UNIT = eINSTANCE.getLegalUnit();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNIT__TEXT = eINSTANCE.getLegalUnit_Text();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNIT__SOURCE_REF = eINSTANCE.getLegalUnit_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNIT__MODIFIED_BY = eINSTANCE.getLegalUnit_ModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Footnotes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_UNIT__FOOTNOTES = eINSTANCE.getLegalUnit_Footnotes();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.RecitalImpl <em>Recital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.RecitalImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getRecital()
		 * @generated
		 */
		EClass RECITAL = eINSTANCE.getRecital();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECITAL__NUMBER = eINSTANCE.getRecital_Number();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ArticleImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__NUMBER = eINSTANCE.getArticle_Number();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__HEADING = eINSTANCE.getArticle_Heading();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLE__PARAGRAPHS = eINSTANCE.getArticle_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLE__POINTS = eINSTANCE.getArticle_Points();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ParagraphImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__NUMBER = eINSTANCE.getParagraph_Number();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__POINTS = eINSTANCE.getParagraph_Points();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.PointImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__LABEL = eINSTANCE.getPoint_Label();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__POINTS = eINSTANCE.getPoint_Points();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__DEFINITION = eINSTANCE.getPoint_Definition();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.DivisionImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVISION__LEVEL = eINSTANCE.getDivision_Level();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVISION__NUMBER = eINSTANCE.getDivision_Number();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVISION__HEADING = eINSTANCE.getDivision_Heading();

		/**
		 * The meta object literal for the '<em><b>Divisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__DIVISIONS = eINSTANCE.getDivision_Divisions();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__ARTICLES = eINSTANCE.getDivision_Articles();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.DefinitionImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__TERM = eINSTANCE.getDefinition_Term();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__NUMBER = eINSTANCE.getDefinition_Number();

		/**
		 * The meta object literal for the '<em><b>Defined In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__DEFINED_IN = eINSTANCE.getDefinition_DefinedIn();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CrossReferenceImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getCrossReference()
		 * @generated
		 */
		EClass CROSS_REFERENCE = eINSTANCE.getCrossReference();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_REFERENCE__SOURCE = eINSTANCE.getCrossReference_Source();

		/**
		 * The meta object literal for the '<em><b>Raw Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_REFERENCE__RAW_TEXT = eINSTANCE.getCrossReference_RawText();

		/**
		 * The meta object literal for the '<em><b>Target Citation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_REFERENCE__TARGET_CITATION_ID = eINSTANCE.getCrossReference_TargetCitationId();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_REFERENCE__TARGET = eINSTANCE.getCrossReference_Target();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_REFERENCE__RESOLVED = eINSTANCE.getCrossReference_Resolved();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_REFERENCE__RELATIVE = eINSTANCE.getCrossReference_Relative();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_REFERENCE__EXTERNAL = eINSTANCE.getCrossReference_External();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_REFERENCE__INSTRUMENT = eINSTANCE.getCrossReference_Instrument();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.FootnoteImpl <em>Footnote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.FootnoteImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getFootnote()
		 * @generated
		 */
		EClass FOOTNOTE = eINSTANCE.getFootnote();

		/**
		 * The meta object literal for the '<em><b>Note Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTNOTE__NOTE_ID = eINSTANCE.getFootnote_NoteId();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTNOTE__TEXT = eINSTANCE.getFootnote_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl <em>Corpus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getCorpus()
		 * @generated
		 */
		EClass CORPUS = eINSTANCE.getCorpus();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__ID = eINSTANCE.getCorpus_Id();

		/**
		 * The meta object literal for the '<em><b>Work Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__WORK_ID = eINSTANCE.getCorpus_WorkId();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__TITLE = eINSTANCE.getCorpus_Title();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__LANGUAGE = eINSTANCE.getCorpus_Language();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__VERSION = eINSTANCE.getCorpus_Version();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__SOURCE = eINSTANCE.getCorpus_Source();

		/**
		 * The meta object literal for the '<em><b>Licence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__LICENCE = eINSTANCE.getCorpus_Licence();

		/**
		 * The meta object literal for the '<em><b>Attribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__ATTRIBUTION = eINSTANCE.getCorpus_Attribution();

		/**
		 * The meta object literal for the '<em><b>Cross References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORPUS__CROSS_REFERENCES = eINSTANCE.getCorpus_CrossReferences();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.AnnexImpl <em>Annex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.AnnexImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getAnnex()
		 * @generated
		 */
		EClass ANNEX = eINSTANCE.getAnnex();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX__NUMBER = eINSTANCE.getAnnex_Number();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX__HEADING = eINSTANCE.getAnnex_Heading();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX__SECTIONS = eINSTANCE.getAnnex_Sections();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX__POINTS = eINSTANCE.getAnnex_Points();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.AnnexSectionImpl <em>Annex Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.AnnexSectionImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getAnnexSection()
		 * @generated
		 */
		EClass ANNEX_SECTION = eINSTANCE.getAnnexSection();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_SECTION__NUMBER = eINSTANCE.getAnnexSection_Number();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_SECTION__HEADING = eINSTANCE.getAnnexSection_Heading();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX_SECTION__SECTIONS = eINSTANCE.getAnnexSection_Sections();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX_SECTION__POINTS = eINSTANCE.getAnnexSection_Points();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.PropertyImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NS = eINSTANCE.getProperty_Ns();

		/**
		 * The meta object literal for the '<em><b>Property Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_CLASS = eINSTANCE.getProperty_PropertyClass();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REMARKS = eINSTANCE.getProperty_Remarks();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlCatalogImpl <em>Control Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlCatalogImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlCatalog()
		 * @generated
		 */
		EClass CONTROL_CATALOG = eINSTANCE.getControlCatalog();

		/**
		 * The meta object literal for the '<em><b>Oscal Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CATALOG__OSCAL_VERSION = eINSTANCE.getControlCatalog_OscalVersion();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CATALOG__PROPERTIES = eINSTANCE.getControlCatalog_Properties();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CATALOG__GROUPS = eINSTANCE.getControlCatalog_Groups();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CATALOG__CONTROLS = eINSTANCE.getControlCatalog_Controls();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl <em>Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlGroupImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlGroup()
		 * @generated
		 */
		EClass CONTROL_GROUP = eINSTANCE.getControlGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GROUP__TITLE = eINSTANCE.getControlGroup_Title();

		/**
		 * The meta object literal for the '<em><b>Group Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GROUP__GROUP_CLASS = eINSTANCE.getControlGroup_GroupClass();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__PROPERTIES = eINSTANCE.getControlGroup_Properties();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__PARTS = eINSTANCE.getControlGroup_Parts();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__GROUPS = eINSTANCE.getControlGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__CONTROLS = eINSTANCE.getControlGroup_Controls();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TITLE = eINSTANCE.getControl_Title();

		/**
		 * The meta object literal for the '<em><b>Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__CONTROL_CLASS = eINSTANCE.getControl_ControlClass();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__PROPERTIES = eINSTANCE.getControl_Properties();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__PARAMETERS = eINSTANCE.getControl_Parameters();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__PARTS = eINSTANCE.getControl_Parts();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROLS = eINSTANCE.getControl_Controls();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlPartImpl <em>Control Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlPartImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlPart()
		 * @generated
		 */
		EClass CONTROL_PART = eINSTANCE.getControlPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PART__NAME = eINSTANCE.getControlPart_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PART__TITLE = eINSTANCE.getControlPart_Title();

		/**
		 * The meta object literal for the '<em><b>Prose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PART__PROSE = eINSTANCE.getControlPart_Prose();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PART__PROPERTIES = eINSTANCE.getControlPart_Properties();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PART__PARTS = eINSTANCE.getControlPart_Parts();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl <em>Control Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getControlParameter()
		 * @generated
		 */
		EClass CONTROL_PARAMETER = eINSTANCE.getControlParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PARAMETER__PARAMETER_ID = eINSTANCE.getControlParameter_ParameterId();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PARAMETER__LABEL = eINSTANCE.getControlParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PARAMETER__VALUES = eINSTANCE.getControlParameter_Values();

		/**
		 * The meta object literal for the '<em><b>Guideline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PARAMETER__GUIDELINE = eINSTANCE.getControlParameter_Guideline();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PARAMETER__PROPERTIES = eINSTANCE.getControlParameter_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl <em>Technical Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getTechnicalDocument()
		 * @generated
		 */
		EClass TECHNICAL_DOCUMENT = eINSTANCE.getTechnicalDocument();

		/**
		 * The meta object literal for the '<em><b>Document Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNICAL_DOCUMENT__DOCUMENT_NUMBER = eINSTANCE.getTechnicalDocument_DocumentNumber();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNICAL_DOCUMENT__PART = eINSTANCE.getTechnicalDocument_Part();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNICAL_DOCUMENT__PUBLISHER = eINSTANCE.getTechnicalDocument_Publisher();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNICAL_DOCUMENT__SECTIONS = eINSTANCE.getTechnicalDocument_Sections();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl <em>Document Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDocumentSection()
		 * @generated
		 */
		EClass DOCUMENT_SECTION = eINSTANCE.getDocumentSection();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SECTION__NUMBER = eINSTANCE.getDocumentSection_Number();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SECTION__HEADING = eINSTANCE.getDocumentSection_Heading();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SECTION__TEXT = eINSTANCE.getDocumentSection_Text();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_SECTION__SECTIONS = eINSTANCE.getDocumentSection_Sections();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_SECTION__CLAUSES = eINSTANCE.getDocumentSection_Clauses();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl <em>Document Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDocumentClause()
		 * @generated
		 */
		EClass DOCUMENT_CLAUSE = eINSTANCE.getDocumentClause();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_CLAUSE__LABEL = eINSTANCE.getDocumentClause_Label();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_CLAUSE__TEXT = eINSTANCE.getDocumentClause_Text();

		/**
		 * The meta object literal for the '<em><b>Obligation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_CLAUSE__OBLIGATION = eINSTANCE.getDocumentClause_Obligation();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.corpus.DivisionLevel <em>Division Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.corpus.DivisionLevel
		 * @see org.eclipse.fennec.model.compliance.corpus.impl.CorpusPackageImpl#getDivisionLevel()
		 * @generated
		 */
		EEnum DIVISION_LEVEL = eINSTANCE.getDivisionLevel();

	}

} //CorpusPackage
