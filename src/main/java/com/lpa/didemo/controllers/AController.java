package com.lpa.didemo.controllers;

import com.lpa.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class AController {
    // here we don't specify a service name, it will use the primary defined
    private GreetingService greetingService;

    public AController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return greetingService.sayGreeting();
    }
}
