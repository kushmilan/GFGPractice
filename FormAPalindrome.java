
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-23 18:23:21
 * @modify date 2020-03-23 18:23:21
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

class FormAPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            //System.out.println(palindrome(str, 0, str.length() - 1));
            System.out.println(palindromeOptimize(str));
        }
    }

    static int palindrome(String str, int low, int high) {
        if (low > high) {
            return Integer.MAX_VALUE;
        }
        if (low == high) {
            return 0;
        }
        if(low == high - 1){
            if(str.charAt(low) == str.charAt(high)){
                return 0;
            }else{
                return 1;
            }
        }

        if(str.charAt(low) == str.charAt(high)){
            return palindrome(str, low+1, high-1);
        }else{
            return Math.min(palindrome(str, low, high-1), palindrome(str, low+1, high))+1;
        }

    }

    static int palindromeOptimize(String str){
        int size = str.length();
        int dp[][] = new int[size][size];
        for(int ar[] : dp){
            Arrays.fill(ar, 0);
        }
        for(int i=1;i<size;i++){
            for(int j=0, k = i;k<size;j++,k++){
                dp[j][k] = (str.charAt(j) == str.charAt(k)) ? dp[j+1][k-1] : Math.min(dp[j][k-1], dp[j+1][k]) + 1;
            }
        }
        return dp[0][size-1];
    }

}
