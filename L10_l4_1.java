package com.javarush.task.task10.task1001;

/* 
������ �1 �� �������������� ����� �����
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        
        byte c = (byte) (a * b);
        
        double f = (char) 1234.15;
        // System.out.println((short)(a + f/c + b));
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
