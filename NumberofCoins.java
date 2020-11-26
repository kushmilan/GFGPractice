class Solution{

	public int minCoins(int coins[], int M, int V){ 
	    int dp[][] = new int[M + 1][V + 1];
	    int ans = minWays(coins, M, V, dp);
	    return ans > 100000000 ? -1 : ans;
	} 
	
	public static int minWays(int c[], int M, int V, int dp[][]){
	    if(V == 0) return 0;
	    
	    if((M == 0 && V > 0) || V < 0) return 1000000000;
	    
	    if(dp[M][V] != 0) return dp[M][V];
	    
	    return dp[M][V] = Math.min(1 + minWays(c, M, V - c[M - 1], dp), minWays(c, M - 1, V, dp));
	}
}

//https://practice.geeksforgeeks.org/problems/number-of-coins1824/1