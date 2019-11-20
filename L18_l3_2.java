package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(br.readLine());

        ArrayList<Integer> bytes = new ArrayList<>();


        while (fileInputStream.available() > 0) {
            bytes.add (fileInputStream.read());
        }
        fileInputStream.close();
//        System.out.println(bytes);
        Integer min = bytes.get(0);
        for (Integer i: bytes) {
            if (i < min) min = i;
        }
        System.out.println(min);

    }
}
