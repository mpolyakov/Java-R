package com.javarush.task.task04.task0418;

/* 
ћинимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int num1;
        int num2;
        String strNum1, strNum2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        num1 = Integer.parseInt(bufferedReader.readLine());
        num2 = Integer.parseInt(bufferedReader.readLine());
        if (num1 <= num2){
            System.out.println(num1);
        } else System.out.println(num2);
        
    }
}