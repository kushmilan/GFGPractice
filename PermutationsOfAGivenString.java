/*
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-26 04:17:46
 * @modify date 2020-03-26 04:17:46
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class PermutationsOfAGivenString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String characters = br.readLine();
            char arr[] = characters.toCharArray();
            solution(arr);
        }
    }

    static void solution(char arr[]) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char c : arr) {
            countMap.compute(c, (x, y) -> (y == null) ? 1 : y + 1);
        }
        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        char result[] = new char[arr.length];
        permute(str, count, result, 0);
    }

    static void permute(char str[], int count[], char result[], int level) {
        if (level == result.length) {
            printArray(result);
            return;
        }

        for (int i = 0; i < str.length; i++) {
            if (count[i] == 0)
                continue;
            result[level] = str[i];
            count[i]--;
            permute(str, count, result, level + 1);
            count[i]++;
        }
    }

    static void printArray(char result[]) {
        StringBuilder sb = new StringBuilder();
        for (char c : result)
            sb.append(c);
        System.out.print(sb + " ");
    }

}