package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n1, n2, n3;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        if ((n1 != n2) && (n1 != n3) && (n2 == n3)) System.out.println(1);
        else if ((n2 != n1) && (n2 != n3) && (n1 == n3)) System.out.println(2);
        else if ((n3 != n1) && (n2 != n3) && (n1 == n2)) System.out.println(3);
        
    }
}
