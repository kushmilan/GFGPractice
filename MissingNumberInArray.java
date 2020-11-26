import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MissingNumberInArray{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int arrInt[] = new int[arr.length];
        int i;
        for(i=0;i<arr.length;i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        missingNumber(arrInt);
        missingNumberViaXOR(arrInt);
    }

    static void missingNumber(int arr[]){
        int n = arr.length;
        int num = (n+1)*(n+2)/2;
        int i;
        for(i=0;i<n;i++){
            num -= arr[i];
        }
        System.out.println("Missing number: "+num);
    }

    static void missingNumberViaXOR(int arr[]){
        int n = arr.length,i;
        int x1 = arr[0], x2 = 1;
        for(i=1;i<n;i++){
            x1 =  x1 ^ arr[i];
            System.out.println("x1 ^ arr[i]: " + x1);
        }
        for(i=2;i<n+2;i++){
            x2 =  x2 ^ i;
        }
        System.out.println("Result from XOR : " + (x2 ^ x1) );
    }
    
}