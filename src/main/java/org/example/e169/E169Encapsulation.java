package org.example.e169;

public class E169Encapsulation {
    public static void main(String[] args){
        Employee employee=new Employee();
        employee.setEmpName("John");
        employee.setEmpAge(30);

        String name=employee.getEmpName();
        int age=employee.getEmpAge();

        System.out.println("Employee's name: "+name);
        System.out.println("Employee's age: "+age);

    }
}
