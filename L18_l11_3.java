//Считать с консоли 3 имени файла.
//Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
//Закрыть потоки.

package com.javarush.task.task18.task1818;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1, name2, name3;
        name1 = br.readLine();
        name2 = br.readLine();
        name3 = br.readLine();
        FileInputStream fis = new FileInputStream(name2);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(name1);
        int i;
        while((i = bis.read()) != -1) {
            fos.write(i);
        }
        fis.close();
        fos.close();
        fos = new FileOutputStream(name1, true);
        fis = new FileInputStream(name3);
        while((i = fis.read()) != -1){
            fos.write(i);
        }
        fis.close();
        fos.close();
        
        

    }
}
