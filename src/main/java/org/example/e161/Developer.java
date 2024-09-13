package org.example.e161;

public class Developer extends Employee{
    public void work() {
        System.out.println("I am a Developer working");
    }

    @Override
    protected void takeBreak() {
        System.out.println("I am a Developer taking a break");
    }

    @Override
    void attendMeeting() {
        System.out.println("I am a Developer attending a meeting");
    }

    @Override
    public void hello() {
        System.out.println("method in Developer class");
    }
}
