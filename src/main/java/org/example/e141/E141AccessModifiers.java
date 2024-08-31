package org.example.e141;

public class E141AccessModifiers {

    public static int maxValue(int[]arr){
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int []numbers={23,34,24,1,12};
        System.out.println(maxValue(numbers));

    }
}
