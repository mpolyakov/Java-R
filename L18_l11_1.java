//� ����� main ������ ���������� �������� ��� �����.
//��������� ���������� ���� ����������� ��������, ������� ���� � ���� �����.
//������� �� ����� ����� (���������� ����).
//������� ������.

package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* 
���������� �����
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0;
        FileInputStream fis = new FileInputStream(args[0]);
        while(fis.available() > 0){
            // char c = char(b);
            int b = fis.read();
            if ((65 <= b && b <= 90) || (97 <= b && b <= 122)) count++;
        }
        System.out.println(count);
        fis.close();
        
    }
}
