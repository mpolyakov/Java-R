package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human h1 = new Human("Mona", false, 21);
        Human h2 = new Human("Garry", true, 27);
        Human h3 = new Human("Kurt", true, 34);
        Human h4 = new Human("Igni", false, 32);
        Human h5 = new Human("Irga", false, 23, h2, h1);
        Human h6 = new Human("Irvin", true, 19, h2, h1);
        Human h7 = new Human("Buddy", true, 33, h2, h4);
        Human h8 = new Human("Zhora", true, 25, h3, h4);
        Human h9 = new Human("Zara", false, 22, h3, h1);
        
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());
        System.out.println(h8.toString());
        System.out.println(h9.toString());
        
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age; 
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}