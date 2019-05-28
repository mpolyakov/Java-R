import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String name = bufferedReader.readLine();
        String amount = bufferedReader.readLine();
        int nAmount = Integer.parseInt(amount);
        String age = bufferedReader.readLine();
        int nAge = Integer.parseInt(age);
        
        System.out.println(name + " �������� " + nAmount + " ����� " + nAge + " ���.");
    }
}
