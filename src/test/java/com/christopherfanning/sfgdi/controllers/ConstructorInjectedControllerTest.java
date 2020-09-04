package com.christopherfanning.sfgdi.controllers;

import com.christopherfanning.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
        controller.getGreeting();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}