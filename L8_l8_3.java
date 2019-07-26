package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;


/* 
�������� ���������
*/
public class Solution {
    public static Map<String, String> createMap() {
        //�������� ��� ��� ���
        Map<String, String> map = new HashMap<String, String>();
        map.put("������", "����");
        map.put("������", "����");
        map.put("�������", "����");
        map.put("����", "����");
        map.put("��������", "�������");
        map.put("������", "����");
        map.put("�������", "�����");
        map.put("�����������", "���������");
        map.put("������", "�����");
        map.put("�������", "�����");
        
        return map; 

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //�������� ��� ��� 
        int iName = 0;
        for(Map.Entry<String, String> pair : map.entrySet()) {
            // String key = pair.getKey();
            String value = pair.getValue();
            if (name.equals(value)) iName = iName + 1;
        }
        return iName;
        
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //�������� ��� ��� ���
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
        // System.out.println(getCountTheSameLastName(createMap(), "�������"));
        // System.out.println(getCountTheSameFirstName(createMap(), "�����"));

    }
}