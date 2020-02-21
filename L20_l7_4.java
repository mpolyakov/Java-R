//Сериализуй класс Solution.
//Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
//Объект всегда должен содержать актуальные итоговые данные.
//Метод main не участвует в тестировании.

package com.javarush.task.task20.task2014;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        System.out.println(new Solution(4));
        FileInputStream fis = new FileInputStream("C:\\savedobject.dat");
        FileOutputStream fos = new FileOutputStream("C:\\savedobject.dat");
        
        Solution savedObject = new Solution(6);
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);
        outputStream.writeObject(savedObject);
        fos.close();
        outputStream.close();
        Solution anotherSolution = new Solution(26);
        
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        Object loadedObject = inputStream.readObject();
        fis.close();
        inputStream.close();
        Solution newSavedObject = (Solution) loadedObject;
        
        if(newSavedObject.equals(savedObject)) System.out.println("Success!");
        
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
