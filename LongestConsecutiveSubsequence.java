// created by Milan Kushwah at 2020/03/16 20:30.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class LongestConsecutiveSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            int arrSize = Integer.parseInt(br.readLine());
            String arrS1[] = br.readLine().split("\\s+");
            int arr[] = new int[arrSize], sizeItr = 0;
            while (sizeItr < arrSize) {
                arr[sizeItr] = Integer.parseInt(arrS1[sizeItr++]);
            }
            Arrays.sort(arr);         
            for(int i=0;i<arrSize;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            int longest=1,count=1;
            for(int i=0;i<arrSize-1;i++){
                if(arr[i+1]-arr[i]==1){
                    count++;
                    if(count > longest){
                        longest = count;
                    }
                }else if(arr[i+1]-arr[i]==0){
                    continue;   
                }else{
                    count=1;
                }
            }
            System.out.println(longest);
        }
    }
}
