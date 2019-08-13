package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private int height;
        private String eyeColor;
        private int weight;
        
        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this(name);
            this.age = age;
        }
        public Human(boolean sex, String eyeColor){
            this.sex = sex;
            this.eyeColor = eyeColor;
        }
        public Human(boolean sex, String eyeColor, int age){
            this(sex, eyeColor);
            this.age = age;
        }
        public Human(String name, boolean sex, int age, String eyeColor){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.eyeColor = eyeColor;
            
        }
        public Human(String name, boolean sex, int age, String eyeColor, int height, int weight){
            this(name, sex, age, eyeColor);
            this.height = height;
            this.weight = weight;
        }
        public Human(int heigh, int weight){
            this.height = height;
            this.weight = weight;
            
        }
        public Human(int height){
            this.height = height;
        }
        public Human(boolean sex, int height){
            this.sex = sex;
            this.height = height;
        }
        public Human(boolean sex, int height, int weight){
            this(sex, height);
            this.weight = weight;
        }
        
        
    }
}
