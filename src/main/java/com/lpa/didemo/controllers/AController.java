package com.lpa.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class AController {
    public String hello() {
        System.out.println("Hello Word");
        return "";
    }
}
