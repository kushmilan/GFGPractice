
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-29 19:46:15
 * @modify date 2020-03-29 19:46:15
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class GridGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][m];
        int sum = 0;
        int mod = 1000000007;
        for (int i = 0; i < n; i++) {
            String tempS[] = br.readLine().split("\\s+");
            for (int k = 0; k < m; k++) {
                arr[i][k] = Integer.parseInt(tempS[k]);
            }
        }

        for (int[] a : arr) {
            Arrays.sort(a);
            sum += a[a.length - 1] % mod;
        }
        System.out.println(maxTotalSum(arr));
    }

    static int maxTotalSum(int[][] arr) {
        int sum = -1;
        int N = arr.length;
        int M = arr[0].length;

        for (int i = 0; i < M; i++) 
            sum = Math.max(sum, arr[0][i]);
        
        for (int i = 1; i < N; i++){ 
            sum = -1; 
            for (int j = 0; j < M; j++){ 
                if (j > 0 && j < M - 1) 
                arr[i][j] += Math.max(arr[i - 1][j], Math.max(arr[i - 1][j - 1], arr[i - 1][j + 1])); 

                else if (j > 0) 
                    arr[i][j] += Math.max(arr[i - 1][j], arr[i - 1][j - 1]); 

                else if (j < M - 1) 
                    arr[i][j] += Math.max(arr[i - 1][j], arr[i - 1][j + 1]); 

                sum = Math.max(arr[i][j], sum); 
            } 
        }         

        return sum;
    }

}