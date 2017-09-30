package com.javadevjournal.sarter.demo.controller;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Autowired
    OAuthClientRequest oAuthClientRequest;

    @RequestMapping("/greeting")
    public String greeting() {

        //System.out.println(oAuthClientRequest.getLocationUri());
        return "welcome";
    }
}
