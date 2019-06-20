package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double i = 0; 
        double num, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            num = Double.parseDouble(br.readLine());
            
            if (num == -1){
                System.out.println(sum/i);
                break;
            } else {
                sum = sum + num;
                i++;
            }
        }
        
    }
}
