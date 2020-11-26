
/**
 * @author [Milan Kushwah]
 * @create date 2020-04-16 15:49:06
 * @modify date 2020-04-16 15:49:06
 * @desc [description]
 */

import java.io.*;
import java.util.*;

class NumWithoutFour {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int T = Integer.parseInt(br.readLine().replace(" ", ""));
            System.out.println(count(T));
        }
    }

    static int count(int num) {
        if (num < 4) {
            return num;
        }
        if (num >= 4 && num < 10) {
            return num - 1;
        }

        int powerOf = 1;
        while (num / powerOf > 9) {
            powerOf *= 10;
        }

        int msd = num / powerOf;

        if (msd != 4) {
            return count(msd)*count(powerOf-1) + count(msd) + count(num%powerOf);
        }else{
            return count(msd*powerOf - 1);
        }
    }

}