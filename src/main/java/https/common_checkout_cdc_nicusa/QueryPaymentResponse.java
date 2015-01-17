
package https.common_checkout_cdc_nicusa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.common_payment.PaymentResult;


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
 *         &lt;element name="QueryPaymentResult" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}PaymentResult" minOccurs="0"/>
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
    "queryPaymentResult"
})
@XmlRootElement(name = "QueryPaymentResponse")
public class QueryPaymentResponse {

    @XmlElementRef(name = "QueryPaymentResult", namespace = "https://common.checkout.cdc.nicusa.com", type = JAXBElement.class)
    protected JAXBElement<PaymentResult> queryPaymentResult;

    /**
     * Gets the value of the queryPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentResult }{@code >}
     *     
     */
    public JAXBElement<PaymentResult> getQueryPaymentResult() {
        return queryPaymentResult;
    }

    /**
     * Sets the value of the queryPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentResult }{@code >}
     *     
     */
    public void setQueryPaymentResult(JAXBElement<PaymentResult> value) {
        this.queryPaymentResult = ((JAXBElement<PaymentResult> ) value);
    }

}
