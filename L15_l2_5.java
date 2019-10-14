package com.javarush.task.task15.task1505;

import java.util.ArrayList;
import java.util.List;

/* 
��� - ������� ������ � ������������
*/

public class Solution {
    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return "Yes";
        }

        public String toString() {
            return containsBones().equals("Yes") ? name + " �������� �����" : name + " �� �������� �����";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            if (super.containsBones().equals("Yes") && !isArtificial) return "Yes";
            return "No";
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("����").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("������"));
        bodyParts.add(new BodyPart("����"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("�������", true));
        fingers.add(new Finger("������������", true));
        fingers.add(new Finger("�������", true));
        fingers.add(new Finger("����������", false));
        fingers.add(new Finger("�������", true));
        System.out.println(fingers.toString());
    }
}

