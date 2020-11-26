class Solution{
    static int dp[][] = new int[1][1];
    static int knapSack(int N, int W, int val[], int wt[]){
        dp = new int[N + 1][W + 1];
        for(int e[] : dp) Arrays.fill(e, -1);
        return knap(wt, val, W, N, 0);
    }
    
    public static int knap(int weight[], int val[], int w, int n, int curr){
        if(n == 0 || w <= 0) return 0;
        
        if(dp[n][w] != -1) return dp[n][w];
        
        if(weight[n - 1] <= w){
            return dp[n][w] = Math.max(val[n - 1] + knap(weight, val, w - weight[n - 1], n, curr), (knap(weight, val, w, n - 1, curr)));
        }else{
            return dp[n][w] = knap(weight, val, w, n - 1, curr);
        }
    }
    
}