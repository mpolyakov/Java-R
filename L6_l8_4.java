package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
����� ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //�������� ��� ��� ���
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return str = br.readLine();

    }

    public static int readInt() throws Exception {
        //�������� ��� ��� ���
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return i = Integer.parseInt(br.readLine());

    }

    public static double readDouble() throws Exception {
        //�������� ��� ��� ���
        double dbl;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return dbl = Double.parseDouble(br.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //�������� ��� ��� ���
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return (br.readLine().equals("true"));
        

    }

    public static void main(String[] args) throws Exception {

    }
}
