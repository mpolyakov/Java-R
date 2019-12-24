//Считать с консоли 2 имени файла.
//Первый Файл содержит текст.
//Считать содержимое первого файла и заменить все точки "." на знак "!".
//Результат вывести во второй файл.
//Закрыть потоки.

package com.javarush.task.task19.task1909;

import java.util.*;
import java.io.*;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String name1 = br.readLine();
        String name2 = br.readLine();
        br.close();
        FileReader fr = new FileReader(name1);
        BufferedReader br2 = new BufferedReader(fr);
        FileWriter fw = new FileWriter(name2);
        BufferedWriter bw2 = new BufferedWriter(fw);
        
        String str;
        int line;
        
        while(br2.ready()){
            int c = br2.read();
            if(c == 46) c = 33;
            bw2.write(c);
            // str = String.valueOf(br2.read());
            // if(str.equals(".")) str = "!";
            // bw2.write(str, 0, 1);
        }
        
        fr.close();
        fw.close();
        br2.close();
        bw2.close();
    }
}
