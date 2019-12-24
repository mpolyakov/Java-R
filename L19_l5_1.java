//Считать с консоли 2 имени файла.
//Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

//Пример первого файла:
//text in file
//Вывод во втором файле:
//eti ie

//Закрыть потоки ввода-вывод

package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.*;
/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        FileWriter fw = new FileWriter(br.readLine());
        br.close();
        ArrayList<Integer> list = new ArrayList<>();
        
        
        while(fr.ready()){
            int in = fr.read();
            list.add(in);
        }
        for(int i = 1; i < list.size(); i = i + 2){
            fw.write(list.get(i));
        }
        
        fr.close();
        fw.close();
        
    }
}

