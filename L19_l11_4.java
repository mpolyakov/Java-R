//������� � ������� ��� �����.
//������� � ������� ��� ������ �� �����, ������� �������� ����� 2 ����� �� ������ words.
//������� ������.

//������:
//words �������� ����� �, �, �

//������:
//� � � � //3 ����� �� words, �� ��������
//� � � � //3 ����� �� words, �� ��������
//� � � //1 ����� �� words, �� ��������
//� � � � //2 ����� - ��������, �������
//� � � � //2 ����� - ��������, �������

package com.javarush.task.task19.task1922;

import java.util.ArrayList;
import java.util.List;
import java.io.*; 

/* 
���� ������ ������
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();
    

    static {
        words.add("����");
        words.add("���");
        words.add("�");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameF = br.readLine();
        br.close();
        
        FileReader fr = new FileReader(nameF);
        BufferedReader br2 = new BufferedReader(fr);
        String line;
        String [] arrList;
        int count;
        
        while((line = br2.readLine()) != null){
            arrList = line.split(" ");
            count = 0;
            for (String s : arrList){
                if(words.contains(s)) {
                    count++;
                }
            }
            if(count == 2){
                System.out.println(line);
            }
        }
        
        fr.close();
        br2.close();
        

    }
}

