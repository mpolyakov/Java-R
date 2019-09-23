package com.javarush.task.task13.task1322;

/* 
Èםעונפויס SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    public static class StringObject<Object> implements SimpleObject<String> {
//        private String s;

        @Override
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }

}
