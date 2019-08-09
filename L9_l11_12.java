package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty() || s == null) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        // for (String x : array) {
        //     System.out.println(x);
        // }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> listInt = new ArrayList<>();
        ArrayList<String> listStr = new ArrayList<>();
        for(String a : array){
            if (isNumber(a)) listInt.add(a);
            else listStr.add(a);
        }
        // System.out.println(listStr);             //вывод в консоль
        
        // System.out.println(listInt);            //вывод в консоль
        
        String[] arrInt = new String[listInt.size()];
        String[] arrStr = new String[listStr.size()];
        listInt.toArray(arrInt);
        listStr.toArray(arrStr);
        
        // for(String i : arrInt) System.out.println(i      //вывод в консоль
        
        // for(String s : arrStr) System.out.println(s);      //вывод в консоль
        
        
        for(int i = arrInt.length-1 ; i > 0 ; i--){ //сортировка чисел
            for(int j = 0 ; j < i ; j++){
                //Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if( Integer.parseInt(arrInt[j]) < Integer.parseInt(arrInt[j+1])){
                    String tmp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = tmp;
                }
            }
        }
        // for(String i : arrInt) System.out.println(i);    //вывод в консоль
        
        
        for(int i = arrStr.length-1 ; i > 0 ; i--){ //сортировка строк
            for(int j = 0 ; j < i ; j++){
                //Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if( isGreaterThan(arrStr[j], arrStr[j+1])){
                    String tmp = arrStr[j];
                    arrStr[j] = arrStr[j+1];
                    arrStr[j+1] = tmp;
                }
            }
        }
        // for(String s : arrStr) System.out.println(s);    //вывод в консоль
        
        array = ArrayUtils.addAll(arrStr, arrInt);
        
        for(String s : array) System.out.println(s);
        
        
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
