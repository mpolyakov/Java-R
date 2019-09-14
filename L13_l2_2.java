package com.javarush.task.task13.task1302;

/* 
����-2. �����������
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "������� �����������";
            } else {
                return "������� ��������������";
            }

        }
        public boolean isAlcoholic(){
            return true;
        }

    }
}