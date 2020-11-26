
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
import java.util.*;

class Commonelements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            Set<Integer> set = new HashSet<>();            
            String arrSize[] = br.readLine().split("\\s+");
            int arrSizeS = arrSize.length;

            String arrS1[] = br.readLine().split("\\s+");
            for (int i = 0; i < arrS1.length; i++) {
                set.add(Integer.parseInt(arrS1[i]));
            }

            for (int k = 1; k < arrSizeS; k++) {
                String arr[] = br.readLine().split("\\s+");
                Set<Integer> setTemp = new HashSet<>();
                for (int i = 0; i < arr.length; i++) {
                    setTemp.add(Integer.parseInt(arr[i]));
                }
                //set = Sets.intersection(set, setTemp);
                set.retainAll(setTemp);
            }
            int count =0;
            ArrayList<Integer> list = new ArrayList<Integer>(set);
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<list.size();i++){
                sb.append(list.get(i)+" ");
                count++;
            }

            if(count>0){
                System.out.println(sb);
            }else{
                System.out.println(-1);
            }
        }
    }

}

/*
 * abstract
 * 
 * public static void main(String[] args) throws IOException { BufferedReader br
 * = new BufferedReader(new InputStreamReader(System.in)); for (int j =
 * Integer.parseInt(br.readLine()); j > 0; j--) { SortedMap<Integer, Integer>
 * map = new TreeMap<>(); String arrSize[] = br.readLine().split("\\s+"); int
 * arrSizeS = arrSize.length; for(int k =0;k<arrSizeS;k++){ String arr[] =
 * br.readLine().split("\\s+"); int arrInt[] = new int[arr.length]; for(int
 * i=0;i<arr.length;i++){ arrInt[i] = Integer.parseInt(arr[i]); } for(int
 * i=0;i<arr.length;i++){ if(!map.containsKey(arrInt[i])){ map.put(arrInt[i],
 * 1); }else{ map.put(arrInt[i], map.get(arrInt[i])+1); } } } StringBuilder sb =
 * new StringBuilder(); int count = 0; for (Map.Entry<Integer,Integer> entry :
 * map.entrySet()){ if(entry.getValue().equals(arrSizeS)){
 * sb.append(entry.getKey()+" "); System.out.println(entry.getKey() +" "+
 * arrSizeS); count++; } //System.out.println("Key = " + entry.getKey() +
 * ", Value = " + entry.getValue()); } if(count == 0){ System.out.println(-1);
 * }else{ System.out.println(sb); } } }
 * 
 */