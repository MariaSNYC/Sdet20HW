package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
        ArrayList<String>chatMessages=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            chatMessages.add(s.nextLine());
            
        }
        chatMessages.remove(0);
        chatMessages.remove(1);
        chatMessages.remove(2);

       for (String m:chatMessages){
           System.out.print(m+ " ");
       }


    }

}
