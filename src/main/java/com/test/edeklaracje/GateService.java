package com.test.edeklaracje;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2024-12-15T17:38:46.159+01:00
 * Generated source version: 4.0.0
 *
 */
@WebServiceClient(name = "GateService",
                  wsdlLocation = "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl",
                  targetNamespace = "https://bramka.e-deklaracje.mf.gov.pl/")
public class GateService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://bramka.e-deklaracje.mf.gov.pl/", "GateService");
    public final static QName GateServiceSOAP11Port = new QName("https://bramka.e-deklaracje.mf.gov.pl/", "GateServiceSOAP11port");
    public final static QName GateServiceSOAP12Port = new QName("https://bramka.e-deklaracje.mf.gov.pl/", "GateServiceSOAP12port");
    static {
        URL url = null;
        try {
            url = new URL("https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GateService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://test-bramka.edeklaracje.gov.pl/uslugi/dokumenty?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GateService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GateService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GateService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GateService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns GateServicePortType
     */
    @WebEndpoint(name = "GateServiceSOAP11port")
    public GateServicePortType getGateServiceSOAP11Port() {
        return super.getPort(GateServiceSOAP11Port, GateServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GateServicePortType
     */
    @WebEndpoint(name = "GateServiceSOAP11port")
    public GateServicePortType getGateServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(GateServiceSOAP11Port, GateServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns GateServicePortType
     */
    @WebEndpoint(name = "GateServiceSOAP12port")
    public GateServicePortType getGateServiceSOAP12Port() {
        return super.getPort(GateServiceSOAP12Port, GateServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GateServicePortType
     */
    @WebEndpoint(name = "GateServiceSOAP12port")
    public GateServicePortType getGateServiceSOAP12Port(WebServiceFeature... features) {
        return super.getPort(GateServiceSOAP12Port, GateServicePortType.class, features);
    }

}
