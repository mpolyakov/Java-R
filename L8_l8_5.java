package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/* 
��� ������� �� �����
*/

public class Solution {
    public static Map<String, String> createMap() {
        //�������� ��� ��� ���
        Map<String, String> map = new HashMap<String, String>();
        map.put("�����", "������");
        map.put("����������", "�������");
        map.put("�����", "���");
        map.put("�������", "������");
        map.put("����", "������");
        map.put("�����-��", "������");
        map.put("�������", "������");
        map.put("������", "���");
        map.put("����", "������");
        map.put("�����", "����");
        
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //�������� ��� ��� ���
        ArrayList<String> list = new ArrayList<String>();
        
        for (Map.Entry<String, String> pair : map.entrySet()){
            String value1 = pair.getValue();
            int schetchik = 0;
            for(Map.Entry<String, String> entry : map.entrySet()){
                String value2 = entry.getValue();
                if (value2.equals(value1)) {
                    schetchik = schetchik + 1;
                    // removeItemFromMapByValue(map, value2);
                    
                }
            }
            if(schetchik > 1) list.add(value1);
        }
        
        for(String s : list){
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
