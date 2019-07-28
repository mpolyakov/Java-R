package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>(10);
        // for (int i = 1; i < 11; i++){
        //     map.put("surname" + i, "name" + i);
        // }
        map.put("фамилия1", "имя1");
        map.put("фамилия2", "имя2");
        map.put("фамилия2", "имя3");
        map.put("фамилия5", "имя6");
        map.put("фамилия7", "имя11");
        map.put("фамилия8", "имя3");
        map.put("фамилия7", "имя5");
        map.put("фамилия9", "имя4");
        map.put("фамилия11", "имя1");
        map.put("фамилия14", "имя12");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
