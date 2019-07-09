package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return str = br.readLine();

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return i = Integer.parseInt(br.readLine());

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        double dbl;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return dbl = Double.parseDouble(br.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return (br.readLine().equals("true"));
        

    }

    public static void main(String[] args) throws Exception {

    }
}
