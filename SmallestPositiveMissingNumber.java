
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-19 22:03:06
 * @modify date 2020-03-19 22:03:06
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class SmallestPositiveMissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int size = Integer.parseInt(br.readLine());
            size++;
            String arrS[] = br.readLine().split("\\s+");
            int arr[] = new int[size];
            for (int i = 0; i < size-1; i++) {
                if (Integer.parseInt(arrS[i]) > 0 && Integer.parseInt(arrS[i]) <= size) {
                    arr[Integer.parseInt(arrS[i]) - 1] = -1;
                }
            }

            for (int i = 0; i < size; i++) {
                if (arr[i] == 0) {
                    System.out.println(i+1);
                    break;
                }
            }

            

        }
    }
}