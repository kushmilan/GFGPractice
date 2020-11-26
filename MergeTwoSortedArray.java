import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

class MergeTwoSortedArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split("\\s+");
        int arr1[] = new int[arr.length];
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String arrA[] = br1.readLine().split("\\s+");
        int arr2[] = new int[arrA.length];
        br.close();
        br1.close();
        for(int i=0;i<arr.length;i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }
        for(int i=0;i<arrA.length;i++){
            arr2[i] = Integer.parseInt(arrA[i]);
        }
        int arrFinal[] = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i < arr1.length){
            while(j < arr2.length){
                if(arr1[i] < arr2[j]){
                    arrFinal[k] = arr1[i];
                    i++;k++;
                }else if(arr1[i] > arr2[j]){
                    arrFinal[k] = arr2[j];
                    j++;k++;
                }else if(arr1[i] == arr2[j]){
                    arrFinal[k] = arr2[j];
                    k++;
                    arrFinal[k] = arr1[i];
                    i++;j++;k++;
                }
            }
        }
        int o=0;
        while(o < arrFinal.length){
            System.out.print(arrFinal[o]+" ");
            o++;
        }
        System.out.println();
    }

}