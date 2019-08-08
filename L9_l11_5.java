package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        char[] stringToCharArray = inputString.toCharArray();
        
        ArrayList<Character> charVow = new ArrayList<>();
        ArrayList<Character> charNoVow = new ArrayList<>();
        Character space =  ' ';
        
        for (Character c : stringToCharArray){
            if (isVowel(c)) charVow.add(c);
            else if (c.equals(space)) continue;
            else charNoVow.add(c);
        }
        
        for (Character c : charVow){
            System.out.print(c + " ");
        }
        System.out.println( "" );
        
        for (Character c : charNoVow){
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}