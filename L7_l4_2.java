package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
������ �� ������� � �������� �������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strMass = new String[10];
        for (int i = 0; i < 8; i++){
            strMass[i] = br.readLine();
        }
        for (int i = strMass.length - 1; i >= 0; i-- ){
            System.out.println(strMass[i]);
        }
    }
}