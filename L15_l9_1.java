package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
�������-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    
    static{
        labels.put(1.1, "1");
        labels.put(2.2, "2");
        labels.put(3.3, "3");
        labels.put(4.4, "4");
        labels.put(5.5, "5");
    }
}
