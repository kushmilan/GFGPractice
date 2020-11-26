
// created by Milan Kushwah at 2020/03/18 19:45.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class LargestCommonSubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            String arrSize[] = br.readLine().split("\\s+");
            int arrSize1 = Integer.parseInt(arrSize[0]);
            int arrSize2 = Integer.parseInt(arrSize[1]);
            String one = br.readLine();
            one = "a" + one;
            String two = br.readLine();
            two = "a" + two;
            int arr[][] = new int[arrSize1 + 1][arrSize2 + 1];
            for (int i = 0; i <= arrSize1; i++) {
                arr[i][0] = 0;
            }
            for (int i = 0; i <= arrSize2; i++) {
                arr[0][i] = 0;
            }
            int max = 0;
            for (int i = 1; i <= arrSize1; i++) {
                for (int j = 1; j <= arrSize2; j++) {
                    if (one.charAt(i) == two.charAt(j)) {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                        System.out.println(arr[i][j]);
                        if (max < arr[i][j])
                            max = arr[i][j];
                    }
                }
            }
            System.out.println("max: "+max);
            //System.out.println(max);
        }
    }
}