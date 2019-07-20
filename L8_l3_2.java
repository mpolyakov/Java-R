package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String,String> mapS = new HashMap<String, String>();
        mapS.put("арбуз", "€года");
        mapS.put("банан", "трава");
        mapS.put("вишн€", "€года");
        mapS.put("груша", "фрукт");
        mapS.put("дын€", "овощ");
        mapS.put("ежевика", "куст");
        mapS.put("жень-шень", "корень");
        mapS.put("земл€ника", "€года");
        mapS.put("ирис", "цветок");
        mapS.put("картофель", "клубень");
        
        for (Map.Entry<String, String> pair : mapS.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            
            System.out.println (key + " - " + value);
        }

    }
}
