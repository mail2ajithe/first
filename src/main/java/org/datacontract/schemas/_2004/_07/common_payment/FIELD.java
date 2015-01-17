
package org.datacontract.schemas._2004._07.common_payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIELD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIELDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIELD", propOrder = {
    "fieldname",
    "fieldvalue"
})
public class FIELD {

    @XmlElementRef(name = "FIELDNAME", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> fieldname;
    @XmlElementRef(name = "FIELDVALUE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> fieldvalue;

    /**
     * Gets the value of the fieldname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFIELDNAME() {
        return fieldname;
    }

    /**
     * Sets the value of the fieldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFIELDNAME(JAXBElement<String> value) {
        this.fieldname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fieldvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFIELDVALUE() {
        return fieldvalue;
    }

    /**
     * Sets the value of the fieldvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFIELDVALUE(JAXBElement<String> value) {
        this.fieldvalue = ((JAXBElement<String> ) value);
    }

}
