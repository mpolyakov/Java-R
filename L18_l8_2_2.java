package com.javarush.task.task18.task1812;

import java.io.*;

/* 
��������� AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream exemplar;
    
    public QuestionFileOutputStream(AmigoOutputStream exemplar){
        this.exemplar = exemplar;
    }
    public void flush() throws IOException{
        exemplar.flush();
        
    }

    public void write(int b) throws IOException{
        exemplar.write(b);
    }

    public void write(byte[] b) throws IOException{
        exemplar.write(b);          
    }

    public void write(byte[] b, int off, int len) throws IOException{
        exemplar.write(b, off, len);
    }

    public void close() throws IOException{
        System.out.println("�� ������������� ������ ������� �����? �/�");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine().equals("�")) exemplar.close();
    }
    

}

