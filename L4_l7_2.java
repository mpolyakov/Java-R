package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n, cifer;
        String strN;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strN = br.readLine();
        cifer = strN.length();
        n = Integer.parseInt(strN);
        
        if ((n % 2 == 0) && (cifer == 1) && (n > 0) && (n < 1000)) System.out.println("четное однозначное число");
        else if ((n % 2 == 0) && (cifer == 2) && (n > 0) && (n < 1000)) System.out.println("четное двузначное число");
        else if ((n % 2 == 0) && (cifer == 3) && (n > 0) && (n < 1000)) System.out.println("четное трехзначное число");
        else if ((n % 2 != 0) && (cifer == 1) && (n > 0) && (n < 1000)) System.out.println("нечетное однозначное число");
        else if ((n % 2 != 0) && (cifer == 2) && (n > 0) && (n < 1000)) System.out.println("нечетное двузначное число"); 
        else if ((n % 2 != 0) && (cifer == 3) && (n > 0) && (n < 1000)) System.out.println("нечетное трехзначное число");
        
    }
}
