package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Set �� �����
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //�������� ��� ��� ���. step 3 - ����� 3
        // cats.remove(1);
        Iterator<Cat> it = cats.iterator();
        
        while (it.hasNext()){
            cats.remove(it.next());
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //�������� ��� ��� ���. step 2 - ����� 2
        Set<Cat> cats = new HashSet<Cat>(3);
        // Cat cat1 = new Cat();
        // Cat cat2 = new Cat();
        // Cat cat3 = new Cat();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - ����� 4
        Iterator<Cat> it = cats.iterator();
        
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
    }

    // step 1 - ����� 1
    public static class Cat{
        
    }
}
