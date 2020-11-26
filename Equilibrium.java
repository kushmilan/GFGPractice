import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Equilibrium{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int testcases = Integer.parseInt(br.readLine()),o=0;
        int o=0;
        int testcases = sc.nextInt();
        while(o < testcases){
            //int arraySize = Integer.parseInt(br.readLine());
            int arraySize = sc.nextInt();
            //String arrS1[] = br.readLine().split("\\s+");
            String arrS1[] = sc.nextLine().split("\\s+");
            int k=0;
            int arr[] = new int[arraySize];
            while(k<arraySize){
                arr[k] = Integer.parseInt(arrS1[k]);
                k++;
            }
            int arrSum[] = new int[arraySize];
            int arrSumReverse[] = new int[arraySize];
            int q=0;
            int p=arraySize-1;
            arrSum[q] = arr[q];
            q++;
            while(q<arraySize){
                arrSum[q] = arrSum[q-1] + arr[q];q++;
            }
            arrSumReverse[p] = arr[p];
            p--;
            while(p>0){
                arrSumReverse[p] = arrSumReverse[p+1] + arr[p];
            }
            for(int i=0;i<arraySize;i++){
                System.out.print(arrSum[i]+" ");
            }
            System.out.println();
            for(int i=0;i<arraySize;i++){
                System.out.print(arrSumReverse[i]+" ");
            }
            o++;
        }        
    }
    
}






/*abstract

            o++;
            
            

            


*/