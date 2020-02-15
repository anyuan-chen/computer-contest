import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class test2 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int speed = readInt();
        int speedDriver = readInt();

        if (speedDriver - speed > 30){
            System.out.println("You are speeding and your fine is $500.");
        }
        else if (speedDriver - speed > 20){
            System.out.println("You are speeding and your fine is $270.");
        }
        else if (speedDriver - speed > 0){
            System.out.println("You are speeding and your fine is $100.");
        }
        else {
            System.out.println("Congratulations, you are within the speed limit!");
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
