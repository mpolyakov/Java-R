package com.javarush.task.task04.task0416;

/* 
��������� ������ �������
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        double t;
        String strT;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strT = bufferedReader.readLine();
        t = Double.parseDouble(strT);
        if (((t % 5) >= 0) & ((t % 5) < 3)) {
            System.out.println("������");
        } else if (((t % 5) >= 3) & ((t % 5) < 4)) {
            System.out.println("�����");
        } else System.out.println("�������");
        
    }
}