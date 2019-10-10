package com.javarush.task.task14.task1414;

import java.io.*;
/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //������ � ������� ��������� ������ (�����), ����� 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key1 = null;
        
        
        while (true) {
            Movie movie = null;
            key1 = br.readLine();
            if (key1.equals("soapOpera")) {
                movie = MovieFactory.getMovie(key1);
                System.out.println(movie.getClass().getSimpleName());
            } else if  (key1.equals("cartoon")) {
                movie = MovieFactory.getMovie(key1);
                System.out.println(movie.getClass().getSimpleName());
            } else if (key1.equals("thriller")) {
                movie = MovieFactory.getMovie(key1);
                System.out.println(movie.getClass().getSimpleName());
            } else {
                movie = MovieFactory.getMovie(key1);
                break; }
        }
        

        /*
8 ������� ���������� movie ������ Movie � ��� ������ ��������� ������(�����):
8.1 �������� ������ ��������� MovieFactory.getMovie � ��������� ��� ���������� movie
8.2 ������� �� ����� movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //�������� ������� SoapOpera (������� �����) ��� ����� "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //�������� ��� ��� ���, ������ 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //�������� ��� ���� ������, ����� 3
    static class Cartoon extends Movie {
        
    }
    
    static class Thriller extends Movie {
        
    }
}
