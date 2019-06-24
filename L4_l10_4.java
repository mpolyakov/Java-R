package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 1, m;
        while(n <= 10){
            m = 1;
            while(m < 10){
                System.out.print("S");
                m++;
            }
            System.out.println("S");
            n++;
        }

    }
}
