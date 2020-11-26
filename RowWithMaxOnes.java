
// created by Milan Kushwah at 2020/03/19 13:30.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.math.BigInteger;

class RowWithMaxOnes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()), k = 0;
        while (k++ < testCases) {
            String sizeArr[] = br.readLine().split("\\s+");
            int m = Integer.parseInt(sizeArr[0]);
            int n = Integer.parseInt(sizeArr[1]);
            int num = 0, currentMax=0,tempMax=0;
            String full = br.readLine().replace(" ", "");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(full.charAt(num)=='1'){
                        tempMax++;num++;
                    }else{
                        num++;
                    }
                    if((m*(i+1)+n*(j+1))%m==0){
                        if(currentMax < tempMax){
                            currentMax = tempMax;
                        }
                    }
                }
                tempMax=0;
            }
            System.out.println(currentMax);
        }
    }
}