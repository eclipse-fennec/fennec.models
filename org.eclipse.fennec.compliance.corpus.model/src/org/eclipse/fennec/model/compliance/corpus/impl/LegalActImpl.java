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
package org.eclipse.fennec.model.compliance.corpus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.corpus.Annex;
import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.Definition;
import org.eclipse.fennec.model.compliance.corpus.Division;
import org.eclipse.fennec.model.compliance.corpus.LegalAct;
import org.eclipse.fennec.model.compliance.corpus.Recital;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getConsolidatedDate <em>Consolidated Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getFormexSchema <em>Formex Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getClosingFormula <em>Closing Formula</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getRecitals <em>Recitals</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getDivisions <em>Divisions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.LegalActImpl#getAnnexes <em>Annexes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegalActImpl extends CorpusImpl implements LegalAct {
	/**
	 * The default value of the '{@link #getConsolidatedDate() <em>Consolidated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolidatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSOLIDATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsolidatedDate() <em>Consolidated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolidatedDate()
	 * @generated
	 * @ordered
	 */
	protected String consolidatedDate = CONSOLIDATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormexSchema() <em>Formex Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormexSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMEX_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormexSchema() <em>Formex Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormexSchema()
	 * @generated
	 * @ordered
	 */
	protected String formexSchema = FORMEX_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosingFormula() <em>Closing Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSING_FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosingFormula() <em>Closing Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingFormula()
	 * @generated
	 * @ordered
	 */
	protected String closingFormula = CLOSING_FORMULA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCitations() <em>Citations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> citations;

	/**
	 * The cached value of the '{@link #getRecitals() <em>Recitals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecitals()
	 * @generated
	 * @ordered
	 */
	protected EList<Recital> recitals;

	/**
	 * The cached value of the '{@link #getDivisions() <em>Divisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Division> divisions;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> definitions;

	/**
	 * The cached value of the '{@link #getAnnexes() <em>Annexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annex> annexes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.LEGAL_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsolidatedDate() {
		return consolidatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsolidatedDate(String newConsolidatedDate) {
		String oldConsolidatedDate = consolidatedDate;
		consolidatedDate = newConsolidatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.LEGAL_ACT__CONSOLIDATED_DATE, oldConsolidatedDate, consolidatedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormexSchema() {
		return formexSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormexSchema(String newFormexSchema) {
		String oldFormexSchema = formexSchema;
		formexSchema = newFormexSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.LEGAL_ACT__FORMEX_SCHEMA, oldFormexSchema, formexSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClosingFormula() {
		return closingFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingFormula(String newClosingFormula) {
		String oldClosingFormula = closingFormula;
		closingFormula = newClosingFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.LEGAL_ACT__CLOSING_FORMULA, oldClosingFormula, closingFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCitations() {
		if (citations == null) {
			citations = new EDataTypeUniqueEList<String>(String.class, this, CorpusPackage.LEGAL_ACT__CITATIONS);
		}
		return citations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Recital> getRecitals() {
		if (recitals == null) {
			recitals = new EObjectContainmentEList<Recital>(Recital.class, this, CorpusPackage.LEGAL_ACT__RECITALS);
		}
		return recitals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Division> getDivisions() {
		if (divisions == null) {
			divisions = new EObjectContainmentEList<Division>(Division.class, this, CorpusPackage.LEGAL_ACT__DIVISIONS);
		}
		return divisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Definition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<Definition>(Definition.class, this, CorpusPackage.LEGAL_ACT__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annex> getAnnexes() {
		if (annexes == null) {
			annexes = new EObjectContainmentEList<Annex>(Annex.class, this, CorpusPackage.LEGAL_ACT__ANNEXES);
		}
		return annexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusPackage.LEGAL_ACT__RECITALS:
				return ((InternalEList<?>)getRecitals()).basicRemove(otherEnd, msgs);
			case CorpusPackage.LEGAL_ACT__DIVISIONS:
				return ((InternalEList<?>)getDivisions()).basicRemove(otherEnd, msgs);
			case CorpusPackage.LEGAL_ACT__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case CorpusPackage.LEGAL_ACT__ANNEXES:
				return ((InternalEList<?>)getAnnexes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusPackage.LEGAL_ACT__CONSOLIDATED_DATE:
				return getConsolidatedDate();
			case CorpusPackage.LEGAL_ACT__FORMEX_SCHEMA:
				return getFormexSchema();
			case CorpusPackage.LEGAL_ACT__CLOSING_FORMULA:
				return getClosingFormula();
			case CorpusPackage.LEGAL_ACT__CITATIONS:
				return getCitations();
			case CorpusPackage.LEGAL_ACT__RECITALS:
				return getRecitals();
			case CorpusPackage.LEGAL_ACT__DIVISIONS:
				return getDivisions();
			case CorpusPackage.LEGAL_ACT__DEFINITIONS:
				return getDefinitions();
			case CorpusPackage.LEGAL_ACT__ANNEXES:
				return getAnnexes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorpusPackage.LEGAL_ACT__CONSOLIDATED_DATE:
				setConsolidatedDate((String)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__FORMEX_SCHEMA:
				setFormexSchema((String)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__CLOSING_FORMULA:
				setClosingFormula((String)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__CITATIONS:
				getCitations().clear();
				getCitations().addAll((Collection<? extends String>)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__RECITALS:
				getRecitals().clear();
				getRecitals().addAll((Collection<? extends Recital>)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__DIVISIONS:
				getDivisions().clear();
				getDivisions().addAll((Collection<? extends Division>)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Definition>)newValue);
				return;
			case CorpusPackage.LEGAL_ACT__ANNEXES:
				getAnnexes().clear();
				getAnnexes().addAll((Collection<? extends Annex>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorpusPackage.LEGAL_ACT__CONSOLIDATED_DATE:
				setConsolidatedDate(CONSOLIDATED_DATE_EDEFAULT);
				return;
			case CorpusPackage.LEGAL_ACT__FORMEX_SCHEMA:
				setFormexSchema(FORMEX_SCHEMA_EDEFAULT);
				return;
			case CorpusPackage.LEGAL_ACT__CLOSING_FORMULA:
				setClosingFormula(CLOSING_FORMULA_EDEFAULT);
				return;
			case CorpusPackage.LEGAL_ACT__CITATIONS:
				getCitations().clear();
				return;
			case CorpusPackage.LEGAL_ACT__RECITALS:
				getRecitals().clear();
				return;
			case CorpusPackage.LEGAL_ACT__DIVISIONS:
				getDivisions().clear();
				return;
			case CorpusPackage.LEGAL_ACT__DEFINITIONS:
				getDefinitions().clear();
				return;
			case CorpusPackage.LEGAL_ACT__ANNEXES:
				getAnnexes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorpusPackage.LEGAL_ACT__CONSOLIDATED_DATE:
				return CONSOLIDATED_DATE_EDEFAULT == null ? consolidatedDate != null : !CONSOLIDATED_DATE_EDEFAULT.equals(consolidatedDate);
			case CorpusPackage.LEGAL_ACT__FORMEX_SCHEMA:
				return FORMEX_SCHEMA_EDEFAULT == null ? formexSchema != null : !FORMEX_SCHEMA_EDEFAULT.equals(formexSchema);
			case CorpusPackage.LEGAL_ACT__CLOSING_FORMULA:
				return CLOSING_FORMULA_EDEFAULT == null ? closingFormula != null : !CLOSING_FORMULA_EDEFAULT.equals(closingFormula);
			case CorpusPackage.LEGAL_ACT__CITATIONS:
				return citations != null && !citations.isEmpty();
			case CorpusPackage.LEGAL_ACT__RECITALS:
				return recitals != null && !recitals.isEmpty();
			case CorpusPackage.LEGAL_ACT__DIVISIONS:
				return divisions != null && !divisions.isEmpty();
			case CorpusPackage.LEGAL_ACT__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case CorpusPackage.LEGAL_ACT__ANNEXES:
				return annexes != null && !annexes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (consolidatedDate: ");
		result.append(consolidatedDate);
		result.append(", formexSchema: ");
		result.append(formexSchema);
		result.append(", closingFormula: ");
		result.append(closingFormula);
		result.append(", citations: ");
		result.append(citations);
		result.append(')');
		return result.toString();
	}

} //LegalActImpl
