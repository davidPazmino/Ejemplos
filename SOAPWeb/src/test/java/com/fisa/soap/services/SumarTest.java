package com.fisa.soap.services;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author David Pazmino
 * @version 1.0
 * @since <pre>12/8/15</pre>
 */
public class SumarTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void fromMapTest() throws Exception {
        FTransactionMessage ftm = jsonFTM.fromMap(lmap);
        Assert.assertEquals(47, ftm.getDataMessage().getAllFields().size());
        Assert.assertEquals("accCy / string", ftm.getField("accCy").getValue());

    }
}