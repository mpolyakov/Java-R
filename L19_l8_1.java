//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//Выведи модифицированную строку в консоль.

package com.javarush.task.task19.task1911;

import java.util.*;
import java.io.*;

/* 
Ридер обертка
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
        
        result.toUpperCase();
        System.out.println(result.toUpperCase());
        

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
