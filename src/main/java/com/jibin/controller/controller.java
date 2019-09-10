package com.jibin.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(value = {"/", "/index", "/logged-in"})
    public String home(@AuthenticationPrincipal AuthenticationPrincipal principal) {
        return "logged-in";
    }
}
