package dev.jwad.java.spring.sfgdi.controllers;

import dev.jwad.java.spring.sfgdi.services.GreetingService;
import dev.jwad.java.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Constructor Injected Dependency injection example
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}