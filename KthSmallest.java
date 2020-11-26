/*
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-08 15:35:20
 * @modify date 2020-03-08 15:35:20
 * @desc [description]
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

class KthSmallest{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()),testM=0;
        while(testM++<testCases){
            int arrSize = Integer.parseInt(br.readLine());
            String arrS[] = br.readLine().split("\\s+");
            int arr[] = new int[arrSize];
            
            for(int i=0;i<arrSize;i++){
                arr[i] = Integer.parseInt(arrS[i]);
            }
            int index = Integer.parseInt(br.readLine());
            System.out.println(inbuiltSortMethod(arr, index));
            //System.out.println(findKthLargest(arr, index));
            
            int element = arrSize - index+1;
            PriorityQueue<Integer> q = new PriorityQueue<Integer>(element);
            for(int i=0;i<arrSize;i++){
                q.offer(Integer.parseInt(arrS[i]));
                if(q.size() > element){
                    q.poll();
                }              
            }
            System.out.println(q);
            System.out.println(q.peek());
        }
        br.close();
    }  


    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);
     
            if(q.size()>k){
                q.poll();
            }
        }
     
        return q.peek();
    }

    static int inbuiltSortMethod(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}

/*if(q.size() > index){
                    q.poll();
                }
                */