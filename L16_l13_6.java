package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new CountdownRunnable(), "Уменьшаем");
        t1.start();
        t1.join();
        
        Thread t2 = new Thread(new CountUpRunnable(), "Увеличиваем");
        t2.start();
        t2.join();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
        private int countIndexUp = 1;
        
        public void run(){
            try{
                while(true){
                    System.out.println(toString());
                    countIndexUp = countIndexUp + 1;
                    Thread.sleep(500);
                    if(this.countIndexUp == 6) break;
                    
                }
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) break;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Achteng!");
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
