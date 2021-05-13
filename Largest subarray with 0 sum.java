class GfG{
    int maxLen(int arr[], int n){
        
        int sum = 0, max = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i< n; i++){
            sum += arr[i];
            if(sum == 0){
               max = Math.max(max, i + 1);  
            }else{
               if(map.containsKey(sum)){
                   max = Math.max(max, i - map.get(sum));
               }else{
                  map.put(sum, i);    
               }
            }
        }
        
        return max;
    }
}