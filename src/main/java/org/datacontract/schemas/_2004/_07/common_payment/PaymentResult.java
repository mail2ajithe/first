
package org.datacontract.schemas._2004._07.common_payment;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST4NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTALAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIPTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIPTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDERID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AUTHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAILMESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCALREFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVVResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAILCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResult", propOrder = {
    "name",
    "phone",
    "fax",
    "address1",
    "address2",
    "city",
    "state",
    "zip",
    "country",
    "email",
    "email1",
    "email2",
    "email3",
    "last4NUMBER",
    "totalamount",
    "receiptdate",
    "receipttime",
    "orderid",
    "authcode",
    "failmessage",
    "localrefid",
    "paytype",
    "expirationDate",
    "creditCardType",
    "billingName",
    "avsResponse",
    "cvvResponse",
    "failcode"
})
public class PaymentResult {

    @XmlElementRef(name = "NAME", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PHONE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "FAX", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "ADDRESS1", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> address1;
    @XmlElementRef(name = "ADDRESS2", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> address2;
    @XmlElementRef(name = "CITY", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "STATE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "ZIP", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> zip;
    @XmlElementRef(name = "COUNTRY", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "EMAIL", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EMAIL1", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email1;
    @XmlElementRef(name = "EMAIL2", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email2;
    @XmlElementRef(name = "EMAIL3", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email3;
    @XmlElementRef(name = "LAST4NUMBER", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> last4NUMBER;
    @XmlElementRef(name = "TOTALAMOUNT", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> totalamount;
    @XmlElementRef(name = "RECEIPTDATE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> receiptdate;
    @XmlElementRef(name = "RECEIPTTIME", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> receipttime;
    @XmlElement(name = "ORDERID")
    protected BigDecimal orderid;
    @XmlElementRef(name = "AUTHCODE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> authcode;
    @XmlElementRef(name = "FAILMESSAGE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> failmessage;
    @XmlElementRef(name = "LOCALREFID", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> localrefid;
    @XmlElementRef(name = "PAYTYPE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> paytype;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElementRef(name = "CreditCardType", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> creditCardType;
    @XmlElementRef(name = "BillingName", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> billingName;
    @XmlElementRef(name = "AVSResponse", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> avsResponse;
    @XmlElementRef(name = "CVVResponse", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> cvvResponse;
    @XmlElementRef(name = "FAILCODE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> failcode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAME(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPHONE(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAX(JAXBElement<String> value) {
        this.fax = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRESS1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRESS1(JAXBElement<String> value) {
        this.address1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRESS2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRESS2(JAXBElement<String> value) {
        this.address2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCITY(JAXBElement<String> value) {
        this.city = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATE(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZIP(JAXBElement<String> value) {
        this.zip = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOUNTRY(JAXBElement<String> value) {
        this.country = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAIL(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAIL1() {
        return email1;
    }

    /**
     * Sets the value of the email1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAIL1(JAXBElement<String> value) {
        this.email1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAIL2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAIL2(JAXBElement<String> value) {
        this.email2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAIL3() {
        return email3;
    }

    /**
     * Sets the value of the email3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAIL3(JAXBElement<String> value) {
        this.email3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the last4NUMBER property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLAST4NUMBER() {
        return last4NUMBER;
    }

    /**
     * Sets the value of the last4NUMBER property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLAST4NUMBER(JAXBElement<String> value) {
        this.last4NUMBER = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTALAMOUNT(JAXBElement<String> value) {
        this.totalamount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receiptdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRECEIPTDATE() {
        return receiptdate;
    }

    /**
     * Sets the value of the receiptdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRECEIPTDATE(JAXBElement<String> value) {
        this.receiptdate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receipttime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRECEIPTTIME() {
        return receipttime;
    }

    /**
     * Sets the value of the receipttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRECEIPTTIME(JAXBElement<String> value) {
        this.receipttime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getORDERID() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setORDERID(BigDecimal value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the authcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUTHCODE() {
        return authcode;
    }

    /**
     * Sets the value of the authcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUTHCODE(JAXBElement<String> value) {
        this.authcode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failmessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAILMESSAGE() {
        return failmessage;
    }

    /**
     * Sets the value of the failmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAILMESSAGE(JAXBElement<String> value) {
        this.failmessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the localrefid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLOCALREFID() {
        return localrefid;
    }

    /**
     * Sets the value of the localrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLOCALREFID(JAXBElement<String> value) {
        this.localrefid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paytype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYTYPE() {
        return paytype;
    }

    /**
     * Sets the value of the paytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYTYPE(JAXBElement<String> value) {
        this.paytype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardType(JAXBElement<String> value) {
        this.creditCardType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the billingName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingName() {
        return billingName;
    }

    /**
     * Sets the value of the billingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingName(JAXBElement<String> value) {
        this.billingName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the avsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAVSResponse() {
        return avsResponse;
    }

    /**
     * Sets the value of the avsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAVSResponse(JAXBElement<String> value) {
        this.avsResponse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cvvResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVVResponse() {
        return cvvResponse;
    }

    /**
     * Sets the value of the cvvResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVVResponse(JAXBElement<String> value) {
        this.cvvResponse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAILCODE() {
        return failcode;
    }

    /**
     * Sets the value of the failcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAILCODE(JAXBElement<String> value) {
        this.failcode = ((JAXBElement<String> ) value);
    }

}
