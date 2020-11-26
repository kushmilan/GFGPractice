//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String s){
        int n = s.length();
        int dp[][] = new int[n][n];
        return minPartitioning(s, 0, n - 1, dp);
    }
    
    private static int minPartitioning(String s, int i, int j, int dp[][]){
        if(i > j) return 0;
        
        if(isPalindrome(s, i, j)) return 0;
        
        if(dp[i][j] != 0) return dp[i][j];
        
        int ans = Integer.MAX_VALUE;
        
        for(int k = i; k < j; k++){
            int part = minPartitioning(s, i, k, dp) + minPartitioning(s, k + 1, j, dp) + 1;
            ans = Math.min(ans, part);
            dp[i][j] = ans;
        }
        
        return ans;
    }
    
    private static boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}

//https://practice.geeksforgeeks.org/problems/palindromic-patitioning4845/1#