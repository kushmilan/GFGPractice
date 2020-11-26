import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

class RearrangeArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split("\\s+");
        int arr1[] = new int[arr.length];
        int i;
        for(i=0;i<arr1.length;i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int start =0, end = arr1.length-1;
        while(start!=end){
            if(start>end){
                break;
            }
            System.out.print(arr1[start]);
            start++;
            System.out.print(arr1[end]);
            end--;
        }

    }

}