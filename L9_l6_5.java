package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
���������� ��� ������ � ����������� Map
*/

public class Solution {
    public static void main(String[] args) {
        //�������� ��� ��� ���
        try{
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
            
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

        

        //�������� ��� ��� ���
    }
}
