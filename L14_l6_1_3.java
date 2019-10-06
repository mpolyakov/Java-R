package com.javarush.task.task14.task1408;


public class RussianHen extends Hen {
    @Override
    public String getDescription(){
        return (super.getDescription() + " ћо€ страна - " + Country.RUSSIA + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.");
    }
    
    public int getCountOfEggsPerMonth(){
            return 10;
    }
}