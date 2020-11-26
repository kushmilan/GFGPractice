
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

class NcR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        BigInteger dp[] = factorial(1001);
        while (k++ < testCases) {
            String nAndR[] = br.readLine().split("\\s+");
            int n = Integer.parseInt(nAndR[0]);
            int r = Integer.parseInt(nAndR[1]);
            //System.out.println(dp[n].divide(((dp[n - r]).multiply(dp[r]).mod(BigInteger.valueOf(1000000007)))));
            System.out.println("!!!"+binomialCoff(n, r));
        }
    }

    static BigInteger[] factorial(int size) {
        BigInteger arr[] = new BigInteger[size];
        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;
        for (int i = 2; i < size; i++) {
            arr[i] = (arr[i - 1].multiply(BigInteger.valueOf(i))).mod(BigInteger.valueOf(1000000007));
        }
        return arr;
    }


    public static int binomialCoff(int n,int r){
        int arr[]=new int[r+1];
        arr[0]=1;
        for(int i=1;i<=n;++i){
            //Min is performed so that it won't go more than r (array range)
            for(int j=Math.min(i,r);j>0;--j){
                //add previous values
                arr[j]=(arr[j]+arr[j-1])%1000000007;
            }
        }
        return arr[r];
    } 

}