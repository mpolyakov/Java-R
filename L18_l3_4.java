package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //C:\Users\Mik\Desktop\PROGRAMMING\JavaRush\strs.txt
        FileInputStream fis = new FileInputStream(br.readLine());

        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        int min = 1;
        Set<Integer> list = new TreeSet<>();


        for (int i = 0; i < buffer.length; i++){
            int colvo = 0;
            for (int j = 0; j < buffer.length; j++){
                if(buffer[i] == buffer[j]){
                    colvo++;
                }
            }
            if (min > colvo){
                min = colvo;
                list.clear();
                list.add((int)buffer[i]);
            } else if (min == colvo){
                list.add((int)buffer[i]);
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
            
        
    }
}
