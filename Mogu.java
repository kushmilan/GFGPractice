import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mogu{

    public static int SegTree[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int primeAr[] = sieveOfEratosthenes(1000001);
        int primeCount[] = new int[1000001];
        primeCount[0] = 0;
        primeCount[1] = 0;
        for(int i=2;i<1000001;i++){
            primeCount[i] = primeCount[i-1]+primeAr[i];
        }
        
        for(int i=0;i<input;i++){
            StringTokenizer stTemp = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stTemp.nextToken());
            int b = Integer.parseInt(stTemp.nextToken());
            System.out.println(primeCount[Math.max(a,b)]-primeCount[Math.min(a,b)-1]);
        }

    }
    
    static int[] sieveOfEratosthenes(int n){  
        int prime[] = new int[n]; 
        for(int i=0;i< n;i++) 
            prime[i] = 1; 
          
        for(int p = 2; p*p <n; p++){ 
            if(prime[p] == 1){
                for(int i = p*p; i < n; i += p) 
                    prime[i] = 0; 
            } 
        }
        return prime; 
    }

}