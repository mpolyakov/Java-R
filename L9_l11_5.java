package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
������� � ���������
*/

public class Solution {
    public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        char[] stringToCharArray = inputString.toCharArray();
        
        ArrayList<Character> charVow = new ArrayList<>();
        ArrayList<Character> charNoVow = new ArrayList<>();
        Character space =  ' ';
        
        for (Character c : stringToCharArray){
            if (isVowel(c)) charVow.add(c);
            else if (c.equals(space)) continue;
            else charNoVow.add(c);
        }
        
        for (Character c : charVow){
            System.out.print(c + " ");
        }
        System.out.println( "" );
        
        for (Character c : charNoVow){
            System.out.print(c + " ");
        }
    }

    // ����� ���������, ������� �� �����
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // �������� ������ � ������ ������� - �� ��������� � �������� ������
        for (char d : vowels) {  // ���� ����� ������� �������
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}