package com.MBugajski.springdi.services;

import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingService  implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Setter";
    }
}
