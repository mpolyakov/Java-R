package com.javarush.task.task04.task0412;

/* 
ѕоложительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        String s;
        //System.out.print("¬ведите число: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        s = bufferedReader.readLine();
        a = Integer.parseInt(s);
        
        if (a > 0) {
            System.out.println(a * 2);
        } else if (a < 0) {
            System.out.println(a + 1);
        } else System.out.println(0);

    }

}