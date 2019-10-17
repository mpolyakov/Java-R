package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;
    
    public static String a, b;
    
    static{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            a = br.readLine();
            b = br.readLine();
            A = Integer.parseInt(a);
            B = Integer.parseInt(b);
        } catch (IOException e){
            System.out.println("Попалося исключение ввода");
        }
        // br.close();
    }
    

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    
    
}
