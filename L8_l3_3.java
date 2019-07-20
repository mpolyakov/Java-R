package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
��������� Map �� �����
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"������", "�����", "�����", "�����", "�����", "������", "����", "�����", "����", "�����"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //�������� ��� ��� ���
        Map<String, Cat> catMap = new HashMap<String, Cat> ();
        // for (int i = 0; i < 10; i++){
        //     catMap.put(cats[i], new Cat(cats[i]));
        // }
        for(String c : cats){
            catMap.put(c, new Cat(c));
        }
        return catMap;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
