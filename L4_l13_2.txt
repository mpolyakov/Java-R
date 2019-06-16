package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int m, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n - 1; j++){
                System.out.print(8);
            }
            System.out.println(8);
        }

    }
}
