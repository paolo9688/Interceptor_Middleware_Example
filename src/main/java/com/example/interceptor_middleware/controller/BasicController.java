package com.example.interceptor_middleware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String getCurrentTime() {
        // Restituisce la data e l'ora corrente
        return "Current Date/Time: " + LocalDateTime.now();
    }
}