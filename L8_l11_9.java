package com.javarush.task.task08.task0827;

import java.util.Date;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy");
        Date currentDate = formatter.parse(date);
        System.out.println(currentDate);
        
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        
        
        
        yearStartTime.setYear(currentDate.getYear());
        
        // System.out.println(yearStartTime);
        
        
        
        long milisDelta =  currentDate.getTime() - yearStartTime.getTime();
        long days = milisDelta/86400000;
        // System.out.println(days);
        if (days % 2 == 0) return false;
        else return true;
        
        
    }
}
