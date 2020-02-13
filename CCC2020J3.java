


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int noD = readInt();
		int [] xCoordinate = new int [noD];
		int [] yCoordinate = new int [noD];
		for (int i = 0; i < noD; i++) {
			String [] thing = br.readLine().split(",");
			xCoordinate [i] = Integer.parseInt(thing [0]);
			yCoordinate [i] = Integer.parseInt(thing [1]);
		}
		int xMax = Integer.MIN_VALUE;
		int xMin = Integer.MAX_VALUE;
		int yMax = Integer.MIN_VALUE;
		int yMin = Integer.MAX_VALUE;
		for (int i = 0; i < noD; i++) {
			if (xCoordinate[i] > xMax) {
				xMax = xCoordinate[i];
			}
			if (xCoordinate [i] < xMin) {
				xMin = xCoordinate [i];
			}
			if (yCoordinate [i] > yMax) {
				yMax = yCoordinate [i];
			}
			if (yCoordinate [i] < yMin) {
				yMin = yCoordinate [i];
			}
		}
		System.out.println((xMin-1) + "," + (yMin-1));
		System.out.println((xMax+1) + "," + (yMax+1));
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