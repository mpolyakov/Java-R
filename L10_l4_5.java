package com.javarush.task.task10.task1005;

/* 
������ �5 �� �������������� ����� �����
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (int) 300;
        short c = (short) ((int) b - (int) a);
        System.out.println(c);
    }
}