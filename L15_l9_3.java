package com.javarush.task.task15.task1516;

/* 
�������� �� ���������
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public Object ObjectVar;
    public boolean booleanVar;
    public Exception ExceptionVar;
    public String StringVar;
    
    public static void main(String[] args) {
        
        
        Solution solution = new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);
    }
}