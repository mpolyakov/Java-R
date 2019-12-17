//Придумать механизм шифровки/дешифровки.

//Программа запускается с одним из следующих наборов параметров:
//-e fileName fileOutputName
//-d fileName fileOutputName

//где:
//fileName - имя файла, который необходимо зашифровать/расшифровать.
//fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
//-e - ключ указывает, что необходимо зашифровать данные.
//-d - ключ указывает, что необходимо расшифровать данные.

package com.javarush.task.task18.task1826;

import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);
        if(args[0].equals("-e")){
            while(fis.available() > 0){
                fos.write(fis.read() * 2);
            }
        } else if(args[0].equals("-d")){
            while(fis.available() > 0){
                fos.write(fis.read() / 2);
            }
        }
        fis.close();
        fos.close();
        

    }

}

