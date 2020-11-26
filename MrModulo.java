/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-25 21:29:14
 * @modify date 2020-03-25 21:29:14
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class MrModulo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String tempStr[] = br.readLine().split("\\s+");
            int n = Integer.parseInt(tempStr[0]);
            int k = Integer.parseInt(tempStr[1]);
            String arrS[] = br.readLine().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(arrS[i]);
            }
            System.out.println(Solution(arr, k, n));
        }
    }

    static int Solution(int arr[], int k, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for(int j = i+1 ; j<n; j++){
                if (arr[i] % arr[j] == k) {
                    count++;
                } else if (arr[j] % arr[i] == k) {
                    count++;
                }
            }
        }

        return count;
    }

}