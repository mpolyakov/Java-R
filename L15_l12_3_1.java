package com.javarush.task.task15.task1521;

import java.math.BigDecimal;

/* 
���. ����������
*/

public class Solution {
    public static void main(String[] args) {
        //���� 2.
        //����� ��� Object
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        //���� 3.
        //����� ��� Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //���� 4.
        //����� ��� String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
