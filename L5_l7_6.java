package com.javarush.task.task05.task0514;

/* 
����������� ������� ��������
*/

public class Solution {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        Person person = new Person();
        person.initialize("Joker", 23);
        
    }

    static class Person {
        //�������� ��� ��� ���
        private String name;
        private int age;
        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
