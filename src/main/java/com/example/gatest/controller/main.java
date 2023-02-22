package com.example.gatest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {

    @GetMapping("/")
    public String print(){
        return "접속확인";
    }
}
