package com.javarush.task.task04.task0425;

/* 
���� �����������!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        String strA, strB;
        int a, b;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        strA = br.readLine();
        strB = br.readLine();
        a = Integer.parseInt(strA);
        b = Integer.parseInt(strB);
        
        if ((a > 0) && (b > 0)) {
            System.out.println(1);
        } else if ((a < 0) && (b > 0)){
            System.out.println(2);
        } else if ((a < 0) && (b < 0)){
            System.out.println(3);
        } else if ((a > 0) && (b < 0)){
            System.out.println(4);
        }
    }
}
