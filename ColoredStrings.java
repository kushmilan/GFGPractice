/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-30 17:45:21
 * @modify date 2020-03-30 17:45:21
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class ColoredStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long fact[] = fact(200);
        for (int k = Integer.parseInt(br.readLine()); k > 0; k--) {
            String arrS[] = br.readLine().split("\\s+");
            int n = Integer.parseInt(arrS[0]);
            int r = Integer.parseInt(arrS[1]);
            int g = Integer.parseInt(arrS[2]);
            int b = Integer.parseInt(arrS[3]);

            long ans = 0;
            int remaining = n - (r + g + b);

            for (int i = 0; i <= remaining; i++) {
                for (int j = 0; j <= remaining; j++) {
                    int p = remaining - i - j;
                    if (p < 0)
                        break;
                    ans += fact[n] / (fact[r + i] * fact[g + j] * fact[b + p]);
                }
            }
            System.out.println(ans);
        }
    }

    static long[] fact(int num) {
        long arr[] = new long[num + 1];
        arr[0] = 1;
        for (int i = 1; i < num + 1; i++) {
            arr[i] = arr[i - 1] * i;
        }
        return arr;
    }
}