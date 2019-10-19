package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
���������� ������� Singleton
*/

public class Solution {
    
    public static void main(String[] args)  {

    }

    public static Planet thePlanet;

    //add static block here - �������� ����������� ���� ���
    static {
        try {
           readKeyFromConsoleAndInitPlanet(); 
        } catch (IOException e){
            System.out.println("Oshibka vvoda");
        }
        
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException   {
        // implement step #5 here - ���������� ������� �5 ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pl = null;
        pl = br.readLine();
        switch(pl){
            case("sun"):
                thePlanet = Sun.getInstance();
                break;
                case("moon"):
                    thePlanet = Moon.getInstance();
                    break;
                    case("earth"):
                        thePlanet = Earth.getInstance();
                        break;
                        default:
                        thePlanet = null;
                        break;
        }
        
    }
}
