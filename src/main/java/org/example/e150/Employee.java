package org.example.e150;

public class Employee extends Person{
    private int salary;

    public Employee(String name,String lastName,int age, int salary){
        super(name,lastName,age);
        this.salary=salary;

    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary=salary;
    }
    public void displayEmployeeInfo(){

        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+salary);
    }
}
