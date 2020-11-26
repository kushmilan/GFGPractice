// created by Milan Kushwah at 2020/03/17 15:32.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class MaximumIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            int n = Integer.parseInt(br.readLine());
            String arrS1[] = br.readLine().split("\\s+");
            if(n==1){
                System.out.println(0);
            }else{
                int arr[] = new int[n], sizeItr = 0;
                while (sizeItr < n) {
                    arr[sizeItr] = Integer.parseInt(arrS1[sizeItr++]);
                }
                int RMax[] = new int[n]; 
                int LMin[] = new int[n]; 
        
                /* Construct LMin[] such that LMin[i] stores the minimum value 
                from (arr[0], arr[1], ... arr[i]) */
                LMin[0] = arr[0]; 
                for (int i = 1; i < n; ++i) 
                    LMin[i] = min(arr[i], LMin[i - 1]); 
        
                /* Construct RMax[] such that RMax[j] stores the maximum value 
                from (arr[j], arr[j+1], ..arr[n-1]) */
                RMax[n - 1] = arr[n - 1]; 
                for (int j = n - 2; j >= 0; --j) 
                    RMax[j] = max(arr[j], RMax[j + 1]); 


                int i = 0, j = 0, maxDiff = -1; 
                while (j < n && i < n){ 
                    if (LMin[i] < RMax[j]){ 
                        maxDiff = max(maxDiff, j - i); 
                        j = j + 1; 
                    }  
                    else 
                        i = i + 1; 
                }

                if(maxDiff==n-2){
                    System.out.println(n-1);
                }else if(maxDiff > 0){
                    System.out.println(maxDiff);
                }else{
                    System.out.println(0);
                }
                

            }
            
            
        }
    }


    static int max(int x, int y){ 
        return x > y ? x : y; 
    } 
  
    static int min(int x, int y){ 
        return x < y ? x : y; 
    }
}