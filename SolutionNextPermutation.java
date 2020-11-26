/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-07 16:13:51
 * @modify date 2020-05-07 16:13:51
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Comparator;

public class SolutionNextPermutation{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int p = Integer.parseInt(br.readLine());
            String inp[] = br.readLine().split("\\s+");
            int arr[] = new int[p];
            int index = 0;
            for(String s : inp)
                arr[index++] = Integer.parseInt(s);
            
            String temp = biggerIsGreater(arr);
            //String temp = biggerIGreater(br.readLine());
            System.out.println(temp);
            //writer.println(temp);
        }
        br.close();
        //writer.close();
    }

    static String biggerIsGreater(int arr[]){
        if(arr.length==1){
            return arr[0]+"";
        }
        if(arr.length==2){
            if(arr[0]<arr[1]){                
                return arr[1]+" "+arr[0];
            }else{
                return arr[0]+" "+arr[1];
            }
        }
        int max = arr[arr.length-1];
        int index = 0;
        int count = 0;
        for(int i = arr.length -2; i >= 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                //System.out.println(i+" "+max+" "+arr[i]);
                continue;
            }else{
                //System.out.println(i+" "+max+" "+arr[i]);
                count++;
                index = i;
                break;
            }
        }
        //System.out.println("index: "+index);
        if(count==0){
           // System.out.println("here");
           String r = "";
           for(int i = 0; i < arr.length; i++){
               r+=arr[i]+" ";
           }
            return r;
        }
        int inext = 0;

        for(int i = arr.length -1; i > 0; i--){
            if(arr[index] < arr[i]){
                inext = i;
                //System.out.println("inext: "+inext);
                break;
            }else{
                continue;
            }
        }
        //System.out.println("inext: "+inext);
        int temp = arr[inext];
        arr[inext] = arr[index];
        arr[index] = temp;

        StringBuilder pre = new StringBuilder();
        StringBuilder post = new StringBuilder();
        for(int i = 0; i <=index; i++){
            pre.append(arr[i]+" ");
        }
        for(int i = arr.length-1; i > index; i--){
            post.append(arr[i]+" ");
        }
        //pre.append(str.substring(0, index));
        //post.append(str.substring(index+1, str.length()));
        //System.out.println(post);
        return pre.append(post).toString();
    }

}