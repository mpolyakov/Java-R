package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
�������� ����
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //�������� ��� ��� ���
        
        char[] ch = string.toCharArray();
        
        char[] ch2 = new char[ch.length];
        ch2[0] = Character.toUpperCase(ch[0]);
        for (int i = 1; i < ch.length; i++){
            
            if (ch[i - 1] == ' ') ch2[i] = Character.toUpperCase(ch[i]);
            else ch2[i] = ch[i];
        }
        System.out.println(new String(ch2));
        
    }
}
