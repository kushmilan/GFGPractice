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
import java.util.Arrays;

class FourSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String arrTemp[] = br.readLine().split("\\s+");
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(arrTemp[i]);
        }
        
    }

    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-3; i++){
            for(int j = i+1; j < arr.length-2; j++){
            
                int k = j + 1;
                int l = nums.length - 1;
                while(k < l){
                    
                }

            }
        
        }
    
        return list;
    }

}