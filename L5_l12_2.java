package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man ("Petya", 23, "Petrovka 38");
        Man man2 = new Man ("Zhenya", 34, "Vnukovo");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        
        Woman woman1 = new Woman ("Lesya", 19, "Zelenograd");
        Woman woman2 = new Woman ("Sveta", 25, "Piter");
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    //напишите тут ваш код
    public static class Man {
        private String name;
        private int age;
        private String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString (){
            return (this.name + " " + this.age + " " + this.address);
        }
    }
    
    public static class Woman {
        private String name;
        private int age;
        private String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString (){
            return (this.name + " " + this.age + " " + this.address);
        }
    }
    
}
