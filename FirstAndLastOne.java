/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-13 21:53:31
 * @modify date 2020-03-13 21:53:31
 * @desc [description]
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

class FirstAndLastOne{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),testM=0;
        while(testM++<testCases){
            int arrSize = Integer.parseInt(br.readLine());
            String arrS[] = br.readLine().split("\\s+");
            int number = Integer.parseInt(br.readLine());
            int arr[] = new int[arrSize];
            for(int i=0;i<arrSize;i++){
                arr[i] = Integer.parseInt(arrS[i]);
            }

            int firstIndex = arrSize + 1;int lastIndex =-1;
            boolean flag = false;
            for(int i=0;i<arrSize;i++){
                if(arr[i]==number){
                    flag = true;
                    lastIndex = i;
                    //System.out.println(lastIndex);
                    firstIndex = Math.min(firstIndex,lastIndex);
                }
            }
            if(flag){
                System.out.println(firstIndex +" "+ lastIndex);
            }else{
                System.out.println(-1);
            }
            
        }
        br.close();
    }  

}