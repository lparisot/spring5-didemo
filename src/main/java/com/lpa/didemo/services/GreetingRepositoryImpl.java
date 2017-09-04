package com.lpa.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getFrenchGreeting() {
        return "Service de salutation primaire";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
