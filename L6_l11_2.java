package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
����������� ����
*/

public class Cat {
    //�������� ��� ��� ���
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
        
    }

    public static void main(String[] args) {
        //�������� ��� ��� ���
        for (int i = 0; i <10; i++){
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //�������� ��� ��� ���
        for (int y = 0; y < cats.size(); y++){
            System.out.println(Cat.cats.get(y));
        }
    }
}
