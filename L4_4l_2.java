package com.javarush.task.task04.task0409;

/* 
��������� � 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(-8, -11);
        displayClosestToTen(-10, -15);
    }

    public static void displayClosestToTen(int a, int b) {
        // �������� ��� ��� ���
        if ((abs(a - 10)) < (abs(b - 10))){
            System.out.println(a);
        } else System.out.println(b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}