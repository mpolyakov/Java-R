package com.javarush.task.task14.task1404;

import java.io.*;

/* 
����
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(true) {
           str = br.readLine();
           if (str == null || str.equals(null) || str.equals("") ) {
               break;
           } else {
            //   Cat cat111 = new Cat(str);
            //   CatFactory.getCatByKey(str); 
               System.out.println(CatFactory.getCatByKey(str).toString()); 
           }
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("�������");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("�������");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("��������");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "� ������� ��� " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "� - �������� ����� �� ����� " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "� - ����� ������� �� ����� " + getName();
        }
    }
}
