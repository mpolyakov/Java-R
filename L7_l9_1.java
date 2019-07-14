package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> intList0 = new ArrayList<Integer>();
        ArrayList<Integer> intList1 = new ArrayList<Integer>();
        ArrayList<Integer> intList2 = new ArrayList<Integer>();
        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        
        for(int i = 0; i < 20; i++){
            intList0.add(Integer.parseInt(br.readLine()));
        }
        for (Integer i : intList0){
            if(i % 3 == 0) intList1.add(i);
            if(i % 2 == 0) intList2.add(i);
            if(i % 3 != 0 && i % 2 != 0) intList3.add(i);
        }
        
        printList(intList1);
        printList(intList2);
        printList(intList3);
        
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) System.out.println(i);
    }
}
