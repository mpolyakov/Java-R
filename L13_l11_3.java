package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameF = br.readLine();
        
        InputStream inStream = new FileInputStream(nameF);
        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            
            System.out.print((char)data);
            // outStream.write(data); //записываем прочитанный байт в другой поток.
        }
        
        inStream.close(); //закрываем потоки
        br.close();
        // outStream.close();
    }
}