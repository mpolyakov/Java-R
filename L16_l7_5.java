package com.javarush.task.task16.task1615;

/* 
��������
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   //1 �������� ������

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("������� #1");
        Plane plane2 = new Plane("������� #2");
        Plane plane3 = new Plane("������� #3");
    }

    private static void waiting() {
        //add your code here - ������ ��� ���
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    private static void takingOff() {
        //fix this method - ������� ���� �����
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    //���� �������� ������ ��������, �������� ��
                    System.out.println(getName() + " ��������");
                    takingOff();//��������
                    System.out.println(getName() + " ��� � ����");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  //���� �������� ������ ������ ���������
                    System.out.println(getName() + " �������");
                    waiting(); //�������
                }
            }
        }
    }

    public static class Runway { //�������� ������
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

