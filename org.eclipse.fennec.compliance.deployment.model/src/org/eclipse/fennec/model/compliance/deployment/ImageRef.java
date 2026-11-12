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
package org.eclipse.fennec.model.compliance.deployment;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container image as declared. The digest is what identifies the content; a tag alone can move.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getRegistry <em>Registry</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getPullPolicy <em>Pull Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#isFloating <em>Floating</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#isBuiltLocally <em>Built Locally</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef()
 * @model
 * @generated
 */
@ProviderType
public interface ImageRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry</em>' attribute.
	 * @see #setRegistry(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_Registry()
	 * @model
	 * @generated
	 */
	String getRegistry();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getRegistry <em>Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' attribute.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_Repository()
	 * @model required="true"
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content digest, e.g. sha256:..., when the declaration pins one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digest</em>' attribute.
	 * @see #setDigest(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_Digest()
	 * @model
	 * @generated
	 */
	String getDigest();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getDigest <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest</em>' attribute.
	 * @see #getDigest()
	 * @generated
	 */
	void setDigest(String value);

	/**
	 * Returns the value of the '<em><b>Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pull policy as declared, e.g. newer, always, missing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pull Policy</em>' attribute.
	 * @see #setPullPolicy(String)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_PullPolicy()
	 * @model
	 * @generated
	 */
	String getPullPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#getPullPolicy <em>Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull Policy</em>' attribute.
	 * @see #getPullPolicy()
	 * @generated
	 */
	void setPullPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when the content can change without a change of the declaration: no digest, and a missing, moving or major-only tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floating</em>' attribute.
	 * @see #setFloating(boolean)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_Floating()
	 * @model
	 * @generated
	 */
	boolean isFloating();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#isFloating <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating</em>' attribute.
	 * @see #isFloating()
	 * @generated
	 */
	void setFloating(boolean value);

	/**
	 * Returns the value of the '<em><b>Built Locally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when the image is built on the host and has no registry to compare with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Built Locally</em>' attribute.
	 * @see #setBuiltLocally(boolean)
	 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getImageRef_BuiltLocally()
	 * @model
	 * @generated
	 */
	boolean isBuiltLocally();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.deployment.ImageRef#isBuiltLocally <em>Built Locally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built Locally</em>' attribute.
	 * @see #isBuiltLocally()
	 * @generated
	 */
	void setBuiltLocally(boolean value);

} // ImageRef
