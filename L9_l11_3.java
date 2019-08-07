package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.lang.NumberFormatException;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList <Integer> list = new ArrayList <> ();
            try{
                
                while (true){
                    list.add(Integer.parseInt(br.readLine()));
                }
            } catch(IOException e){
                for (Integer i : list){
                    System.out.println(i);
                }
            } catch(NumberFormatException t){
                for (Integer i : list){
                    System.out.println(i);
                }
            }
        
        
    }
}
