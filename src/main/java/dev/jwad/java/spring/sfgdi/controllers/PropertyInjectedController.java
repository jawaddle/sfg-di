package dev.jwad.java.spring.sfgdi.controllers;

import dev.jwad.java.spring.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
