package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
���������� ������������ �����
*/

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String param;
    static int number;
    public static void main(String[] args) {
       

    }
    
    static {
        //add your code here - �������� ��� ���
        reset();
        
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - �������� ��� ���
        
        try{
           param = br.readLine();
        } catch(IOException e){
            System.out.println("������!");
        }
        if (param.equals("helicopter")) {
            result = new Helicopter();
        } else if (param.equals("plane")) {
            try{
            number = Integer.parseInt(br.readLine());
            br.close();
        } catch(IOException e){
            System.out.println("������!");
        }
          
          
            result = new Plane(number);
        }
        
        
    }
}
