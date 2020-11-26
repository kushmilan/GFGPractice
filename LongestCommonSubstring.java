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
            int max = 0;
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= m; j++){
                    if(i == 0 || j == 0){
                        dp[i][j] = 0;
                    }else if(a.charAt(i - 1) == b.charAt(j - 1)){
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        max = Math.max(max, dp[i][j]);
                    }else{
                        dp[i][j] = 0;
                    }
                }
            }
            System.out.println(max);
		}
	}
	
}

//https://practice.geeksforgeeks.org/problems/longest-common-substring/0#