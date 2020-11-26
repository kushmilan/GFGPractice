
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReverseSubArray{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),testM=0;
        while(testM++<testCases){
            String arrS1[] = br.readLine().split("\\s+");
            int arrSize = Integer.parseInt(arrS1[0]),sizeItr=0;
            int arrSubSize = Integer.parseInt(arrS1[1]);
            String arrS[] = br.readLine().split("\\s+");
            long arr[] = new long[arrSize];
            while(sizeItr<arrSize){
                arr[sizeItr] = Long.parseLong(arrS[sizeItr++]);
            }
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<arrSize;i+=arrSubSize){
                int left = i;
                int right = Math.min(i+arrSubSize, arrSize);
                for(int j=right-1;j>=left;j--){
                    sb.append(arr[j]);sb.append(" ");
                    //System.out.print(arr[j]+" ");
                }
            }
            System.out.println(sb);
            
            
            /*
            int i=0,j=0,k=0;
            for(i=0;i<arrSize;i+=arrSubSize){
                for(j=i+arrSubSize-1;j>=i;j--){
                    if(j<arrSize){
                        System.out.print(arr[j]+" ");k++;
                    }else{
                        
                        break;
                    }
                }
            }
            //System.out.println("here: "+k+"xyz");
            
            if(k<arrSize){
                int temp = arrSize-k;
                arrSize--;
                while(temp-->0){
                    System.out.print(arr[arrSize--]+" ");
                }
            }
            */
            //System.out.println();
        }
        br.close();

    }
    
}