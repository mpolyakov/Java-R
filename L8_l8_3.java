package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;


/* 
Перепись населения
*/
public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Шапитто", "Иван");
        map.put("Суса", "Сидр");
        map.put("Дмитриев", "Дмитрий");
        map.put("Олегов", "Олег");
        map.put("Тинькоф", "Тиньк");
        map.put("Александров", "Александр");
        map.put("Игорев", "Игорь");
        map.put("Сусанин", "Сусан");
        
        return map; 

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш 
        int iName = 0;
        for(Map.Entry<String, String> pair : map.entrySet()) {
            // String key = pair.getKey();
            String value = pair.getValue();
            if (name.equals(value)) iName = iName + 1;
        }
        return iName;
        
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int iSurname = 0;
        for(Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            // String value = pair.getValue();
            if (lastName.equals(key)) iSurname = iSurname + 1;
        }
        return iSurname;

    }

    public static void main(String[] args) {
        // System.out.println(createMap());
        // System.out.println(getCountTheSameLastName(createMap(), "Сусанин"));
        // System.out.println(getCountTheSameFirstName(createMap(), "Сусан"));

    }
}