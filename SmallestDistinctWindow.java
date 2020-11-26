
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-25 14:02:43
 * @modify date 2020-03-25 14:02:43
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;


class SmallestDistinctWindow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            if (Solution(str) != "") {
                System.out.println(Solution(str).length());
            } else {
                System.out.println(-1);
            }
            //System.out.println(Solution(str));
        }
    }

    static String Solution(String s) {
        if (s == null)
            return "";
        String res = "";
        int letterCount[] = new int[128];
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set  = new HashSet<>();
        int left = 0, count = 0, minLength = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); ++right) {
            if (set.contains(s.charAt(right))) {
                //System.out.println("if: "+set.contains(s.charAt(right))+" "+ s.charAt(right));
                count++;
            } else {
                set.add(s.charAt(right));
                map.put(s.charAt(right), right);
                //System.out.println("Else: "+set.contains(s.charAt(right))+" "+ s.charAt(right));
                ++letterCount[s.charAt(right)];
            }

            if (count == 0) {
                minLength = Math.max(minLength, right - left + 1);
                res = s.substring(left, right+1);
                System.out.println("String: "+res);
            }else{
                if(map.get(s.charAt(right)) + 1 < s.length()){
                    left = map.get(s.charAt(right)) + 1;
                    map.put(s.charAt(right), right);
                    //System.out.println("Changing Left: " + map.get(s.charAt(right)) +"Right: "+right +" To: " + left );
                }else{
                    left = map.get(s.charAt(right));
                    map.put(s.charAt(right), right);
                }
                set.clear();
                //System.out.println("Left: "+left+"Right: "+right);
                for(int i =left;i<right;i++){
                    set.add(s.charAt(i));
                }
                //System.out.println("Set: "+set);
                set.add(s.charAt(right));
                count = 0; 
            }
        }
        return res;
    }

}


/*

if (Solution(str) != "") {
                System.out.println(Solution(str));
            } else {
                System.out.println(-1);
            }

*/


/*abstract

static String Solution(String s) {
        if (s == null)
            return "";
        String res = "";
        int letterCount[] = new int[128];
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set  = new HashSet<>();
        int left = 0, count = 0, minLength = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); ++right) {
            if (letterCount[s.charAt(right)]-1 == 0 && set.contains(s.charAt(right))) {
                System.out.println("if: "+letterCount[s.charAt(right)]+" "+ s.charAt(right));
                count++;
            } else {
                set.add(s.charAt(right));
                map.put(s.charAt(right), right);
                System.out.println("Else: "+letterCount[s.charAt(right)]+" "+ s.charAt(right));
                ++letterCount[s.charAt(right)];
            }

            if (count == 0) {
                minLength = Math.max(minLength, right - left + 1);
                res = s.substring(left, right+1);
                System.out.println("String: "+res);
            }else{
                if(map.get(s.charAt(right)) + 1 < s.length()){
                    System.out.println("Changing Left: " + map.get(s.charAt(right)) +" To: " + (map.get(s.charAt(right))+1) );
                    left = map.get(s.charAt(right)) + 1;
                    map.put(s.charAt(right), right);
                }else{
                    left = map.get(s.charAt(right));
                    map.put(s.charAt(right), right);
                }
                set.clear();
                for(int i =left;i<right;i++){
                    set.add(s.charAt(i));
                }
                count = 0; 
                letterCount[s.charAt(right)] = 1;
            }
        }
        return res;
    }





lcpsklryvmcpjnbpbwllsrehfmxrkecwitrsglrexvtjmxypunbqfgxmuvgfajclfvenhyuhuorjosamibdn
dbeyhkbsombltouujdrbwcrrcgbflqpottpegrwvgajcrgwdlpgitydvhedtusippyvxsuvbvfenodqasajoy

*/