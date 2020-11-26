class Solution{
    public long count(int S[], int m, int n){ 
        long dp[][] = new long[n + 1][m + 1];
        return coinChangeMax(S, n, m, dp);
    } 
    
    public static long coinChangeMax(int s[], int n, int m, long dp[][]){
        if(n == 0) return 1;
        if((m == 0 && n > 0) || (n < 0)) return 0;
        
        if(dp[n][m] != 0) return dp[n][m];
        
        return dp[n][m] = coinChangeMax(s, n - s[m - 1], m, dp) + coinChangeMax(s, n, m - 1, dp);
    }
}

//https://practice.geeksforgeeks.org/problems/coin-change2448/1