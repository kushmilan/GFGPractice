/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    String s = br.readLine();
		    String a = br.readLine();
		    String b = br.readLine();
		    int n = a.length(), m = b.length();
            int dp[][] = new int[n + 1][m + 1];
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= m; j++){
                    if(i == 0 || j == 0){
                        dp[i][j] = 0;
                    }else if(a.charAt(i - 1) == b.charAt(j - 1)){
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    }else{
                        dp[i][j] = Math.max(dp[i- 1][j], dp[i][j - 1]);
                    }
                }
            }
            System.out.println(dp[n][m]);
            //System.out.println(lcs(a, b, n, m, dp));
		}
	}
	
	private static int lcs(String a, String b, int n, int m, int dp[][]) {
        if(n == 0 || m == 0) return 0;

        if(dp[n][m] != 0) return dp[n][m];

        if(a.charAt(n - 1) == b.charAt(m - 1)){
            return dp[n][m] = 1 + lcs(a, b, n - 1, m - 1, dp);
        }else{
            return dp[n][m] = Math.max(lcs(a, b, n - 1, m, dp), lcs(a, b, n, m - 1, dp));
        }
    }
}


//https://practice.geeksforgeeks.org/problems/longest-common-subsequence/0