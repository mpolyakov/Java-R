package com.javarush.task.task08.task0801;

/* 
Set �� ��������
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Set<String> setS = new HashSet<String>();
        setS.add("�����");
        setS.add("�����");
        setS.add("�����");
        setS.add("�����");
        setS.add("����");
        setS.add("�������");
        setS.add("��������");
        setS.add("���������");
        setS.add("����");
        setS.add("���������");
        
        for (String s : setS){
            System.out.println(s);
        }

    }
}
