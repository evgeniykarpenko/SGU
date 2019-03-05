package task2056;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        Integer count;
        String str;
        while (scanner.hasNext()) {
            str = scanner.next();
            if (map.containsKey(str.toLowerCase())) {
                count = map.get(str.toLowerCase());
                map.put(str.toLowerCase(), ++count);
            } else {
                count = 1;
                map.put(str.toLowerCase(), count);
            }
        }
        Integer max = Collections.max(map.values());
        for (Map.Entry<String, Integer> p : map.entrySet()) {
            if (max.equals(p.getValue())) {
                result.add(p.getKey());
            }
        }
        Collections.sort(result);
        for (String word : result) {
            System.out.println(word);
        }
    }
}
