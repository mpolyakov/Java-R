package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        while(fis.available() > 0) {
            list.add(fis.read());
        }
        
        int c;
        int schetchik = 0;
        Iterator it = list.iterator();
        while(it.hasNext()){
            c = (int)(it.next());
            if(c == 44) schetchik++;
        }
        System.out.println(schetchik);
        fis.close();
    }
}
