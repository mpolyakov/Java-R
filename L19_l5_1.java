//������� � ������� 2 ����� �����.
//������� �� ������ ���� ��� ������� � ������ ���������� ������� (��������� ���������� � 1).

//������ ������� �����:
//text in file
//����� �� ������ �����:
//eti ie

//������� ������ �����-�����

package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.*;
/* 
������ �������
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        FileWriter fw = new FileWriter(br.readLine());
        br.close();
        ArrayList<Integer> list = new ArrayList<>();
        
        
        while(fr.ready()){
            int in = fr.read();
            list.add(in);
        }
        for(int i = 1; i < list.size(); i = i + 2){
            fw.write(list.get(i));
        }
        
        fr.close();
        fw.close();
        
    }
}

