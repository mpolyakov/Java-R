//Считать с консоли 2 имени файла.
//Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
//Округлить числа до целых и записать через пробел во второй файл.
//Закрыть потоки.

package com.javarush.task.task18.task1820;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        
        FileInputStream fis = new FileInputStream(name1);
        
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        fis.close();
        
        String allContentStr = new String(bytes);
        String[] allContStrArr = allContentStr.split(" ");
        Double[] dblArr = new Double[allContStrArr.length];
        for(int i = 0; i < allContStrArr.length; i++){
            dblArr[i] = Double.parseDouble(allContStrArr[i]);
        }
        int iii = 0;
       String outputFileStr = "";
       for(Double d : dblArr){
           iii = (int) Math.round(d);
           outputFileStr += " " + ((Integer)iii).toString();
       }
       FileOutputStream fos = new FileOutputStream(name2);
       byte[] buffer = outputFileStr.getBytes();
       
       fos.write(buffer);
       fos.flush();
       fos.close();

    }
}
