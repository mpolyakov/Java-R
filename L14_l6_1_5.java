package com.javarush.task.task14.task1408;


public class MoldovanHen extends Hen {
    @Override
    public String getDescription(){
        return (super.getDescription() + " ��� ������ - " + Country.MOLDOVA + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����.");
    }
    
    public int getCountOfEggsPerMonth(){
        return 30;    
    }
}