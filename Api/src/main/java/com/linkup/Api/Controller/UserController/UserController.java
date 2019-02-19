package com.linkup.Api.Controller.UserController;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @CrossOrigin
    @GetMapping("/user")
    String userMessage(){
        return" user controller";
    }
}
