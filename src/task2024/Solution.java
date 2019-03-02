package task2024;

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
        int res = 0;
        for (int i = 0; i < n / 2; i++) {
            if (!str[i].equals(str[n - i - 1])) {
                res++;
            }
        }
        if (str.length <= 2)
            System.out.println(0);
        else
            System.out.println(res);
    }
}


