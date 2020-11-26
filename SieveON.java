/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-16 11:20:23
 * @modify date 2020-04-16 11:20:23
 * @desc [description]
 */

import java.io.*;
import java.util.*;

class SieveON {
    
    static final int MAX_SIZE = 1000001; 
    // isPrime[] : isPrime[i] is true if number is prime  
    // prime[] : stores all prime number less than N 
    // SPF[] that store smallest prime factor of number 
    // [for Exp : smallest prime factor of '8' and '16' 
    // is '2' so we put SPF[8] = 2 , SPF[16] = 2  
    static Vector<Boolean>isprime = new Vector<>(MAX_SIZE); 
    static Vector<Integer>prime = new Vector<>(); 
    static Vector<Integer>SPF = new Vector<>(MAX_SIZE); 
    
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < MAX_SIZE; i++){ 
            isprime.add(true); 
            SPF.add(2); 
        }
        manipulated_seive(10001);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            int number = Integer.parseInt(br.readLine().replace(" ", ""));
            int temp = 1, tempB = number-1;
            while(!isprime.get(temp) || !isprime.get(tempB)){
                temp++; tempB--;
            }
            System.out.println(temp+" "+tempB);
        }
    }

    static void manipulated_seive(int N){
        isprime.set(0, false);
        isprime.set(1, false);

        for(int i = 0; i < N; i++){
            if(isprime.get(i)){
                prime.add(i);
                SPF.set(i, i);
            }

            for(int j = 0; j < prime.size() && i*prime.get(j) < N && prime.get(j) <= SPF.get(i); j++){
                isprime.set(i*prime.get(j), false);
                SPF.set(i*prime.get(j), prime.get(j));
            }
        }
    }


}