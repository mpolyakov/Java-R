package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    
    public static void printMatrix(double d, int i, String s){
        
    }
    
    public static void printMatrix(int i, double d, String s){
        
    }
    
    public static void printMatrix(short s, double d, Object o){
        
    }
    
    public static void printMatrix(int i, byte b, Object o){
        
    }
    
    public static void printMatrix(int i, byte b, String s){
        
    }
    
    public static void printMatrix(byte b, int i, Object o){
        
    }
    
    public static void printMatrix(short ss, byte b, String s){
        
    }
    
    public static void printMatrix(long l, byte b, Object o){
        
    }
}
