package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Integer[] newArray = new Integer[array.length];
        int i = 0;
        for (int value : array) {
            newArray[i++] = Integer.valueOf(value);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(newArray));
        Collections.sort(list);
        Collections.reverse(list);
        
        for (int j = 0; j < list.size(); j++) {
            array[j] = (int)list.get(j);
        }
        
        
    }
}
