//Считай с консоли имя файла.
//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//Закрой поток файла.

package com.javarush.task.task19.task1915;

import java.util.*;
import java.io.*;


/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        
        System.setOut(consoleStream);
        
        FileOutputStream fos = new FileOutputStream(name);
        byte[] buffer = result.getBytes();
        fos.write(buffer);
        fos.close();
        System.out.println(outputStream.toString());
        
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

