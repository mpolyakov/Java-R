package com.javarush.task.task04.task0411;

/* 
������� ���� �� �����
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //�������� ��� ��� ���
        if (((month < 3) & (month > 0)) || (month == 12)){
            System.out.println("����");
        } else if ((month >= 3) & (month <=5)) {
            System.out.println("�����");
        } else if ((month >= 6) & (month <=8)) {
            System.out.println("����");
        } else {
            System.out.println("�����");
        }
            
    }
}