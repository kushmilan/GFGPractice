// created by Milan Kushwah at 2020/03/18 11:09.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class SearchInRotatedArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            int arrSize = Integer.parseInt(br.readLine());
            String arrS1[] = br.readLine().split("\\s+");
            int arr[] = new int[arrSize], sizeItr = 0;
            Map<Integer, Integer> map = new HashMap<>();
            while (sizeItr < arrSize) {
                map.put(Integer.parseInt(arrS1[sizeItr]), sizeItr++);
            }
            String ans = ""+map.get(Integer.parseInt(br.readLine()));
            if(!ans.equals("null")){
                System.out.println(ans);
            }else{
                System.out.println(-1);
            }
            
        }
    }

}