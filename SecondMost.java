/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-30 20:46:06
 * @modify date 2020-03-30 20:46:06
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.*;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class SecondMost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int k = Integer.parseInt(br.readLine()); k > 0; k--) {
            String size = br.readLine();
            Map<String, Integer> map = new HashMap<>();
            String arrS[] = br.readLine().split("\\s+");
            for (String string : arrS){
                if(map.containsKey(string)){
                    map.put(string, map.get(string)+1);
                }else{
                    map.put(string, 1);
                }
            }
            //System.out.println(map);
            int max = -1;
            String maxStr = "";
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(max < entry.getValue()){
                    max = entry.getValue();
                    maxStr = entry.getKey();
                }   
            }
            map.remove(maxStr);
            //System.out.println(map);
            max = -1;maxStr = "";
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(max < entry.getValue()){
                    max = entry.getValue();
                    maxStr = entry.getKey();
                }
            }
            System.out.println((maxStr));

        }
    }

}