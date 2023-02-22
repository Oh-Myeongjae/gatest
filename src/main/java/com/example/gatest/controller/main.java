package com.example.gatest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {

    @Value("${enString}")
    private String word;

    @GetMapping("/")
    public String print(){
        System.out.println("word = " + word);
        return "git 액션적용 "+word;
    }
}
