package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;

/* 
������ �����
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // �������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameF = br.readLine();
        
        InputStream inStream = new FileInputStream(nameF);
        while (inStream.available() > 0)
        {
            int data = inStream.read(); //������ ���� ���� �� ������ ��� ������
            
            System.out.print((char)data);
            // outStream.write(data); //���������� ����������� ���� � ������ �����.
        }
        
        inStream.close(); //��������� ������
        br.close();
        // outStream.close();
    }
}