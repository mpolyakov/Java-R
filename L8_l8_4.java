package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 12 2012"));
        map.put("Шварцнегр", dateFormat.parse("JULY 10 2011"));
        map.put("Кузьмич", dateFormat.parse("January 1 2012"));
        map.put("Вандам", dateFormat.parse("March 1 2012"));
        map.put("Стетхем", dateFormat.parse("April 1 2012"));
        map.put("Гир", dateFormat.parse("September 1 2012"));
        map.put("Макэвой", dateFormat.parse("October 1 2012"));
        map.put("Макгрегор", dateFormat.parse("November 1 2012"));
        map.put("Нильсон", dateFormat.parse("December 1 2012"));
        map.put("Харди", dateFormat.parse("February 1 2012"));
        
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        
        for(Map.Entry<String, Date> pair : map.entrySet()){
            Date value = pair.getValue();
            if ((value.getMonth() == 5) || (value.getMonth() == 6) || (value.getMonth() == 7)) {
                list.add(pair.getKey());
                // System.out.println(list.get(pair.getKey()));
            }
            
        }
        for(String s : list){
            map.remove(s);
        }
        // System.out.println(list.toString());
        
        // Iterator<Integer> it = map.iterator();
        // while (it.hasNext()) {
        //     Date value = pair.getValue();
        //     if (value.getMonth().equals(5)){
        //         it.remove();
        //     }
            
        // }

    }

    public static void main(String[] args) throws ParseException {
        // System.out.println(createMap());
        // removeAllSummerPeople(createMap());
        // System.out.println(createMap());


    }
}
