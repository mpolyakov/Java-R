package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
�������-�������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        String ex = "�����";
        int num, sum = 0;
        String numS;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            numS = br.readLine();
            
            if (numS.equals(ex)) {
                break;
            } else {
                num = Integer.parseInt(numS);
                sum = sum + num;
            }
        } System.out.println(sum);
    }
}
