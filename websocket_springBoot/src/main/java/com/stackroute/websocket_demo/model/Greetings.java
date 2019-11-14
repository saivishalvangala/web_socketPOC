package com.stackroute.websocket_demo.model;

public class Greetings {
    private String greeting;

    public Greetings (){

    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Greetings(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
