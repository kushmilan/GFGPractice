import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int dp[][] = new int[1][1];
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    int ar[] = new int[3];
		    dp = new int[n + 1][4];
		    for(int e[] : dp) Arrays.fill(e, -1);
		    ar[0] = sc.nextInt();
		    ar[1] = sc.nextInt();
		    ar[2] = sc.nextInt();
		    System.out.println(knap(ar, n, 3));
		}
	}
	
	public static int knap(int ar[], int n, int ind){
	    if(n < 0 || ind == 0) return Integer.MIN_VALUE;
	    
	    if(n == 0) return 0;
	    
	    if(dp[n][ind] != -1) return dp[n][ind];
	    
	    return dp[n][ind] = Math.max(1 + knap(ar, n - ar[ind - 1], ind), knap(ar, n, ind - 1));
	}
}