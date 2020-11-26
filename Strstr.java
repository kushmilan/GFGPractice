
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-24 12:51:25
 * @modify date 2020-03-24 12:51:25
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class Strstr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str[] = br.readLine().split("\\s+");
            String str1 = str[0];
            String str2 = str[1];
            if (str1.contains(str2)) {
                System.out.println(strStr(str1, str2));
            } else {
                System.out.println(-1);
            }
        }
    }

    static int strStr(String s, String x) {
        int i = 0, j = 0, index = 0;
        while (i < s.length() && j < x.length()) {
            if(s.charAt(i) == x.charAt(j)){
                index = i;
                i++;j++;
                while (i < s.length() && j < x.length()) {
                    if(s.charAt(i) != x.charAt(j)){
                        break;
                    }else{
                        i++;j++;
                    }
                }
                if(j== x.length()-1){
                    return index;
                }else{
                    j = 0;
                }
            }else{
                i++;
            }
        }
        return index;
    }

}
