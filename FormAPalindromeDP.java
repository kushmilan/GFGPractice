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
		    int n = s.length(), j = n - 1;
		    String ss = "";
		    while(j >= 0){
		        ss += s.charAt(j--);
		    }
		    int dp[][] = new int[n + 1][n + 1];
		    for(int i = 1; i <= n; i++){
		        for(j = 1; j <= n; j++){
		            if(s.charAt(i - 1) == ss.charAt(j - 1)){
		                dp[i][j] = 1 + dp[i - 1][j - 1];
		            }else{
		                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
		            }
		        }
		    }
		    System.out.println(n - dp[n][n]);
		}
	}
}


//https://practice.geeksforgeeks.org/problems/form-a-palindrome/