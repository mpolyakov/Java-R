package com.javarush.task.task04.task0426;

/* 
������ � �����
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        int n;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        if(((n % 2) == 0) && (n > 0)){
            System.out.println("������������� ������ �����");
        } else if (((n % 2) == 0) && (n < 0)){
            System.out.println("������������� ������ �����");
        } else if (((n % 2) != 0) && (n < 0)){
            System.out.println("������������� �������� �����");
        } else if (((n % 2) != 0) && (n > 0)){
            System.out.println("������������� �������� �����");
        } else if (n == 0) {
            System.out.println("����");
        }
    }
}
