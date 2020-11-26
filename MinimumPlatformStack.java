// created by Milan Kushwah at 2020/03/06 15:24.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

class MinimumPlatformStack{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),test=0;
        while(test++ < testCases){
            int arraySize = Integer.parseInt(br.readLine()),arrItr=0;
            String arrS[] = br.readLine().split("\\s+");
            String arrS1[] = br.readLine().split("\\s+");
            int arr[] = new int[arraySize];
            int arr1[] = new int[arraySize];
            int fullArray[] = new int[2*arraySize];
            char fullArrayC[] = new char[2*arraySize];
            int itrForFullArray =0;
            while(arrItr<arraySize){
                arr[arrItr] = Integer.parseInt(arrS[arrItr]);
                arr1[arrItr] = Integer.parseInt(arrS1[arrItr]);
                fullArray[itrForFullArray++] = Integer.parseInt(arrS[arrItr]);
                fullArray[itrForFullArray++] = Integer.parseInt(arrS1[arrItr++]);
            }

            Map<Integer,Character> arrival = new HashMap<>();
            Map<Integer,Character> departure = new HashMap<>();
            int itrForMap =0;
            while(itrForMap<arraySize){
                arrival.put(arr[itrForMap], 'a');
                departure.put(arr1[itrForMap], 'b');
                itrForMap++;
            }
            Arrays.sort(fullArray);
            int itrForFullCharArray =0;
            while(itrForFullCharArray < 2*arraySize){
                fullArrayC[itrForFullCharArray] = getFromMap(arrival, departure, fullArray[itrForFullCharArray]);
                itrForFullCharArray++;
            }
            /*
            for(int i=0;i<2*arraySize;i++){
                System.out.print(fullArrayC[i]+" ");
            }
            System.out.println();
            */

            Stack<Character> st = new Stack<>();
            //st.push('a');
            int max = 0,height=0,itrFinal=0;
            while(itrFinal<2*arraySize){
                if(fullArrayC[itrFinal]=='a'){
                    st.push('a');height++;
                    if(height>max){
                        max = height;
                    }
                }else{
                    st.pop();height--;
                }
                itrFinal++;
            }
            System.out.println(max);
        }
    }

    static char getFromMap(Map arrival, Map departure,int number){{
        if(arrival.containsKey(number)){
            return 'a';
        }else{
            return 'b';
        }
    }

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