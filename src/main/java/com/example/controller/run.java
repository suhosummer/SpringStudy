package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class run {

    @GetMapping(value = "/")
    public String HelloWorld() {
        return "sex";
    }
}
