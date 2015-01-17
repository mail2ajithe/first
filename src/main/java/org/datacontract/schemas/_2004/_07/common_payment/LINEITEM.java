
package org.datacontract.schemas._2004._07.common_payment;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNIT_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTES" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}ArrayOfFIELD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEITEM", propOrder = {
    "itemid",
    "sku",
    "description",
    "unitprice",
    "quantity",
    "attributes"
})
public class LINEITEM {

    @XmlElement(name = "ITEM_ID")
    protected Integer itemid;
    @XmlElementRef(name = "SKU", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> sku;
    @XmlElementRef(name = "DESCRIPTION", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "UNIT_PRICE")
    protected BigDecimal unitprice;
    @XmlElement(name = "QUANTITY")
    protected BigDecimal quantity;
    @XmlElementRef(name = "ATTRIBUTES", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFIELD> attributes;

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setITEMID(Integer value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKU(JAXBElement<String> value) {
        this.sku = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIPTION(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unitprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUNITPRICE() {
        return unitprice;
    }

    /**
     * Sets the value of the unitprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUNITPRICE(BigDecimal value) {
        this.unitprice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQUANTITY() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQUANTITY(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFIELD }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFIELD> getATTRIBUTES() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFIELD }{@code >}
     *     
     */
    public void setATTRIBUTES(JAXBElement<ArrayOfFIELD> value) {
        this.attributes = ((JAXBElement<ArrayOfFIELD> ) value);
    }

}
