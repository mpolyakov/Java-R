package com.javarush.task.task09.task0905;

/* 
���, � ����� �������� ����-�������
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();
        
    }

    public static int getStackTraceDeep() {
        //�������� ��� ��� ���
        // StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
    }
}

