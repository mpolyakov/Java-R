package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        
        int schetchik = 1;
        int maxSchetchik = 1;
        for (int i = 1; i < list.size(); i++ ){
            if (list.get(i).equals(list.get(i - 1))){
                schetchik = schetchik + 1;
            }
            else {
                if (maxSchetchik < schetchik){
                maxSchetchik = schetchik;
                
                } 
                schetchik = 1;   
            } 
            
          
            
        }
        if (maxSchetchik < schetchik){
            maxSchetchik = schetchik;
            
        }
        System.out.println(maxSchetchik);  
        
        

    }
}