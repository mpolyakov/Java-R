package com.javarush.task.task16.task1622;

/* 
ѕоследовательные выполнени€ нитей
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            Thread ttt = new SleepingThread();
            //напишите тут ваш
            ttt.join();
            
        }
    }

    public static class SleepingThread extends Thread  {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //напишите тут ваш код
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("Ќить прервана");
                }
                try{
                    Thread.sleep(10);
                } catch(InterruptedException e){
                    
                }
                
            }
            
            
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
