package dev.jwad.java.spring.sfgdi.controllers;

import dev.jwad.java.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Setter based Injection
 */

class SetterInjectedControllerTest {

    SetterInjectedController controller;


    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}