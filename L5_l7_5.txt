package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;
    
    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;
    }
    public void initialize(int left, int top, int height){
        this.left = left;
        this.top = top;
        this.height = height;
        
    }
    public void initialize( int width, int height){
        
        this.height = height;
        this.width = width;
    }
    public void initialize(int left){
        this.left = left;
        
    }

    public static void main(String[] args) {

    }
}
