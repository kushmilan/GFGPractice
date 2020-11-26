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

class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String str = br.readLine();
            System.out.println(removeDuplicate(str));
        }
    }


    static String removeDuplicate(String str){
        if(str.equals("")){
            return "";
        }else if(str.length()==1){
            return str;
        }else if(str.length()==2){
            if(str.charAt(0)!=str.charAt(1)){
                return str;
            }else{
                return "";
            }
        }
        int deletion = 0,i=0;
        String temp = "";
        while(i<str.length()-1){
            if(str.charAt(i)!=str.charAt(i+1)){
                temp += str.charAt(i);
                //System.out.println("Append: "+str+" "+temp);
                i++;
            }
            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                    //System.out.println("Removal: "+str+" "+temp);
                    i++;
                    deletion++;
                }
                i++;
            }
        }
        if(str.length()>2){
            if(str.charAt(str.length()-2)!=str.charAt(str.length()-1)){
                temp += str.charAt(str.length()-1);
                //System.out.println("Append: "+str+" "+temp);
            }
        }
        if(deletion==0){
            return temp;
        }else{
            return removeDuplicate(temp);
        }

    }
}


