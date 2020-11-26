/* package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class BooleanParenthesization{
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());    
            char[] arr = br.readLine().toCharArray();
            System.out.println(possibilities(arr, n));
        }
	}
	
	private static int possibilities(char[] arr, int size){
	    int i = 0, j = size - 1;
	    boolean isTrue = true;
	    int dp[][][] = new int[size + 1][size + 1][2];
	    return solve(arr, i, j, true, dp);
	}
	
	private static int solve(char[] arr, int i, int j, boolean isTrue, int dp[][][]){
	    if(i > j) return 0;
	    
	    if(i == j){
	        if(isTrue){
	            if(arr[i] == 'T') return dp[i][j][1] = 1;
	            else return dp[i][j][0] = 0;
	        }else{
	            if(arr[i] == 'F') return dp[i][j][0] = 1;
	            else return dp[i][j][1] = 0;
	        }
	    }
	    
	    if(isTrue){
	        if(dp[i][j][1] != 0) return dp[i][j][1];
	    }else{
	        if(dp[i][j][0] != 0) return dp[i][j][0];
	    }
	    
	    int ans = 0, leftTrue = 0, leftFalse = 0, rightTrue = 0, rightFalse = 0;
	    for(int k = i + 1; k < j; k += 2){
	        if(dp[i][k - 1][1] != 0){
	            leftTrue = dp[i][k - 1][1];
	        }else{
	            leftTrue = solve(arr, i, k - 1, true, dp);   
	        }
	        if(dp[i][k - 1][0] != 0){
	            leftFalse = dp[i][k - 1][0];
	        }else{
	            leftFalse = solve(arr, i, k - 1, false, dp);   
	        }
	        if(dp[k + 1][j][1] != 0){
	            rightTrue = dp[k + 1][j][1];
	        }else{
	            rightTrue = solve(arr, k + 1, j, true, dp);   
	        }
	        if(dp[k + 1][j][0] != 0){
	            rightFalse = dp[k + 1][j][0];
	        }else{
	            rightFalse = solve(arr, k + 1, j, false, dp);   
	        }
	        
	        if(arr[k] == '&'){
	            if(isTrue){
	                ans += leftTrue * rightTrue;
	            }else{
	                ans += (leftTrue * rightFalse) + (leftFalse * rightTrue) + (leftFalse * rightFalse);
	            }
	        }else if(arr[k] == '|'){
	            if(isTrue){
	                ans += (leftTrue * rightTrue) + (leftTrue * rightFalse) + (leftFalse * rightTrue);
	            }else{
	                ans += (leftFalse * rightFalse);
	            }
	        }else{
	            if(isTrue){
	                ans += (leftTrue * rightFalse) + (leftFalse * rightTrue);
	            }else{
	                ans += (leftTrue * rightTrue) + (leftFalse * rightFalse);
	            }
	        }
	    }
	    ans %= 1003;
	    
	    if(isTrue){
	        return dp[i][j][1] = ans;   
	    }else{
	        return dp[i][j][0] = ans;   
	    }
	}
}