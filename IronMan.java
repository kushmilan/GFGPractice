/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-30 16:23:16
 * @modify date 2020-03-30 16:23:16
 * @desc [description]
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class IronMan{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int k = Integer.parseInt(br.readLine()); k > 0; k--) {
            String s = br.readLine();
            if(s.isEmpty())
		        s = br.readLine().toLowerCase();

            StringBuilder sb = new StringBuilder(s);
            int flag = 1;
		    for(int i=0, j=sb.length()-1;i<j;i++,j--){
		        if((sb.charAt(i)>=97 && sb.charAt(i)<=122) || (sb.charAt(i)>=48 && sb.charAt(i)<=57)){
		            if((sb.charAt(j)>=97 && sb.charAt(j)<=122) || (sb.charAt(j)>=48 && sb.charAt(j)<=57)){
		                if(sb.charAt(i) != sb.charAt(j)){
		                    flag = 0;
		                    break;
		                }
		            }
		            else
		                i--;
		        }
		        else
		            j++;
		    }
		    if(flag == 1)
		        System.out.println("YES");
		    else
		        System.out.println("NO");

        }
    }

}