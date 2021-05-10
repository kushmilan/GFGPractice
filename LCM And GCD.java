
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long a[] = new Long[2];
        if(B % A == 0){
            a[0] = B;
            a[1] = A;
            return a;
        }
        
        a[1] = gcd(A, B);
        a[0] = (A * B) / a[1];
        
        return a;
    }
    
    static long gcd(long a, long b){
        if(a < b) return gcd(b, a);
        
        if(b == 0) return a;
        
        return gcd(b, a - b);
    }
};