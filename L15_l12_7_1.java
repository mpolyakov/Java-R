package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
���� � ����������� �����
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static{
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
//        List<String> lines = new ArrayList<String>();
        try {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        System.out.println(lines);


    }
}
