package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] m1 = {1, 3, 6, 4, 4};
        int[] m2 = {22, 53};
        int[] m3 = {22, 534, 64, 8};
        int[] m4 = {2, 553, 678, 88, 345, 3, 76};
        int[] m5 = new int[0];
        
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
