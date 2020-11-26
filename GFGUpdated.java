import java.io.*;
import java.util.*;

public class GFGUpdated {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strarr;
        System.out.println();
        for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
            br.readLine();
            strarr = br.readLine().split(" ");
            Arrays.sort(strarr,((x,y)->(Integer.compare(Integer.parseInt(x+y), Integer.parseInt(y+x))>0)? -1:1));
            //Arrays.sort(strarr,new Comp());
            //Arrays.sort(strarr, ((x, y) -> (x + y).compareTo((y + x)) > 0 ? -1 : 1));
            System.out.println(String.join("", strarr));
        }
    }
}