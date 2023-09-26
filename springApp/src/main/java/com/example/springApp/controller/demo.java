package com.example.springApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @GetMapping("/")
    public String msg(){
        return "Hii,All is Good!!!";
    }
}
