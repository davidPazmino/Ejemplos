package com.fisa.soap.services.impl;

import com.fisa.soap.services.SOAPWebService;
import com.fisa.soap.services.model.RequestSOAP;
import com.fisa.soap.services.model.ResponseSOAP;

import javax.jws.WebService;

/**
 * @author advance
 */
@WebService(endpointInterface = "com.fisa.soap.services.SOAPWebService", serviceName = "SOAPWeb")
public class SOAPWebServiceImpl implements SOAPWebService {

    public ResponseSOAP sumar(RequestSOAP request) {
        ResponseSOAP response = new ResponseSOAP();
        response.setMessage("OK");
        response.setResponse(request.getNum1() + request.getNum2());
        return response;
    }
}
