package com.javarush.task.task14.task1408;


public class RussianHen extends Hen {
    @Override
    public String getDescription(){
        return (super.getDescription() + " ��� ������ - " + Country.RUSSIA + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����.");
    }
    
    public int getCountOfEggsPerMonth(){
            return 10;
    }
}