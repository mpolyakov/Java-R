package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
������ ������� �����
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //�������� ��� ��� ���
        ArrayList<String>[] masList = new ArrayList[3];
        
        for (int i = 0; i < masList.length; i++){
            masList[i] = new ArrayList<String>();
            for (int j = 0; j < 3; j++){
               masList[i].add(Integer.toString(j));
                
                // System.out.println(masList[i]);
            }
        }
        
        

        return masList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}