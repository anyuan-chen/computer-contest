
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int nP = readInt();
		int [] times = new int [nP];
		int [] distances = new int [nP];
		for (int i = 0; i < nP; i++) {
			times [i] = readInt();
			distances [i] = readInt();
		}
		boolean sorted;
		for (int i = 0; i < nP-1; i++) {
			sorted = true;
			for (int j = 0; j < nP - i - 1; j++) {
				if (times [j] > times [j+1]) {
					int temp = times [j];
					times [j] = times [j+1];
					times [j+1] = temp;
					
					int temp2 = distances [j];
					distances [j] = distances [j+1];
					distances [j+1] = temp2;
					sorted = false;
				}
			}
			if (sorted == true) {
				break;
			}
		}
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < nP-1; i++ ) {
			double spd = ((Math.abs((double) distances [i+1] - (double) distances [i]) / Math.abs((double) times [i+1] - (double) times [i])));
			if (spd > max) {
				max = spd;
			}
		}
		System.out.print(max);
		
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
