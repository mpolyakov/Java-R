package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArr = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArr.length; i++){
            bigArr[i] = Integer.parseInt(br.readLine());
        }
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        
        for (int i = 0; i < bigArr.length/2; i++){
            small1[i] = bigArr[i];
        }
        for (int i = 0 ; i < bigArr.length/2; i++){
            System.out.println(small2[i] = bigArr[i + 10]);
            
        }
        
    }
}
