import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindMedianInStream {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int median[] = getmedian(arr);
        for(int i : median)
            System.out.println(i);

    }

    private static final PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
    private static final PriorityQueue<Integer> higher = new PriorityQueue<>();

    private static int[] getmedian(int arr[]){
        int median[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            addnumber(arr[i]);
            rearrange();
            median[i] = getMedianNumber();
        }
        return median;
    }

    private static int getMedianNumber(){
        if(lower.size() == higher.size()){
            return (lower.peek()+higher.peek())/2;
        }else if(lower.size() > higher.size()){
            return lower.peek();
        }else if(lower.size() < higher.size()){
            return higher.peek();
        }
        return 0;
    }

    private static void rearrange(){
        if(lower.size() > higher.size()){
            if(lower.size() - higher.size() >= 2){
                higher.add(lower.poll());
            }
        }else if(lower.size() < higher.size()){
            if(higher.size() - lower.size() >= 2){
                lower.add(higher.poll());
            }
        }

    }


    private static void addnumber(int num){
        if(lower.size()==0 || num < lower.peek()){
            lower.add(num);
        }else{
            higher.add(num);
        }

    }

}