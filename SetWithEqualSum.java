/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-02 19:33:14
 * @modify date 2020-04-02 19:33:14
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

class SetWithEqualSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int k = Integer.parseInt(br.readLine()); k > 0; k--) {
            String arrS[] = br.readLine().split("\\s+");
            int i = 0, total = 0;
            int arr[] = new int[arrS.length];
            for (String s : arrS){
                arr[i] = Integer.parseInt(s);
                total += arr[i++];
            }

            if(total%2!=0){
                System.out.println("No");
            }else{
                if (canPartition(arr, 0, 0, total, new HashMap<String, Boolean>())) {
                    System.out.println("yes");
                } else {
                    System.out.println("No");
                }
            }
            
        }
    }

    static boolean canPartition(int arr[], int index, int sum, int total, HashMap<String, Boolean> map) {
        String current = index + " " + sum;
        
        if(map.containsKey(current)){
            return map.get(current);
        }

        if (sum * 2 == total) {
            return true;
        }

        if (sum > total / 2 || index >= arr.length) {
            return false;
        }

        boolean var = canPartition(arr, index + 1, sum, total, map) || canPartition(arr, index + 1, sum + arr[index], total, map);
        map.put(current, var);
        return var;
    }

    static boolean isPresent(int[] arr, int sum){
        boolean c[] = new boolean[sum+1];
        c[0] = true;

        for(int i = 0; i < arr.length; i++){
            int ele = arr[i];
            for(int j = 0; j >= ele; j--){
                c[j] = c[j] || c[j - ele];
            }
            if(c[sum]) return true;
        }

        return c[sum];
    }

}












/*abstract

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

class SetWithEqualSum {
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

            if(total%2!=0){
                System.out.println("NO");
            }else{
                System.out.println(isPresent(arr, total/2) ? "YES" : "NO");
            }
        }
    }

    static boolean isPresent(int[] arr, int sum){
        boolean c[] = new boolean[sum+1];
        c[0] = true;

        for(int i = 0; i < arr.length; i++){
            int ele = arr[i];
            for(int j = 0; j >= ele; j--){
                c[j] |= c[j - ele];
            }
            if(c[sum]) return true;
        }

        return c[sum];
    }
}


*/