
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://webService.ayyoub.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://webService.ayyoub.net/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://webService.ayyoub.net/", className = "proxy.ListComptesResponse")
    @Action(input = "http://webService.ayyoub.net/BanqueService/listComptesRequest", output = "http://webService.ayyoub.net/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://webService.ayyoub.net/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://webService.ayyoub.net/", className = "proxy.GetCompteResponse")
    @Action(input = "http://webService.ayyoub.net/BanqueService/getCompteRequest", output = "http://webService.ayyoub.net/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDH")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDH", targetNamespace = "http://webService.ayyoub.net/", className = "proxy.ConversionEuroToDH")
    @ResponseWrapper(localName = "ConversionEuroToDHResponse", targetNamespace = "http://webService.ayyoub.net/", className = "proxy.ConversionEuroToDHResponse")
    @Action(input = "http://webService.ayyoub.net/BanqueService/ConversionEuroToDHRequest", output = "http://webService.ayyoub.net/BanqueService/ConversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
