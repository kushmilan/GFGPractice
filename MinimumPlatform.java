// created by Milan Kushwah at 2020/03/06 15:24.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class MinimumPlatform{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),test=0;
        while(test++ < testCases){
            int arraySize = Integer.parseInt(br.readLine()),arrItr=0;
            String arrS[] = br.readLine().split("\\s+");
            String arrS1[] = br.readLine().split("\\s+");
            int arr[] = new int[arraySize];
            int arr1[] = new int[arraySize];
            while(arrItr<arraySize){
                arr[arrItr] = Integer.parseInt(arrS[arrItr]);
                arr1[arrItr] = Integer.parseInt(arrS1[arrItr++]);
            }
            
            System.out.println(platformCount(arr, arr1, arraySize));
            
            /*
            int countFlags =0,platform=0;
            while(countFlags < arraySize){
                int itr =0, currentDepartureTime=0;
                while(itr<arraySize){
                    if(arr[itr]!= -1 && arr[itr] > currentDepartureTime){
                        currentDepartureTime = arr1[itr];
                        arr[itr] = -1;countFlags++;
                    }
                    itr++;
                }
                platform++;
            }
            //System.out.println("platforms required: "+platform);
            System.out.println(platform);

            */
        }
    }

    static int platformCount(int arr[], int arr1[], int arraySize){
        int platformNeeded = 1, result=1;
        int i=1, j=0;

        while(i< arraySize && j< arraySize){
            if(arr[i] <= arr1[j]){
                platformNeeded++;
                i++;
                if(platformNeeded > result){
                    result = platformNeeded;
                }
            }else{
                platformNeeded--;
                j++;
            }
        }

        return result;
    }
}



/*abstract

1
6
0900 0940 0950 1100 1500 1800
0910 1200 1120 1130 1900 2000

1
3
0900 1100 1235
1000 1200 1240

*/