class Solution{
    
    static long inversionCount(long arr[], long N){
        return binaryCount(arr, 0, (int)N - 1);
    }
    
    static long binaryCount(long arr[], int l, int r){
        long count = 0;
        
        if(l < r){
            int m = (l + r) / 2;
            
            count += binaryCount(arr, l, m);
            count += binaryCount(arr, m + 1, r);
            
            count += mergeCount(arr, l, m, r);
            
        }
        
        return count;
    }
    
    static long mergeCount(long arr[], int l, int m, int r){
        
        long count = 0;
        
        long left[] = copyOfRang(arr, l, m);
        long right[] = copyOfRang(arr, m + 1, r);
        
        int i = 0, j = 0, k = l;
        
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                count += (m + 1) - (l + i);
            }
        }
        
        while(i < left.length) arr[k++] = left[i++];
        while(j < right.length) arr[k++] = right[j++];
        
        return count;
    }
    
    static long[] copyOfRang(long[] arr, int l, int r){
        long a[] = new long[r - l + 1];
        int ind = 0;
        
        for(int i = l; i <= r; i++){
            a[ind++] = arr[i];
        }
        
        return a;
    }
    
    
}