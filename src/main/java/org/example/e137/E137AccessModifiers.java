package org.example.e137;

public class E137AccessModifiers {

      private  String name;
      public  String city;
        String nameOfSchool;
       protected int batchNumber;

    public void printInfo() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfSchool + " in batch " + batchNumber);

    }


        public static void main(String[] args) {
            E137AccessModifiers call=new E137AccessModifiers();
            call.name="John";
            call.city="Miami";
            call.nameOfSchool="Syntax";
            call.batchNumber=9;

            call.printInfo();
    }
}

