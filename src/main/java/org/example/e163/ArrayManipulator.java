package org.example.e163;

public class ArrayManipulator {
    public final double avgElements(int[]arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return (double) sum/arr.length;

    }
}
