import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Kadanes{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int arrInt[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        kadaneMax(arrInt);
        kadaneMin(arrInt);
        normal();
    }

    static void kadaneMax(int arr[]){
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        
        for(int i=0;i<arr.length;i++){
            maxEndingHere = maxEndingHere + arr[i];
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            
            if(maxEndingHere<0)
                maxEndingHere = 0;
        }
        System.out.println("maxSoFar: " + maxSoFar);
    }

    static void kadaneMin(int arr[]){
        int minSoFar = Integer.MAX_VALUE, minEndingHere = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(minEndingHere > 0){
                minEndingHere = arr[i];
            }else{
                minEndingHere += arr[i];
            }
            minSoFar = Math.min(minEndingHere, minSoFar);
        }
        System.out.println("minSoFar: "+minSoFar);
    }
    
    static void normal(){
        int n =10;
        while(n-- > 0){
            System.out.println("Here!: "+n);
        }
    }
    
}