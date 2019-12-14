//В метод main первым параметром приходит имя файла.
//Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
//1. Посчитать количество всех символов.
//2. Посчитать количество пробелов.
//3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
//4. Закрыть потоки.

package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        float countAll = 0;
        float countSpaces = 0;
        FileInputStream fis = new FileInputStream(args[0]);
        while(fis.available() > 0){
            int b = fis.read();
            countAll++;
            if (b == 32){
                countSpaces++;
            }
        }
        float rel = countSpaces / countAll * 100;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(rel));
        // System.out.println(rel);
        fis.close();
        

    }
}
