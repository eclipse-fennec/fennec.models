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
package org.eclipse.fennec.atlas.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codec Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The rules for turning a payload into EObjects with the EMF codec: format, type map, root type per source and name handling. The consuming runtime translates them into the codec's load options.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getTypeMapId <em>Type Map Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#isUseNamesFromExtendedMetadata <em>Use Names From Extended Metadata</em>}</li>
 *   <li>{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getRootTypes <em>Root Types</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getCodecConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface CodecConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.atlas.configuration.PayloadFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The serialization format of the payloads. Unset = the input derives it per payload (e.g. from the file extension or the content type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.fennec.atlas.configuration.PayloadFormat
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(PayloadFormat)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getCodecConfiguration_Format()
	 * @model unsettable="true"
	 * @generated
	 */
	PayloadFormat getFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.fennec.atlas.configuration.PayloadFormat
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(PayloadFormat value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(PayloadFormat)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(PayloadFormat)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Type Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codec's type-mapping registry id (codec load option codec.typeMapId). Formats that do not name their own model - JSON, unlike XMI - are typed by the codec's discriminator, which the models declare in eAnnotations with source http://eclipse.org/fennec/codec/typeMapping/<typeMapId>. Unset = the codec's defaults, so untyped JSON yields no objects unless a root type applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Map Id</em>' attribute.
	 * @see #setTypeMapId(String)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getCodecConfiguration_TypeMapId()
	 * @model
	 * @generated
	 */
	String getTypeMapId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#getTypeMapId <em>Type Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Map Id</em>' attribute.
	 * @see #getTypeMapId()
	 * @generated
	 */
	void setTypeMapId(String value);

	/**
	 * Returns the value of the '<em><b>Use Names From Extended Metadata</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the codec reads property names from the models' ExtendedMetaData annotations (codec load option codec.useNamesFromExtendedMetadata) instead of the feature names. Default true: models generated from external payloads record the original names there.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Names From Extended Metadata</em>' attribute.
	 * @see #setUseNamesFromExtendedMetadata(boolean)
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getCodecConfiguration_UseNamesFromExtendedMetadata()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseNamesFromExtendedMetadata();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.atlas.configuration.CodecConfiguration#isUseNamesFromExtendedMetadata <em>Use Names From Extended Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Names From Extended Metadata</em>' attribute.
	 * @see #isUseNamesFromExtendedMetadata()
	 * @generated
	 */
	void setUseNamesFromExtendedMetadata(boolean value);

	/**
	 * Returns the value of the '<em><b>Root Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.atlas.configuration.RootTypeRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root type to read payloads as, per source. The first rule whose sourcePattern matches the payload's source wins; without a match the codec resolves the type itself (discriminator, or the type the payload names).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Types</em>' containment reference list.
	 * @see org.eclipse.fennec.atlas.configuration.AtlasConfigPackage#getCodecConfiguration_RootTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RootTypeRule> getRootTypes();

} // CodecConfiguration
