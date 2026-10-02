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
package org.eclipse.fennec.model.compliance.corpus.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fennec.model.compliance.corpus.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage
 * @generated
 */
public class CorpusSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorpusPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorpusSwitch() {
		if (modelPackage == null) {
			modelPackage = CorpusPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorpusPackage.LEGAL_ACT: {
				LegalAct legalAct = (LegalAct)theEObject;
				T result = caseLegalAct(legalAct);
				if (result == null) result = caseCorpus(legalAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CITABLE: {
				Citable citable = (Citable)theEObject;
				T result = caseCitable(citable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.LEGAL_UNIT: {
				LegalUnit legalUnit = (LegalUnit)theEObject;
				T result = caseLegalUnit(legalUnit);
				if (result == null) result = caseCitable(legalUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.RECITAL: {
				Recital recital = (Recital)theEObject;
				T result = caseRecital(recital);
				if (result == null) result = caseLegalUnit(recital);
				if (result == null) result = caseCitable(recital);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.ARTICLE: {
				Article article = (Article)theEObject;
				T result = caseArticle(article);
				if (result == null) result = caseLegalUnit(article);
				if (result == null) result = caseCitable(article);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseLegalUnit(paragraph);
				if (result == null) result = caseCitable(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = caseLegalUnit(point);
				if (result == null) result = caseCitable(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseCitable(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CROSS_REFERENCE: {
				CrossReference crossReference = (CrossReference)theEObject;
				T result = caseCrossReference(crossReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.FOOTNOTE: {
				Footnote footnote = (Footnote)theEObject;
				T result = caseFootnote(footnote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CORPUS: {
				Corpus corpus = (Corpus)theEObject;
				T result = caseCorpus(corpus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.ANNEX: {
				Annex annex = (Annex)theEObject;
				T result = caseAnnex(annex);
				if (result == null) result = caseLegalUnit(annex);
				if (result == null) result = caseCitable(annex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.ANNEX_SECTION: {
				AnnexSection annexSection = (AnnexSection)theEObject;
				T result = caseAnnexSection(annexSection);
				if (result == null) result = caseCitable(annexSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CONTROL_CATALOG: {
				ControlCatalog controlCatalog = (ControlCatalog)theEObject;
				T result = caseControlCatalog(controlCatalog);
				if (result == null) result = caseCorpus(controlCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CONTROL_GROUP: {
				ControlGroup controlGroup = (ControlGroup)theEObject;
				T result = caseControlGroup(controlGroup);
				if (result == null) result = caseCitable(controlGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseCitable(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CONTROL_PART: {
				ControlPart controlPart = (ControlPart)theEObject;
				T result = caseControlPart(controlPart);
				if (result == null) result = caseCitable(controlPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.CONTROL_PARAMETER: {
				ControlParameter controlParameter = (ControlParameter)theEObject;
				T result = caseControlParameter(controlParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.TECHNICAL_DOCUMENT: {
				TechnicalDocument technicalDocument = (TechnicalDocument)theEObject;
				T result = caseTechnicalDocument(technicalDocument);
				if (result == null) result = caseCorpus(technicalDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.DOCUMENT_SECTION: {
				DocumentSection documentSection = (DocumentSection)theEObject;
				T result = caseDocumentSection(documentSection);
				if (result == null) result = caseCitable(documentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorpusPackage.DOCUMENT_CLAUSE: {
				DocumentClause documentClause = (DocumentClause)theEObject;
				T result = caseDocumentClause(documentClause);
				if (result == null) result = caseCitable(documentClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalAct(LegalAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitable(Citable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalUnit(LegalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recital</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recital</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecital(Recital object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossReference(CrossReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footnote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footnote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFootnote(Footnote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corpus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorpus(Corpus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnex(Annex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexSection(AnnexSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlCatalog(ControlCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlGroup(ControlGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlPart(ControlPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlParameter(ControlParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalDocument(TechnicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentSection(DocumentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentClause(DocumentClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CorpusSwitch
