package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x;
        int numYear;
        String strYear;
        boolean flag = false;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strYear = bufferedReader.readLine();
        numYear = Integer.parseInt(strYear);
        if ((((numYear % 400) == 0) & ((numYear % 4) == 0)) || (((numYear % 4) == 0) & ((numYear % 100) != 0))){
            flag = true;
            x = 366;
        } else {
            x = 365;
        }
        System.out.println("количество дней в году: " + x);
            
    }
}