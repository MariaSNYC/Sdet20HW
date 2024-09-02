package org.example.e146;

public class Employee {
    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    public Employee(){
        name="null";
        lastName="null";
        employeeId=0;
        startDate="null";
        salary=0;
    }

    public Employee(String name,String lastName,int employeeId,String startDate,int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }

    public void printInfo(){
        System.out.println(this.name+" "+this.lastName+" "+this.employeeId+" "+this.startDate+" "+salary);
    }


}
