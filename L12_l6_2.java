package com.javarush.task.task12.task1212;

/* 
�������� ���, ����� 1
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "� - �������";
        }

        public abstract Pet getChild();
    }
}
