    /*
    * @author [Milan Kushwah]
    * @email [kushmilan4@gmail.com]
    * @create date 2020-03-26 04:17:46
    * @modify date 2020-03-26 04:17:46
    * @desc [description]
    */

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    class MultipleOfThree {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
                String str = br.readLine();
                if(checkMultipleOfThree(str, str.length())){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }

        static boolean checkMultipleOfThree(String binary, int length){
            int countEven = 0, countOdd = 0;
            for(int i = length-1 ; i >= 0;i--){
                //for even Position
                if(binary.charAt(i)=='1'){
                    countOdd++;
                    binary = binary.substring(0,i); i--;
                }else{
                    binary = binary.substring(0,i); i--;
                }
                //for odd Position
                if(binary.length()>=1){
                    if(binary.charAt(i)=='1'){
                        countEven++;
                        binary = binary.substring(0,i);
                    }else{
                        binary = binary.substring(0,i);
                    }
                }
            }
            if(Math.abs(countEven - countOdd)%3 == 0){
                return true;
            }else{
                return false;
            }
        }

    }