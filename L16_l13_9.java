package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();
        
        t1.join();
        t1.printResult();
        
        t2.join();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
        private static String str1, str2, str3, str11, str22;
        public void run(){
            try{
            str11 = reader.readLine() + " " + reader.readLine() + " "  + reader.readLine();
            
            // str1 = reader.readLine();
            // str2 = reader.readLine();
            // str3 = reader.readLine();  
            } catch(IOException e){
                e.printStackTrace();
            }
            
            
        }
        
        public void printResult(){
            System.out.println(str11);
            // System.out.print(" ");
            // System.out.print(str2);
            // System.out.print(" ");
            // System.out.println(str3);
        }
        
    }
}
