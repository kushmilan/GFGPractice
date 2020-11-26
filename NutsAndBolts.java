
// created by Milan Kushwah at 2020/03/19 13:30.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.math.BigInteger;

class NutsAndBolts{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            int arrSize = Integer.parseInt(br.readLine());
            String arrS1[] = br.readLine().split("\\s+");
            String arrS2[] = br.readLine().split("\\s+");
            String ordered[] = {"!", "#", "$", "%", "&", "*", "@", "^",  "~"};
            Set<String> setOne = new HashSet<>();
            Set<String> setTwo = new HashSet<>();
            for(int i=0;i<arrSize;i++){
                setOne.add(arrS1[i]);
                setTwo.add(arrS2[i]);
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<9;i++){
                if(setOne.contains(ordered[i]) && setTwo.contains(ordered[i])){
                    sb.append(ordered[i]+" ");
                }
            }
            System.out.println(sb);
            System.out.println(sb);
        }
    }

}