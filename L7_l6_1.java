package com.javarush.task.task07.task0707;

import java.util.ArrayList;


/* 
„то за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("fdsf");
        arrList.add("sfasf");
        arrList.add("wfq");
        arrList.add("wqq");
        arrList.add("22f2f");
        System.out.println(arrList.size());
        for (int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    }
}
