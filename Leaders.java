// created by Milan Kushwah at 2020/03/06 14:42.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Leaders{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()),testCount=0;
        while(testCount++ < testCase){
            int arraySize = Integer.parseInt(br.readLine());
            int tempVar = arraySize,i=0,k=0;
            String arrS[] = br.readLine().split("\\s+");
            int arr[] = new int[arraySize];
            while(tempVar-- > 0){
                arr[i] =  Integer.parseInt(arrS[i]);i++;
            }
            int tempVar2 = arraySize-1,p=tempVar2-1;
            int max = arr[tempVar2];
            if(arraySize==1){
                System.out.print(arr[0]);
            }else{
                while(tempVar2-- > 0){
                    if(max <= arr[p]){
                        max = arr[p--];
                    }else{
                        arr[p--] = -1;
                    }
                    //tempVar2--;
                }
            }
            StringBuilder sb = new StringBuilder();
            int size = arraySize,itr=0;
            while(itr <size){
                if(arr[itr]!= -1){
                    sb.append(arr[itr]);
                    sb.append(" ");
                }
                itr++;
            }            
            System.out.println(sb);
        }
    }    
}