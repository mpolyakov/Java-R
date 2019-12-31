//� ������ main ��������� ������ System.out ���������� ����� �����-�������� �� �������� � �������.
//���� �����-������� ������ �������� ��� ��������� "te" �� "??".
//������ ������� ����� printSomething(), �������������� testString.
//����� ���������� System.out �������������� �����.
//������ ���������������� ������ � �������.

package com.javarush.task.task19.task1912;

import java.util.*;
import java.io.*;


/* 
����� ������� 2
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
