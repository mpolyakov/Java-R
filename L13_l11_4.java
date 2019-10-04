package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameF = br.readLine();
        
        FileWriter fw = new FileWriter(nameF);
        BufferedWriter bw  = new BufferedWriter(fw);
        String str;
        
        while(true) {
            str = br.readLine();
            bw.write(str + "\n");
            if (str.equals("exit")) {
                break;
            }
        }
        br.close();
        fw.close();
        bw.close();
    }
}