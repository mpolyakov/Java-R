package com.javarush.task.task18.task1809;

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
׀וגונס פאיכא
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        
        FileInputStream fis = new FileInputStream(fileName1);
        FileOutputStream fos = new FileOutputStream(fileName2);
        List<Integer> list = new ArrayList<>();
        
        while(fis.available() > 0){
            list.add(fis.read());   
        }
        Collections.reverse(list);
        
        for(Integer i : list){
            fos.write(i);
        }
        
        fis.close();
        fos.close();
        

    }
}
