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

class LastOne{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),testM=0;
        while(testM++<testCases){
            String str = br.readLine();
            int arrSize = str.length();
            int index=-1;
            //StringBuilder sb = new StringBuilder();
            for(int i=0;i<arrSize;i++){
                if(str.charAt(i)=='1'){
                    index = i;
                }
            }
            if(index > -1){
                System.out.println(index);
            }else{
                System.out.println(-1);
            }
            
        }
        br.close();
    }  

}