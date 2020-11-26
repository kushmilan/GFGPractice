import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;  

class GfgSubArray{
    public static void main(String[] args) throws IOException{
        BufferedReader temp = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(temp.readLine());
        for(int i=0;i < testCases;i++){
            BufferedReader brSum = new BufferedReader(new InputStreamReader(System.in));
            String arrSum[] = br.readLine().split(" ");
            int arr1Sum[] = new int[arrSum.length];
            for(int j =0;j< arr1Sum.length;j++){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String arr[] = br.readLine().split(" ");
                int arr1[] = new int[arr.length];
                for(int i=0;i<arr.length;i++){
                    arr1[i] = Integer.parseInt(arr[i]);
                }
                int sum = Integer.parseInt(brSum.readLine());   
            }
            br.close();
            brSum.close();
            sumFinder(arr1, sum);
        }
        temp.close();
    }

    static void sumFinder(int arr[], int sum){
        int currentSum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            currentSum = arr[i];
            for(int j = i+1; j <= n; j++){
                if(currentSum == sum){
                    System.out.println( i + " "+ j);
                }
                if(currentSum > sum || j == n){
                    break;
                }
            currentSum = currentSum + arr[j];
            }
        }
        System.out.println("-1");
    }

}