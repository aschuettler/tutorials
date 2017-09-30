package com.javadevjournal.demo.controller;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @Autowired
    OAuthClientRequest oAuthClientRequest;

    @RequestMapping("/greeting")
    public String greeting(final Model model) {
        model.addAttribute("locationURL",  oAuthClientRequest.getLocationUri());
        return "greeting";
    }

}
