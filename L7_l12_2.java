package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
ѕерестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N, M;
        N = Integer.parseInt(reader.readLine());
        M = Integer.parseInt(reader.readLine());
        
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < N; i++){
            strings.add(reader.readLine());
        }
        String polka;
        for (int i = 0; i < M; i++){
            polka = strings.get(i);
            strings.add(polka);
        }
        
        Iterator<String> stringsIterator = strings.iterator();
        for (int i = 0; i < M; i++){
            strings.remove(0);
        }
        
        for (String s : strings){
            System.out.println(s);
        }
        
    }
}
