package com.javarush.task.task04.task0413;

/* 
���� ������
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int num = Integer.parseInt(str);
        switch (num){
            case 1: System.out.println("�����������");
            break;
            case 2: System.out.println("�������");
            break;
            case 3: System.out.println("�����");
            break;
            case 4: System.out.println("�������");
            break;
            case 5: System.out.println("�������");
            break;
            case 6: System.out.println("�������");
            break;
            case 7: System.out.println("����������� ");
            break;
            default: System.out.println("������ ��� ������ �� ����������");
            break;
        }
    }
}