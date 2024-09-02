package org.example.e150;

public class Student extends Employee {
    private int grade;

    public Student(String name,String lastName,int age,int grade){
        super(name, lastName, age,0);
        this.grade=grade;
    }


    public void printStudentDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+grade);
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(){
        this.grade=grade;
    }
}
