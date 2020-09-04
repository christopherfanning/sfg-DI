package com.christopherfanning.sfgdi.controllers;

import com.christopherfanning.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
        controller.getGreeting();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}