package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
���������� ���� ����
*/

public class Solution {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add(1, "������");
        strings.add(3, "������");
        strings.add(5, "������");
        for (String s : strings){
            System.out.println(s);
        }
    }
}
