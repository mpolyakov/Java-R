package com.javarush.task.task05.task0522;

/* 
ћаксимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    private int cLeft, cTop;
    
    public Circle(){
        
    }
    public Circle(int cLeft, int cTop, int radius){
        this.cLeft = cLeft;
        this.cTop = cTop;
        this.radius = radius;
    }
    public Circle(int cLeft, int cTop){
        this(cLeft, cTop, 234);
    }
    public Circle(int cLeft){
        this(cLeft, 14);
    }

    public static void main(String[] args) {

    }
}