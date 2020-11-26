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


class ExcelSheet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(Solution(n));
        }
    }

    static String Solution(int n) {
        String res = "";
        while(n>0){
            if(n%26 == 0){
                res = "Z" + res;
                n = n/26 -1;
            }else{
                res = Character.toString((char)(n%26+64)) + res;
                n = n/26;
            }
        }
        return res;
    }
    
}