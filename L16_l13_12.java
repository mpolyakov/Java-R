package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    
    static{
        Thread1 thread1 = new Thread1();
        threads.add(thread1);
        // thread1.start();
        
        Thread2 thread2 = new Thread2();
        threads.add(thread2);
        // thread2.start();
        
        Thread3 thread3 = new Thread3();
        threads.add(thread3);
        // thread3.start();
        
        Thread4 thread4 = new Thread4();
        threads.add(thread4);
        // thread4.start();
        thread4.showWarning();
        
        Thread5 thread5 = new Thread5();
        threads.add(thread5);
        // thread5.start();
    }

    public static void main(String[] args) throws Exception {
        
        
        
    }
    
    public static class Thread1 extends Thread{
        public void run(){
            while(true){
                
            }
        }
    }
    
    public static class Thread2 extends Thread{
        public void run(){
            try{
                Thread.sleep(500);
                Thread.currentThread().interrupt();
                
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    
    public static class Thread3 extends Thread{
        public void run() {
            
            try{
                while(true){
                    System.out.println("Óðà");
                    Thread.sleep(500);
                    
                }
            }catch(InterruptedException e){
                
            }
            
            
        }
    }
    
    public static class Thread4 extends Thread  implements Message{
        public void run(){
            while(!this.isInterrupted()) {
                
           }
        }
        
        public void showWarning(){
            if(Thread.currentThread().isAlive()){
                this.interrupt();
            }
        }
    }
    
    public static class Thread5 extends Thread{
        public void run(){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            int sum = 0;
            while(true){
                try{
                  str = br.readLine();
                    if(str.equals("N")) break;
                    sum = sum + Integer.parseInt(str);  
                }catch(IOException e){
                    
                }
                
            }
            System.out.println(sum);
            
        }
        
        
    }
}