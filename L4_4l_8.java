package com.javarush.task.task04.task0415;

/* 
������� ������������
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        int nums1, nums2, nums3;
        String strs1, strs2, strs3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strs1 = bufferedReader.readLine();
        strs2 = bufferedReader.readLine();
        strs3 = bufferedReader.readLine();
        nums1 = Integer.parseInt(strs1);
        nums2 = Integer.parseInt(strs2);
        nums3 = Integer.parseInt(strs3);
        if (((nums1 + nums2) > nums3) & ((nums3 + nums2) > nums1) & ((nums3 + nums1) > nums2)) {
            System.out.println("����������� ����������.");
        } else System.out.println("����������� �� ����������."); 
    }
}