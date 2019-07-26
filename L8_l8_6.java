package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList; 

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Petrov", 100);
        map.put("Vasnetsov", 150);
        map.put("Kulikov", 110);
        map.put("Nevsky", 700);
        map.put("Bazhenov", 300);
        map.put("Zaharov", 1100);
        map.put("Izmailov", 12300);
        map.put("Gorbachev", 10340);
        map.put("Basharov", 1040);
        map.put("Popov", 1100);
        
        return map;
        
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<String> stuff = new ArrayList<>();
        
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            Integer zp = pair.getValue();
            if (zp < 500) stuff.add(pair.getKey());
        }
        
        for (String s : stuff){
            map.remove(s);
        }
    }

    public static void main(String[] args) {

    }
}