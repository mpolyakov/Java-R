package com.javarush.task.task06.task0613;

/* 
��� � �������
*/

public class Solution {
    public static void main(String[] args) {
        // ������ 10 �����
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
        }

        // ������ �������� ���������� catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // ������ ����������� ���������� catCount
        public static int catCount;
        

        // ������ �����������
        public Cat(){
            catCount++;
        }
        
    }
}
