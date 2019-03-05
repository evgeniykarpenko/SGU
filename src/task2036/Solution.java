package task2036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] masStr = new String[100];
        int j=0;
        Pattern p = Pattern.compile("\\S*[aeiouy]{3,}\\S*");

        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            Matcher m = p.matcher(str);
            if(!m.matches()) {
                masStr[j] = str;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(masStr[i]);
        }
    }
}