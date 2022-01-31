package dev.jwad.java.spring.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello Spring Controller World");
        return "Hi Springers!";
    }
}
