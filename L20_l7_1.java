//�������� ��������� Externalizable � ������ Apartment.

package com.javarush.task.task20.task2011;

import java.io.*;


/* 
Externalizable ��� ������������
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }
        
        public void writeExternal(ObjectOutput out) throws IOException{
            out.writeObject(address);
            out.writeInt(year);
        }
        
        public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
            address = (String) in.readObject();
            year = (int) in.readInt();
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }
    }

    public static void main(String[] args) {

    }
}
