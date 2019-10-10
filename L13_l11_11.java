package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


/* 
���������� ������ ����� �� �����
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // �������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //C:\\Users\\Mik\\Desktop\\PROGRAMMING\\JavaRush\\strs.txt
        String nameF = br.readLine();
        FileInputStream inStream = new FileInputStream(nameF);

        br = new BufferedReader(new InputStreamReader(inStream));
        ArrayList<Integer> list = new ArrayList<>();
        int ii;

        String line;

        while ((line = br.readLine()) != null){
            ii = Integer.parseInt(line);
            if(!list.contains(ii)) {
                list.add(ii);
            }
        }

        Collections.sort(list);

        for (Integer n : list){
            if (n % 2 == 0) System.out.println(n);
        }

        inStream.close();
        br.close();

    }
}
