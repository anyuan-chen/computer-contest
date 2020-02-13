

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int req = readInt();
		int total = readInt();
		int multiplier = readInt();

		int trueTotal = total;
		int newPeople = total;
		int days = 0;
		
		while (trueTotal <= req) {
			total = total*multiplier;
			trueTotal+=total;
			days++;	
		}
		System.out.println(days);
		
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