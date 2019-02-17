package com.linkup.Api.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    /**
     * Display some sample text on the homepage. can be used to test the application is up and running
     */
    @CrossOrigin
    @GetMapping("/")
    String home(){
        return "Welcome to The Link Up Api Service :)";
    }
}
