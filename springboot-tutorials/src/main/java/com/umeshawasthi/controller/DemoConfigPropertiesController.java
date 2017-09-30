package com.umeshawasthi.controller;

import com.umeshawasthi.config.ApplicationProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umesh on 6/21/17.
 */
@RestController
public class DemoConfigPropertiesController {

    private static Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    ApplicationProperties applicationProperties;


    @RequestMapping(value = "/demo-config-properties",method = {RequestMethod.GET,RequestMethod.POST})
    public String printHelloWorld(){
        LOG.info("Password is : " +applicationProperties.getSecurity().getPassword());
        return "Hello" + applicationProperties.getSecurity().getUserName();
    }
}
