//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна выводить на консоль решенный пример.
//Вызови готовый метод printSomething(), воспользуйтесь testString.
//Верни переменной System.out первоначальный поток.

//Возможные операции: + - *
//Шаблон входных данных и вывода: a [знак] b = c
//Отрицательных и дробных чисел, унарных операторов - нет.

package com.javarush.task.task19.task1914;

import java.util.*;
import java.io.*;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        
        testString.printSomething();
        
        String result = outputStream.toString();
        
        System.setOut(consoleStream);
        
        String[] arrString = result.split(" ");
        
        int answer;
        
        if(arrString[1].equals("+")) {
            answer = Integer.parseInt(arrString[0]) + Integer.parseInt(arrString[2]);
            System.out.print(result + " " + answer);
        }
        if(arrString[1].equals("-")) {
            answer = Integer.parseInt(arrString[0]) - Integer.parseInt(arrString[2]);
            System.out.print(result + " " + answer);
        }
        if(arrString[1].equals("*")) {
            answer = Integer.parseInt(arrString[0]) * Integer.parseInt(arrString[2]);
            System.out.print(result + " " + answer);
        }
            
            
            
            
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

