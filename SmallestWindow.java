/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-25 11:35:34
 * @modify date 2020-03-25 11:35:34
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class SmallestWindow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            ArrayList<Character> list = new ArrayList<>();
            String contain = br.readLine();
            if(Solution(str, contain)!=""){
                System.out.println(Solution(str, contain));
            }else{
                System.out.println(-1);
            }
        }
    }

    static String Solution(String s, String t) {
        if (s == null || t == null)
            return "";

        String res = "";
        int letterCount[] = new int[128];
        int left = 0, count = 0, minCount = Integer.MAX_VALUE;
        for (char c : t.toCharArray())
            ++letterCount[c];
        for (int right = 0; right < s.length(); ++right) {
            if(--letterCount[s.charAt(right)] >= 0)
                ++count;
            while(count == t.length()){
                if(minCount > right - left + 1){
                    minCount = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                if(++letterCount[s.charAt(left)] > 0)
                    --count;
                ++left;
            }  
        }
        return res;
    }
}