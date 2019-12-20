//Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.

package com.javarush.task.task19.task1902;                                                                                                                                                      
                                                                                                                                                      
import java.io.*;                                                                                                                                                      
                                                                                                                                                      
/*                                                                                                                                                       
Адаптер                                                                                                                                                      
*/                                                                                                                                                      
                                                                                                                                                      
public class AdapterFileOutputStream implements AmigoStringWriter {                                                                                                                                                      
                                                                                                                                                          
    private FileOutputStream fileOutputStream;                                                                                                                                                      
    private String s;                                                                                                                                                      
                                                                                                                                                          
    public AdapterFileOutputStream(FileOutputStream fileOutputStream) throws Exception{                                                                                                                                                      
        this.fileOutputStream = fileOutputStream;                                                                                                                                                      
    }                                                                                                                                                      
                                                                                                                                                              
    public void flush() throws IOException{                                                                                                                                                      
        fileOutputStream.flush();                                                                                                                                                      
    }                                                                                                                                                      
    public void writeString(String s) throws IOException{                                                                                                                                                      
        fileOutputStream.write(s.getBytes());                                                                                                                                                      
    }                                                                                                                                                      
    public void close() throws IOException{                                                                                                                                                      
        fileOutputStream.close();                                                                                                                                                      
    }                                                                                                                                                      
                                                                                                                                                      
    public static void main(String[] args) {                                                                                                                                                      
                                                                                                                                                              
                                                                                                                                                      
    }                                                                                                                                                      
                                                                                                                                                      
                                                                                                                                                      
}