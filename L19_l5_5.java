//Считать с консоли 2 имени файла.
//Первый Файл содержит текст.
//Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

//Результат вывести во второй файл.

//Закрыть потоки.

package com.javarush.task.task19.task1910;

import java.util.*;
import java.io.*;

/* 
Пунктуация
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
        
        String str = "";
        int line;
        
        while(br2.ready()){
            
            str += br2.readLine();
        }
        
        str = str.replaceAll("\\p{Punct}", "");
        str = str.replaceAll("\\n", "");
        
        bw2.write(str);
        
        
        fr.close();
        fw.close();
        br2.close();
        bw2.close();
        
    }
}
