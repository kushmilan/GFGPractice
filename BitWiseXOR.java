/*
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-29 01:17:27
 * @modify date 2020-03-29 01:17:27
 * @desc [description]
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class BitWiseXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String arrTemp[] = br.readLine().split("\\s+");
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(arrTemp[i]);
        }
        System.out.println(5^7^5);
        nonRepeating(arr, T);
    }

    static void nonRepeating(int arr[], int T){
        int first = 0;
        int distinct;
        int one = 0;
        int two = 0;
        for(int i : arr)
            first ^= arr[i];
        
        distinct = first & ~(first-1);
        System.out.println(distinct);
        
        for(int i = 0; i < T; i++){
            if((arr[0] & distinct)==1 )
                one = one ^ arr[i];
            else
                two = two ^ arr[i];
        }

        System.out.println(one +" "+ two);


    }

}