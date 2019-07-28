package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>(3);
        
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        
        result.add(dog1);
        result.add(dog2);
        result.add(dog3);
        
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> result = new HashSet<>();
        for(Cat c : cats){
            result.add(c);
        }
        for(Dog d : dogs){
            result.add(d);
        }
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        
        pets.removeAll(cats);
        // Iterator<Object> it1 = pets.iterator();
        
        // while (it1.hasNext()){
        //     for (Cat c : cats){
        //         if(it1.next().equals(c)) pets.remove(it1.next());
        //     }
            // Iterator<Cat> it2 = cats.iterator();
            // while (it2.hasNext()){
                // if(it1.next().equals(it2.next())) pets.remove(it1.next());
            // }
            
        // }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object p : pets){
            System.out.println(p);
        }
    }

    //напишите тут ваш код
    public static class Dog{
        
    }
    
    public static class Cat{
        
    }
}
