package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        
        while(true) {
            str = br.readLine();
            if(str.equals("exit")) {
                break;
            } 
            try {
                Double.parseDouble(str);
                if (str.contains(".")){
                print(Double.parseDouble(str));
                // } else if (str.matches("[a-zA-Z]+")) {
                //     print(str);
                } else if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128){
                    print(Short.parseShort(str));
                } else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128){
                    print(Integer.parseInt(str));
                }
                
            } catch (NumberFormatException | NullPointerException nfe) {
                print(str);
            }
            
            
             
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
