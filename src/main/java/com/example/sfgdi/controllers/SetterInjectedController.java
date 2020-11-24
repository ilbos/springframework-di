package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class SetterInjectedController {

    //private property will be set by the setter
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
