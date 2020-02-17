import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class contests {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   


    public static void main(String[] args) throws IOException {
        double weight = readDouble();
        double height = readDouble();
        if (weight / (height*height) > 25){
            System.out.println("Overweight");
        }
        else if (weight / (height*height) > 18.4){
            System.out.println("Normal weight");
        }
        else{
            System.out.println("Underweight");
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
