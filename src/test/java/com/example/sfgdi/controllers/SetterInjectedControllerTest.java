package com.example.sfgdi.controllers;

import com.example.sfgdi.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        //set the greetingService property with a new GreetingServiceImpl instance
        controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}