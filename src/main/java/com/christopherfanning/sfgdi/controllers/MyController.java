package com.christopherfanning.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World.");

        return "I'm the return of the controller.";
    }
}
