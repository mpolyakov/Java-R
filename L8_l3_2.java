package com.javarush.task.task08.task0802;

/* 
Map �� 10 ���
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Map<String,String> mapS = new HashMap<String, String>();
        mapS.put("�����", "�����");
        mapS.put("�����", "�����");
        mapS.put("�����", "�����");
        mapS.put("�����", "�����");
        mapS.put("����", "����");
        mapS.put("�������", "����");
        mapS.put("����-����", "������");
        mapS.put("���������", "�����");
        mapS.put("����", "������");
        mapS.put("���������", "�������");
        
        for (Map.Entry<String, String> pair : mapS.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            
            System.out.println (key + " - " + value);
        }

    }
}
