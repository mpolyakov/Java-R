package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        String polka;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strings.add(br.readLine());
        }
        for (int i = 0; i < 13; i++){
            polka = strings.get(4);
            strings.remove(4);
            strings.add(0, polka);
        }
        for (String i : strings){
            System.out.println(i);
        }
        
        
    }
}
