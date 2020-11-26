import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegMentTree{
    public static int SegTree1[];
    public static void main(String[] args)throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 1000000;
        int x = (int) (Math.ceil(Math.log(size) / Math.log(2))); 
        int max_size = 2 * (int) Math.pow(2, x) - 1;

        SegTree = new int[max_size];

    }  
    
    public static void constructSTUtil(int arr[], int ss, int se, int si){ 
		if (ss == se){ 
            SegTree[si] = arr[ss]; //Node
			return ; 
		} 
        int mid = getMid(ss, se);
        constructSTUtil(arr,      ss, mid,   si * 2 + 1);
        constructSTUtil(arr, mid + 1,  se,   si * 2 + 2);
		SegTree[si] = SegTree[2 * si+1] + SegTree[2 * si + 2]; //Operation
    }

    public static int getSumUtil(int ss, int se, int qs, int qe, int si){
		if (qs <= ss && qe >= se) 
			return SegTree[si]; //node Return

		if (se < qs || ss > qe) 
			return 0; 

        int mid = getMid(ss, se); 
        return  getSumUtil(ss, mid, qs, qe, 2 * si + 1) + getSumUtil(mid + 1, se, qs, qe, 2 * si + 2); //Operation
    }

}