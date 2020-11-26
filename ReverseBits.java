/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-04-06 21:24:19
 * @modify date 2020-04-06 21:24:19
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class ReverseBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int p = Integer.parseInt(br.readLine()); p > 0; p--) {
            String binary = toBinary(Integer.parseInt(br.readLine()));
            System.out.println(binary);
            long sum = 0;
            for(int i = 0; i < binary.length(); i++){
                if(binary.charAt(i) == '1'){
                    sum += Math.pow(2, i);
                }
            }
            System.out.println(sum);
        }
    }

	public static String toBinary(int x) {
		return String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0");
	}
}