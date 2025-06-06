package com.example.interceptor_middleware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyCode() {
        // Questo codice non dovrebbe mai essere raggiunto a causa dell'interceptor
        return "This is just old code";
    }
}