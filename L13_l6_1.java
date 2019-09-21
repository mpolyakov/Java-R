package com.javarush.task.task13.task1315;

/* 
���, ������ � �����
*/

public class Solution {
    public static void main(String[] args) {

    }
    //����� ���������
    public interface Movable {
        void move();
    }

    //����� ���� ������
    public interface Edible {
        void beEaten();
    }

    //����� ����-������ ������
    public interface Eat {
        void eat();
    }
    
    public class Dog implements Eat, Movable{
        public void move(){
            
        }
        public void eat(){
            
        }
        
    }
    
    public class Cat implements Eat, Movable, Edible {
        public void eat(){
            
        }
        public void move(){
            
        }
        public void beEaten(){
            
        }
    }
    
    public class Mouse implements Movable, Edible {
        public void move(){
            
        }
        public void beEaten(){
            
        }
    }
}