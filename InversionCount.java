import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InversionCount{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrS1[] = br.readLine().split("\\s+");
        int size1 = arrS1.length,k=0;
        int arr1[] = new int[size1];
        while(k<size1){
            arr1[k] = Integer.parseInt(arrS1[k]);
            k++;
        }
        int low = 0;
        int high = arr1.length-1;
        sort(arr1, low, high);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }   
  
    static void sort(int arr[], int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            
            sort(arr, low, mid);
            sort(arr, mid+1, high);

            merge(arr, low, high, mid);
        }
    }

    static void merge(int arr[], int low, int high, int mid){
        int n1 = mid - low +1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0;i<n1;++i){
            left[i] = arr[low + i];
        }
        for(int i=0;i<n2;++i){
            right[i] = arr[mid + 1 + i];
        }

        int i=0, j=0;

        int k = low;
        while(i < n1 && j < n2){
            if(left[i] <= right[i]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = left[i];
            i++;k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;k++;
        }

    }

}