package task2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();
        int year = Integer.parseInt(r);
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(1);
        else
            System.out.println(0);
    }
}