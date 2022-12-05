package com.example51.spring_intro_lab.models;

import java.util.ArrayList;

public class Hello {
    private String greeting;
    private String timeOfDay;


    public Hello(String greeting, ArrayList<String> timeOfDay){
        this.greeting = greeting;
        timeOfDay = new ArrayList<>();
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
