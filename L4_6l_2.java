package com.javarush.task.task04.task0419;

/* 
ћаксимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n1, n2, n3, n4, max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        n4 = Integer.parseInt(br.readLine());
        max = n1;
        if (max < n2) max = n2;
        if (max < n3) max = n3;
        if (max < n4) max = n4; 
        System.out.println(max);
        
    }
}
