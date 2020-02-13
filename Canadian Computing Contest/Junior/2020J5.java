package computerConest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class CCC2020J5 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int m = readInt();
		int n = readInt();
		HashMap <int [], Integer > grid = new HashMap <int [], Integer>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++){
				int [] temp = {i+1,j+1};
				int temp2 = readInt();
				grid.put(temp, temp2);
				
			}
		}
		
		int hello = 0;
		while(hello < 1000) {
			int[] currentPosition = {1,1};
			for (int [] i : grid.keySet()) {
				if (grid.get(currentPosition) == i[0]*i[1]) {
					currentPosition = i;
					if (i[0] == 2 && i[1] == 2) {
						System.out.print("yes");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("no");
		
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