package com.javarush.task.task06.task0605;


import java.io.*;

/* 
������������ ����� ����
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // �������� ��� ��� ���
            double ind;
            ind = weight / (height * height);
            if (ind < 18.5) System.out.println("�������: ������ ��� 18.5");
            else if (ind < 25 && ind >= 18.5) System.out.println("����������: ����� 18.5 � 25");
            else if (ind < 30 && ind >= 25) System.out.println("���������� ���: ����� 25 � 30");
            else if (ind >=30) System.out.println("��������: 30 ��� ������");
        }
    }
}
