package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int num1, num2, num3;
        String strNum1, strNum2, strNum3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strNum1 = bufferedReader.readLine();
        strNum2 = bufferedReader.readLine();
        strNum3 = bufferedReader.readLine();
        num1 = Integer.parseInt(strNum1);
        num2 = Integer.parseInt(strNum2);
        num3 = Integer.parseInt(strNum3);
        if ((num1 == num2) & (num2 == num3)) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 == num2){
            System.out.println(num1 + " " + num2);
        } else if (num1 == num3) {
            System.out.println(num1 + " " + num3);
        } else if (num2 == num3){
            System.out.println(num2 + " " + num3);
        }
        
    }
}