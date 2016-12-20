package com.fisa.soap.services;

import com.fisa.soap.services.model.RequestSOAP;
import com.fisa.soap.services.model.ResponseSOAP;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * @author advance
 *
 */

@WebService(name = "SOAPWeb", targetNamespace = "http://com.fisa.soap.web/")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SOAPWebService {
	
	/**
	 * Ejecuta la notificación 
	 * @param request
	 * @return
	 */
	@WebResult(name = "responseSOAP", targetNamespace = "http://com.fisa.soap.web/", partName = "parameters")
    @WebMethod(operationName="sumar", action = "http://com.fisa.soap.web/sumar")
	public ResponseSOAP sumar(
			@WebParam(partName = "parameters", name = "requestSOAP", targetNamespace = "http://com.fisa.soap.web/")
			RequestSOAP request
	);

}
