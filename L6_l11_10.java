package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int num1, num2, num3, num4, num5, max;
        int[] num = new int[5]; 
        
        for (int i = 0; i < 5; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = num.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                /*Сравниваем элементы попарно, 
                  если они имеют неправильный порядок, 
                  то меняем местами*/
                if( num[j] > num[j+1] ){
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }
        for (int i : num){
            System.out.println(i);
        }
    } 
    
        
        
    }

