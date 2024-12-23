package com.example.cicdtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    @Value("${app.version}")
    private String version;

    @GetMapping("/cicd")
    public String cicd() {
        return "CICD!! version: " + version;
    }
}
