package com.javarush.task.task15.task1517;

/* 
������� � ����������
*/

public class Solution  {
    public static int A = 0;

    static  {
        //throw an exception here - ��������� ������� ���
        if (A < 1) throw new  NumberFormatException("Achtung!");
    }

    public static int B = 5;

    public static void main(String[] args) throws Exception {
        System.out.println(B);
    }
}
