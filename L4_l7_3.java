package com.javarush.task.task04.task0428;

/* 
ѕоложительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n1, n2, n3, numb = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        
        if (n1 > 0) {
            numb++;
        } 
        if (n2 > 0) {
            numb++;
        }
        if (n3 > 0) {
            numb++;
        }
        System.out.println(numb);

    }
}
