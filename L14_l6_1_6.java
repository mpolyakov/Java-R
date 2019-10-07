package com.javarush.task.task14.task1408;


public class UkrainianHen extends Hen {
    @Override
    public String getDescription(){
        return (super.getDescription() + " ћо€ страна - " + Country.UKRAINE + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.");
    }
    
    public int getCountOfEggsPerMonth(){
        return 40;    
    }
}