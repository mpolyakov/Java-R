package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, Integer> map = new HashMap<>();
        String name;
        Integer id;
        String idString;
        
        while(true){
            idString = reader.readLine();
            if (idString.isEmpty() || idString.equals("")){
                break;
            }
            id = Integer.parseInt(idString);
            name = reader.readLine();
            map.put(name, id);
            
            
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            name = pair.getKey();
            id = pair.getValue();
            System.out.println(id + " " + name);
        }

        
    }
}
