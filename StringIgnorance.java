/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-25 01:01:08
 * @modify date 2020-03-25 01:01:08
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class StringIgnorance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            Set<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if(!set.contains(str.charAt(i)) && !set.contains(Character.toUpperCase(str.charAt(i))) && !set.contains(Character.toLowerCase(str.charAt(i)))){
                    sb.append(str.charAt(i));
                    set.add(str.charAt(i));
                }else{
                    set.remove(str.charAt(i));
                    set.remove(Character.toUpperCase(str.charAt(i)));
                    set.remove(Character.toLowerCase(str.charAt(i)));
                }
            }
            System.out.println(sb);
        }
    }
}


/*abstract

cKlBoKdTfJzDfOiGwVbGgL iTaFzVjJtRuMyExItBeC sVbLgCjXkJcRwSpEnXqY mGnMuMqKpQlUiHkOnQaV

cKlBodTfJziGwVg aFJtRuMyExIBsVLCkJpEnXq GMQUHkOnmrlIgYhAVbX
cKlBodTfJziGwVg aFJtRuMyExIBsVLCkJpEnXq GMQUHkOn

*/