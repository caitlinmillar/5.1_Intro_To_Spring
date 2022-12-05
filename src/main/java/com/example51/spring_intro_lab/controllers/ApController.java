package com.example51.spring_intro_lab.controllers;

import com.example51.spring_intro_lab.models.Ap;
import com.example51.spring_intro_lab.models.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/greetings")
public class ApController {
    private Hello hello;
    private Ap ap;
    private ArrayList<String> timeOfDay;


    @PostMapping
    public ResponseEntity<Hello> newAp(){
        this.timeOfDay = new ArrayList<>();
        timeOfDay.add("Morning");
        timeOfDay.add("Afternoon");
        timeOfDay.add("Evening");
        this.ap = new Ap("Good ", this.timeOfDay);

        Hello hello = new Hello("Hello %s", timeOfDay);
        return new ResponseEntity<>(hello, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<Hello> getGreeting(){
        Hello hello = new Hello("Hello ", this.timeOfDay);
        return new ResponseEntity<>(hello, HttpStatus.OK);
    }



}
