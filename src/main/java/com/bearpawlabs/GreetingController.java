package com.bearpawlabs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting getGreeting() {
        
        return new Greeting();
    }
    
}
