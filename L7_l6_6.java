package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String max, min;
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            strings.add(br.readLine());
        }
        max = strings.get(0);
        min = strings.get(0);
        for (String s : strings){
            if (max.length() < s.length()) max = s; 
            if (min.length() > s.length()) min = s;
        }
        int indMax = strings.indexOf(max);
        int indMin = strings.indexOf(min);
        if (indMax < indMin) System.out.println(max);
        else System.out.println(min);
    }
}
