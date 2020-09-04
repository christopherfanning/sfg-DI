package com.christopherfanning.sfgdi.controllers;

import com.christopherfanning.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();

    }
}
