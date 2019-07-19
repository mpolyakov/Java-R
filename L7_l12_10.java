package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
¬ убывающем пор€дке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        
        int[] invArray = new int[20];
        
        for (int i = 0; i < 20; i++){
            invArray[i] = array[19 - i];
        }
        // System.out.println(Arrays.toString(invArray));
        
        for (int i = 0; i < 20; i++){
            array[i] = invArray[i];
        }
    }
}
