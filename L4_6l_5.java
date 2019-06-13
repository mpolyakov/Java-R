package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int age;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        name = br.readLine();
        age = Integer.parseInt(br.readLine());
        if (age < 18) System.out.println("Подрасти еще");
    }
}
