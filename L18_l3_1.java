package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
//        fileName = "C:\\Users\\Mik\\Desktop\\PROGRAMMING\\JavaRush\\strs.txt";
        List<Integer> list = new ArrayList<>();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            list.add((Integer) data);
        }
        fileInputStream.close();
        
        Integer maxByte = Collections.max(list);
        System.out.println(maxByte);


        
    }
}
