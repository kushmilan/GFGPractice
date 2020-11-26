
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-01 16:18:50
 * @modify date 2020-04-01 16:18:50
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Comparator;
import java.math.BigInteger;

class NCRMod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // System.out.println(powerP(Integer.parseInt(br.readLine()),
            // Integer.parseInt(br.readLine())));
            long n = Long.parseLong(br.readLine());
            long c = Long.parseLong(br.readLine());
            long m = Integer.parseInt(br.readLine());
            System.out.println(fact(n, m) % m);
            System.out.println(powerP(fact(n, m) % m, m - 2));
            System.out.println((((fact(n, m) % m)*(powerP(fact(n, m) % m, m - 2))%m)*powerP(fact(n - c, m) % m, m -2 ))%m);
            // System.out.println(fact(n, BigInteger.valueOf(m)));
            // System.out.println((((fact(n, BigInteger.valueOf(m).multiply(powerP(fact(n,
            // BigInteger.valueOf(m)), m
            // -2)))).mod(BigInteger.valueOf(m))).multiply(powerP(fact(n - c,
            // BigInteger.valueOf(m)), m-2))).mod(BigInteger.valueOf(m)));
        }
    }


    static long fact(long n, long m) {
        long fact = 1;
        for (long i = 1; i <= n; i++)
            fact = (fact * i) % m;
        return fact;
    }

    static long powerP(long base, long power) {
        if (power == 1) {
            return base;
        }
        if (power % 2 == 0) {
            return powerP(base* base, power / 2);
        }
        if (power % 2 == 1) {
            return powerP(base* base, power / 2) *base;
        }
        return 0;
    }
}