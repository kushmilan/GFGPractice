
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-20 00:14:34
 * @modify date 2020-03-20 00:14:34
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class PatternCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String arrS[] = br.readLine().split("");
            int size = arrS.length;
            int count = 0, state = 0;
            for (int i = 0; i < size; i++) {
                if (state == 0) {
                    if (arrS[i].equals("1")) {
                        state = 1;
                    }
                } else if (state == 1) {
                    if (arrS[i].equals("0")) {
                        state = 2;
                    } else if (arrS[i].equals("1")) {
                        state = 1;
                    } else {
                        state = 0;
                    }
                } else if (state == 2) {
                    if (arrS[i].equals("1")) {
                        state = 3;
                        count++;
                    }
                    if (arrS[i].equals("0")) {
                        state = 2;
                    } else {
                        state = 0;
                    }
                } else if (state == 3) {
                    if (arrS[i].equals("1"))
                        state = 1;
                    else if (arrS[i].equals("0"))
                        state = 2;
                    else
                        state = 0;
                }
            }
            System.out.println(count);
        }
    }
}
