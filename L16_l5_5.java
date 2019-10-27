package com.javarush.task.task16.task1610;

/* 
�������� ������ ������� join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("�����");
        Cat cat2 = new Cat("�������");
    }

    private static void investigateWorld() {
        try{
            Thread.sleep(200);
        } catch (InterruptedException e){
            
        }
        

    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("������� 1, ���� - " + getName());
            kitten2 = new Kitten("������� 2, ���� - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " ������ 2 �������");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            
            System.out.println(getName() + ": ��� ������ � ��������. " + getName() + " ������� �� �����");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
            kitten1.join();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", ����� �� ��������");
            investigateWorld();
        }
    }
}
