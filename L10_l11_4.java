package com.javarush.task.task10.task1011;

import java.util.ArrayList;
import java.util.Arrays;
/* 
������� ��������
*/

public class Solution {
    public static void main(String[] args) {
        String s = "� �� ���� ������� Java, � ���� ������� ��������";

        //�������� ��� ��� ���
        char[] chArr = s.toCharArray();
        
        for (char i = 0; i < 40; i++){
            for (char j = i; j < chArr.length; j++){
                System.out.print(chArr[j]);
            }
            System.out.print("\n");
        }
        
    }

}

