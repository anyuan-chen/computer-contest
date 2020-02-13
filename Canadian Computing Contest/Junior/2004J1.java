import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Arrays;

public class DWITE2011R3 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int size = readInt();
		if (size == 0){
			System.out.print("0");
			System.exit(0);
		}
		int i = 0;
		while(i*i <= size) {
			i++;
		}
		System.out.print("The largest square has side length " + (i-1) + ".");
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
