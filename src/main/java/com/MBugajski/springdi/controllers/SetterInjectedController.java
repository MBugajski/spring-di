package com.MBugajski.springdi.controllers;

import com.MBugajski.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
//    @Qualifier("setterGreetingService")
//    Without qualifier the primary bean will be used instead, but app will run without this qualifier if primary bean is specified (will not, without it)
    public void setGreetingService( GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
