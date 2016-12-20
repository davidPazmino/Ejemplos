package com.fisa.soap.services;


import com.fisa.soap.services.model.RequestSOAP;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author David Pazmino
 * @version 1.0
 * @since <pre>12/8/15</pre>
 */
public class SumarTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void sumarTest() throws Exception {

        RequestSOAP requestSOAP = new RequestSOAP();
        requestSOAP.setNum1(10);
        requestSOAP.setNum2(4);

        Assert.assertEquals(14, requestSOAP.getNum1() + requestSOAP.getNum2());
    }
}