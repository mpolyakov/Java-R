//Считать с консоли имя файла.
//Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
//Закрыть потоки.

//Пример:
//words содержит слова А, Б, В

//Строки:
//В Б А Д //3 слова из words, не подходит
//А Б А Д //3 слова из words, не подходит
//Д А Д //1 слово из words, не подходит
//Д А Б Д //2 слова - подходит, выводим
//Д А А Д //2 слова - подходит, выводим

package com.javarush.task.task19.task1922;

import java.util.ArrayList;
import java.util.List;
import java.io.*; 

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();
    

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameF = br.readLine();
        br.close();
        
        FileReader fr = new FileReader(nameF);
        BufferedReader br2 = new BufferedReader(fr);
        String line;
        String [] arrList;
        int count;
        
        while((line = br2.readLine()) != null){
            arrList = line.split(" ");
            count = 0;
            for (String s : arrList){
                if(words.contains(s)) {
                    count++;
                }
            }
            if(count == 2){
                System.out.println(line);
            }
        }
        
        fr.close();
        br2.close();
        

    }
}

