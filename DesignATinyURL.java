/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-25 22:07:22
 * @modify date 2020-03-25 22:07:22
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class DesignATinyURL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Map<Character, Integer> mapChar = new HashMap<>();
        int n = 62;
        for (int i = 0; i < characters.length(); i++) {
            mapChar.put(characters.charAt(i), i);
            mapInt.put(i, characters.charAt(i));
        }
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int num = Integer.parseInt(br.readLine());
            String str = solution(num, mapInt, n);
            System.out.println(str);
            System.out.println(solutionReverse(str, mapChar, n));
        }
    }

    static String solution(int num, Map<Integer, Character> mapInt, int n) {
        String res = "";
        while (num > 0) {
            if (num % n == 0) {
                res = "a" + res;
                num = num / n;
            } else {
                res = mapInt.get(num % n) + res;
                num = num / n;
            }
        }
        return res;
    }

    static int solutionReverse(String str, Map<Character, Integer> mapChar, int n) {
        int res = 0, k = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            res += mapChar.get(str.charAt(i)) * Math.pow(n, k++);
        }
        return res;
    }

}