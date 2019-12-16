//Программа запускается с одним параметром - именем файла, который содержит английский текст.
//Посчитать частоту встречания каждого символа.
//Отсортировать результат по возрастанию кода ASCII (почитать в инете).

package com.javarush.task.task18.task1821;

import java.io.*;
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
import java.util.Collections;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[0]);
        ArrayList<Integer> ints = new ArrayList<>();
        
        while(fis.available() > 0) {
            ints.add(fis.read());
        }
        
        Collections.sort(ints);
        // Collections.reverse(ints);
        
        ArrayList<Integer> ints2 = new ArrayList<>();
        
        int count;
        for (int i : ints){
            count = 0;
            for (int j : ints){
                if (i == j){
                    count++;
                }
            }
            if(!ints2.contains(i)) {
                ints2.add(i);
                System.out.println((char) i + " " + count);
            }
            
        }
        
        fis.close();
        

    }
}
