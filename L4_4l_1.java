package com.javarush.task.task04.task0408;

/* 
������ ��� �����?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //�������� ��� ��� ���
        if (a < 5){
            System.out.println("����� ������ 5");
        } else if (a > 5) {
            System.out.println("����� ������ 5");
        } else {
            System.out.println("����� ����� 5");
        }
    }
}