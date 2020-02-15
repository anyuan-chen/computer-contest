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
       int numberVoters = readInt();
       for (int i = 0; i < numberVoters; i++){
           int year = readInt();
           int month = readInt();
           int day = readInt();

           if (2007 - year >18){
               System.out.println("Yes");
           }
           else if (2007-year == 18 && month == 1){
               System.out.println("Yes");
           }
           else if (2007 - year == 18 && month == 2 && day < 28){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
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
