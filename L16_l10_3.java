package com.javarush.task.task16.task1618;

/* 
����� interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - ������ ��� ���
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
        
        
    }

    //Add your code below - ������ ��� ����
    public static class TestThread extends Thread {
        Thread current = Thread.currentThread();
        
        public void run(){
            
        }
        
    }
}