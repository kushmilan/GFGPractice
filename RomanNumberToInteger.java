
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-22 16:40:20
 * @modify date 2020-03-22 16:40:20
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

class RomanNumberToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            System.out.println(romanToInt(br.readLine()));
        }
    }

    static int romanToInt(String str) {
        int len = str.length();
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < len; i++){
            if (i < len - 1 && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result += map.get(str.charAt(i + 1)) - map.get(str.charAt(i));
                i++;
            } else {
                result += map.get(str.charAt(i));
            }
        }
        return result;
    }

}
