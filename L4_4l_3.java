package com.javarush.task.task04.task0410;

/* 
������-��-������
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //�������� ��� ��� ���
        if ((a > 50) & (a < 100)){
            System.out.println("����� " + a + " ���������� � ���������.");
        } else {System.out.println("����� " + a + " �� ���������� � ���������.");
            
        }
    }
}