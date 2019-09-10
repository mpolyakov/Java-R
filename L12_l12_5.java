package com.javarush.task.task12.task1225;

/* 
����������
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //�������� ��� ��� ���
        if (o instanceof Lion) return "���";
        if (o instanceof Tiger) return "����";
        if (o instanceof Cat) return "���";
        if (o instanceof Bull) return "���";
        if (o instanceof Cow) return "������";
        if (o instanceof Animal) return "��������";
        

        return "��������";
    }

    public static class Cat extends Animal   //<--������ �����������!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
