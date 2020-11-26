import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SieveOfEratosthenes{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean sieveArr[] = sieveOfEratosthenes(1000000);
    }

    static boolean[] sieveOfEratosthenes(int n){  
        boolean prime[] = new boolean[n]; 
        for(int i=0;i< n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <n; p++){ 
            if(prime[p] == true){
                for(int i = p*p; i < n; i += p) 
                    prime[i] = false; 
            } 
        }
        return prime; 
    }

}