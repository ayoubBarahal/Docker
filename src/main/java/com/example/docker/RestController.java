package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
class RestController {
    @GetMapping("/")
    public String hello() {
        return "Hello Docker!";
    }
}