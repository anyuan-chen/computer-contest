import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Stack;

public class GenevaConfection {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String [] numLet = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
    public static void main(String[] args) throws IOException {
        int numberPhone = readInt();
        for (int i = 0; i < numberPhone; i++){
            String phone = br.readLine();
            String newPhone = "";
            for (int j = 0; j < phone.length() && newPhone.length() < 12; j++){
                if (phone.charAt(j) == '-'){
                }
                else{
                    try{
                        Integer.parseInt(Character.toString(phone.charAt(j)));
                        newPhone += Character.toString(phone.charAt(j));
                    } catch (Exception e){
                        for (int a = 0; a < numLet.length; a++){
                            for (int b = 0; b < numLet [a].length(); b++){
                                if (numLet[a].charAt(b) == phone.charAt(j)){
                                    newPhone += Integer.toString(a);
                                }
                            }
                        }
                    }
                }
                if (newPhone.length() == 3 || newPhone.length() == 7){
                    newPhone += "-";
                }
            }
            System.out.println(newPhone);
        }

    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

}
