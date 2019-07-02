package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int n2, maximum;
        maximum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N - 1; i++){
            // n2 = 3;
            n2 = Integer.parseInt(reader.readLine());
            maximum = maximum > n2 ? maximum : n2;
        }
        
        //напишите тут ваш код
        System.out.println(maximum);
    }
}
