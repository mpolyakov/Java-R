package com.javarush.task.task04.task0441;


/* 
���-�� ����������
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        int n1, n2, n3, sr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        sr = n1;
        if (((n1 < n2) && (n1 > n3)) || ((n1 > n2) && (n1 < n3))) System.out.println(n1);
        else if (((n2 < n1) && (n2 > n3)) || ((n2 > n1) && (n2 < n3))) System.out.println(n2);
        else if (((n3 < n1) && (n3 > n2)) || ((n3 > n1) && (n3 < n2))) System.out.println(n3);
        
        else if (n1 == n2) System.out.println(n1);
        else if (n1 == n3) System.out.println(n1);
        else if (n2 == n3) System.out.println(n2);
        else if (n1 == n2 && n2 == n3) System.out.println(n1);
        
    }
}
