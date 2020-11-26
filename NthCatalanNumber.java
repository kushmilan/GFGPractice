
// created by Milan Kushwah at 2020/03/19 13:30.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.math.BigInteger;

class NthCatalanNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        BigInteger dp[] = factorial(201);
        while (k++ < testCases) {
            int number = sc.nextInt();// Integer.parseInt(br.readLine());
            // System.out.println(dp[number*2]);
            // System.out.println(dp[number-1]);
            // System.out.println(dp[number]);
            System.out.println(dp[2 * number].divide((dp[number + 1]).multiply(dp[number])));
        }
    }

    static BigInteger[] factorial(int size) {
        BigInteger arr[] = new BigInteger[size];
        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;
        for (int i = 2; i < size; i++) {
            arr[i] = arr[i - 1].multiply(BigInteger.valueOf(i));
        }
        return arr;
    }
}