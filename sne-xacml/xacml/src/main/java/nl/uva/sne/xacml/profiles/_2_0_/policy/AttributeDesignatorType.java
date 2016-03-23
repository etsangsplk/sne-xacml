/*
 * *
 *  * Copyright (C) 2016 Canh Ngo <canhnt@gmail.com>
 *  * All rights reserved.
 *  *
 *  * This library is free software; you can redistribute it and/or
 *  * modify it under the terms of the GNU Lesser General Public
 *  * License as published by the Free Software Foundation; either
 *  * version 3.0 of the License, or any later version.
 *  *
 *  * This library is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  * Lesser General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU Lesser General Public
 *  * License along with this library; if not, write to the Free Software
 *  * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *  * MA 02110-1301 USA
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.01 at 04:14:23 PM CEST 
//


package nl.uva.sne.xacml.profiles._2_0_.policy;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AttributeDesignatorType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AttributeDesignatorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}ExpressionType">
 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MustBePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeDesignatorType")
@XmlSeeAlso({
        SubjectAttributeDesignatorType.class
})
public class AttributeDesignatorType
        extends ExpressionType {

    @XmlAttribute(name = "AttributeId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String attributeId;
    @XmlAttribute(name = "DataType", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dataType;
    @XmlAttribute(name = "Issuer")
    protected String issuer;
    @XmlAttribute(name = "MustBePresent")
    protected Boolean mustBePresent;

    /**
     * Gets the value of the attributeId property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Gets the value of the dataType property.
     *
     * @return possible object is {@link String }
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Gets the value of the issuer property.
     *
     * @return possible object is {@link String }
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Gets the value of the mustBePresent property.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean isMustBePresent() {
        if (mustBePresent == null) {
            return false;
        } else {
            return mustBePresent;
        }
    }

    /**
     * Sets the value of the attributeId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeId(String value) {
        this.attributeId = value;
    }

    /**
     * Sets the value of the dataType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Sets the value of the issuer property.
     *
     * @param value allowed object is {@link String }
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Sets the value of the mustBePresent property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMustBePresent(Boolean value) {
        this.mustBePresent = value;
    }

}