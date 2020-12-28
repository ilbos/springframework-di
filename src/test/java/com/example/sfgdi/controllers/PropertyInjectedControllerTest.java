package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        //I can do this, as the property greetingService is not private!
        //So I can set the property to be a new GreetingServiceImpl instance
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        //as the property is set, I call the function getGreeting(), that calls sayGreeting()
        //of the property (=> greetingService.sayGreeting())
        System.out.println(controller.getGreeting());
    }
}