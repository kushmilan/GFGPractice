/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    String s[] = br.readLine().split(" ");
		    String a = s[0];
		    String b = s[1];
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
            System.out.println(m + n - dp[n][m]);
		}
	}
}

//https://practice.geeksforgeeks.org/problems/shortest-common-supersequence/0#