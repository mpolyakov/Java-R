package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/* 
���������� ����
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // �������
        List<Character> alphabet = Arrays.asList(
                '�','�','�','�','�','�','�','�',
                '�','�','�','�','�','�','�','�',
                '�','�','�','�','�','�','�','�',
                '�','�','�','�','�','�','�','�','�');

        // ���� �����
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // �������� ��� ��� ���
        for(Character a : alphabet){
            int schetchik = 0;
            for (String s : list){
                char[] chArr = s.toCharArray();
                for(char c : chArr){
                    if (c == a) schetchik++;
                }
            }
            System.out.print(a + " ");
            System.out.println(schetchik);
        }
    }
}
