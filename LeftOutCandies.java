/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-15 16:56:23
 * @modify date 2020-03-15 16:56:23
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LeftOutCandies{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int j=Integer.parseInt(br.readLine()); j > 0; j--){
            String strin[] = br.readLine().split("\\s+");
            int students = Integer.parseInt(strin[0]);
            int candies = Integer.parseInt(strin[1]);
            int sum = students*(students+1)/2;
            int remaining = candies % sum;
            //System.out.println(remaining);
            int k=1;
            while(remaining >= k){
                //System.out.println(remaining+" "+k);    
                remaining = remaining-(k++);
            }
            System.out.println(remaining);
        }
    }
}