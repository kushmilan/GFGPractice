
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-18 18:15:31
 * @modify date 2020-04-18 18:15:31
 * @desc [description]
 */

import java.io.*;
import java.util.*;

class LargestPrimeFactor {
    
    static Map<Long, Boolean> primes;
    public static void main(String[] args) throws IOException {
        primes = new HashMap<>();
        primes.put(1L, false);
        primes.put(2L, true);
        primes.put(3L, true);
        primes.put(5L, true);
        primes.put(7L, true);       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            System.out.println(largetsPrimeFactor(Integer.parseInt(br.readLine())));
        }
    }

    static long largetsPrimeFactor(long number) {
        long num = -1;
        while (number % 2 == 0) {
            num = 2;
            number = number / 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            while (number % i == 0) {
                if(isPrime(i)){
                    num = i;
                }
                number = number / i;
            }
        }
        
        if(number > 2){
            return number;
        }
        return num;
    }



    static boolean isPrime(long n) {
        if(primes.containsKey(n)) return primes.get(n);
        if(n%2 == 0) return false;
        for(int i = 3; i <= (int) Math.sqrt(n); i+=2) {
            if(n%i == 0) {
                primes.put(n, false);
                return false;
            }
        }
        primes.put(n, true);
        return true;
    }

}