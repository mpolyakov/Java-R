package com.javarush.task.task14.task1408;


public class BelarusianHen extends Hen {
    @Override
    public String getDescription(){
        return super.getDescription() + " ћо€ страна - " + Country.BELARUS + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц.";
    }
    
    public int getCountOfEggsPerMonth(){
          return 20;  
    }
}