package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> setS = new HashSet<String>();
        setS.add("арбуз");
        setS.add("банан");
        setS.add("вишня");
        setS.add("груша");
        setS.add("дыня");
        setS.add("ежевика");
        setS.add("женьшень");
        setS.add("земляника");
        setS.add("ирис");
        setS.add("картофель");
        
        for (String s : setS){
            System.out.println(s);
        }

    }
}
