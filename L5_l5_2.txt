package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int count1 = 0, count2 = 0;
        
        if (weight > anotherCat.weight) count1++;
        else if (weight < anotherCat.weight) count2++;
        
        if (age > anotherCat.age) count1++;
        else if (age < anotherCat.age) count2++;
        
        if (strength > anotherCat.strength) count1++;
        else if (strength < anotherCat.strength) count2++;
        
        if (count1 > count2) return true;
        else return false;
    }

    public static void main(String[] args) {
        

    }
}
