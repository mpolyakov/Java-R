package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
������������ � ����
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //�������� ��� ��� ���
        Map<String, String> map = new HashMap<>(10);
        // for (int i = 1; i < 11; i++){
        //     map.put("surname" + i, "name" + i);
        // }
        map.put("�������1", "���1");
        map.put("�������2", "���2");
        map.put("�������2", "���3");
        map.put("�������5", "���6");
        map.put("�������7", "���11");
        map.put("�������8", "���3");
        map.put("�������7", "���5");
        map.put("�������9", "���4");
        map.put("�������11", "���1");
        map.put("�������14", "���12");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
