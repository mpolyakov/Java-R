//В методе main подмените объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна заменять все подстроки "te" на "??".
//Вызови готовый метод printSomething(), воспользуйтесь testString.
//Верни переменной System.out первоначальный поток.
//Выведи модифицированную строку в консоль.

package com.javarush.task.task19.task1912;

import java.util.*;
import java.io.*;


/* 
Ридер обертка 2
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
        
        System.out.println(result.replace("te", "??"));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
