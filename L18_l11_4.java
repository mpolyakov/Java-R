//Считать с консоли 2 имени файла.
//В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
//Закрыть потоки.

package com.javarush.task.task18.task1819;

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
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name1 = br.readLine();
        String name2 = br.readLine();
        
        // FileInputStream fis1 = new FileInputStream(name1);
        // FileInputStream fis2 = new FileInputStream(name2);
        // FileOutputStream fos = new FileOutputStream(name2, true);
        
        // int b1, b2;
        // while ((b1 = fis1.read()) != -1 ) {
        //     fos.write(b1);
        // }
        
        
        // fos = new FileOutputStream(name1);
        // while ((b2 = fis2.read()) != -1) {
        //     fos.write(b2);
        // }
        // fis1.close();
        // fis2.close();
        // fos.close();
        
        FileInputStream fileInputStream1 = new FileInputStream(name1);
        List<Integer> bytesArray1 = new ArrayList<>();
        while(fileInputStream1.available() > 0) {
            bytesArray1.add(fileInputStream1.read());
        }
        
        FileInputStream fileInputStream2 = new FileInputStream(name2);
        
        FileOutputStream fileOutputStream1 = new FileOutputStream(name1);
        int b;
        while (fileInputStream2.available() > 0) {
            b = fileInputStream2.read();
            fileOutputStream1.write(b);
        }
        
        // fileOutputStream1 = new FileOutputStream(name1, true);
        for (int bt : bytesArray1){
            fileOutputStream1.write(bt);
        }
        
        fileInputStream1.close();
        fileOutputStream1.close();
        fileInputStream2.close();

    }
}
