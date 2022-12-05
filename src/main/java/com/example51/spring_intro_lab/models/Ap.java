package com.example51.spring_intro_lab.models;

import java.util.ArrayList;

public class Ap {
    private String greeting;
    private ArrayList<String> timeOfDay;


    public Ap(String greeting, ArrayList timeOfDay){
        this.greeting = greeting;
        this.timeOfDay = new ArrayList<>();

    }
    public Ap(){

    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public ArrayList<String> getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(ArrayList<String> timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
