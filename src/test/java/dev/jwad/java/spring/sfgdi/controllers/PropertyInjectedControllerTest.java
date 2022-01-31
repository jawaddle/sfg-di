package dev.jwad.java.spring.sfgdi.controllers;

import dev.jwad.java.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Properties based controller
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}