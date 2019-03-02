package task2025;

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
        String r3 = reader.readLine();
        int m = Integer.parseInt(r3);
        int[] ans = new int[m];
        int k = 0;
        for (int i = 0; i < m; i++) {
            String r4 = reader.readLine();
            String[] str2 = r4.split(" ");
            int l = Integer.parseInt(str2[0]);
            int r = Integer.parseInt(str2[1]);
            int min = 101;
            for (int j = l - 1; j < r; j++) {
                if (Integer.parseInt(str[j]) < min) {
                    min = Integer.parseInt(str[j]);
                }
            }
            ans[k] = min;
            k++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
