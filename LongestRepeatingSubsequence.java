import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());    
		    String s = br.readLine();
		    int dp[][] = new int[n + 1][n + 1];
		    
		    for(int e[] : dp) Arrays.fill(e, 0);
		    
		    for(int i = 1; i <= n; i++){
		        for(int j = 1; j <= n; j++){
		            if(s.charAt(i - 1) == s.charAt(j - 1) && i != j){
	                    dp[i][j] = 1 + dp[i - 1][j - 1];
	                }else{
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
		        }
		    }
		    System.out.println(dp[n][n]);
		}
	}
}

//https://practice.geeksforgeeks.org/problems/longest-repeating-subsequence/0#