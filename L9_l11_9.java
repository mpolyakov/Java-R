package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Vaska");
        Cat cat2 = new Cat("Da");
        Cat cat3 = new Cat("Zeta");
        Cat cat4 = new Cat("Lambda");
        Cat cat5 = new Cat("Plusha");
        Cat cat6 = new Cat("Tigra");
        Cat cat7 = new Cat("Cusik");
        Cat cat8 = new Cat("Musik");
        Cat cat9 = new Cat("Pusik");
        Cat cat10 = new Cat("Gamma");
        map.put("Vaska", cat1 );
        map.put("Da", cat2 );
        map.put("Zeta", cat3 );
        map.put("Lambda", cat4 );
        map.put("Plusha", cat5 );
        map.put("Tigra", cat6 );
        map.put("Cusik", cat7 );
        map.put("Musik", cat8 );
        map.put("Pusik", cat9 );
        map.put("Gamma", cat10 );
        
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

       while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Cat> pair = iterator.next();
            // String key = pair.getKey();            //ключ
            Cat value = pair.getValue();        //значение
            set.add(value);
        }
        
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
