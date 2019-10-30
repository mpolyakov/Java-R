package com.javarush.task.task16.task1617;

/* 
������ �� ������
*/

public class Solution {
    public static volatile int numSeconds = 4;
    

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - ������ ��� ���
        Thread.sleep(3500);
        clock.interrupt();
        
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - ������ ��� ���
            boolean isYetWorking = true;
            Thread current = Thread.currentThread();
            
            while (numSeconds > 0){
                
                System.out.print(numSeconds + " ");
                
                if (current.isInterrupted()){
                    isYetWorking = false;
                    System.out.println("��������!");
                    break;
                }
                
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                        isYetWorking = false;
                        System.out.println("��������!");
                }
                
                numSeconds--;
            }
            
            if(isYetWorking) System.out.println("����!");
            
        }
    }
}
