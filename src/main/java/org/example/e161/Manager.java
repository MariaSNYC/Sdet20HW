package org.example.e161;

public class Manager extends Employee{
    @Override
    public void work() {
        System.out.println("I am a Manager working");
    }

    @Override
    protected void takeBreak() {
        System.out.println("I am a Manager taking a break");
    }

    @Override
    void attendMeeting() {
        System.out.println("I am a Manager attending a meeting");
    }

    @Override
    public void hello() {
        System.out.println("method in Manager class");
    }
}
