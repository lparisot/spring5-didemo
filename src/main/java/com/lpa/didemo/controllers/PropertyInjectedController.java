package com.lpa.didemo.controllers;

import com.lpa.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
