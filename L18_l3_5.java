package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //C:\\Users\\Mik\\Desktop\\PROGRAMMING\\JavaRush\\strs.txt
        FileInputStream fis = new FileInputStream(br.readLine());

        
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        while(fis.available() > 0){
            set.add(fis.read());
        }
        for(Integer i : set){
            list.add(i);
        }
        Collections.sort(list);

        fis.close();
        br.close();
        
        
        for(Integer j : list){
            System.out.print(j + " ");
        }
        
    }
}
