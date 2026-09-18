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
package org.eclipse.fennec.model.gdprReportHistory;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One field that differs between a revision and the one before it. Emitted only for fields that actually differ, so an empty sheet means nothing changed rather than nothing was compared.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedAt <em>Changed At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedBy <em>Changed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getClassifierId <em>Classifier Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangeKind <em>Change Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow()
 * @model
 * @generated
 */
@ProviderType
public interface ChangeRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revision that introduced the change, never the one it is measured against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(int)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_RevisionNumber()
	 * @model required="true"
	 * @generated
	 */
	int getRevisionNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Changed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the introducing revision was generated. Denormalised onto the row so the sheet reads without joining.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changed At</em>' attribute.
	 * @see #setChangedAt(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_ChangedAt()
	 * @model
	 * @generated
	 */
	String getChangedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedAt <em>Changed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed At</em>' attribute.
	 * @see #getChangedAt()
	 * @generated
	 */
	void setChangedAt(String value);

	/**
	 * Returns the value of the '<em><b>Changed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who made the change - the agent identity for a review, the user for a correction. The accountability column.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changed By</em>' attribute.
	 * @see #setChangedBy(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_ChangedBy()
	 * @model
	 * @generated
	 */
	String getChangedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangedBy <em>Changed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed By</em>' attribute.
	 * @see #getChangedBy()
	 * @generated
	 */
	void setChangedBy(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifier the change is about. Joins to EvaluationRow.classifierId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Id</em>' attribute.
	 * @see #setClassifierId(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_ClassifierId()
	 * @model required="true"
	 * @generated
	 */
	String getClassifierId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getClassifierId <em>Classifier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Id</em>' attribute.
	 * @see #getClassifierId()
	 * @generated
	 */
	void setClassifierId(String value);

	/**
	 * Returns the value of the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature the change is about, empty for a classifier-level change. Joins to EvaluationRow.featureId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Id</em>' attribute.
	 * @see #setFeatureId(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_FeatureId()
	 * @model
	 * @generated
	 */
	String getFeatureId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getFeatureId <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Id</em>' attribute.
	 * @see #getFeatureId()
	 * @generated
	 */
	void setFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which field differs: category, relevanceLevel, confidence, rationale, recommendation or evidence. Empty when the whole evaluation was added or removed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_Field()
	 * @model
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Change Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReportHistory.ChangeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the evaluation appeared, disappeared or was modified. UNCHANGED never occurs on a change row.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
	 * @see #setChangeKind(ChangeKind)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_ChangeKind()
	 * @model required="true"
	 * @generated
	 */
	ChangeKind getChangeKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getChangeKind <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReportHistory.ChangeKind
	 * @see #getChangeKind()
	 * @generated
	 */
	void setChangeKind(ChangeKind value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value in the preceding revision, empty on ADDED.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_OldValue()
	 * @model
	 * @generated
	 */
	String getOldValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(String value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value in this revision, empty on REMOVED.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeRow_NewValue()
	 * @model
	 * @generated
	 */
	String getNewValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(String value);

} // ChangeRow
