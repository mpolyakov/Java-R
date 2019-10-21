package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String urlRead = br.readLine();
        char[] urlReadtoCharArray = urlRead.toCharArray();
        
        Character[] paramArray;
        String valueObj = "";
        
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = true;
        String paramString = "";
        String objFinal = null;
        
        for (char c : urlReadtoCharArray){
            
            if (paramString.contains("obj")) {
                flag3 = true;
            }
            if (c == '?') {
                flag1 = true;
                flag2 = true;
                continue;
            }
            if (c == '=') {
                flag2 = false;
                continue;
            }
            if (c == '&' && flag3) {
                flag4 = false;
                paramString = paramString + " ";
                flag3 = false;
                objFinal = valueObj;
                flag2 = true;
                continue;
            }
            if (c == '&') {
                paramString = paramString + " ";
                flag3 = false;
                objFinal = valueObj;
                flag2 = true;
                continue;
            }
            
            if (flag1 && flag2) {
                paramString = paramString + c;
            }
            if (flag3 && flag4) {
                valueObj += c;
            }
        }
        System.out.println(paramString);
        
        if (flag3){
        try{
            alert(Double.parseDouble(objFinal));
        } catch (NullPointerException | NumberFormatException e) {
            alert(objFinal);
        }
        }
        
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
