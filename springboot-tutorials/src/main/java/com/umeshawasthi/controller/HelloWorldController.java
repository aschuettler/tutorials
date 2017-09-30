package com.umeshawasthi.controller;

import com.umeshawasthi.config.ApplicationProperties;
import com.umeshawasthi.profile.DatabaseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umesh on 6/7/17.
 */

@RestController
public class HelloWorldController {

    private static Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    ApplicationProperties applicationProperties;

    @Autowired
    DatabaseService databaseService;

    //@Resource(name = "adminDAO") /* enable this to see failure analyzer in action*/
    //private AdminDAO adminDAO;

    @RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
    public String printHelloWorld(){
       return "Hello" + applicationProperties.getSecurity().getUserName();
    }
}
