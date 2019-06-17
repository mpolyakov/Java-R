package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int y, m, d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        y = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        System.out.println("Меня зовут " + name + ".");
        System.out.print( "Я родился " + d + "." + m + "." + y);
    }
}
