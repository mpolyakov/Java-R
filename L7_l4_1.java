package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inpArr = new int[20];
        for (int i = 0; i < 20; i++){
           inpArr[i] = Integer.parseInt(br.readLine()); 
        }
        // for (int i : inpArr) {
            
        //     i = Integer.parseInt(br.readLine());
        // }
        return inpArr;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maxim = array[0];
        for (int i : array){
            if (maxim < i) maxim = i;
        }
        return maxim;
    }
}
