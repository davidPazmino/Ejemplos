package com.fisa.soap.services;

import com.fisa.soap.services.impl.SOAPWebServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

/**
 * Created by advance on 12/19/16.
 */
@WebListener
public class ContextInitialization  implements ServletContextListener{
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Exponiendo WS");
        Endpoint.publish("http://localhost:8082/SOAPWeb", new SOAPWebServiceImpl());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}