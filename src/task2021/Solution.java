package task2021;

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
        int max = 1;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(str[i]);
            if (temp >= max) {
                max = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(str[i]) == max)
                res[i] = (Integer.parseInt(str[i])) / 2;
            else
                res[i] = Integer.parseInt(str[i]);
        }
        max = 1;
        for (int i = 0; i < n; i++) {

            if (res[i] >= max) {
                max = res[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (res[i] == max)
                res[i] = (res[i]) / 2;
            System.out.print(res[i] + " ");
        }

    }
}