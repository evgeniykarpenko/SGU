package task2001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();
        String[] str = r.split(" ");
        System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
    }
}
