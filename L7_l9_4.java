package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
� ��� �
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("����");
        strings.add("���");
        strings.add("����");
        strings.add("�����");
        
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //�������� ��� ��� ���
        ArrayList<String> newString = new ArrayList<String>();
        for (String s : strings){
            if (s.contains("�") && s.contains("�")) {
                newString.add(s);
                continue;
            }
            if (!s.contains("�") && !s.contains("�")) {
                newString.add(s);
                continue;
            }
            if (s.contains("�")) {
                
            }
            if (s.contains("�")) {
                newString.add(s);
                newString.add(s);
            }
        }
        return newString;
    }
}