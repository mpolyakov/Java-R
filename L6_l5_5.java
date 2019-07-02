package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int num;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        
        while (num >= 1){
            if (num % 2 == 0) even++;
            else odd++;
            num = num / 10;
        }
        System.out.print("Even: " + even + " " + "Odd: " + odd);
        
    }
}