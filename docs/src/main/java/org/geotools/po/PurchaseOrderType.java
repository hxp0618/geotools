/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2019, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.04.10 at 05:20:23 PM EST
//

package org.geotools.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for PurchaseOrderType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PurchaseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipTo" type="{http://www.geotools.org/po}USAddress"/>
 *         &lt;element name="billTo" type="{http://www.geotools.org/po}USAddress"/>
 *         &lt;element ref="{http://www.geotools.org/po}comment" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.geotools.org/po}Items"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orderDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "PurchaseOrderType",
    propOrder = {"shipTo", "billTo", "comment", "items"}
)
public class PurchaseOrderType {

    @XmlElement(required = true)
    protected USAddress shipTo;

    @XmlElement(required = true)
    protected USAddress billTo;

    protected String comment;

    @XmlElement(required = true)
    protected Items items;

    @XmlAttribute(name = "orderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;

    /**
     * Gets the value of the shipTo property.
     *
     * @return possible object is {@link USAddress }
     */
    public USAddress getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     *
     * @param value allowed object is {@link USAddress }
     */
    public void setShipTo(USAddress value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the billTo property.
     *
     * @return possible object is {@link USAddress }
     */
    public USAddress getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     *
     * @param value allowed object is {@link USAddress }
     */
    public void setBillTo(USAddress value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return possible object is {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value allowed object is {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the items property.
     *
     * @return possible object is {@link Items }
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     *
     * @param value allowed object is {@link Items }
     */
    public void setItems(Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the orderDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }
}
