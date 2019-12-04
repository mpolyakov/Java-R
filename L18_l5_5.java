package com.javarush.task.task18.task1810;

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
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<FileInputStream> listOfFis = new ArrayList<>();
        while(true){
            FileInputStream fis = new FileInputStream(br.readLine());
            listOfFis.add(fis);
            if(fis.available() < 1000) {
                for(FileInputStream i : listOfFis){
                    i.close();
                }
                throw new DownloadException();
                
            }
        }
        
        

    }

    public static class DownloadException extends Exception {

    }
}
