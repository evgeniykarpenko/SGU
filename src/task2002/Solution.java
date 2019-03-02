package task2002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r1 = reader.readLine();
        int n = Integer.parseInt(r1);
        String r2 = reader.readLine();
        String[] str = r2.split(" ");
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
