package com.javarush.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
�������
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("������ ���� ������� ���� �������");
            } else if (!note.startsWith(threadName)) {
                System.out.println("���� [" + threadName + "] ������� ����� ������� [" + note + "]");
            } else {
                System.out.println("���� [" + threadName + "] ������� ���� ������� [" + note + "]");
            }
        }
    }
    
    public static class NoteThread extends Thread{
        public void run(){
            for(int index = 0; index < 1000; index++){
                Note.addNote(getName() + "-Note" + index);
                try{
                  Thread.sleep(1);  
                }catch(InterruptedException e){System.out.println("������!");}
                Note.removeNote(getName());
                
            }
        
        }
    }
}
