package com.javarush.task.task18.task1808;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1, fileName2, fileName3;
        fileName1 = br.readLine();
        fileName2 = br.readLine();
        fileName3 = br.readLine();
        FileInputStream fis = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);
        
        int numBytes = fis.available();
        int bt;
        if(!(numBytes % 2 == 0)){
            while(fis.available() > ((numBytes - 1) / 2)){
                bt = fis.read();
                fileOutputStream2.write(bt);
            }
            while(fis.available() > 0){
                bt = fis.read();
                fileOutputStream3.write(bt);
            }
        } else {
            while(fis.available() > (numBytes / 2)){
                bt = fis.read();
                fileOutputStream2.write(bt);
            }
            while(fis.available() > 0){
                bt = fis.read();
                fileOutputStream3.write(bt);
            }
            
        }
        fis.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
        

    }
}
