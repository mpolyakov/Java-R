package com.javarush.task.task14.task1420;

import java.io.*;

/* 
мнд
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        // try{
            Integer n1 = Integer.parseInt(br.readLine());
            Integer n2 = Integer.parseInt(br.readLine());
            
            if ((n1 <= 0) || (n2 <= 0)) throw new NumberFormatException();
            if (!(n1 instanceof Integer) || !(n2 instanceof Integer))  throw new NumberFormatException();
        // } catch (Exception e){
        //     System.out.println("Achtung!");
        // }
            int n = 0;
            int nod = 1;
            
            if (n1 < n2) n = n1;
            else n = n2;
            
            for (int i = 1; i <= n; i++){
                if ((n1 % i == 0) && (n2 % i == 0)) nod = i;
            }
            System.out.println(nod);
        // catch (IOException e ){
        //     System.out.println("Achtung IO!");
        // }
        
        
    } 
}
