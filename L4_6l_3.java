package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n1, n2, n3, p;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        
        if (n1 > n2) {
            p = n1;
            n1 = n2;
            n2 = p;
        }
        if (n2 > n3) {
            p = n2;
            n2 = n3;
            n3 = p;
        }
        if (n1 > n2) {
            p = n1;
            n1 = n2;
            n2 = p;
        }
        System.out.println(n3 + " " + n2 + " " + n1);
        
}
}