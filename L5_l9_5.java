package com.javarush.task.task05.task0520;

/* 
������� ����� ������������� (Rectangle)
*/


public class Rectangle {
    //�������� ��� ��� ���
    private int top, left, width = 0, height = 0;
    
    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left, int widht){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rect){
        this.top = rect.top;
        this.left = rect.left;
        this.height = rect.height;
        this.width = rect.width;
    }

    public static void main(String[] args) {

    }
}