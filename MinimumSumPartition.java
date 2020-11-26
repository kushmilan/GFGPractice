/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-02 23:24:26
 * @modify date 2020-04-02 23:24:26
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;
import java.lang.*;
import java.util.LinkedHashSet;;

class MinimumSumPartition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int k = Integer.parseInt(br.readLine()); k > 0; k--) {
            int size = Integer.parseInt(br.readLine());
            String arrS[] = br.readLine().split("\\s+");
            int i = 0, total = 0;
            int arr[] = new int[arrS.length];
            for (String s : arrS){
                arr[i] = Integer.parseInt(s);
                total += arr[i++];
            }
            System.out.println(total - 2*isPresent(arr, total/2, total));
        }
    }

    static int isPresent(int[] arr, int sum, int total){
        boolean c[] = new boolean[sum+1];
        c[0] = true;
        int diff = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int ele = arr[i];
            for(int j = sum; j >= ele; j--){
                c[j] = c[j] || c[j - ele];
                if(c[j]){
                    diff = Math.max(diff, Math.abs(j));
                }
            }
        }
        return diff;
    }
}
