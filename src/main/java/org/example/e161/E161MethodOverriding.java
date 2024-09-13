package org.example.e161;

public class E161MethodOverriding {
    public static void main(String[] args) {
       Employee []employees={new Manager(),new Developer(),new Intern()};
       for (Employee emp:employees){
           emp.hello();
        }

       Developer d=new Developer();
       d.work();
       d.takeBreak();
       d.attendMeeting();
    }

}



