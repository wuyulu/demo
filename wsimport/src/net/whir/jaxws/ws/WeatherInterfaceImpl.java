
package net.whir.jaxws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherInterfaceImpl", targetNamespace = "http://ws.jaxws.whir.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://ws.jaxws.whir.net/", className = "net.whir.jaxws.ws.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://ws.jaxws.whir.net/", className = "net.whir.jaxws.ws.QueryWeatherResponse")
    @Action(input = "http://ws.jaxws.whir.net/WeatherInterfaceImpl/queryWeatherRequest", output = "http://ws.jaxws.whir.net/WeatherInterfaceImpl/queryWeatherResponse")
    public String queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
