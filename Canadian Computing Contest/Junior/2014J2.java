import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class contests {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    public static void main(String[] args) throws IOException {
        br.readLine();
        String str = br.readLine();
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'A'){
                a++;
            }
            else{
                b++;
            }
        }
        if (a > b){
            System.out.println("A");
        }
        else if (b > a){
            System.out.println("B");
        }
        else{
            System.out.println("Tie");
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
    static double readDouble() throws IOException{
        return Double.parseDouble(next());
    }

}
