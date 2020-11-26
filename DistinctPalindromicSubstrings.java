/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-31 17:53:39
 * @modify date 2020-03-31 17:53:39
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Comparator;

class DistinctPalindromicSubstrings {
    static Map<String, Integer> mapGlobal = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), s = 0;
        while (s++ < testCases) {
            String str = br.readLine();
            Set<String> set = new HashSet<>();
            int size = str.length();
            for (int i = 0; i < size; i++) {
                set.add(Character.toString(str.charAt(i)));
            }

            boolean dp[][] = new boolean[size][size];

            for (int i = 0; i < size; i++) {
                dp[i][i] = true;
            }
            // for length 2
            for (int i = 0; i < size - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    dp[i][i + 1] = true;
                    set.add(str.substring(i, i + 2));
                }
            }
            // for length 3
            for (int k = 3; k <= size; k++) {
                for (int i = 0; i < size - k + 1; i++) {
                    int p = i + k - 1;
                    if (dp[i + 1][p - 1] && str.charAt(i) == str.charAt(p)) {
                        dp[i][p] = true;
                        set.add(str.substring(i, p + 1));
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}