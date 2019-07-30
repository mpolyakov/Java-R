package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List<String> list = new ArrayList<>();
        // while (true) {
        //     String family = reader.readLine();
        //     if (family.isEmpty()) {
        //         break;
        //     }

        //     list.add(family);
        // }
        
        HashMap<String, String> map = new HashMap<>();
        String input2;
        while (true) {
            String input1 = reader.readLine();
            input2 = reader.readLine();
            if (input1.isEmpty()) {
                break;
            }

            map.put(input1, input2);
        }
        String city = reader.readLine();
        
        System.out.println(map.get(input2));
        
        // System.out.println(map);

        // Read the house number
        
        // String city = reader.readLine();
        // System.out.println(map.get(city));
        
        // while (true) {
        //     String city = reader.readLine();
        //     if (city.isEmpty()) {
        //         continue;
        //     } 
        //     else {
        //         System.out.println(map.get(city));
        //         break;
        //     }

        // }
        
    }
}
