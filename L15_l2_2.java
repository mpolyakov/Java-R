package com.javarush.task.task15.task1502;

/* 
��� - ������������ ��������
*/

public class Solution {
    //�������� ������ Goose � Dragon ���
    public static class Goose extends SmallAnimal {
        public String getSize(){
            return "���� ���������, " + super.getSize();
        }
    
    }
    public static class Dragon extends BigAnimal {
        public String getSize(){
            return "������ �������, " + super.getSize();
        }
    }

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "��� ��������";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "��� �����";
        }
    }
}
