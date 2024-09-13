package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180EmployeeAgesList {
    public static void main(String[] args){
        LinkedList<Integer>employeeAges=new LinkedList<>();
        employeeAges.add(20);
        employeeAges.add(54);
        employeeAges.add(63);
        employeeAges.add(45);
        employeeAges.add(35);
        employeeAges.add(28);
        employeeAges.add(31);
        employeeAges.add(33);
        employeeAges.add(61);
        employeeAges.add(53);


            employeeAges.removeIf(num->num<25||num>60);
        Collections.sort(employeeAges);

        double sum=0;
        for (int s:employeeAges){
            sum+=s;
        }
        double averageAge=sum/employeeAges.size();
        System.out.println("Remaining ages: " + employeeAges);
        System.out.println("Average age: " + averageAge);




    }

}
