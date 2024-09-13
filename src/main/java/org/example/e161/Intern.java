package org.example.e161;

public class Intern extends Employee{
    public void work() {
        System.out.println("I am an Intern working");
    }

    @Override
    protected void takeBreak() {
        System.out.println("I am an Intern taking a break");
    }

    @Override
    void attendMeeting() {
        System.out.println("I am an Intern attending a meeting");
    }

    @Override
    public void hello() {
        System.out.println("method in Intern class");
    }
}
