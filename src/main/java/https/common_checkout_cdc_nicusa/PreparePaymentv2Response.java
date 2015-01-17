
package https.common_checkout_cdc_nicusa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.common_payment.PreparePaymentv2Result;


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
 *         &lt;element name="PreparePaymentv2Result" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}PreparePaymentv2Result" minOccurs="0"/>
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
    "preparePaymentv2Result"
})
@XmlRootElement(name = "PreparePaymentv2Response")
public class PreparePaymentv2Response {

    @XmlElementRef(name = "PreparePaymentv2Result", namespace = "https://common.checkout.cdc.nicusa.com", type = JAXBElement.class)
    protected JAXBElement<PreparePaymentv2Result> preparePaymentv2Result;

    /**
     * Gets the value of the preparePaymentv2Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PreparePaymentv2Result }{@code >}
     *     
     */
    public JAXBElement<PreparePaymentv2Result> getPreparePaymentv2Result() {
        return preparePaymentv2Result;
    }

    /**
     * Sets the value of the preparePaymentv2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PreparePaymentv2Result }{@code >}
     *     
     */
    public void setPreparePaymentv2Result(JAXBElement<PreparePaymentv2Result> value) {
        this.preparePaymentv2Result = ((JAXBElement<PreparePaymentv2Result> ) value);
    }

}
