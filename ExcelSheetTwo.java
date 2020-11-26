
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-25 20:38:15
 * @modify date 2020-03-25 20:38:15
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class ExcelSheetTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String n = br.readLine();
            System.out.println(Solution(n));
        }
    }

    static int Solution(String n) {
        int res = 0, k = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            res += ((int) (n.charAt(i)) - 64) * Math.pow(26, k++);
        }
        return res;
    }

}