// created by Milan Kushwah at 2020/03/13 14:57.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ElementLeftRight{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),k=0;
        while(k++<testCases){
            int arrSize = Integer.parseInt(br.readLine());    
            String arrS1[] = br.readLine().split("\\s+");
            int arr[] = new int[arrSize],sizeItr=0;
            while(sizeItr < arrSize){
                arr[sizeItr] = Integer.parseInt(arrS1[sizeItr++]);
            }
            int answer = check(arr, arrSize);
            //System.out.println(check(arr, arrSize));
            if(answer!=0){
                System.out.println(answer);
            }else{
                System.out.println(-1);
            }
        }
        br.close();
    }


    static int check(int arr[], int arrSize){
        int rightMax[] = new int[arrSize];
        int leftMax[] = new int[arrSize];
        leftMax[0]=arr[0];
        for(int i=1;i<arrSize;i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        rightMax[arrSize-1] = arr[arrSize-1];
        for(int i=arrSize-2;i>0;i--){
            rightMax[i] = Math.min(rightMax[i+1], arr[i]);
        }

        /*
        for(int i=0;i<arrSize;i++){
            System.out.print(leftMax[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arrSize;i++){
            System.out.print(rightMax[i]+" ");
        }
        System.out.println();
        
        */

        int current=0, next=2;
        if(arrSize==1 || arrSize==2){
            return 0;
        }
        for(int i=1;i<arrSize-1;i++){
            //System.out.println(current+" "+i+" "+next);
            if(leftMax[current++] <= arr[i] && arr[i] <= rightMax[next]){                
                return arr[i];
            }
            next++;
        }
        return 0;
    }
}
