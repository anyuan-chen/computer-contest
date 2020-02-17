import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class contests {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    public static void main(String[] args) throws IOException {
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());
        if (month < 2){
            System.out.println("Before");
        }
        else if (month == 2 && day < 18){
            System.out.println("Before");
        }
        else if (month == 2 && day == 18){
            System.out.println("Special");
        }else{
            System.out.println("After");
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
