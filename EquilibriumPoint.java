import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class EquilibriumPoint{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrS[] = br.readLine().split(" ");
        int arr[] = new int[arrS.length];
        int size = arr.length;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(arrS[i]);
        }
        int arrSum[] = new int[size];
        int arrReverseSum[] = new int[size];
        arrSum[0] = arr[0];
        for(int i=1;i<size;i++){
            arrSum[i] = arr[i] + arrSum[i-1];
        }
        arrReverseSum[size-1] = arr[size-1];
        System.out.println(arr[size-1]);
        for(int i=size-2;i>=0;i--){
            arrReverseSum[i] = arr[i] + arrReverseSum[i+1];
        }

        for(int i=0;i<size;i++){
            System.out.print(arrSum[i]+" ");
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(arrReverseSum[i]+" ");
        }
        System.out.println();
        for(int i=1;i<size-1;i++){
            if(arrSum[i-1]==arrReverseSum[i+1]){
                System.out.println("Index: "+(i+1));
            }
        }

    }
    
}