package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("море");
        strings.add("мир");
        strings.add("ромб");
        strings.add("рубец");
        
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> newString = new ArrayList<String>();
        for (String s : strings){
            if (s.contains("р") && s.contains("л")) {
                newString.add(s);
                continue;
            }
            if (!s.contains("р") && !s.contains("л")) {
                newString.add(s);
                continue;
            }
            if (s.contains("р")) {
                
            }
            if (s.contains("л")) {
                newString.add(s);
                newString.add(s);
            }
        }
        return newString;
    }
}