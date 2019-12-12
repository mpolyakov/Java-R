package com.javarush.task.task18.task1815;

import java.util.List;

/* 
�������
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        private String str;
        TableInterface original;
        public TableInterfaceWrapper(TableInterface original){
            this.original = original;
        }
        
        
        public void setModel(List rows){
            System.out.println(rows.size());
            original.setModel(rows);
        }
        
        public String getHeaderText(){
            return original.getHeaderText().toUpperCase();
        }
        public void setHeaderText(String newHeaderText){
            original.setHeaderText(newHeaderText);
        }
        

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}