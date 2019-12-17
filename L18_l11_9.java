//Читайте с консоли имена файлов.
//Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
//Закрыть потоки.
//Не используйте System.exit();

package com.javarush.task.task18.task1824;

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
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = null;
        FileInputStream fis = null;
        BufferedReader br = null;
        
        while(true){
            try{
                br = new BufferedReader(new InputStreamReader(System.in));
                name = br.readLine();
                fis = new FileInputStream(name);
                fis.close();
            } catch (FileNotFoundException ex){
                System.out.println(name);
                break;
            }
            
        }
        
        
        
        
        
        
    }
}
