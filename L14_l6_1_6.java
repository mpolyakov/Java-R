package com.javarush.task.task14.task1408;


public class UkrainianHen extends Hen {
    @Override
    public String getDescription(){
        return (super.getDescription() + " ��� ������ - " + Country.UKRAINE + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����.");
    }
    
    public int getCountOfEggsPerMonth(){
        return 40;    
    }
}