package task2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r1 = reader.readLine();
        int n1 = Integer.parseInt(r1);
        String r2 = reader.readLine();
        String[] str = r2.split(" ");
        String r3 = reader.readLine();
        int n2 = Integer.parseInt(r3);
        String r4 = reader.readLine();
        String[] str2 = r4.split(" ");
        int res = 0;
        int k = 0;
        List list = Arrays.asList(str2);
        int[] resMas = new int[10000];

        for (int i = 0; i < n1; i++) {
            if (list.contains(str[i])) {
                res++;
                resMas[k] = Integer.parseInt(str[i]);
                k++;
            }
        }


        if (res == 0)
            System.out.println(0);
        else

        {
            System.out.println(res);
            for (int i = 0; i < res; i++) {
                System.out.print(resMas[i] + " ");
            }
        }
    }
}






