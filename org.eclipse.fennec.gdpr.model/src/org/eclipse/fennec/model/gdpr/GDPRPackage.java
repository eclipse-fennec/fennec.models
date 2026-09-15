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
package org.eclipse.fennec.model.gdpr;


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
 * @see org.eclipse.fennec.model.gdpr.GDPRFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='21.0' oSGiCompatible='true' basePackage='org.eclipse.fennec.model' resource='XMI' copyrightText='Copyright (c) 2026 Contributors to the Eclipse Foundation.\n\nThis program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n  Data In Motion Consulting - initial implementation'"
 * @generated
 */
@ProviderType
@EPackage(uri = GDPRPackage.eNS_URI, fingerprint = "fp1:df9b4bd045552e64e81975aa18957ee00810fbfa708518209ed7c6dbf588394a", genModel = "/model/gdpr.genmodel", genModelSourceLocations = {"model/gdpr.genmodel","org.eclipse.fennec.gdpr.model/model/gdpr.genmodel"}, ecore = "/model/gdpr.ecore", ecoreSourceLocations = "/model/gdpr.ecore")
public interface GDPRPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gdpr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/gdpr/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gdpr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GDPRPackage eINSTANCE = org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.LegalActImpl <em>Legal Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.LegalActImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getLegalAct()
	 * @generated
	 */
	int LEGAL_ACT = 0;

	/**
	 * The feature id for the '<em><b>Celex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CELEX = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Consolidated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CONSOLIDATED_DATE = 3;

	/**
	 * The feature id for the '<em><b>Formex Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__FORMEX_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Closing Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CLOSING_FORMULA = 5;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CITATIONS = 6;

	/**
	 * The feature id for the '<em><b>Recitals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__RECITALS = 7;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__DIVISIONS = 8;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__DEFINITIONS = 9;

	/**
	 * The feature id for the '<em><b>Cross References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT__CROSS_REFERENCES = 10;

	/**
	 * The number of structural features of the '<em>Legal Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Legal Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.CitableImpl <em>Citable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.CitableImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getCitable()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl <em>Legal Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getLegalUnit()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.RecitalImpl <em>Recital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.RecitalImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getRecital()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.ArticleImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getArticle()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.ParagraphImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getParagraph()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.PointImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getPoint()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.DivisionImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getDivision()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.DefinitionImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getDefinition()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getCrossReference()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.impl.FootnoteImpl <em>Footnote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.impl.FootnoteImpl
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getFootnote()
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
	 * The meta object id for the '{@link org.eclipse.fennec.model.gdpr.DivisionLevel <em>Division Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.gdpr.DivisionLevel
	 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getDivisionLevel()
	 * @generated
	 */
	int DIVISION_LEVEL = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.LegalAct <em>Legal Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Act</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct
	 * @generated
	 */
	EClass getLegalAct();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalAct#getCelex <em>Celex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Celex</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getCelex()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_Celex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalAct#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getTitle()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalAct#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getLanguage()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalAct#getConsolidatedDate <em>Consolidated Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consolidated Date</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getConsolidatedDate()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_ConsolidatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalAct#getFormexSchema <em>Formex Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formex Schema</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getFormexSchema()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_FormexSchema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalAct#getClosingFormula <em>Closing Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Formula</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getClosingFormula()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_ClosingFormula();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.gdpr.LegalAct#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Citations</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getCitations()
	 * @see #getLegalAct()
	 * @generated
	 */
	EAttribute getLegalAct_Citations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.LegalAct#getRecitals <em>Recitals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recitals</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getRecitals()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Recitals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.LegalAct#getDivisions <em>Divisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divisions</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getDivisions()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Divisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.LegalAct#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getDefinitions()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.LegalAct#getCrossReferences <em>Cross References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross References</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalAct#getCrossReferences()
	 * @see #getLegalAct()
	 * @generated
	 */
	EReference getLegalAct_CrossReferences();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Citable <em>Citable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citable</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Citable
	 * @generated
	 */
	EClass getCitable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Citable#getCitationId <em>Citation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Citation Id</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Citable#getCitationId()
	 * @see #getCitable()
	 * @generated
	 */
	EAttribute getCitable_CitationId();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.gdpr.Citable#getCites <em>Cites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cites</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Citable#getCites()
	 * @see #getCitable()
	 * @generated
	 */
	EReference getCitable_Cites();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.gdpr.Citable#getCitedBy <em>Cited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cited By</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Citable#getCitedBy()
	 * @see #getCitable()
	 * @generated
	 */
	EReference getCitable_CitedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.LegalUnit <em>Legal Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Unit</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalUnit
	 * @generated
	 */
	EClass getLegalUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalUnit#getText()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EAttribute getLegalUnit_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalUnit#getSourceRef()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EAttribute getLegalUnit_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalUnit#getModifiedBy()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EAttribute getLegalUnit_ModifiedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.LegalUnit#getFootnotes <em>Footnotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footnotes</em>'.
	 * @see org.eclipse.fennec.model.gdpr.LegalUnit#getFootnotes()
	 * @see #getLegalUnit()
	 * @generated
	 */
	EReference getLegalUnit_Footnotes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Recital <em>Recital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recital</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Recital
	 * @generated
	 */
	EClass getRecital();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Recital#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Recital#getNumber()
	 * @see #getRecital()
	 * @generated
	 */
	EAttribute getRecital_Number();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Article#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Article#getNumber()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Article#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Article#getHeading()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.Article#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Article#getParagraphs()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Paragraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.Article#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Article#getPoints()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Paragraph#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Paragraph#getNumber()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.Paragraph#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Paragraph#getPoints()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Points();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Point#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Point#getLabel()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.Point#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Point#getPoints()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Points();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.gdpr.Point#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Point#getDefinition()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Division#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Division#getLevel()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Division#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Division#getNumber()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Division#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Division#getHeading()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.Division#getDivisions <em>Divisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divisions</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Division#getDivisions()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Divisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.gdpr.Division#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Division#getArticles()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Articles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Definition#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Definition#getTerm()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Definition#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Definition#getNumber()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Number();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.gdpr.Definition#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined In</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Definition#getDefinedIn()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_DefinedIn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.CrossReference <em>Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Reference</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference
	 * @generated
	 */
	EClass getCrossReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.gdpr.CrossReference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getSource()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.CrossReference#getRawText <em>Raw Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Text</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getRawText()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_RawText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.CrossReference#getTargetCitationId <em>Target Citation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Citation Id</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getTargetCitationId()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_TargetCitationId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.gdpr.CrossReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getTarget()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.CrossReference#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#isResolved()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.CrossReference#isRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#isRelative()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_Relative();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.CrossReference#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#isExternal()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_External();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.CrossReference#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument</em>'.
	 * @see org.eclipse.fennec.model.gdpr.CrossReference#getInstrument()
	 * @see #getCrossReference()
	 * @generated
	 */
	EAttribute getCrossReference_Instrument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.gdpr.Footnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Footnote
	 * @generated
	 */
	EClass getFootnote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Footnote#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Id</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Footnote#getNoteId()
	 * @see #getFootnote()
	 * @generated
	 */
	EAttribute getFootnote_NoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.gdpr.Footnote#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.fennec.model.gdpr.Footnote#getText()
	 * @see #getFootnote()
	 * @generated
	 */
	EAttribute getFootnote_Text();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.gdpr.DivisionLevel <em>Division Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Division Level</em>'.
	 * @see org.eclipse.fennec.model.gdpr.DivisionLevel
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
	GDPRFactory getGDPRFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.LegalActImpl <em>Legal Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.LegalActImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getLegalAct()
		 * @generated
		 */
		EClass LEGAL_ACT = eINSTANCE.getLegalAct();

		/**
		 * The meta object literal for the '<em><b>Celex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__CELEX = eINSTANCE.getLegalAct_Celex();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__TITLE = eINSTANCE.getLegalAct_Title();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ACT__LANGUAGE = eINSTANCE.getLegalAct_Language();

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
		 * The meta object literal for the '<em><b>Cross References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ACT__CROSS_REFERENCES = eINSTANCE.getLegalAct_CrossReferences();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.CitableImpl <em>Citable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.CitableImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getCitable()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl <em>Legal Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getLegalUnit()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.RecitalImpl <em>Recital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.RecitalImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getRecital()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.ArticleImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getArticle()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.ParagraphImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getParagraph()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.PointImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getPoint()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.DivisionImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getDivision()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.DefinitionImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getDefinition()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getCrossReference()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.impl.FootnoteImpl <em>Footnote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.impl.FootnoteImpl
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getFootnote()
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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.gdpr.DivisionLevel <em>Division Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.gdpr.DivisionLevel
		 * @see org.eclipse.fennec.model.gdpr.impl.GDPRPackageImpl#getDivisionLevel()
		 * @generated
		 */
		EEnum DIVISION_LEVEL = eINSTANCE.getDivisionLevel();

	}

} //GDPRPackage
