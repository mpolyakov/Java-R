package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
������� �������� ��������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        String[] strArr = new String[10];
        int[] intArr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strArr.length; i++){
            strArr[i] = br.readLine();
        }
        for (int i = 0; i < intArr.length; i++){
            intArr[i] = strArr[i].length();
            System.out.println(intArr[i]);
        }
    }
}