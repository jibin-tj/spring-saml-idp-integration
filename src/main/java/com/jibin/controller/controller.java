package com.jibin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(value = {"/", "/index", "/logged-in"})
    public String home() {
        return "logged-in";
    }
}
