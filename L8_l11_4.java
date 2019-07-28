package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        int minN = getMinimum(integerList);
        System.out.println(minN);
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        // System.out.println(Collections.min(array));
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++){
            
            list.add(Integer.parseInt(br.readLine()));
        }
        // System.out.println(list);
        return list;
    }
}
