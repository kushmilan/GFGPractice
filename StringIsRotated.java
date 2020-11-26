/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-22 12:40:20
 * @modify date 2020-03-22 12:40:20
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class StringIsRotated {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            System.out.println(checkRotation(br.readLine(),br.readLine()));
        }
    }

    static int checkRotation(String str1, String str2){
        int size1 = str1.length();
        int size2 = str2.length();
        String tempString1 = str1.substring(2, size1) + str1.substring(0,2);
        //System.out.println(tempString1);
        String tempString2 = str1.substring(size1-2,size1) + str1.substring(0, size1-2);
        //System.out.println(tempString2);
        if(size1 == size2){
            for(int i=0;i<size1;i++){
                if(str2.equals(tempString1)){
                    return 1;
                }else if(str2.equals(tempString2)){
                    return 1;
                }
            }
        }
        return 0;
    }
}


