package com.javarush.task.task14.task1408;


public class BelarusianHen extends Hen {
    @Override
    public String getDescription(){
        return super.getDescription() + " ��� ������ - " + Country.BELARUS + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����.";
    }
    
    public int getCountOfEggsPerMonth(){
          return 20;  
    }
}