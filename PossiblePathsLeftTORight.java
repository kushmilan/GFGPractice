
// created by Milan Kushwah at 2020/03/19 13:06.

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

class PossiblePathsLeftTORight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            String arrSize[] = br.readLine().split("\\s+");
            int m = Integer.parseInt(arrSize[0]);
            int n = Integer.parseInt(arrSize[1]);
            int mod = 1000000007;
            System.out.println(pathCount(m, n, mod));
        }
    }

    static int pathCount(int m, int n, int mod) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = (arr[i - 1][j] + arr[i][j - 1]) % mod;
            }
        }
        //printTwoDArray(arr, m, n);
        return arr[m - 1][n - 1];
    }

    static void printTwoDArray(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}