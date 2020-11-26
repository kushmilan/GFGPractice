import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Kajal{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size  = Integer.parseInt(br.readLine());
        int sizeArr = size*size;
        int arrRow[] = new int[sizeArr];
        int arrColumn[] = new int[sizeArr];
        int twoDArr[][] = new int[size][size];
        for(int i = 0;i<size;i++){
            String arrTemp[] = br.readLine().split("\\s+");
            for(int j =0;j<size;j++){
                twoDArr[i][j] = Integer.parseInt(arrTemp[i]);
            }
        }
        int k=0;
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                arrRow[k++] = twoDArr[i][j];
            }
        }
        k=0;
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                arrColumn[k++] = twoDArr[j][i];
            }
        }

        kadaneMax(arrColumn); 
        
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
    
    static void normal(){
        int n =10;
        while(n-- > 0){
            System.out.println("Here!: "+n);
        }
    }
    
}