package com.fisa.soap.services.model;

import javax.xml.bind.annotation.*;

/**
 * @author advance
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "message", "response" })
@XmlRootElement(name = "responseSOAP")
public class ResponseSOAP {

	@XmlElement(name = "message", required = true)
	private String message;

	@XmlElement(name = "response", required = true)
	private int response;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getResponse() {
		return response;
	}

	public void setResponse(int response) {
		this.response = response;
	}
}