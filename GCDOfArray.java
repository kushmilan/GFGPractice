/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-15 17:09:09
 * @modify date 2020-03-15 17:09:09
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GCDOfArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int j=Integer.parseInt(br.readLine()); j > 0; j--){
            int arrSize = Integer.parseInt(br.readLine());
            String arrS[] = br.readLine().split("\\s+");
            int arr[] = new int[arrSize];
            for(int i=0;i<arrSize;i++){
                arr[i] = Integer.parseInt(arrS[i]);
            }
            if(arrSize==1){
                System.out.println(arr[0]);
            }else{
                int temp = arr[0],ans1=arr[0];
                for(int i=1;i<arrSize;i++){
                    ans1 = gcd(ans1, arr[i]);
                    //System.out.println(ans1+" "+arr[i]+" "+gcd(ans1, arr[i]));
                    temp = arr[i];
                }
                //System.out.println(gcd(5, 10));
                System.out.println(ans1);
            }
            
        }
    }


    static int gcd(int a, int b){
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 

}