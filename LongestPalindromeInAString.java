
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-22 11:04:05
 * @modify date 2020-03-22 11:04:05
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class LongestPalindromeInAString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            int size = str.length();
            int arr[][] = new int[size][size];
            int maxLength = 1, start = 0;
            for (int[] row : arr)
                Arrays.fill(row, -1);

            // for length = 1
            for (int i = 0; i < size; i++) {
                arr[i][i] = 1;
            }

            if (size == 0) {
                System.out.println(str);
                {
                }
            } else if (size == 1) {
                System.out.println(str);
            } else {
                // for length = 2
                for (int i = 0; i < size - 1; i++) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        arr[i][i + 1] = 1;
                        start = i;
                        maxLength = 2;
                        break;
                    }
                }

                for (int i = 0; i < size - 1; i++) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        arr[i][i + 1] = 1;
                    }
                }

                // for length >=3
                for (int k = 3; k <=size; k++) {
                    for (int i = 0; i < size - k + 1; i++) {
                        int p = i + k - 1;
                        if (arr[i + 1][p - 1] == 1 && str.charAt(i) == str.charAt(p)){
                            arr[i][p] = 1;
                            if (k > maxLength) {
                                start = i;
                                maxLength = k;
                            }
                        }
                    }
                }


                // for (int k = 0; k < size; k++) {
                //     for (int i = 0; i < size; i++) {
                //        System.out.print(arr[k][i]+" ");
                //     }
                //     System.out.println();
                // }



                System.out.println(str.substring(start, start + maxLength));

            }
        }
    }
}