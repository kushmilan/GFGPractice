/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-24 12:42:55
 * @modify date 2020-03-24 12:42:55
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class Atoi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            System.out.println(atoi(str));
        }
    }

    static int atoi(String str){
        try{
            return Integer.parseInt(str);
        }catch(Exception e){
            return -1;
        }
    }

}
