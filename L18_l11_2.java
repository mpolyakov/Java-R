//� ����� main ������ ���������� �������� ��� �����.
//������� �� ����� ����������� ���������� �������� � ���������� ���� ��������. ��������, 10.45.
//1. ��������� ���������� ���� ��������.
//2. ��������� ���������� ��������.
//3. ������� �� ����� �2/�1*100, �������� �� 2 ������ ����� �������.
//4. ������� ������.

package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
�������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        float countAll = 0;
        float countSpaces = 0;
        FileInputStream fis = new FileInputStream(args[0]);
        while(fis.available() > 0){
            int b = fis.read();
            countAll++;
            if (b == 32){
                countSpaces++;
            }
        }
        float rel = countSpaces / countAll * 100;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(rel));
        // System.out.println(rel);
        fis.close();
        

    }
}
