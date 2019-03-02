package task2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r1 = reader.readLine();
        int n = Integer.parseInt(r1);
        String r2 = reader.readLine();
        String[] str = r2.split(" ");
        int sum = Integer.parseInt(str[0]);
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                sum += Integer.parseInt(str[i]);
            else
                sum -= Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}