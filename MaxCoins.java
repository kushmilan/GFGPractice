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

class MaxCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrTemp[] = br.readLine().split("\\s+");
        int arr[] = new int[arrTemp.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrTemp[i]);
        }
        System.out.println(maxCoins(arr));
    }

    static int maxCoins(int[] arr) {
        int T[][] = new int[arr.length][arr.length];

        for (int len = 0; len <= arr.length; len++) {
            for (int i = 0; i <= arr.length - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    int left = 0;
                    int right = 0;

                    if (i != 0) {
                        left = arr[i - 1];
                    }
                    if (j != arr.length - 1) {
                        right = arr[j + 1];
                    }

                    int before = 0;
                    int after = 0;
                    
                    if (i != k) {
                        before = T[i][k - 1];
                    }
                    if (j != k) {
                        after = T[k + 1][j];
                    }

                    if(i==0 && (j != arr.length - 1)){
                        T[i][j] = Math.max((0 + arr[k] * right) + before + after, T[i][j]);
                        //System.out.println(left+" "+ arr[k]+ " "+ right +" "+T[i][j]);
                    }else if(i!=0 && (j == arr.length - 1)){
                        T[i][j] = Math.max((left * arr[k] + 0) + before + after, T[i][j]);
                        //System.out.println(left+" "+ arr[k]+ " "+ right +" "+T[i][j]);
                    }else if(i==0 && (j == arr.length - 1)){
                        T[i][j] = Math.max((1 * arr[k] + 0) + before + after, T[i][j]);
                        //System.out.println(left+" "+ arr[k]+ " "+ right +" "+T[i][j]);
                    }else if(Math.max(left, right)==left && i!=0){
                        T[i][j] = Math.max((left * arr[k] + right) + before + after, T[i][j]);
                        //System.out.println(left+" "+ arr[k]+ " "+ right +" "+T[i][j]);
                    }else if(Math.max(left, right)==right && (j != arr.length - 1)){
                        T[i][j] = Math.max((left + arr[k] * right) + before + after, T[i][j]);
                        //System.out.println(left+" "+ arr[k]+ " "+ right +" "+T[i][j]);
                    }

                    //T[i][j] = Math.max(left * arr[k] * right + before + after, T[i][j]);
                }
            }
        }
        return T[0][arr.length - 1];
    }

}