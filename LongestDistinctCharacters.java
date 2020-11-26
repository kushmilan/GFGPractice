/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-22 17:31:53
 * @modify date 2020-03-22 17:31:53
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class LongestDistinctCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            int len=0, max1=0;
            Map<Character, Integer> map = new HashMap<>();
            for(int k = 0;k<str.length();k++){
                if(!map.containsKey(str.charAt(k))){
                    map.put(str.charAt(k), k);
                    len++;
                    if(len > max1){
                        max1 = len;
                    }
                }else{
                    if(len > max1){
                        max1 = len;
                    }
                    len=0;
                    k = map.get(str.charAt(k));
                    map.clear();
                }
            }
            System.out.println(max1);
        }
    }

}
