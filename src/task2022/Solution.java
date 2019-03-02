package task2022;

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i != j) && (Integer.parseInt(str[j]) % (Integer.parseInt(str[i]))) == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}