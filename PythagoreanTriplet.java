// created by Milan Kushwah at 2020/03/12 19:24.
   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class PythagoreanTriplet{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),testItr=0;
        while(testItr++ < testCases ){
            int arrSize = Integer.parseInt(br.readLine()),k=0;
            String arrS1[] = br.readLine().split("\\s+");
            long arr[] = new long[arrSize];
            while(k<arrSize){
                arr[k] = Long.parseLong(arrS1[k++]);
            }
            if(check(arr, arrSize)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }   

    static boolean check(long arr[], int arrSize){
        Set<Long> tempSet = new HashSet<Long>();
        for(int i=0;i<arrSize;i++){
            tempSet.add(arr[i]*arr[i]);
        }
        //System.out.println(tempSet);
        for(int k=0;k<arrSize;k++){
            for(int j=1;j<arrSize;j++){
                if(tempSet.contains((arr[k]*arr[k])+(arr[j]*arr[j]))){
                    return true;
                }
            }
        }

        return false;
    }
}

// Solution is n^2!!

/*
if(tempSet.contains((arr[k]*arr[k++])+(arr[j]*arr[j]))){
    return true;
}
*/