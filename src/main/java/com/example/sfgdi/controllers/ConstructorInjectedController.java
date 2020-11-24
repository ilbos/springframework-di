package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //Constructor setting the property
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
