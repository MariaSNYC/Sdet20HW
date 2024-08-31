package org.example.e138;
public class E138AccessModifiers {
       public String p(){
              return "public";
       }

       private String pr(){
              return "private";
       }
       String d(){
              return "default";

       }
       protected String pro(){
              return "protected";
       }



       public static void main(String[] args) {
              E138AccessModifiers call=new E138AccessModifiers();
              System.out.println(call.d());
              System.out.println(call.pro());
              System.out.println(call.p());


       }
}
