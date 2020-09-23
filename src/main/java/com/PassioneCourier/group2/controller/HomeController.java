package com.PassioneCourier.group2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping({"/", "/venezia.polpo"})
        String home(){
            return "This is Passione Courier Application DEMO!";
        }
}
