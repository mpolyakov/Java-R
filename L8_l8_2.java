package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        int[] init = new int[]{10,56,2,49,23,89,1569,442,1,8,7,456,985,369,15,64,356,899,315,96};
        for(int i : init){
            set.add(i);
        }
        // System.out.println(set.toString());
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }
        }
        // System.out.println(set.toString());
        return set;

    }

    public static void main(String[] args) {
        Set<Integer> set1 = createSet();
        Set<Integer> set2 = removeAllNumbersGreaterThan10(set1);

    }
}
