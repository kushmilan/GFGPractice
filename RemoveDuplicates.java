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

class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            Set<Character> s = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(!s.contains(str.charAt(i))){
                    sb.append(str.charAt(i));
                    s.add(str.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }

}
