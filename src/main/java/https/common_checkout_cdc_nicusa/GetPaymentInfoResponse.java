
package https.common_checkout_cdc_nicusa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPaymentInfoResult" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}GetPaymentInfoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPaymentInfoResult"
})
@XmlRootElement(name = "GetPaymentInfoResponse")
public class GetPaymentInfoResponse {

    @XmlElementRef(name = "GetPaymentInfoResult", namespace = "https://common.checkout.cdc.nicusa.com", type = JAXBElement.class)
    protected JAXBElement<org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse> getPaymentInfoResult;

    /**
     * Gets the value of the getPaymentInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse> getGetPaymentInfoResult() {
        return getPaymentInfoResult;
    }

    /**
     * Sets the value of the getPaymentInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse }{@code >}
     *     
     */
    public void setGetPaymentInfoResult(JAXBElement<org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse> value) {
        this.getPaymentInfoResult = ((JAXBElement<org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse> ) value);
    }

}
