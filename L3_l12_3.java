package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int c1, c2, c3, sum;
        
        c1 = number % 10;
        c2 = (number / 10) %  10;
        c3 = (number / 100) % 10;
        sum = c1 + c2 + c3;
        return sum;
        
    }
}