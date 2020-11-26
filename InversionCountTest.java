// created by Milan Kushwah at 2020/03/03 12:27.
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.HashSet;
    import java.util.Scanner;
    import java.util.Set;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    class InversionCountTest{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String arrS1[] = br.readLine().split("\\s+");
            int size1 = arrS1.length, k=0;
            int arr1[] = new int[size1];
            while(k<size1){
                arr1[k] = Integer.parseInt(arrS1[k]);
                k++;
            }
        int low = 0;
        int high = arr1.length-1;
        System.out.println(sort(arr1, low, high));
        /*
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        */        
    }   

    static int sort(int arr[], int low, int high){
        int count =0;
        if(low<high){
            
            int mid = (low+high)/2;

            count += sort(arr, low, mid);
            count += sort(arr, mid+1, high);

            count += merge(arr, low, high, mid);
        }
        return count;
    }

    static int merge(int arr[], int low, int high, int mid){
        int n1 = mid - low +1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0;i<n1;i++){
            left[i] = arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[mid+1+i];
        }

        int j=0,k=0, swaps = 0;
        int m=low;
        while(j<n1 && k<n2){
            if(left[j] <=right[k]){
                arr[m++] = left[j++];
                //inversion++;
            }else{
                arr[m++] = right[k++];
                swaps += (mid +1) - (low+j);
                System.out.println("swaps: "+ swaps + ", arr: "+ arr[m-1] +" arr: "+ right[k-1]);
            }
            
        }

        while(j<n1){
            arr[m++] = left[j++];
        }
        while(k<n2){
            arr[m++] = right[k++];
        }
        //System.out.println("Inversion count: "+ inversion);
        System.out.println("Inversion count: "+ swaps);
        return swaps;
        
    }


    /*
    static void sort(int arr[], int low, int high){
        if(low<high){
            
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

        for(int i=0;i<n1;i++){
            left[i] = arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[mid+1+i];
        }

        int j=0,k=0;
        int m=low;
        while(j<n1 && k<n2){
            if(left[j] <=right[k]){
                arr[m] = left[j];
                inversion++;
                j++;
                m++;
            }else{
                arr[m] = right[k];
                inversion++;
                k++;
                m++;
            }
            
        }

        while(j<n1){
            arr[m] = left[j];
            j++;m++;
        }
        while(k<n2){
            arr[m] = right[k];
            k++;m++;
        }

        System.out.println("Inversion count: "+ inversion);
    }
    */
}

// created by Milan Kushwah at 2020/03/03 12:27.