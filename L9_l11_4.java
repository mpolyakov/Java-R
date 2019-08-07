package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
 акое сегодн€ число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        
        data = br.readLine();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(data);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println((dateFormat.format(date)).toUpperCase());
        
        // System.out.println(date);
    }
}
