
package https.common_checkout_cdc_nicusa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ServiceWeb", targetNamespace = "https://common.checkout.cdc.nicusa.com", wsdlLocation = "https://stageccp.dev.cdc.nicusa.com/CommonCheckout/CCPWebService/ServiceWeb.wsdl")
public class ServiceWeb
    extends Service
{

    private final static URL SERVICEWEB_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(https.common_checkout_cdc_nicusa.ServiceWeb.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = https.common_checkout_cdc_nicusa.ServiceWeb.class.getResource(".");
            url = new URL(baseUrl, "https://stageccp.dev.cdc.nicusa.com/CommonCheckout/CCPWebService/ServiceWeb.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://stageccp.dev.cdc.nicusa.com/CommonCheckout/CCPWebService/ServiceWeb.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SERVICEWEB_WSDL_LOCATION = url;
    }

    public ServiceWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceWeb() {
        super(SERVICEWEB_WSDL_LOCATION, new QName("https://common.checkout.cdc.nicusa.com", "ServiceWeb"));
    }

    /**
     * 
     * @return
     *     returns IServiceWeb
     */
    @WebEndpoint(name = "BasicHttpBinding_IServiceWeb")
    public IServiceWeb getBasicHttpBindingIServiceWeb() {
        return super.getPort(new QName("https://common.checkout.cdc.nicusa.com", "BasicHttpBinding_IServiceWeb"), IServiceWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceWeb
     */
    @WebEndpoint(name = "BasicHttpBinding_IServiceWeb")
    public IServiceWeb getBasicHttpBindingIServiceWeb(WebServiceFeature... features) {
        return super.getPort(new QName("https://common.checkout.cdc.nicusa.com", "BasicHttpBinding_IServiceWeb"), IServiceWeb.class, features);
    }

}
