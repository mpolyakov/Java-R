package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childChild = new ArrayList<>();
        Human child1 = new Human("MAry", false, 12, childChild);
        Human child2 = new Human("Ivon", true, 15, childChild);
        Human child3 = new Human("Iva", false, 17, childChild);
        ArrayList<Human> lowChild = new ArrayList<>();
        lowChild.add(child1);
        lowChild.add(child2);
        lowChild.add(child3);
        Human father = new Human("Peter", true, 44, lowChild);
        Human mother = new Human("Tatra", false, 36, lowChild);
        ArrayList<Human> midChild1 = new ArrayList<>();
        midChild1.add(father);
        ArrayList<Human> midChild2 = new ArrayList<>();
        midChild2.add(mother);
        
        Human ded1 = new Human("Umpen", true, 77, midChild1);
        Human ded2 = new Human("Pnompen", true, 88, midChild2);
        Human bab1 = new Human("Umka", false, 76, midChild1);
        Human bab2 = new Human("Zimka", false, 87, midChild2);
        
        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(ded2);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age; 
        }
        
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this(name, sex, age);
            this.children = children; 
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
