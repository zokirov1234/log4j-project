package com.example.log4jproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/man")
    public String main(){

        return "man";
    }

    @GetMapping("/exp")
    public String getException() throws UserPrincipalNotFoundException {
        throw new UserPrincipalNotFoundException("Found it");
    }
}
