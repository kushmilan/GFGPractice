
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
import java.util.HashSet;
import java.util.Set;

class FindMissingAndRepeating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int size = Integer.parseInt(br.readLine());
            String arrS[] = br.readLine().split("\\s+");
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i <arrS.length; i++) {
                long temp = Integer.parseInt(arrS[i]);
                sum1 += temp;
                sum2 += temp*temp;
            }
            long x = (size)*(size+1)/2 - sum1;
            long y = ((size)*(size+1)*(2*size+1)/6 - sum2)/x;
            System.out.println(y);
            System.out.println((y-x)/2 +" "+(y+x)/2);
        }
    }
}