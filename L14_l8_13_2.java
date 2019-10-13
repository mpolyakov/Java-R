package com.javarush.task.task14.task1421;


public class Singleton {
    public static int sch = 0;
    private static Singleton instance;
    private Singleton (){
        sch++;
    }
    public static Singleton  getInstance(){
        if (sch == 0) {
            // sch++;
            instance = new Singleton();
            
        } else instance = null;
        return instance;
    }
}