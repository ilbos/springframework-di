package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    //try and error learning: I wondered, why I got a Nullpointer exc.
    //that was because I did not create a constructor in the class. If there is no constructor,
    //I need to @Autowire that GreetingService object that I have inside this class. If there is a
    //constructor, however, I would not need to have @Autowired there, as Spring does it by default.
    //I will use the constructor here.
    private final GreetingService greetingService;

    //@Autowired is not needed here. Done by default by Spring framework.
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
