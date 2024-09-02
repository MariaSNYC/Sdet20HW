package org.example.e150;

public class E150Inheritance {
    public static void main(String[] args) {
        Employee E=new Employee("Joe","Smith",35,35000);
        E.displayEmployeeInfo();

        Student S=new Student("Adam","Smith",15,10);
        S.printStudentDetails();

        Retiree R=new Retiree("Frank","Smith",15,"tour");
        R.printRetireeDetails();

    }

}
