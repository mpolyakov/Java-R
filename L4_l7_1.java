package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        if(((n % 2) == 0) && (n > 0)){
            System.out.println("положительное четное число");
        } else if (((n % 2) == 0) && (n < 0)){
            System.out.println("отрицательное четное число");
        } else if (((n % 2) != 0) && (n < 0)){
            System.out.println("отрицательное нечетное число");
        } else if (((n % 2) != 0) && (n > 0)){
            System.out.println("положительное нечетное число");
        } else if (n == 0) {
            System.out.println("ноль");
        }
    }
}
