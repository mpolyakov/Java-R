package com.javarush.task.task12.task1220;

/* 
����� Human � ���������� CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - ������ public ���������� � public ����� ���
    public abstract class Human implements CanRun, CanSwim{
        
    }
    public interface CanRun{
        public void run();
    }
    
    public interface CanSwim{
        public void swim();
    }
}
