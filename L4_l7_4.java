package com.javarush.task.task04.task0429;

/* 
������������� � ������������� �����
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        int n1, n2, n3, numP = 0, numN = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        
        if (n1 > 0) {
            numP++;
        } else if (n1 < 0) numN++;
        if (n2 > 0) {
            numP++;
        } else if (n2 < 0) numN++;
        if (n3 > 0) {
            numP++;
        } else if (n3 < 0) numN++;
        
        System.out.println("���������� ������������� �����: " + numN);
        System.out.println("���������� ������������� �����: " + numP);

    }
}
