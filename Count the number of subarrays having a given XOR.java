/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.print(count(arr, n, m));
	}
	
	private static int count(int arr[], int n, int m){
	    int xor = 0, count  = 0;
	    
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    //map.put(0, 1);
	    
	    for(int i = 0; i < n; i++){
	        if(xor == m) count++;
	        if(arr[i] == m) count++;
	        
	        xor ^= arr[i];
	        
	        if(map.containsKey(m ^ xor)) count += map.get(m ^ xor);
	            
	        map.put(xor, map.getOrDefault(xor, 0) + 1);
	    }
	    
	    return count;
	}
}