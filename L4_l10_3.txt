package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n, i = 1;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        n = Integer.parseInt(br.readLine());
        while (i <= n){
            System.out.println(str);
            i++;
        }

    }
}
