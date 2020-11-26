
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-29 19:46:15
 * @modify date 2020-03-29 19:46:15
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class NonRepeatingCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int n = Integer.parseInt(br.readLine().replace(" ", ""));
            char arrC[] = br.readLine().toCharArray();
            int arr[] = new int[26];
            Arrays.fill(arr, 0);
            Queue<Character> q = new LinkedList<>();
            for (char c : arrC) {
                arr[(int) c - 97]++;                
                q.add(c);
            }
            while (q.size() != 0 && n >=0) {
                if(arr[(int)q.peek()-97] > 1){
                    q.remove();
                }
                n--;
            }

            if (q.size() > 0) {
                System.out.println(q.peek());
            } else {
                System.out.println(-1);
            }
        }
    }

}