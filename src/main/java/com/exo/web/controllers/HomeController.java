package com.exo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    String message = "Welcome to My Blog!";
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model)  {
        return second(model);
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String second(ModelMap model)  {
        return "home";
    }    
}
