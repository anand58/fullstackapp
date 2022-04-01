package com.springangular.fullstackapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api2")
public class SecondController {

    @GetMapping("/message")
    public String getSecondMsg() {
        return "Hello world from Second Controller";
    }
}
