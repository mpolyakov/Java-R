package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
������ �� ����������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //�������� ��� ��� ���
        
        for (int j = 0; j < array.length; j++) {
                for (int i = j + 1; i < array.length; i++) {
                    if (!isGreaterThan(array[i], array[j])) {
                        String k = array[j];
                        array[j] = array[i];
                        array[i] = k;
                    }
                }
                
            }
    
    }

    //����� ��� ��������� �����: '�' ������ ��� 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
