
package org.datacontract.schemas._2004._07.common_payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInfov2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfov2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HASHVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVICECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNIQUETRANSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCALREFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MERCHANTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MERCHANTKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPANYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HREFSUCCESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HREFFAILURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HREFDUPLICATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HREFCANCEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDERATTRIBUTES" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}ArrayOfFIELD" minOccurs="0"/>
 *         &lt;element name="LINEITEMS" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}ArrayOfLINEITEM" minOccurs="0"/>
 *         &lt;element name="ALTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALTADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALTADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALTCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALTSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALTZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALTCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfov2", propOrder = {
    "statecd",
    "hashvalue",
    "amount",
    "cid",
    "servicecode",
    "uniquetransid",
    "description",
    "localrefid",
    "merchantid",
    "merchantkey",
    "paytype",
    "name",
    "companyname",
    "country",
    "fax",
    "address1",
    "address2",
    "city",
    "state",
    "zip",
    "phone",
    "email",
    "email1",
    "email2",
    "email3",
    "hrefsuccess",
    "hreffailure",
    "hrefduplicate",
    "hrefcancel",
    "orderattributes",
    "lineitems",
    "altname",
    "altaddress1",
    "altaddress2",
    "altcity",
    "altstate",
    "altzip",
    "altcountry"
})
public class PaymentInfov2 {

    @XmlElementRef(name = "STATECD", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> statecd;
    @XmlElementRef(name = "HASHVALUE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> hashvalue;
    @XmlElementRef(name = "AMOUNT", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "CID", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> cid;
    @XmlElementRef(name = "SERVICECODE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> servicecode;
    @XmlElementRef(name = "UNIQUETRANSID", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> uniquetransid;
    @XmlElementRef(name = "DESCRIPTION", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "LOCALREFID", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> localrefid;
    @XmlElementRef(name = "MERCHANTID", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> merchantid;
    @XmlElementRef(name = "MERCHANTKEY", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> merchantkey;
    @XmlElementRef(name = "PAYTYPE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> paytype;
    @XmlElementRef(name = "NAME", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "COMPANYNAME", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> companyname;
    @XmlElementRef(name = "COUNTRY", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> country;
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
    @XmlElementRef(name = "PHONE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "EMAIL", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EMAIL1", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email1;
    @XmlElementRef(name = "EMAIL2", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email2;
    @XmlElementRef(name = "EMAIL3", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> email3;
    @XmlElementRef(name = "HREFSUCCESS", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> hrefsuccess;
    @XmlElementRef(name = "HREFFAILURE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> hreffailure;
    @XmlElementRef(name = "HREFDUPLICATE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> hrefduplicate;
    @XmlElementRef(name = "HREFCANCEL", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> hrefcancel;
    @XmlElementRef(name = "ORDERATTRIBUTES", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFIELD> orderattributes;
    @XmlElementRef(name = "LINEITEMS", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLINEITEM> lineitems;
    @XmlElementRef(name = "ALTNAME", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altname;
    @XmlElementRef(name = "ALTADDRESS1", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altaddress1;
    @XmlElementRef(name = "ALTADDRESS2", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altaddress2;
    @XmlElementRef(name = "ALTCITY", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altcity;
    @XmlElementRef(name = "ALTSTATE", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altstate;
    @XmlElementRef(name = "ALTZIP", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altzip;
    @XmlElementRef(name = "ALTCOUNTRY", namespace = "http://schemas.datacontract.org/2004/07/Common.Payment.Common", type = JAXBElement.class)
    protected JAXBElement<String> altcountry;

    /**
     * Gets the value of the statecd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATECD() {
        return statecd;
    }

    /**
     * Sets the value of the statecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATECD(JAXBElement<String> value) {
        this.statecd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hashvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHASHVALUE() {
        return hashvalue;
    }

    /**
     * Sets the value of the hashvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHASHVALUE(JAXBElement<String> value) {
        this.hashvalue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAMOUNT(JAXBElement<String> value) {
        this.amount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCID() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCID(JAXBElement<String> value) {
        this.cid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the servicecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERVICECODE() {
        return servicecode;
    }

    /**
     * Sets the value of the servicecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERVICECODE(JAXBElement<String> value) {
        this.servicecode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the uniquetransid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUNIQUETRANSID() {
        return uniquetransid;
    }

    /**
     * Sets the value of the uniquetransid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUNIQUETRANSID(JAXBElement<String> value) {
        this.uniquetransid = ((JAXBElement<String> ) value);
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
     * Gets the value of the merchantid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMERCHANTID() {
        return merchantid;
    }

    /**
     * Sets the value of the merchantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMERCHANTID(JAXBElement<String> value) {
        this.merchantid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the merchantkey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMERCHANTKEY() {
        return merchantkey;
    }

    /**
     * Sets the value of the merchantkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMERCHANTKEY(JAXBElement<String> value) {
        this.merchantkey = ((JAXBElement<String> ) value);
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
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMPANYNAME() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMPANYNAME(JAXBElement<String> value) {
        this.companyname = ((JAXBElement<String> ) value);
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
     * Gets the value of the hrefsuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHREFSUCCESS() {
        return hrefsuccess;
    }

    /**
     * Sets the value of the hrefsuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHREFSUCCESS(JAXBElement<String> value) {
        this.hrefsuccess = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hreffailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHREFFAILURE() {
        return hreffailure;
    }

    /**
     * Sets the value of the hreffailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHREFFAILURE(JAXBElement<String> value) {
        this.hreffailure = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrefduplicate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHREFDUPLICATE() {
        return hrefduplicate;
    }

    /**
     * Sets the value of the hrefduplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHREFDUPLICATE(JAXBElement<String> value) {
        this.hrefduplicate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrefcancel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHREFCANCEL() {
        return hrefcancel;
    }

    /**
     * Sets the value of the hrefcancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHREFCANCEL(JAXBElement<String> value) {
        this.hrefcancel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderattributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFIELD }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFIELD> getORDERATTRIBUTES() {
        return orderattributes;
    }

    /**
     * Sets the value of the orderattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFIELD }{@code >}
     *     
     */
    public void setORDERATTRIBUTES(JAXBElement<ArrayOfFIELD> value) {
        this.orderattributes = ((JAXBElement<ArrayOfFIELD> ) value);
    }

    /**
     * Gets the value of the lineitems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLINEITEM }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLINEITEM> getLINEITEMS() {
        return lineitems;
    }

    /**
     * Sets the value of the lineitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLINEITEM }{@code >}
     *     
     */
    public void setLINEITEMS(JAXBElement<ArrayOfLINEITEM> value) {
        this.lineitems = ((JAXBElement<ArrayOfLINEITEM> ) value);
    }

    /**
     * Gets the value of the altname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTNAME() {
        return altname;
    }

    /**
     * Sets the value of the altname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTNAME(JAXBElement<String> value) {
        this.altname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altaddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTADDRESS1() {
        return altaddress1;
    }

    /**
     * Sets the value of the altaddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTADDRESS1(JAXBElement<String> value) {
        this.altaddress1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altaddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTADDRESS2() {
        return altaddress2;
    }

    /**
     * Sets the value of the altaddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTADDRESS2(JAXBElement<String> value) {
        this.altaddress2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altcity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTCITY() {
        return altcity;
    }

    /**
     * Sets the value of the altcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTCITY(JAXBElement<String> value) {
        this.altcity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altstate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTSTATE() {
        return altstate;
    }

    /**
     * Sets the value of the altstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTSTATE(JAXBElement<String> value) {
        this.altstate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altzip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTZIP() {
        return altzip;
    }

    /**
     * Sets the value of the altzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTZIP(JAXBElement<String> value) {
        this.altzip = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the altcountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTCOUNTRY() {
        return altcountry;
    }

    /**
     * Sets the value of the altcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTCOUNTRY(JAXBElement<String> value) {
        this.altcountry = ((JAXBElement<String> ) value);
    }

}
