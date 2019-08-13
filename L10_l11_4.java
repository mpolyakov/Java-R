package com.javarush.task.task10.task1011;

import java.util.ArrayList;
import java.util.Arrays;
/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] chArr = s.toCharArray();
        
        for (char i = 0; i < 40; i++){
            for (char j = i; j < chArr.length; j++){
                System.out.print(chArr[j]);
            }
            System.out.print("\n");
        }
        
    }

}

