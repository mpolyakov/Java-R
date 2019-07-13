package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        int max;
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strings.add(br.readLine());
            
        }
        max = strings.get(0).length();
        String s = strings.get(0);
        for (String i : strings){
            if(max < i.length()) {
                max = i.length();
                s = i;
            }
            
        }
        
            
        for (String i : strings){
            if(s.length() == i.length()) {
                System.out.println(i);
            }
        } 
        
        // for  (String i : strings){
        //     if (s.equals(i)) System.out.println(i);
        // }
        
    }
}
