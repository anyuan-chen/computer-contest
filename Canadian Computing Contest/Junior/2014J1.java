import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int digit1 = readInt();
		int digit2 = readInt();
		int digit3 = readInt();
		if(digit1+digit2+digit3 != 180){
			System.out.println("Error");
		}
		else if (digit1 == 60 && digit2 == 60 && digit3 ==60){
			System.out.println("Equilateral");
		}
		else if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3){
			System.out.println("Isosceles");
		}
		else{
			System.out.println("Scalene");
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
