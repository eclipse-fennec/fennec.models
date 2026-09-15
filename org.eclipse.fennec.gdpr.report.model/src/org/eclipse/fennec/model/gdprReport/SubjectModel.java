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
package org.eclipse.fennec.model.gdprReport;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identity of the reviewed metamodel, precise enough to tell whether a later version is still the same model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getModelFingerprint <em>Model Fingerprint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubjectModel()
 * @model
 * @generated
 */
@ProviderType
public interface SubjectModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reviewed EPackage's name attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubjectModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required. The reviewed EPackage's nsURI, copied verbatim. This is the primary identity of what was reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubjectModel_NsURI()
	 * @model required="true"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reviewed EPackage's nsPrefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubjectModel_NsPrefix()
	 * @model
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Model Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required. Hex digest identifying this exact revision of the model, so a later run can tell whether the model really changed. Compute it; never invent or copy one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Fingerprint</em>' attribute.
	 * @see #setModelFingerprint(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getSubjectModel_ModelFingerprint()
	 * @model required="true"
	 * @generated
	 */
	String getModelFingerprint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.SubjectModel#getModelFingerprint <em>Model Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Fingerprint</em>' attribute.
	 * @see #getModelFingerprint()
	 * @generated
	 */
	void setModelFingerprint(String value);

} // SubjectModel
