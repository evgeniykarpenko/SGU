package task2057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            Integer min=0;
            String str = reader.readLine();
            String strMas[] = str.split(" ");
            Integer first = Integer.parseInt(strMas[0]);
            Integer kolvoMin = 0;
            if (first.equals(1)) {
                Integer second = Integer.parseInt(strMas[1]);
                Integer count = map.get(second);
                if(count!=null)
                    map.put(second, ++count);
                else {
                    count = 0;
                    map.put(second, ++count);
                }
            } else if (first.equals(2)) {
                min = map.firstKey();
                kolvoMin = map.get(min);
                if (kolvoMin - 1 == 0)
                    map.remove(min);
                else {
                    map.put(min, --kolvoMin);
                }
                System.out.println(min);
            }
        }
    }
}