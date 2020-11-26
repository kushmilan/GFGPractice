// created by Milan Kushwah at 2020/03/16 13:15.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class NumberOfPairs{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=Integer.parseInt(br.readLine());i>0;i--){
            String arrS[] = br.readLine().split("\\s+");
            int m = Integer.parseInt(arrS[0]);
            int n = Integer.parseInt(arrS[1]);
            String arrS1[] = br.readLine().split("\\s+");
            String arrS2[] = br.readLine().split("\\s+");
            int X[] = new int[m];
            int Y[] = new int[n];
            for(int j=0;j<m;j++){
                X[j] = Integer.parseInt(arrS1[j]);
            }
            for(int j=0;j<n;j++){
                Y[j] = Integer.parseInt(arrS2[j]);
            }
            System.out.println(countPairs(X, Y, m, n));
        }
    }    

    static long countPairs(int X[], int Y[], int m, int n){
        int countY[] = new int[5];

        for(int i=0;i<n;i++){
            if(Y[i]<5){
                countY[Y[i]]++;
            }
        }
        Arrays.sort(Y);
        long totalPairs = 0;
        for(int i=0;i<m;i++){
            totalPairs += count(X[i], Y, countY, n);
        }

        return totalPairs;
    }

    static long count(int x, int Y[], int countY[], int n){
        if(x==0){
            return 0;
        }
        if(x==1){
            return countY[0];
        }
        int idx = Arrays.binarySearch(Y, x);
        long ans;
        if(idx<0){
            idx = Math.abs(idx+1);
            ans = n - idx;
        }else{
            while(idx<n && Y[idx]==x){
                idx++;
            }
            ans = n-idx;
        }
        ans += countY[0]+ countY[1];

        if(x==2) ans -=(countY[3]+countY[4]);
        if(x==3) ans +=(countY[2]);

        return ans;
    }
    
}