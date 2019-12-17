//Читайте с консоли имена файлов, пока не будет введено слово "exit".
//Передайте имя файла в нить ReadThread.
//Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
//где параметр String - это имя файла, параметр Integer - это искомый байт.
//Закрыть потоки.

package com.javarush.task.task18.task1823;

import java.util.HashMap;
import java.util.Map;
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
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stopWord = "exit";
        String inputName;
        while(true){
            inputName = br.readLine();
            if(inputName.equals(stopWord)) break;
            new ReadThread(inputName).start();
            
        }

    }

    public static class ReadThread extends Thread {
        private String filenameC;
        public ReadThread(String fileName) {
            //implement constructor body
            this.filenameC = fileName;
            
            
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try{
                FileInputStream fis = new FileInputStream(filenameC);
                ArrayList<Integer> list = new ArrayList<>();
                while (fis.available() > 0) {
                    list.add(fis.read());
                    int max = 0;
                    int chastyiByte = list.get(0);
                
                    for(int i = 0; i < list.size(); i++){
                        int count = 0;
                        for (int j = 0; j < list.size(); j++){
                            if (list.get(i) == list.get(j)) count++;
                        }
                        if(max < count){
                            max = count;
                            chastyiByte = list.get(i);
                        }
                    }
                    resultMap.put(filenameC, chastyiByte);
                } 
                fis.close();
            } catch(IOException e){
                
            }
            
            
            
            
        }
    }
}
