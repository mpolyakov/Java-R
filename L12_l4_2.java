package com.javarush.task.task12.task1207;

/* 
Int � Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(3);
        print((Integer)5);

    }

    //�������� ��� ���� ������
    public static void print(int a){
        System.out.println("This is int");
    }
    
    public static void print(Integer b){
        System.out.println("This is Integer");
        
    }
}
