
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-24 13:24:12
 * @modify date 2020-03-24 13:24:12
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class LongestCommonPrefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int size = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split("\\s+");
            Arrays.sort(str, ((x, y) -> (x.length() > y.length()) ? 1 : -1));

            int traverse = str[0].length();
            //System.out.println("Traverse: "+traverse);
            for (int i = 0; i < size - 1; i++) {
                int temp = 0;
                    for (int k = 0; k < traverse; k++) {
                        if (str[i].charAt(k) == str[i + 1].charAt(k)) {
                            //System.out.println("Yes: " + str[i].charAt(k) );
                            temp++;
                        }
                    }
                    //System.out.println("Bet: "+traverse);
                    if (traverse > temp){
                        traverse = temp;
                        //System.out.println("Traverse change: "+traverse);
                    }
            }
            //System.out.println(traverse);
            if(traverse == 0){
                System.out.println(-1);
            }else{
                System.out.println(str[0].substring(0,traverse));
            }
        }
    }

}



/*abstract

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class LongestCommonPrefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int size = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split("\\s+");
            //Arrays.sort(str, ((x, y) -> (x.length() > y.length()) ? 1 : -1));

            int traverse = str[0].length();
            //System.out.println("Traverse: "+traverse);
            for (int i = 0; i < size - 1; i++) {
                int temp = 0;
                    for (int k = 0; k < Math.min(str[i].length(),str[i+1].length()) && k < traverse; k++) {
                        if (str[i].charAt(k) == str[i + 1].charAt(k)) {
                            //System.out.println("Yes: " + str[i].charAt(k) );
                            temp++;
                        }
                    }
                    //System.out.println("Bet: "+traverse);
                    if (traverse > temp){
                        traverse = temp;
                        //System.out.println("Traverse change: "+traverse);
                    }
            }
            //System.out.println(traverse);
            if(traverse == 0){
                System.out.println(-1);
            }else{
                System.out.println(str[0].substring(0,traverse));
            }
            
        }
    }

}


*/