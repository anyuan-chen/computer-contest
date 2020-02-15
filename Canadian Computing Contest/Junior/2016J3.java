import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Scanner;

public class test {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int longest = 1;
        for (int i = 1; i <= str.length() ; i++){
            for (int j = 0; j <= str.length()-i; j++){
                if (isPalindrome(str.substring(j, j+i))){
                    longest = i;
                }
            }
        }
        System.out.println(longest);
    }
    public static boolean isPalindrome(String string){
        for (int i = 0; i < string.length()/2; i++){
            if (string.charAt(i) == string.charAt(string.length()-1-i)){
            }
            else{
                return false;
            }
        }
        return true;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException{
        return Double.parseDouble(next());
    }

}
