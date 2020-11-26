import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Rotation{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
            String s1 = br.readLine();
            String s2 = br.readLine();
            if(s1.length()==s2.length()){
                s2 = s2 + s2;
                if(s2.contains(s1)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                System.out.println(0);
            }
        }
    }
}