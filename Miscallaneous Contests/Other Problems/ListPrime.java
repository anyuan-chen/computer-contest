import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class test {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = readInt();
        if (n ==1){
            System.out.println(2);
            System.exit(0);
        }
        boolean isPrime = true;
        for (int i = n; i < Integer.MAX_VALUE; i++){
            isPrime = true;
            for (int j = 2; j*j <= i; j++){
                if (i%j ==0){
                    isPrime = false;
                }
            }
            if (isPrime == true ){
                System.out.println(i);
                System.exit(0);
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
