package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fos;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
    
    public AmigoOutputStream(FileOutputStream fos) throws FileNotFoundException{
        super(fileName);
        this.fos = fos;
    }
    
    public void close(){
        try{
           fos.flush(); 
        }catch(IOException e){
            
        }
        
        String str = "JavaRush © All rights reserved.";
        byte[] buffer = str.getBytes();
        
        try{
           fos.write(buffer);
        }catch(IOException e){
            
        }
        try{
           fos.close();
        }catch(IOException e){
            
        }
        
        
    }
    public void write(byte[] buffer) throws IOException{
        fos.write(buffer);
    }
    public void write(byte[] b, int off, int len) throws IOException{
        fos.write(b, off, len);
    }
    public void write(int b) throws IOException{
        fos.write(b);
    }
    public void flush() throws IOException{
        fos.flush();
    }
    

}
