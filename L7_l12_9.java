package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }
        
        // ArrayList<String> newStrings = new ArrayList<String>();          //решение без метода
        //     for (String s : strings){
        //         int ost = s.length() % 2;
        //         if (ost == 0) newStrings.add(s + s);
        //         else if (ost != 0) newStrings.add(s + s + s);
        //     }
        // for (String s : newStrings){
        //     System.out.println(s);
        // }                                                                //решение без метода
        
        strings = doubledStrings(strings);
        
        for (String s : strings){
            System.out.println(s);
        }

        // ArrayList<String> resultStrings = new ArrayList<String>(); //прошлая задача
        // for (int i = 0; i < strings.size(); i++) {
        //     String string = strings.get(i);
        //     resultStrings.add(string.toUpperCase());   
        // }

        // for (int i = 0; i < resultStrings.size(); i++) {
        //     System.out.println(resultStrings.get(i));
        // }                                                        //прошлая задача
        
        
        
    }
    
    private static ArrayList<String> doubledStrings (ArrayList<String> strings){  //решение через метод
            ArrayList<String> newStrings = new ArrayList<String>();
            for (String s : strings){
                int ost = s.length() % 2;
                if (ost == 0) newStrings.add(s + " " + s);
                else if (ost != 0) newStrings.add(s + " " + s + " " + s);
            }
            return newStrings;
        }
}
