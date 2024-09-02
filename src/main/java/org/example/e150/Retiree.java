package org.example.e150;

public class Retiree extends Student{
    private String seniorActivity;

    public Retiree(String name,String lastName,int age, String seniorActivity){
        super(name,lastName,age,0);
        this.seniorActivity=seniorActivity;
    }
    public void printRetireeDetails(){
        System.out.println(getName()+" "+getLastName()+" "+getAge()+" "+seniorActivity);
    }
}
