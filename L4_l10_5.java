package com.javarush.task.task04.task0434;


/* 
“аблица умножени€
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 1, m;
        while (n <= 10){
            m = 1;
            while (m < 10){
                System.out.print(n * m + " ");
                m++;
            }
            System.out.println(n * m);
            n++;
        }

    }
}
