package com.javarush.task.task04.task0421;

/* 
����� ��� �����?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        String name1 = null;
        String name2 = null;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        name1 = br.readLine();
        name2 = br.readLine();
        
        if (name1.equals(name2)) System.out.println("����� ���������");
        else if (name1.length() == name2.length()) System.out.println("����� ���� �����");
        
    }
}
