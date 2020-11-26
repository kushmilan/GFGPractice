
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-18 18:15:31
 * @modify date 2020-04-18 18:15:31
 * @desc [description]
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class MigicSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrr[][] = {{8, 1, 6, 3, 5, 7, 4, 9, 2},
                        {6, 1, 8, 7, 5, 3, 2, 9, 4},
                        {4, 9, 2, 3, 5, 7, 8, 1, 6},
                        {2, 9, 4, 7, 5, 3, 6, 1, 8}, 
                        {8, 3, 4, 1, 5, 9, 6, 7, 2},
                        {4, 3, 8, 9, 5, 1, 2, 7, 6}, 
                        {6, 7, 2, 1, 5, 9, 8, 3, 4}, 
                        {2, 7, 6, 9, 5, 1, 4, 3, 8}};

        int[] arr = new int[9];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            String s[] = br.readLine().split("\\s+");
            for (int j = 0; j < 3; j++) {
                arr[index++] = Integer.parseInt(s[j]);
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int[] ar : arrr){
            int sum = 0;
            for(int i = 0; i < 9; i++){
                sum += Math.abs(ar[i] - arr[i]);
            }
            ans = Math.min(sum , ans);
        }
        System.out.println(ans);
    }

}