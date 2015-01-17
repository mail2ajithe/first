
package https.common_checkout_cdc_nicusa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.common_payment.PaymentInfo;
import org.datacontract.schemas._2004._07.common_payment.PaymentInfov2;
import org.datacontract.schemas._2004._07.common_payment.PaymentResult;
import org.datacontract.schemas._2004._07.common_payment.PreparePaymentResult;
import org.datacontract.schemas._2004._07.common_payment.PreparePaymentv2Result;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.common_checkout_cdc_nicusa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPaymentInfoResponseGetPaymentInfoResult_QNAME = new QName("https://common.checkout.cdc.nicusa.com", "GetPaymentInfoResult");
    private final static QName _GetPaymentInfoToken_QNAME = new QName("https://common.checkout.cdc.nicusa.com", "token");
    private final static QName _QueryPaymentResponseQueryPaymentResult_QNAME = new QName("https://common.checkout.cdc.nicusa.com", "QueryPaymentResult");
    private final static QName _PreparePaymentResponsePreparePaymentResult_QNAME = new QName("https://common.checkout.cdc.nicusa.com", "PreparePaymentResult");
    private final static QName _PreparePaymentRequest_QNAME = new QName("https://common.checkout.cdc.nicusa.com", "request");
    private final static QName _PreparePaymentv2ResponsePreparePaymentv2Result_QNAME = new QName("https://common.checkout.cdc.nicusa.com", "PreparePaymentv2Result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.common_checkout_cdc_nicusa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link https.common_checkout_cdc_nicusa.GetPaymentInfoResponse }
     * 
     */
    public https.common_checkout_cdc_nicusa.GetPaymentInfoResponse createGetPaymentInfoResponse() {
        return new https.common_checkout_cdc_nicusa.GetPaymentInfoResponse();
    }

    /**
     * Create an instance of {@link GetPaymentInfo }
     * 
     */
    public GetPaymentInfo createGetPaymentInfo() {
        return new GetPaymentInfo();
    }

    /**
     * Create an instance of {@link QueryPaymentResponse }
     * 
     */
    public QueryPaymentResponse createQueryPaymentResponse() {
        return new QueryPaymentResponse();
    }

    /**
     * Create an instance of {@link QueryPayment }
     * 
     */
    public QueryPayment createQueryPayment() {
        return new QueryPayment();
    }

    /**
     * Create an instance of {@link PreparePaymentResponse }
     * 
     */
    public PreparePaymentResponse createPreparePaymentResponse() {
        return new PreparePaymentResponse();
    }

    /**
     * Create an instance of {@link PreparePayment }
     * 
     */
    public PreparePayment createPreparePayment() {
        return new PreparePayment();
    }

    /**
     * Create an instance of {@link PreparePaymentv2Response }
     * 
     */
    public PreparePaymentv2Response createPreparePaymentv2Response() {
        return new PreparePaymentv2Response();
    }

    /**
     * Create an instance of {@link PreparePaymentv2 }
     * 
     */
    public PreparePaymentv2 createPreparePaymentv2() {
        return new PreparePaymentv2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "GetPaymentInfoResult", scope = https.common_checkout_cdc_nicusa.GetPaymentInfoResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse> createGetPaymentInfoResponseGetPaymentInfoResult(org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse>(_GetPaymentInfoResponseGetPaymentInfoResult_QNAME, org.datacontract.schemas._2004._07.common_payment.GetPaymentInfoResponse.class, https.common_checkout_cdc_nicusa.GetPaymentInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "token", scope = GetPaymentInfo.class)
    public JAXBElement<String> createGetPaymentInfoToken(String value) {
        return new JAXBElement<String>(_GetPaymentInfoToken_QNAME, String.class, GetPaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "QueryPaymentResult", scope = QueryPaymentResponse.class)
    public JAXBElement<PaymentResult> createQueryPaymentResponseQueryPaymentResult(PaymentResult value) {
        return new JAXBElement<PaymentResult>(_QueryPaymentResponseQueryPaymentResult_QNAME, PaymentResult.class, QueryPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "token", scope = QueryPayment.class)
    public JAXBElement<String> createQueryPaymentToken(String value) {
        return new JAXBElement<String>(_GetPaymentInfoToken_QNAME, String.class, QueryPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreparePaymentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "PreparePaymentResult", scope = PreparePaymentResponse.class)
    public JAXBElement<PreparePaymentResult> createPreparePaymentResponsePreparePaymentResult(PreparePaymentResult value) {
        return new JAXBElement<PreparePaymentResult>(_PreparePaymentResponsePreparePaymentResult_QNAME, PreparePaymentResult.class, PreparePaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "request", scope = PreparePayment.class)
    public JAXBElement<PaymentInfo> createPreparePaymentRequest(PaymentInfo value) {
        return new JAXBElement<PaymentInfo>(_PreparePaymentRequest_QNAME, PaymentInfo.class, PreparePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreparePaymentv2Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "PreparePaymentv2Result", scope = PreparePaymentv2Response.class)
    public JAXBElement<PreparePaymentv2Result> createPreparePaymentv2ResponsePreparePaymentv2Result(PreparePaymentv2Result value) {
        return new JAXBElement<PreparePaymentv2Result>(_PreparePaymentv2ResponsePreparePaymentv2Result_QNAME, PreparePaymentv2Result.class, PreparePaymentv2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfov2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://common.checkout.cdc.nicusa.com", name = "request", scope = PreparePaymentv2 .class)
    public JAXBElement<PaymentInfov2> createPreparePaymentv2Request(PaymentInfov2 value) {
        return new JAXBElement<PaymentInfov2>(_PreparePaymentRequest_QNAME, PaymentInfov2 .class, PreparePaymentv2 .class, value);
    }

}
