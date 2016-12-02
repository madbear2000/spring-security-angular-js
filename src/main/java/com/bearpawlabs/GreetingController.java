package com.bearpawlabs;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting getGreeting() {
        
        return new Greeting();
    }
    
    @GetMapping("/user")
    public Principal user(Principal user) {
      return user;
    }
    
}
