package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
����� � ����
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //�������� ��� ��� ���
        int[] street = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumNech = 0, sumCh = 0;
        String message;
        
        for (int i = 0; i < street.length; i++){
            street[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < street.length; i = i + 2){
            sumCh = sumCh + street[i];
        }
        for (int i = 1; i < street.length; i = i + 2){
            sumNech = sumNech + street[i];
        }
        // System.out.println(sumCh);
        // System.out.println(sumNech);
        message = (sumCh > sumNech) ? "� ����� � ������� �������� ��������� ������ �������." : "� ����� � ��������� �������� ��������� ������ �������.";
        System.out.println(message);
    }
}
