package com.fisa.soap.services.model;

import javax.xml.bind.annotation.*;

/**
 * @author Advance Consulting
 */
@XmlType(name = "", propOrder = {
        "num1",
        "num2"
})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestSOAP")
public class RequestSOAP {

    @XmlElement(name = "num1", required = true)
    private int num1;

    @XmlElement(name = "num2", required = true)
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}