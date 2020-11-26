import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class RemoveCommonCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String s1 = br.readLine();
            String s2 = br.readLine();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s1.length(); i++){
                if(!s2.contains(Character.toString(s1.charAt(i)))){
                    sb.append(s1.charAt(i));
                }
            }
            for(int i = 0; i < s2.length(); i++){
                if(!s1.contains(Character.toString(s2.charAt(i)))){
                    sb.append(s2.charAt(i));
                }
            }
            if(sb.length()==0){
                System.out.println(-1);
            }else{
                System.out.println(sb);
            }
        }
    }
}